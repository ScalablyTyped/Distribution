package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemTooltipBorder extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorSeriesItemTooltipBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): StockChartNavigatorSeriesItemTooltipBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItemTooltipBorder]
  }
}

