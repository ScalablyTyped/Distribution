package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ReviewDocumentResponse extends StObject {
  
  /**
    * The Cloud Storage uri for the human reviewed document if the review is succeeded.
    */
  var gcsDestination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason why the review is rejected by reviewer.
    */
  var rejectionReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the review operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ReviewDocumentResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ReviewDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ReviewDocumentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ReviewDocumentResponse](x: Self) {
    
    inline def setGcsDestination(value: String): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationNull: Self = StObject.set(x, "gcsDestination", null)
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    inline def setRejectionReasonNull: Self = StObject.set(x, "rejectionReason", null)
    
    inline def setRejectionReasonUndefined: Self = StObject.set(x, "rejectionReason", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
