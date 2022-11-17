package typings.leaflet.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafletMouseEvent
  extends StObject
     with LeafletEvent {
  
  var containerPoint: Point_
  
  var latlng: LatLng_
  
  var layerPoint: Point_
  
  var originalEvent: MouseEvent
}
object LeafletMouseEvent {
  
  inline def apply(
    containerPoint: Point_,
    latlng: LatLng_,
    layer: Any,
    layerPoint: Point_,
    originalEvent: MouseEvent,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): LeafletMouseEvent = {
    val __obj = js.Dynamic.literal(containerPoint = containerPoint.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerPoint = layerPoint.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletMouseEvent]
  }
  
  extension [Self <: LeafletMouseEvent](x: Self) {
    
    inline def setContainerPoint(value: Point_): Self = StObject.set(x, "containerPoint", value.asInstanceOf[js.Any])
    
    inline def setLatlng(value: LatLng_): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
    
    inline def setLayerPoint(value: Point_): Self = StObject.set(x, "layerPoint", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
