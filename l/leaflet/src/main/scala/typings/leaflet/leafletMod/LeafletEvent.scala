package typings.leaflet.leafletMod

import typings.leaflet.leafletMod.DomEvent._PropagableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEvent extends _PropagableEvent {
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
  @scala.inline
  def apply(layer: js.Any, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): LeafletEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletEvent]
  }
}

