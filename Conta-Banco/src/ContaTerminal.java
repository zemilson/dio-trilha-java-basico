import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System .in);
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua conta é " + numeroConta + " e sua agência é " + numeroAgencia + ".");
        System.out.printf("Seu saldo é de R$ %.2f%n", saldoConta);
        scanner.close();
    }
}