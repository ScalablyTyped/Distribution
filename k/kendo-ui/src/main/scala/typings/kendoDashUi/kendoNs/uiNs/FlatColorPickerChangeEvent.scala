package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerChangeEvent extends FlatColorPickerEvent {
  var value: js.UndefOr[String] = js.undefined
}

object FlatColorPickerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: FlatColorPicker,
    value: String = null
  ): FlatColorPickerChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FlatColorPickerChangeEvent]
  }
}

