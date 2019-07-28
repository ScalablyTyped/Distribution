package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ButtonGroup
  def isDefaultPrevented(): Boolean
}

object ButtonGroupEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ButtonGroup): ButtonGroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ButtonGroupEvent]
  }
}

