package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ListView
  def isDefaultPrevented(): Boolean
}

object ListViewEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ListView): ListViewEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ListViewEvent]
  }
}

