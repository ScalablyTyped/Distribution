package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSelectEvent extends StockChartEvent {
  var axis: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[stdLib.Date] = js.undefined
  var to: js.UndefOr[stdLib.Date] = js.undefined
}

object StockChartSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    axis: js.Any = null,
    from: stdLib.Date = null,
    to: stdLib.Date = null
  ): StockChartSelectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[StockChartSelectEvent]
  }
}

