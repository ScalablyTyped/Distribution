package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotAttributes extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var onSlotchange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
}

object SlotAttributes {
  @scala.inline
  def apply(name: String = null, onSlotchange: /* event */ Event => Unit = null, slot: String = null): SlotAttributes = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onSlotchange != null) __obj.updateDynamic("onSlotchange")(js.Any.fromFunction1(onSlotchange))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotAttributes]
  }
}

