package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePayInData extends EntityBaseData {
  
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  var CreditedFunds: MoneyData = js.native
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String = js.native
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String = js.native
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String = js.native
  
  /**
    * When the transaction happened
    */
  var ExecutionDate: Timestamp = js.native
  
  /**
    * The type of execution for the payin
    */
  var ExecutionType: PayInExecutionType = js.native
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  
  /**
    * The nature of the transaction
    */
  var Nature: TransactionNature = js.native
  
  /**
    * The type of payin
    */
  var PaymentType: PayInPaymentType = js.native
  
  /**
    * The result code
    */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  
  /**
    * The status of the transaction
    */
  var Status: TransactionStatus = js.native
  
  /**
    * The type of the transaction
    */
  var Type: TransactionType = js.native
}
object BasePayInData {
  
  @scala.inline
  def apply(
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
  implicit class BasePayInDataOps[Self <: BasePayInData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedFunds(value: MoneyData): Self = this.set("CreditedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditedWalletId(value: String): Self = this.set("CreditedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedWalletId(value: String): Self = this.set("DebitedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionDate(value: Timestamp): Self = this.set("ExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: PayInExecutionType): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNature(value: TransactionNature): Self = this.set("Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentType(value: PayInPaymentType): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TransactionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TransactionType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
