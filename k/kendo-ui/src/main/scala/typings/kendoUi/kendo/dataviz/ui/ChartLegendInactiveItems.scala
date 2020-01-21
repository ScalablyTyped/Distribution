package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendInactiveItems extends js.Object {
  var labels: js.UndefOr[ChartLegendInactiveItemsLabels] = js.undefined
}

object ChartLegendInactiveItems {
  @scala.inline
  def apply(labels: ChartLegendInactiveItemsLabels = null): ChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendInactiveItems]
  }
}

