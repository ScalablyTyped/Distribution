package typings.kendoDashUi.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Group
  def isDefaultPrevented(): Boolean
}

object GroupEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Group): GroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[GroupEvent]
  }
}

