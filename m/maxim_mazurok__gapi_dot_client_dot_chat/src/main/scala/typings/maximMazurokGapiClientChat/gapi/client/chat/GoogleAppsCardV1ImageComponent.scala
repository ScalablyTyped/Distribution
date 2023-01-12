package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1ImageComponent extends StObject {
  
  /** The accessibility label for the image. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** The border style to apply to the image. */
  var borderStyle: js.UndefOr[GoogleAppsCardV1BorderStyle] = js.undefined
  
  /** The crop style to apply to the image. */
  var cropStyle: js.UndefOr[GoogleAppsCardV1ImageCropStyle] = js.undefined
  
  /** The image URL. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1ImageComponent {
  
  inline def apply(): GoogleAppsCardV1ImageComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1ImageComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1ImageComponent] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBorderStyle(value: GoogleAppsCardV1BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setCropStyle(value: GoogleAppsCardV1ImageCropStyle): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
    
    inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
