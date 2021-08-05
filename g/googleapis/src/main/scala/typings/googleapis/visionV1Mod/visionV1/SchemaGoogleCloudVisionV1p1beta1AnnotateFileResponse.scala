package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
trait SchemaGoogleCloudVisionV1p1beta1AnnotateFileResponse extends StObject {
  
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1InputConfig] = js.undefined
  
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageResponse]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1AnnotateFileResponse {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AnnotateFileResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1AnnotateFileResponse](x: Self) {
    
    inline def setInputConfig(value: SchemaGoogleCloudVisionV1p1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p1beta1AnnotateImageResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
