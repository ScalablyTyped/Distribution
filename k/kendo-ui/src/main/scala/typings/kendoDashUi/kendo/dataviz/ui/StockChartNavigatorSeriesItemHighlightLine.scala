package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemHighlightLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorSeriesItemHighlightLine {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null, width: Int | Double = null): StockChartNavigatorSeriesItemHighlightLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlightLine]
  }
}

