package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayoutReorderEvent extends TileLayoutEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
}

object TileLayoutReorderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TileLayout,
    container: JQuery = null,
    newIndex: js.UndefOr[Double] = js.undefined,
    oldIndex: js.UndefOr[Double] = js.undefined
  ): TileLayoutReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(newIndex)) __obj.updateDynamic("newIndex")(newIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldIndex)) __obj.updateDynamic("oldIndex")(oldIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutReorderEvent]
  }
}

