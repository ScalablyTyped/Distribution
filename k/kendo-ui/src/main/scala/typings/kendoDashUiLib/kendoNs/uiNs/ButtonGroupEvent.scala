package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ButtonGroup
  def isDefaultPrevented(): scala.Boolean
}

object ButtonGroupEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ButtonGroup): ButtonGroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ButtonGroupEvent]
  }
}

