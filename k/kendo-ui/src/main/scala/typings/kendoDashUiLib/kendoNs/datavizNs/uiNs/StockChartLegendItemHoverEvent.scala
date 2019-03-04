package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendItemHoverEvent extends StockChartEvent {
  var element: js.UndefOr[js.Any] = js.undefined
  var pointIndex: js.UndefOr[scala.Double] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var seriesIndex: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartLegendItemHoverEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: StockChart,
    element: js.Any = null,
    pointIndex: scala.Int | scala.Double = null,
    series: js.Any = null,
    seriesIndex: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): StockChartLegendItemHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[StockChartLegendItemHoverEvent]
  }
}

