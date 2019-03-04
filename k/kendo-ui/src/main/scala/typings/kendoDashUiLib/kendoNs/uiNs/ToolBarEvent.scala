package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ToolBar
  def isDefaultPrevented(): scala.Boolean
}

object ToolBarEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ToolBar): ToolBarEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ToolBarEvent]
  }
}

