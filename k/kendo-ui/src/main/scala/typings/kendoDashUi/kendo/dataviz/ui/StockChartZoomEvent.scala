package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartZoomEvent extends StockChartEvent {
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object StockChartZoomEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: StockChart,
    axisRanges: js.Any = null,
    delta: Int | Double = null,
    originalEvent: js.Any = null
  ): StockChartZoomEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (axisRanges != null) __obj.updateDynamic("axisRanges")(axisRanges.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartZoomEvent]
  }
}

