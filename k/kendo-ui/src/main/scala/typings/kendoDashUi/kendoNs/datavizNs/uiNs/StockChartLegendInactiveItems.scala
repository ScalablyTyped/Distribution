package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendInactiveItems extends js.Object {
  var labels: js.UndefOr[StockChartLegendInactiveItemsLabels] = js.undefined
  var markers: js.UndefOr[StockChartLegendInactiveItemsMarkers] = js.undefined
}

object StockChartLegendInactiveItems {
  @scala.inline
  def apply(
    labels: StockChartLegendInactiveItemsLabels = null,
    markers: StockChartLegendInactiveItemsMarkers = null
  ): StockChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    __obj.asInstanceOf[StockChartLegendInactiveItems]
  }
}

