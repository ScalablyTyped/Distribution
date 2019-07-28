package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNoteHoverEvent extends StockChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object StockChartNoteHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: StockChart,
    category: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    series: js.Any = null,
    value: js.Any = null
  ): StockChartNoteHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (series != null) __obj.updateDynamic("series")(series)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StockChartNoteHoverEvent]
  }
}

