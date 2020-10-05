package typings.leaflet.mod

import typings.std.KeyboardEvent
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
  implicit class LeafletKeyboardEventOps[Self <: LeafletKeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginalEvent(value: KeyboardEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
  
}

