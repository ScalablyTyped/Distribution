package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendItemLeaveEvent extends ChartEvent {
  var element: js.UndefOr[js.Any] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ChartLegendItemLeaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Chart,
    element: js.Any = null,
    pointIndex: js.UndefOr[Double] = js.undefined,
    series: js.Any = null,
    seriesIndex: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): ChartLegendItemLeaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(pointIndex)) __obj.updateDynamic("pointIndex")(pointIndex.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesIndex)) __obj.updateDynamic("seriesIndex")(seriesIndex.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendItemLeaveEvent]
  }
}

