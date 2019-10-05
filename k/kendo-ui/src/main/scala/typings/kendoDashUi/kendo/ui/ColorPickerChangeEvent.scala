package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerChangeEvent extends ColorPickerEvent {
  var value: js.UndefOr[String] = js.undefined
}

object ColorPickerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ColorPicker,
    value: String = null
  ): ColorPickerChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorPickerChangeEvent]
  }
}

