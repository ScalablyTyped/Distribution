package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotateFileResponse extends StObject {
  
  /**
    * If set, represents the error message for the failed request. The `responses` field will not be set in this case.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.undefined
  
  /**
    * Individual responses to images found within the file. This field will be empty if the `error` field is set.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.undefined
  
  /**
    * This field gives the total number of pages in the file.
    */
  var totalPages: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAnnotateFileResponse {
  
  inline def apply(): SchemaAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateFileResponse]
  }
  
  extension [Self <: SchemaAnnotateFileResponse](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPagesNull: Self = StObject.set(x, "totalPages", null)
    
    inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
  }
}
