package typings.kendoDashUi.kendo.dataviz.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSelectEndEvent extends StockChartEvent {
  var axis: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[Date] = js.undefined
  var to: js.UndefOr[Date] = js.undefined
}

object StockChartSelectEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: StockChart,
    axis: js.Any = null,
    from: Date = null,
    to: Date = null
  ): StockChartSelectEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[StockChartSelectEndEvent]
  }
}

