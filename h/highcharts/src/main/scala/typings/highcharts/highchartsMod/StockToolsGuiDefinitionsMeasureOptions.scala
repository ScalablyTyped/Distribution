package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsMeasureOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var measureX: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXOptions] = js.undefined
  var measureXY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXYOptions] = js.undefined
  var measureY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureYOptions] = js.undefined
}

object StockToolsGuiDefinitionsMeasureOptions {
  @scala.inline
  def apply(
    items: js.Array[_] = null,
    measureX: StockToolsGuiDefinitionsMeasureMeasureXOptions = null,
    measureXY: StockToolsGuiDefinitionsMeasureMeasureXYOptions = null,
    measureY: StockToolsGuiDefinitionsMeasureMeasureYOptions = null
  ): StockToolsGuiDefinitionsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (measureX != null) __obj.updateDynamic("measureX")(measureX)
    if (measureXY != null) __obj.updateDynamic("measureXY")(measureXY)
    if (measureY != null) __obj.updateDynamic("measureY")(measureY)
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
}

