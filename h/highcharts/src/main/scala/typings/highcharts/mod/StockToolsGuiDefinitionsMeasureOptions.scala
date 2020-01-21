package typings.highcharts.mod

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
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (measureX != null) __obj.updateDynamic("measureX")(measureX.asInstanceOf[js.Any])
    if (measureXY != null) __obj.updateDynamic("measureXY")(measureXY.asInstanceOf[js.Any])
    if (measureY != null) __obj.updateDynamic("measureY")(measureY.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
}

