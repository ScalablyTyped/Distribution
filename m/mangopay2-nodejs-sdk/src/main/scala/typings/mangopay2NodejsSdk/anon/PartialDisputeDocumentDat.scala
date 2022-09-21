package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.DocumentStatus
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.RefusedReasonType
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/disputeDocument.disputeDocument.DisputeDocumentData> */
trait PartialDisputeDocumentDat extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var DisputeId: js.UndefOr[String] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var ProcessedDate: js.UndefOr[Timestamp] = js.undefined
  
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  
  var RefusedReasonType: js.UndefOr[typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.RefusedReasonType] = js.undefined
  
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Type: js.UndefOr[DisputeDocumentType] = js.undefined
  
  var UserId: js.UndefOr[String] = js.undefined
}
object PartialDisputeDocumentDat {
  
  inline def apply(): PartialDisputeDocumentDat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisputeDocumentDat]
  }
  
  extension [Self <: PartialDisputeDocumentDat](x: Self) {
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDisputeId(value: String): Self = StObject.set(x, "DisputeId", value.asInstanceOf[js.Any])
    
    inline def setDisputeIdUndefined: Self = StObject.set(x, "DisputeId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
    
    inline def setProcessedDateUndefined: Self = StObject.set(x, "ProcessedDate", js.undefined)
    
    inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonMessageUndefined: Self = StObject.set(x, "RefusedReasonMessage", js.undefined)
    
    inline def setRefusedReasonType(value: RefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonTypeUndefined: Self = StObject.set(x, "RefusedReasonType", js.undefined)
    
    inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: DisputeDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
