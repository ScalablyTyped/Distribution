package typings.kakaomaps.kakao.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPanels extends StObject {
  
  var overlayLayer: HTMLElement
}
object MapPanels {
  
  inline def apply(overlayLayer: HTMLElement): MapPanels = {
    val __obj = js.Dynamic.literal(overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanels]
  }
  
  extension [Self <: MapPanels](x: Self) {
    
    inline def setOverlayLayer(value: HTMLElement): Self = StObject.set(x, "overlayLayer", value.asInstanceOf[js.Any])
  }
}
