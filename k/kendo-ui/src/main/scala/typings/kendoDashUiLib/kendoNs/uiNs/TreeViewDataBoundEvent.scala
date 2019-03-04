package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDataBoundEvent extends TreeViewEvent {
  var node: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object TreeViewDataBoundEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    node: kendoDashUiLib.JQuery = null
  ): TreeViewDataBoundEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[TreeViewDataBoundEvent]
  }
}

