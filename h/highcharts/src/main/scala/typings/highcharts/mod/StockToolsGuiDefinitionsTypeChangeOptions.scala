package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsTypeChangeOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var typeCandlestick: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions] = js.native
  var typeLine: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeLineOptions] = js.native
  var typeOHLC: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions] = js.native
}

object StockToolsGuiDefinitionsTypeChangeOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsTypeChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsTypeChangeOptionsOps[Self <: StockToolsGuiDefinitionsTypeChangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setTypeCandlestick(value: StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions): Self = this.set("typeCandlestick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeCandlestick: Self = this.set("typeCandlestick", js.undefined)
    @scala.inline
    def setTypeLine(value: StockToolsGuiDefinitionsTypeChangeTypeLineOptions): Self = this.set("typeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeLine: Self = this.set("typeLine", js.undefined)
    @scala.inline
    def setTypeOHLC(value: StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions): Self = this.set("typeOHLC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeOHLC: Self = this.set("typeOHLC", js.undefined)
  }
  
}

