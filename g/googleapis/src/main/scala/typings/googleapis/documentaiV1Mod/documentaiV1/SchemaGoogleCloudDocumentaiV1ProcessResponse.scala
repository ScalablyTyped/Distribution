package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ProcessResponse extends StObject {
  
  /**
    * The document payload, will populate fields based on the processor's behavior.
    */
  var document: js.UndefOr[SchemaGoogleCloudDocumentaiV1Document] = js.undefined
  
  /**
    * The status of human review on the processed document.
    */
  var humanReviewStatus: js.UndefOr[SchemaGoogleCloudDocumentaiV1HumanReviewStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ProcessResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ProcessResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ProcessResponse](x: Self) {
    
    inline def setDocument(value: SchemaGoogleCloudDocumentaiV1Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setHumanReviewStatus(value: SchemaGoogleCloudDocumentaiV1HumanReviewStatus): Self = StObject.set(x, "humanReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewStatusUndefined: Self = StObject.set(x, "humanReviewStatus", js.undefined)
  }
}
