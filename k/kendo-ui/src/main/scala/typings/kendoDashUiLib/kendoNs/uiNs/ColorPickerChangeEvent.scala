package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerChangeEvent extends ColorPickerEvent {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ColorPickerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ColorPicker,
    value: java.lang.String = null
  ): ColorPickerChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorPickerChangeEvent]
  }
}

