package typings.mangopay2NodejsSdk.mod.PayOut

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.TransferData, 'Type'> */
@js.native
trait PayOutData extends js.Object {
  
  var AuthorId: String = js.native
  
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String = js.native
  
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: String = js.native
  
  var CreationDate: Double = js.native
  
  var CreditedFunds: MoneyData = js.native
  
  var CreditedUserId: String = js.native
  
  var CreditedWalletId: String = js.native
  
  var DebitedFunds: MoneyData = js.native
  
  var DebitedWalletId: String = js.native
  
  var ExecutionDate: Timestamp = js.native
  
  var Fees: MoneyData = js.native
  
  var Id: String = js.native
  
  var Nature: TransactionNature = js.native
  
  var PaymentType: BANK_WIRE = js.native
  
  var ResultCode: String = js.native
  
  var ResultMessage: String = js.native
  
  var Status: TransactionStatus = js.native
  
  var Tag: String = js.native
  
  /**
    * The type of the transaction
    */
  var Type: PAYOUT = js.native
}
object PayOutData {
  
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    BankWireRef: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: BANK_WIRE,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: PAYOUT
  ): PayOutData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], BankWireRef = BankWireRef.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayOutData]
  }
  
  @scala.inline
  implicit class PayOutDataOps[Self <: PayOutData] (val x: Self) extends AnyVal {
    
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
    def setBankAccountId(value: String): Self = this.set("BankAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankWireRef(value: String): Self = this.set("BankWireRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
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
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNature(value: TransactionNature): Self = this.set("Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentType(value: BANK_WIRE): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TransactionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PAYOUT): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
