package typings.kendoDashUi.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Navigator
  def isDefaultPrevented(): Boolean
}

object NavigatorEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Navigator): NavigatorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[NavigatorEvent]
  }
}

