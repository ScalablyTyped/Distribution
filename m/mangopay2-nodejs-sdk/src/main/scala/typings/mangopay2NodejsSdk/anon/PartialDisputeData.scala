package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReason
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData> */
@js.native
trait PartialDisputeData extends StObject {
  
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
  implicit class PartialDisputeDataMutableBuilder[Self <: PartialDisputeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContestDeadlineDate(value: Timestamp): Self = StObject.set(x, "ContestDeadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestDeadlineDateUndefined: Self = StObject.set(x, "ContestDeadlineDate", js.undefined)
    
    @scala.inline
    def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestedFundsUndefined: Self = StObject.set(x, "ContestedFunds", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDisputeReason(value: DisputeReason): Self = StObject.set(x, "DisputeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputeReasonUndefined: Self = StObject.set(x, "DisputeReason", js.undefined)
    
    @scala.inline
    def setDisputeType(value: DisputeType): Self = StObject.set(x, "DisputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputeTypeUndefined: Self = StObject.set(x, "DisputeType", js.undefined)
    
    @scala.inline
    def setDisputedFunds(value: MoneyData): Self = StObject.set(x, "DisputedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputedFundsUndefined: Self = StObject.set(x, "DisputedFunds", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionIdUndefined: Self = StObject.set(x, "InitialTransactionId", js.undefined)
    
    @scala.inline
    def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionTypeUndefined: Self = StObject.set(x, "InitialTransactionType", js.undefined)
    
    @scala.inline
    def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepudiationIdUndefined: Self = StObject.set(x, "RepudiationId", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: DisputeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
