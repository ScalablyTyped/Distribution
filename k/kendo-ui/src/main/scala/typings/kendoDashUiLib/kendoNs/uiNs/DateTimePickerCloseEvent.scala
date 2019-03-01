package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerCloseEvent extends DateTimePickerEvent {
  var view: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimePickerCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: DateTimePicker,
    view: java.lang.String = null
  ): DateTimePickerCloseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[DateTimePickerCloseEvent]
  }
}

