package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListExpandEvent extends TreeListEvent {
  var model: js.UndefOr[TreeListModel] = js.undefined
}

object TreeListExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    model: TreeListModel = null
  ): TreeListExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListExpandEvent]
  }
}

