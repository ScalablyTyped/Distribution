package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOverlayOptions
  extends StObject
     with InteractiveLayerOptions {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[CrossOrigin | Boolean] = js.undefined
  
  var errorOverlayUrl: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ImageOverlayOptions {
  
  inline def apply(): ImageOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOverlayOptions]
  }
  
  extension [Self <: ImageOverlayOptions](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setErrorOverlayUrl(value: String): Self = StObject.set(x, "errorOverlayUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorOverlayUrlUndefined: Self = StObject.set(x, "errorOverlayUrl", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
