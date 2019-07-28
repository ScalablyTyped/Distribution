package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsVerticalLabelsOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var verticalArrow: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] = js.undefined
  var verticalCounter: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions] = js.undefined
  var verticalLabel: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions] = js.undefined
}

object StockToolsGuiDefinitionsVerticalLabelsOptions {
  @scala.inline
  def apply(
    items: js.Array[_] = null,
    verticalArrow: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions = null,
    verticalCounter: StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions = null,
    verticalLabel: StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions = null
  ): StockToolsGuiDefinitionsVerticalLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (verticalArrow != null) __obj.updateDynamic("verticalArrow")(verticalArrow)
    if (verticalCounter != null) __obj.updateDynamic("verticalCounter")(verticalCounter)
    if (verticalLabel != null) __obj.updateDynamic("verticalLabel")(verticalLabel)
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsOptions]
  }
}

