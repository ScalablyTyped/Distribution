package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesLeaveEvent extends ChartEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var percentage: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[ChartSeriesLeaveEventSeries] = js.undefined
  var stackValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartSeriesLeaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Chart,
    category: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    percentage: js.Any = null,
    series: ChartSeriesLeaveEventSeries = null,
    stackValue: js.Any = null,
    value: js.Any = null
  ): ChartSeriesLeaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackValue != null) __obj.updateDynamic("stackValue")(stackValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartSeriesLeaveEvent]
  }
}

