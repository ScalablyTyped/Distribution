package typings.leaflet.mod

import typings.leaflet.mod.DomEvent._PropagableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafletEvent extends _PropagableEvent {
  
  /**
    * @deprecated The same as {@link LeafletEvent.propagatedFrom propagatedFrom}.
    */
  var layer: js.Any = js.native
  
  var propagatedFrom: js.Any = js.native
  
  var sourceTarget: js.Any = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object LeafletEvent {
  
  @scala.inline
  def apply(layer: js.Any, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): LeafletEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletEvent]
  }
  
  @scala.inline
  implicit class LeafletEventMutableBuilder[Self <: LeafletEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: js.Any): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagatedFrom(value: js.Any): Self = StObject.set(x, "propagatedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTarget(value: js.Any): Self = StObject.set(x, "sourceTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
