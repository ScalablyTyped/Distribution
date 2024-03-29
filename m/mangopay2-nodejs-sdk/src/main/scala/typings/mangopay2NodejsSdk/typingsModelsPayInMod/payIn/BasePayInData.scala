package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePayInData
  extends StObject
     with EntityBaseData {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  var CreditedFunds: MoneyData
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String
  
  /**
    * When the transaction happened
    */
  var ExecutionDate: Timestamp
  
  /**
    * The type of execution for the payin
    */
  var ExecutionType: PayInExecutionType
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  /**
    * The nature of the transaction
    */
  var Nature: TransactionNature
  
  /**
    * The type of payin
    */
  var PaymentType: PayInPaymentType
  
  /**
    * The result code
    */
  var ResultCode: String
  
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  
  /**
    * The status of the transaction
    */
  var Status: TransactionStatus
  
  /**
    * The type of the transaction
    */
  var Type: TransactionType
}
object BasePayInData {
  
  inline def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: PayInExecutionType,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): BasePayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePayInData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePayInData] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setCreditedFunds(value: MoneyData): Self = StObject.set(x, "CreditedFunds", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedWalletId(value: String): Self = StObject.set(x, "DebitedWalletId", value.asInstanceOf[js.Any])
    
    inline def setExecutionDate(value: Timestamp): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: PayInExecutionType): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setNature(value: TransactionNature): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: PayInPaymentType): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setType(value: TransactionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
