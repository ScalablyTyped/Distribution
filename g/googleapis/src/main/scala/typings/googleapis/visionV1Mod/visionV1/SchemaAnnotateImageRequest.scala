package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
trait SchemaAnnotateImageRequest extends StObject {
  
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.undefined
  
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.undefined
}
object SchemaAnnotateImageRequest {
  
  inline def apply(): SchemaAnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateImageRequest]
  }
  
  extension [Self <: SchemaAnnotateImageRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[SchemaFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: SchemaFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageContext(value: SchemaImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
