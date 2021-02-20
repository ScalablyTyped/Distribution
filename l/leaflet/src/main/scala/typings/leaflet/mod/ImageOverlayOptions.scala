package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageOverlayOptions extends InteractiveLayerOptions {
  
  var alt: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  
  var errorOverlayUrl: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ImageOverlayOptions {
  
  @scala.inline
  def apply(): ImageOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOverlayOptions]
  }
  
  @scala.inline
  implicit class ImageOverlayOptionsMutableBuilder[Self <: ImageOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setErrorOverlayUrl(value: String): Self = StObject.set(x, "errorOverlayUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOverlayUrlUndefined: Self = StObject.set(x, "errorOverlayUrl", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
