package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest extends StObject {
  
  /**
    * Required. Individual requests for each document.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2BatchProcessDocumentsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
