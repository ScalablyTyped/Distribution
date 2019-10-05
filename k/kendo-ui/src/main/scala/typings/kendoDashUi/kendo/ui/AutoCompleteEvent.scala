package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteEvent extends js.Object {
  var preventDefault: js.Function
  var sender: AutoComplete
  def isDefaultPrevented(): Boolean
}

object AutoCompleteEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: AutoComplete): AutoCompleteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[AutoCompleteEvent]
  }
}

