package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest extends StObject {
  
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.undefined
  
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Image] = js.undefined
  
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Feature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setImage(value: SchemaGoogleCloudVisionV1p1beta1Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageContext(value: SchemaGoogleCloudVisionV1p1beta1ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
