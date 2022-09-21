package typings.kakaomaps.kakao.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOverlayOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[HTMLElement | String] = js.undefined
  
  var map: js.UndefOr[Map | Roadview] = js.undefined
  
  var position: js.UndefOr[LatLng | Viewpoint] = js.undefined
  
  var xAnchor: js.UndefOr[Double] = js.undefined
  
  var yAnchor: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CustomOverlayOptions {
  
  inline def apply(): CustomOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomOverlayOptions]
  }
  
  extension [Self <: CustomOverlayOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setContent(value: HTMLElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMap(value: Map | Roadview): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPosition(value: LatLng | Viewpoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setXAnchor(value: Double): Self = StObject.set(x, "xAnchor", value.asInstanceOf[js.Any])
    
    inline def setXAnchorUndefined: Self = StObject.set(x, "xAnchor", js.undefined)
    
    inline def setYAnchor(value: Double): Self = StObject.set(x, "yAnchor", value.asInstanceOf[js.Any])
    
    inline def setYAnchorUndefined: Self = StObject.set(x, "yAnchor", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
