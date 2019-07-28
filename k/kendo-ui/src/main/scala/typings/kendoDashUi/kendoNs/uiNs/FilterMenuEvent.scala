package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuEvent extends js.Object {
  var preventDefault: js.Function
  var sender: FilterMenu
  def isDefaultPrevented(): Boolean
}

object FilterMenuEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: FilterMenu): FilterMenuEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[FilterMenuEvent]
  }
}

