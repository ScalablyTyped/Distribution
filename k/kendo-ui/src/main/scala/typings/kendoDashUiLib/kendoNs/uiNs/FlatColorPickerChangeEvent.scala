package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerChangeEvent extends FlatColorPickerEvent {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FlatColorPickerChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: FlatColorPicker,
    value: java.lang.String = null
  ): FlatColorPickerChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FlatColorPickerChangeEvent]
  }
}

