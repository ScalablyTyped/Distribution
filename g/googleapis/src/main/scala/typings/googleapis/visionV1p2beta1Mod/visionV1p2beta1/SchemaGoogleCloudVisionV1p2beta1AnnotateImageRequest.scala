package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
trait SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest extends StObject {
  
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Feature]] = js.undefined
  
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1Image] = js.undefined
  
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ImageContext] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[SchemaGoogleCloudVisionV1p2beta1Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: SchemaGoogleCloudVisionV1p2beta1Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setImage(value: SchemaGoogleCloudVisionV1p2beta1Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageContext(value: SchemaGoogleCloudVisionV1p2beta1ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
