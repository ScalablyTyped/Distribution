package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletEvent extends js.Object {
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
    val __obj = js.Dynamic.literal(layer = layer, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletEvent]
  }
}

