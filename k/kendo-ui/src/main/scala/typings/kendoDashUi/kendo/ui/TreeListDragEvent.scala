package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendo.data.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDragEvent extends TreeListEvent {
  var source: js.UndefOr[TreeListModel] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object TreeListDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    source: TreeListModel = null,
    target: JQuery = null
  ): TreeListDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TreeListDragEvent]
  }
}

