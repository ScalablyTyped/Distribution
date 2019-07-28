package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinePlotAreaHoverEvent extends SparklineEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SparklinePlotAreaHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Sparkline,
    category: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    value: js.Any = null
  ): SparklinePlotAreaHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SparklinePlotAreaHoverEvent]
  }
}

