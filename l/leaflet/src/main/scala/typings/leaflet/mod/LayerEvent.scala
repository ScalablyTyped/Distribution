package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerEvent
  extends StObject
     with LeafletEvent {
  
  @JSName("layer")
  var layer_LayerEvent: Layer
}
object LayerEvent {
  
  inline def apply(layer: Layer, popup: Any, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): LayerEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerEvent]
  }
  
  extension [Self <: LayerEvent](x: Self) {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
