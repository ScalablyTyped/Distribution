package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemOverlay extends js.Object {
  var gradient: js.UndefOr[String] = js.undefined
}

object StockChartNavigatorSeriesItemOverlay {
  @scala.inline
  def apply(gradient: String = null): StockChartNavigatorSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    __obj.asInstanceOf[StockChartNavigatorSeriesItemOverlay]
  }
}

