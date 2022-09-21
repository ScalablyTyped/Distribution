package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchAnnotateImagesResponse extends StObject {
  
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaAnnotateImageResponse]] = js.undefined
}
object SchemaBatchAnnotateImagesResponse {
  
  inline def apply(): SchemaBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateImagesResponse]
  }
  
  extension [Self <: SchemaBatchAnnotateImagesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaAnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaAnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
