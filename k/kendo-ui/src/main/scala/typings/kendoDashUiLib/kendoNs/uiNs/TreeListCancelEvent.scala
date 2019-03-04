package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListCancelEvent extends TreeListEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
}

object TreeListCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    container: kendoDashUiLib.JQuery = null,
    model: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null
  ): TreeListCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListCancelEvent]
  }
}

