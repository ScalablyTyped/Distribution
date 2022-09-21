package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1BatchProcessDocumentsResponse extends StObject {
  
  /**
    * Responses for each individual document.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1BatchProcessDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1BatchProcessDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1BatchProcessDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1BatchProcessDocumentsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
