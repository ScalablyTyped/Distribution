package typings.kendoUi.kendo.ui

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
    newWidth: js.UndefOr[Double] = js.undefined,
    oldWidth: js.UndefOr[Double] = js.undefined
  ): TreeListColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(newWidth)) __obj.updateDynamic("newWidth")(newWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldWidth)) __obj.updateDynamic("oldWidth")(oldWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnResizeEvent]
  }
}

