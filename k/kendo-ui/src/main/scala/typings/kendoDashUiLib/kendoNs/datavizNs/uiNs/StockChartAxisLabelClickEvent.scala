package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartAxisLabelClickEvent extends StockChartEvent {
  var axis: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var index: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartAxisLabelClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    axis: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    index: js.Any = null,
    text: js.Any = null,
    value: js.Any = null
  ): StockChartAxisLabelClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (index != null) __obj.updateDynamic("index")(index)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartAxisLabelClickEvent]
  }
}

