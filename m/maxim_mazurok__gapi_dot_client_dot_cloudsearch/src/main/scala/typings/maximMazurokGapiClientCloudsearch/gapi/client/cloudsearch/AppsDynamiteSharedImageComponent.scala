package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedImageComponent extends StObject {
  
  /** The accessibility label for the image. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** The border style to apply to the image. */
  var borderStyle: js.UndefOr[AppsDynamiteSharedBorderStyle] = js.undefined
  
  /** The crop style to apply to the image. */
  var cropStyle: js.UndefOr[AppsDynamiteSharedImageCropStyle] = js.undefined
  
  /** The image URL. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedImageComponent {
  
  inline def apply(): AppsDynamiteSharedImageComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedImageComponent]
  }
  
  extension [Self <: AppsDynamiteSharedImageComponent](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBorderStyle(value: AppsDynamiteSharedBorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setCropStyle(value: AppsDynamiteSharedImageCropStyle): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
    
    inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
