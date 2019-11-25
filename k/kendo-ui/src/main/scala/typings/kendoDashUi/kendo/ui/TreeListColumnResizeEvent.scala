package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnResizeEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newWidth: js.UndefOr[Double] = js.undefined
  var oldWidth: js.UndefOr[Double] = js.undefined
}

object TreeListColumnResizeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null,
    newWidth: Int | Double = null,
    oldWidth: Int | Double = null
  ): TreeListColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnResizeEvent]
  }
}

