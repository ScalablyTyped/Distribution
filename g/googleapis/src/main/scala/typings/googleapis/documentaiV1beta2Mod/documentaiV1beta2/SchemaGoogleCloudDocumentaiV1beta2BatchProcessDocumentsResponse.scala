package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsResponse extends StObject {
  
  /**
    * Responses for each individual document.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentResponse]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
