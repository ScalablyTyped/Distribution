package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendInactiveItemsMarkers extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object StockChartLegendInactiveItemsMarkers {
  @scala.inline
  def apply(color: String = null): StockChartLegendInactiveItemsMarkers = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartLegendInactiveItemsMarkers]
  }
}

