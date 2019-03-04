package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListCollapseEvent extends TreeListEvent {
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
}

object TreeListCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    model: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null
  ): TreeListCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListCollapseEvent]
  }
}

