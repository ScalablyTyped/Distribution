package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewSelectEvent extends TreeViewEvent {
  var node: js.UndefOr[stdLib.Element] = js.undefined
}

object TreeViewSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    node: stdLib.Element = null
  ): TreeViewSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[TreeViewSelectEvent]
  }
}

