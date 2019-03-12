package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesHoverEvent extends SparklineEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var percentage: js.UndefOr[js.Any] = js.undefined
  var series: js.UndefOr[SparklineSeriesHoverEventSeries] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SparklineSeriesHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Sparkline,
    category: js.Any = null,
    dataItem: js.Any = null,
    element: js.Any = null,
    percentage: js.Any = null,
    series: SparklineSeriesHoverEventSeries = null,
    value: js.Any = null
  ): SparklineSeriesHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem)
    if (element != null) __obj.updateDynamic("element")(element)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (series != null) __obj.updateDynamic("series")(series)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SparklineSeriesHoverEvent]
  }
}

