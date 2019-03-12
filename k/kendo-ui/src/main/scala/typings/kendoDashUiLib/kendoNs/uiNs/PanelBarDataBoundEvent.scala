package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarDataBoundEvent extends PanelBarEvent {
  var node: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object PanelBarDataBoundEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    node: kendoDashUiLib.JQuery = null
  ): PanelBarDataBoundEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[PanelBarDataBoundEvent]
  }
}

