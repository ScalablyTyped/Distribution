package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDragendEvent extends TreeListEvent {
  var destination: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
  var source: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
}

object TreeListDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    destination: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null,
    source: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null
  ): TreeListDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[TreeListDragendEvent]
  }
}

