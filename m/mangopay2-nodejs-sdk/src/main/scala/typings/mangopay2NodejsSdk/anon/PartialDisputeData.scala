package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReason
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData> */
@js.native
trait PartialDisputeData extends js.Object {
  
  var ContestDeadlineDate: js.UndefOr[Timestamp] = js.native
  
  var ContestedFunds: js.UndefOr[MoneyData] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var DisputeReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeReason] = js.native
  
  var DisputeType: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeType] = js.native
  
  var DisputedFunds: js.UndefOr[MoneyData] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var InitialTransactionId: js.UndefOr[String] = js.native
  
  var InitialTransactionType: js.UndefOr[TransactionType] = js.native
  
  var RepudiationId: js.UndefOr[String] = js.native
  
  var ResultCode: js.UndefOr[String] = js.native
  
  var ResultMessage: js.UndefOr[String] = js.native
  
  var Status: js.UndefOr[DisputeStatus] = js.native
  
  var StatusMessage: js.UndefOr[String] = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object PartialDisputeData {
  
  @scala.inline
  def apply(): PartialDisputeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisputeData]
  }
  
  @scala.inline
  implicit class PartialDisputeDataOps[Self <: PartialDisputeData] (val x: Self) extends AnyVal {
    
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
    def setContestDeadlineDate(value: Timestamp): Self = this.set("ContestDeadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContestDeadlineDate: Self = this.set("ContestDeadlineDate", js.undefined)
    
    @scala.inline
    def setContestedFunds(value: MoneyData): Self = this.set("ContestedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContestedFunds: Self = this.set("ContestedFunds", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDisputeReason(value: DisputeReason): Self = this.set("DisputeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeReason: Self = this.set("DisputeReason", js.undefined)
    
    @scala.inline
    def setDisputeType(value: DisputeType): Self = this.set("DisputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeType: Self = this.set("DisputeType", js.undefined)
    
    @scala.inline
    def setDisputedFunds(value: MoneyData): Self = this.set("DisputedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputedFunds: Self = this.set("DisputedFunds", js.undefined)
    
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
    def setRepudiationId(value: String): Self = this.set("RepudiationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepudiationId: Self = this.set("RepudiationId", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCode: Self = this.set("ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultMessage: Self = this.set("ResultMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: DisputeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
