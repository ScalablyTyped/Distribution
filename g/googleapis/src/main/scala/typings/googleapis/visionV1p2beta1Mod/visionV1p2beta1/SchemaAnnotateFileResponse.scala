package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
trait SchemaAnnotateFileResponse extends StObject {
  
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.undefined
  
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.undefined
}
object SchemaAnnotateFileResponse {
  
  inline def apply(): SchemaAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateFileResponse]
  }
  
  extension [Self <: SchemaAnnotateFileResponse](x: Self) {
    
    inline def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
