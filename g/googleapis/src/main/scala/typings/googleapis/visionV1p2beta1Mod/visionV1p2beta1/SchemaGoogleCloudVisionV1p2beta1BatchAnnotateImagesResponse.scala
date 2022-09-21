package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse extends StObject {
  
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
