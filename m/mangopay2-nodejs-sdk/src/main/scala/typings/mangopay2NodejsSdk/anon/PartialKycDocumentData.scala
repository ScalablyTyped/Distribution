package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.kycDocument.KycDocumentData> */
trait PartialKycDocumentData extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
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
  
  @scala.inline
  def apply(): PartialKycDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKycDocumentData]
  }
  
  @scala.inline
  implicit class PartialKycDocumentDataMutableBuilder[Self <: PartialKycDocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedDateUndefined: Self = StObject.set(x, "ProcessedDate", js.undefined)
    
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonMessageUndefined: Self = StObject.set(x, "RefusedReasonMessage", js.undefined)
    
    @scala.inline
    def setRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonTypeUndefined: Self = StObject.set(x, "RefusedReasonType", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
