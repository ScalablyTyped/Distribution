package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessResponse extends StObject {
  
  /**
    * The document payload, will populate fields based on the processor's behavior.
    */
  var document: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3Document] = js.undefined
  
  /**
    * The name of the operation triggered by the processed document. If the human review process is not triggered, this field will be empty. It has the same response type and metadata as the long running operation returned by ReviewDocument method.
    */
  var humanReviewOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of human review on the processed document.
    */
  var humanReviewStatus: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3HumanReviewStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessResponse](x: Self) {
    
    inline def setDocument(value: SchemaGoogleCloudDocumentaiV1beta3Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setHumanReviewOperation(value: String): Self = StObject.set(x, "humanReviewOperation", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewOperationNull: Self = StObject.set(x, "humanReviewOperation", null)
    
    inline def setHumanReviewOperationUndefined: Self = StObject.set(x, "humanReviewOperation", js.undefined)
    
    inline def setHumanReviewStatus(value: SchemaGoogleCloudDocumentaiV1beta3HumanReviewStatus): Self = StObject.set(x, "humanReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewStatusUndefined: Self = StObject.set(x, "humanReviewStatus", js.undefined)
  }
}
