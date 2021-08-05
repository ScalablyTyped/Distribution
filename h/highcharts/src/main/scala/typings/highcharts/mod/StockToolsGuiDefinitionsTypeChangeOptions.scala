package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsTypeChangeOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var typeCandlestick: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions] = js.undefined
  
  var typeLine: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeLineOptions] = js.undefined
  
  var typeOHLC: js.UndefOr[StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions] = js.undefined
}
object StockToolsGuiDefinitionsTypeChangeOptions {
  
  inline def apply(): StockToolsGuiDefinitionsTypeChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsTypeChangeOptions](x: Self) {
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTypeCandlestick(value: StockToolsGuiDefinitionsTypeChangeTypeCandlestickOptions): Self = StObject.set(x, "typeCandlestick", value.asInstanceOf[js.Any])
    
    inline def setTypeCandlestickUndefined: Self = StObject.set(x, "typeCandlestick", js.undefined)
    
    inline def setTypeLine(value: StockToolsGuiDefinitionsTypeChangeTypeLineOptions): Self = StObject.set(x, "typeLine", value.asInstanceOf[js.Any])
    
    inline def setTypeLineUndefined: Self = StObject.set(x, "typeLine", js.undefined)
    
    inline def setTypeOHLC(value: StockToolsGuiDefinitionsTypeChangeTypeOHLCOptions): Self = StObject.set(x, "typeOHLC", value.asInstanceOf[js.Any])
    
    inline def setTypeOHLCUndefined: Self = StObject.set(x, "typeOHLC", js.undefined)
  }
}
