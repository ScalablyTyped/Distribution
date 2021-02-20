package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsTypeChangeOptions extends StObject {
  
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
  implicit class StockToolsGuiDefinitionsTypeChangeOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsTypeChangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTypeCandlestick(value: StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions): Self = StObject.set(x, "typeCandlestick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCandlestickUndefined: Self = StObject.set(x, "typeCandlestick", js.undefined)
    
    @scala.inline
    def setTypeLine(value: StockToolsGuiDefinitionsTypeChangeTypeLineOptions): Self = StObject.set(x, "typeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeLineUndefined: Self = StObject.set(x, "typeLine", js.undefined)
    
    @scala.inline
    def setTypeOHLC(value: StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions): Self = StObject.set(x, "typeOHLC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeOHLCUndefined: Self = StObject.set(x, "typeOHLC", js.undefined)
  }
}
