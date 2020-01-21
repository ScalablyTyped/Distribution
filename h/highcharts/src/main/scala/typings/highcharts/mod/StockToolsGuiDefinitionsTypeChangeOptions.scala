package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsTypeChangeOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var typeCandlestick: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions] = js.undefined
  var typeLine: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeLineOptions] = js.undefined
  var typeOHLC: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions] = js.undefined
}

object StockToolsGuiDefinitionsTypeChangeOptions {
  @scala.inline
  def apply(
    items: js.Array[_] = null,
    typeCandlestick: StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions = null,
    typeLine: StockToolsGuiDefinitionsTypeChangeTypeLineOptions = null,
    typeOHLC: StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions = null
  ): StockToolsGuiDefinitionsTypeChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (typeCandlestick != null) __obj.updateDynamic("typeCandlestick")(typeCandlestick.asInstanceOf[js.Any])
    if (typeLine != null) __obj.updateDynamic("typeLine")(typeLine.asInstanceOf[js.Any])
    if (typeOHLC != null) __obj.updateDynamic("typeOHLC")(typeOHLC.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeOptions]
  }
}

