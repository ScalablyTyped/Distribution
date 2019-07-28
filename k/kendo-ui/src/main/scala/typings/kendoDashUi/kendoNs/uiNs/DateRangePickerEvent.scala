package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangePickerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DateRangePicker
  def isDefaultPrevented(): Boolean
}

object DateRangePickerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DateRangePicker): DateRangePickerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DateRangePickerEvent]
  }
}

