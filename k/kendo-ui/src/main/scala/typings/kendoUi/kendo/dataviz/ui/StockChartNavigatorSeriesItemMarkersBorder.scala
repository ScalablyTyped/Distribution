package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemMarkersBorder extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorSeriesItemMarkersBorder {
  @scala.inline
  def apply(color: String = null, width: js.UndefOr[Double] = js.undefined): StockChartNavigatorSeriesItemMarkersBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItemMarkersBorder]
  }
}

