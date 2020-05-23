package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnReorderEvent extends GridEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
}

object GridColumnReorderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    column: js.Any = null,
    newIndex: js.UndefOr[Double] = js.undefined,
    oldIndex: js.UndefOr[Double] = js.undefined
  ): GridColumnReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldIndex)) __obj.updateDynamic("oldIndex")(oldIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnReorderEvent]
  }
}

