package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLayerOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[Map[Element]] = js.undefined
  
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  
  var screenOverlays: js.UndefOr[Boolean] = js.undefined
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object KmlLayerOptions {
  
  inline def apply(): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmlLayerOptions]
  }
  
  extension [Self <: KmlLayerOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    inline def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    inline def setScreenOverlays(value: Boolean): Self = StObject.set(x, "screenOverlays", value.asInstanceOf[js.Any])
    
    inline def setScreenOverlaysUndefined: Self = StObject.set(x, "screenOverlays", js.undefined)
    
    inline def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
