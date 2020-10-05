package typings.leaflet.mod

import typings.leaflet.mod.DomEvent._PropagableEvent
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
  implicit class LeafletEventOps[Self <: LeafletEvent] (val x: Self) extends AnyVal {
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
    def setLayer(value: js.Any): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagatedFrom(value: js.Any): Self = this.set("propagatedFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceTarget(value: js.Any): Self = this.set("sourceTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

