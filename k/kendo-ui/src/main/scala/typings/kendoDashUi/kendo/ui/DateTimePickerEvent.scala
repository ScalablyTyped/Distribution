package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DateTimePicker
  def isDefaultPrevented(): Boolean
}

object DateTimePickerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DateTimePicker): DateTimePickerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DateTimePickerEvent]
  }
}

