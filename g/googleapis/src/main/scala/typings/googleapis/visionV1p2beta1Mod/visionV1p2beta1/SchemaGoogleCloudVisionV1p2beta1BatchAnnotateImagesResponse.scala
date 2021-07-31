package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a batch image annotation request.
  */
trait SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse extends StObject {
  
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponseMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1BatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p2beta1AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
