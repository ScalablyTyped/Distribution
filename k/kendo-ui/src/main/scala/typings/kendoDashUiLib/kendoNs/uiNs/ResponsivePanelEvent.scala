package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsivePanelEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ResponsivePanel
  def isDefaultPrevented(): scala.Boolean
}

object ResponsivePanelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ResponsivePanel
  ): ResponsivePanelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ResponsivePanelEvent]
  }
}

