package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest extends StObject {
  
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.native
  
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Image] = js.native
  
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequestMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: SchemaGoogleCloudVisionV1p1beta1Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContext(value: SchemaGoogleCloudVisionV1p1beta1ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
