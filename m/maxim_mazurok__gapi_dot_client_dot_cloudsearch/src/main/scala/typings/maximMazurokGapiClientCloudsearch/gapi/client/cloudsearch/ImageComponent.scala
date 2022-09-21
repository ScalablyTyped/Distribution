package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageComponent extends StObject {
  
  var altText: js.UndefOr[String] = js.undefined
  
  var borderStyle: js.UndefOr[BorderStyle] = js.undefined
  
  var cropStyle: js.UndefOr[ImageCropStyle] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
}
object ImageComponent {
  
  inline def apply(): ImageComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageComponent]
  }
  
  extension [Self <: ImageComponent](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBorderStyle(value: BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setCropStyle(value: ImageCropStyle): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
    
    inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
  }
}
