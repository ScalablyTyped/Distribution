package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedTextBoxEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MaskedTextBox
  def isDefaultPrevented(): Boolean
}

object MaskedTextBoxEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: MaskedTextBox): MaskedTextBoxEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MaskedTextBoxEvent]
  }
}

