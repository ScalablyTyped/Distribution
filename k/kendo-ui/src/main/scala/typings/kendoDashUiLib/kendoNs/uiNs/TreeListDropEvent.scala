package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDropEvent extends TreeListEvent {
  var destination: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
  var dropTarget: js.UndefOr[stdLib.Element] = js.undefined
  var setValid: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.TreeListModel] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeListDropEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    destination: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null,
    dropTarget: stdLib.Element = null,
    setValid: js.UndefOr[scala.Boolean] = js.undefined,
    source: kendoDashUiLib.kendoNs.dataNs.TreeListModel = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeListDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (!js.isUndefined(setValid)) __obj.updateDynamic("setValid")(setValid)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[TreeListDropEvent]
  }
}

