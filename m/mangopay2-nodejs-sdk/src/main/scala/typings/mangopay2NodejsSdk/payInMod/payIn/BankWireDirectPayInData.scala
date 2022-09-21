package typings.mangopay2NodejsSdk.payInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankWireDirectPayInData
  extends StObject
     with BasePayInData
     with PayInData {
  
  /**
    * Bank account details
    */
  var BankAccount: BankAccountData
  
  /**
    * The declared debited funds
    */
  var DeclaredDebitedFunds: MoneyData
  
  /**
    * The declared fees
    */
  var DeclaredFees: MoneyData
  
  @JSName("ExecutionType")
  var ExecutionType_BankWireDirectPayInData: DIRECT
  
  @JSName("PaymentType")
  var PaymentType_BankWireDirectPayInData: BANK_WIRE
  
  /**
    * Wire reference
    */
  var WireReference: String
}
object BankWireDirectPayInData {
  
  inline def apply(
    AuthorId: String,
    BankAccount: BankAccountData,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    DeclaredDebitedFunds: MoneyData,
    DeclaredFees: MoneyData,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType,
    WireReference: String
  ): BankWireDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "BANK_WIRE", ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankWireDirectPayInData]
  }
  
  extension [Self <: BankWireDirectPayInData](x: Self) {
    
    inline def setBankAccount(value: BankAccountData): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
    
    inline def setDeclaredDebitedFunds(value: MoneyData): Self = StObject.set(x, "DeclaredDebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDeclaredFees(value: MoneyData): Self = StObject.set(x, "DeclaredFees", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: BANK_WIRE): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setWireReference(value: String): Self = StObject.set(x, "WireReference", value.asInstanceOf[js.Any])
  }
}
