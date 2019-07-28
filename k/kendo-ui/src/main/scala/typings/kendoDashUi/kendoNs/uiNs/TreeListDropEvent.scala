package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.TreeListModel
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDropEvent extends TreeListEvent {
  var destination: js.UndefOr[TreeListModel] = js.undefined
  var dropTarget: js.UndefOr[Element] = js.undefined
  var setValid: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[TreeListModel] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object TreeListDropEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    destination: TreeListModel = null,
    dropTarget: Element = null,
    setValid: js.UndefOr[Boolean] = js.undefined,
    source: TreeListModel = null,
    valid: js.UndefOr[Boolean] = js.undefined
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

