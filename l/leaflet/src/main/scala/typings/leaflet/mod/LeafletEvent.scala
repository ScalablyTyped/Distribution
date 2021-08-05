package typings.leaflet.mod

import typings.leaflet.mod.DomEvent._PropagableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafletEvent
  extends StObject
     with _PropagableEvent {
  
  /**
    * @deprecated The same as {@link LeafletEvent.propagatedFrom propagatedFrom}.
    */
  var layer: js.Any
  
  var propagatedFrom: js.Any
  
  var sourceTarget: js.Any
  
  var target: js.Any
  
  var `type`: String
}
object LeafletEvent {
  
  inline def apply(layer: js.Any, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): LeafletEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletEvent]
  }
  
  extension [Self <: LeafletEvent](x: Self) {
    
    inline def setLayer(value: js.Any): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setPropagatedFrom(value: js.Any): Self = StObject.set(x, "propagatedFrom", value.asInstanceOf[js.Any])
    
    inline def setSourceTarget(value: js.Any): Self = StObject.set(x, "sourceTarget", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
