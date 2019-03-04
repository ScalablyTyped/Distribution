package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarEvent extends js.Object {
  var preventDefault: js.Function
  var sender: PanelBar
  def isDefaultPrevented(): scala.Boolean
}

object PanelBarEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: PanelBar): PanelBarEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[PanelBarEvent]
  }
}

