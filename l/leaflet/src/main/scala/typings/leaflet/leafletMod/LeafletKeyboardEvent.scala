package typings.leaflet.leafletMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletKeyboardEvent extends LeafletEvent {
  var originalEvent: KeyboardEvent
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
    val __obj = js.Dynamic.literal(layer = layer, originalEvent = originalEvent, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
}

