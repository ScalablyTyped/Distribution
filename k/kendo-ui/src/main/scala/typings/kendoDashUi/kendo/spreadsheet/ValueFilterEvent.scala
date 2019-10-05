package typings.kendoDashUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ValueFilter
  def isDefaultPrevented(): Boolean
}

object ValueFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ValueFilter): ValueFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ValueFilterEvent]
  }
}

