package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDataBindingEvent extends GridEvent {
  var action: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
}

object GridDataBindingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    action: String = null,
    index: js.UndefOr[Double] = js.undefined,
    items: js.Any = null
  ): GridDataBindingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDataBindingEvent]
  }
}

