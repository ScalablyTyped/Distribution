package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListRemoveEvent extends TreeListEvent {
  var model: js.UndefOr[TreeListModel] = js.undefined
  var row: js.UndefOr[JQuery] = js.undefined
}

object TreeListRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    model: TreeListModel = null,
    row: JQuery = null
  ): TreeListRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[TreeListRemoveEvent]
  }
}

