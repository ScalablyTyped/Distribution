package typings.leafletEditable.mod

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LeafletEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeEvent
  extends StObject
     with LeafletEvent {
  
  /**
    * The shape (LatLngs array) subject of the action.
    */
  var shape: js.Array[LatLng_]
}
object ShapeEvent {
  
  inline def apply(
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    shape: js.Array[LatLng_],
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): ShapeEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeEvent]
  }
  
  extension [Self <: ShapeEvent](x: Self) {
    
    inline def setShape(value: js.Array[LatLng_]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: LatLng_ *): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
