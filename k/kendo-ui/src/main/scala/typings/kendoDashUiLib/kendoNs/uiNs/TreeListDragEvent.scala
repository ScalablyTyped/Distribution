package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDragEvent extends TreeListEvent {
  var source: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object TreeListDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    source: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null,
    target: kendoDashUiLib.JQuery = null
  ): TreeListDragEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TreeListDragEvent]
  }
}

