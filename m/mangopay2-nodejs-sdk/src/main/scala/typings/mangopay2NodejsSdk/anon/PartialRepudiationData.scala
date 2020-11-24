package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.refund.RefundReason
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.repudiation.RepudiationData> */
@js.native
trait PartialRepudiationData extends js.Object {
  
  var AuthorId: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var CreditedFunds: js.UndefOr[MoneyData] = js.native
  
  var CreditedUserId: js.UndefOr[String] = js.native
  
  var CreditedWalletId: js.UndefOr[String] = js.native
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.native
  
  var DebitedWalletId: js.UndefOr[String] = js.native
  
  var ExecutionDate: js.UndefOr[Timestamp] = js.native
  
  var Fees: js.UndefOr[MoneyData] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var InitialTransactionId: js.UndefOr[String] = js.native
  
  var InitialTransactionType: js.UndefOr[TransactionType] = js.native
  
  var Nature: js.UndefOr[REPUDIATION] = js.native
  
  var RefundReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.refund.RefundReason] = js.native
  
  var ResultCode: js.UndefOr[String] = js.native
  
  var ResultMessage: js.UndefOr[String] = js.native
  
  var Status: js.UndefOr[TransactionStatus] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var Type: js.UndefOr[TransactionType] = js.native
}
object PartialRepudiationData {
  
  @scala.inline
  def apply(): PartialRepudiationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRepudiationData]
  }
  
  @scala.inline
  implicit class PartialRepudiationDataOps[Self <: PartialRepudiationData] (val x: Self) extends AnyVal {
    
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
    def deleteAuthorId: Self = this.set("AuthorId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCreditedFunds(value: MoneyData): Self = this.set("CreditedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditedFunds: Self = this.set("CreditedFunds", js.undefined)
    
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditedUserId: Self = this.set("CreditedUserId", js.undefined)
    
    @scala.inline
    def setCreditedWalletId(value: String): Self = this.set("CreditedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditedWalletId: Self = this.set("CreditedWalletId", js.undefined)
    
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebitedFunds: Self = this.set("DebitedFunds", js.undefined)
    
    @scala.inline
    def setDebitedWalletId(value: String): Self = this.set("DebitedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebitedWalletId: Self = this.set("DebitedWalletId", js.undefined)
    
    @scala.inline
    def setExecutionDate(value: Timestamp): Self = this.set("ExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionDate: Self = this.set("ExecutionDate", js.undefined)
    
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFees: Self = this.set("Fees", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInitialTransactionId(value: String): Self = this.set("InitialTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTransactionId: Self = this.set("InitialTransactionId", js.undefined)
    
    @scala.inline
    def setInitialTransactionType(value: TransactionType): Self = this.set("InitialTransactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTransactionType: Self = this.set("InitialTransactionType", js.undefined)
    
    @scala.inline
    def setNature(value: REPUDIATION): Self = this.set("Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNature: Self = this.set("Nature", js.undefined)
    
    @scala.inline
    def setRefundReason(value: RefundReason): Self = this.set("RefundReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundReason: Self = this.set("RefundReason", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCode: Self = this.set("ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultMessage: Self = this.set("ResultMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: TransactionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    
    @scala.inline
    def setType(value: TransactionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
