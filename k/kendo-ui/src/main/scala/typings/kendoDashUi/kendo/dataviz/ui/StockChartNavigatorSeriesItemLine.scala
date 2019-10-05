package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object StockChartNavigatorSeriesItemLine {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null, width: String = null): StockChartNavigatorSeriesItemLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StockChartNavigatorSeriesItemLine]
  }
}

