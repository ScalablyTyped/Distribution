package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeafletKeyboardEvent extends LeafletEvent {
  var originalEvent: stdLib.KeyboardEvent
}

object LeafletKeyboardEvent {
  @scala.inline
  def apply(originalEvent: stdLib.KeyboardEvent, target: js.Any, `type`: java.lang.String): LeafletKeyboardEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
}

