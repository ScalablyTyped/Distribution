package typings.kakaomaps.kakao.maps.drawing

import typings.kakaomaps.kakao.maps.Coords
import typings.kakaomaps.kakao.maps.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEvent extends StObject {
  
  var coords: Coords
  
  var overlayType: OverlayType
  
  var point: Point
  
  var target: js.Object
}
object MouseEvent {
  
  inline def apply(coords: Coords, overlayType: OverlayType, point: Point, target: js.Object): MouseEvent = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], overlayType = overlayType.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  extension [Self <: MouseEvent](x: Self) {
    
    inline def setCoords(value: Coords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setOverlayType(value: OverlayType): Self = StObject.set(x, "overlayType", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
