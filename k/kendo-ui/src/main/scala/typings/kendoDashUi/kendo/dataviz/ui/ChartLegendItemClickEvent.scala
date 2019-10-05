package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendItemClickEvent extends ChartEvent {
  var element: js.UndefOr[js.Any] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var seriesIndex: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ChartLegendItemClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Chart,
    element: js.Any = null,
    pointIndex: Int | Double = null,
    series: js.Any = null,
    seriesIndex: Int | Double = null,
    text: String = null
  ): ChartLegendItemClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChartLegendItemClickEvent]
  }
}

