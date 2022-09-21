package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.kycDocumentMod.kycDocument.DocumentStatus
import typings.mangopay2NodejsSdk.kycDocumentMod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.kycDocumentMod.kycDocument.KycDocumentType
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/kycDocument.kycDocument.KycDocumentData> */
trait PartialKycDocumentData extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var Flags: js.UndefOr[js.Array[String]] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var ProcessedDate: js.UndefOr[Timestamp] = js.undefined
  
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  
  var RefusedReasonType: js.UndefOr[KYCDocumentRefusedReasonType] = js.undefined
  
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Type: js.UndefOr[KycDocumentType] = js.undefined
  
  var UserId: js.UndefOr[String] = js.undefined
}
object PartialKycDocumentData {
  
  inline def apply(): PartialKycDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKycDocumentData]
  }
  
  extension [Self <: PartialKycDocumentData](x: Self) {
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "Flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "Flags", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
    
    inline def setProcessedDateUndefined: Self = StObject.set(x, "ProcessedDate", js.undefined)
    
    inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonMessageUndefined: Self = StObject.set(x, "RefusedReasonMessage", js.undefined)
    
    inline def setRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonTypeUndefined: Self = StObject.set(x, "RefusedReasonType", js.undefined)
    
    inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
