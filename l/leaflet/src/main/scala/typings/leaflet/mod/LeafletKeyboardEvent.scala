package typings.leaflet.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DomEvent._PropagableEvent because Already inherited */ @js.native
trait LeafletKeyboardEvent extends LeafletEvent {
  
  var originalEvent: KeyboardEvent = js.native
}
object LeafletKeyboardEvent {
  
  @scala.inline
  def apply(
    layer: js.Any,
    originalEvent: KeyboardEvent,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LeafletKeyboardEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
  
  @scala.inline
  implicit class LeafletKeyboardEventMutableBuilder[Self <: LeafletKeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: KeyboardEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
