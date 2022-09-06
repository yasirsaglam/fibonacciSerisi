import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a1 = 0, a2 = 1, a3;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını (n) giriniz : ");
        n = input.nextInt();
        System.out.print(a1 + " " + a2);
        for (int i = 1; i <= n-1; i++) {
            a3 = a1 + a2;
            System.out.print(" " + a3);
            a1 = a2;
            a2 = a3;
        }
    }
}
