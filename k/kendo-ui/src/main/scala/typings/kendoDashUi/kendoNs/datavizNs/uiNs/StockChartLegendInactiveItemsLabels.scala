package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartLegendInactiveItemsLabels extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object StockChartLegendInactiveItemsLabels {
  @scala.inline
  def apply(color: String = null, font: String = null, template: String = null): StockChartLegendInactiveItemsLabels = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[StockChartLegendInactiveItemsLabels]
  }
}

