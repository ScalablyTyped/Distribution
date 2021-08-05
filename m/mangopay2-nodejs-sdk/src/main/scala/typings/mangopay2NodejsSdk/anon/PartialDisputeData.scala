package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReason
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData> */
trait PartialDisputeData extends StObject {
  
  var ContestDeadlineDate: js.UndefOr[Timestamp] = js.undefined
  
  var ContestedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var DisputeReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeReason] = js.undefined
  
  var DisputeType: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeType] = js.undefined
  
  var DisputedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var InitialTransactionId: js.UndefOr[String] = js.undefined
  
  var InitialTransactionType: js.UndefOr[TransactionType] = js.undefined
  
  var RepudiationId: js.UndefOr[String] = js.undefined
  
  var ResultCode: js.UndefOr[String] = js.undefined
  
  var ResultMessage: js.UndefOr[String] = js.undefined
  
  var Status: js.UndefOr[DisputeStatus] = js.undefined
  
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
}
object PartialDisputeData {
  
  inline def apply(): PartialDisputeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisputeData]
  }
  
  extension [Self <: PartialDisputeData](x: Self) {
    
    inline def setContestDeadlineDate(value: Timestamp): Self = StObject.set(x, "ContestDeadlineDate", value.asInstanceOf[js.Any])
    
    inline def setContestDeadlineDateUndefined: Self = StObject.set(x, "ContestDeadlineDate", js.undefined)
    
    inline def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
    
    inline def setContestedFundsUndefined: Self = StObject.set(x, "ContestedFunds", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDisputeReason(value: DisputeReason): Self = StObject.set(x, "DisputeReason", value.asInstanceOf[js.Any])
    
    inline def setDisputeReasonUndefined: Self = StObject.set(x, "DisputeReason", js.undefined)
    
    inline def setDisputeType(value: DisputeType): Self = StObject.set(x, "DisputeType", value.asInstanceOf[js.Any])
    
    inline def setDisputeTypeUndefined: Self = StObject.set(x, "DisputeType", js.undefined)
    
    inline def setDisputedFunds(value: MoneyData): Self = StObject.set(x, "DisputedFunds", value.asInstanceOf[js.Any])
    
    inline def setDisputedFundsUndefined: Self = StObject.set(x, "DisputedFunds", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
    
    inline def setInitialTransactionIdUndefined: Self = StObject.set(x, "InitialTransactionId", js.undefined)
    
    inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
    
    inline def setInitialTransactionTypeUndefined: Self = StObject.set(x, "InitialTransactionType", js.undefined)
    
    inline def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
    
    inline def setRepudiationIdUndefined: Self = StObject.set(x, "RepudiationId", js.undefined)
    
    inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
    
    inline def setResultMessageUndefined: Self = StObject.set(x, "ResultMessage", js.undefined)
    
    inline def setStatus(value: DisputeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
