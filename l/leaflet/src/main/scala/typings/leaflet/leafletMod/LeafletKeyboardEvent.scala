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
  def apply(originalEvent: KeyboardEvent, target: js.Any, `type`: String): LeafletKeyboardEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
}

