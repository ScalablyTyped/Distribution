package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsAdvancedTimeCyclesOptions extends StObject {
  
  /**
    * (Highstock) A predefined backgroud symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsAdvancedTimeCyclesOptions {
  
  inline def apply(): StockToolsGuiDefinitionsAdvancedTimeCyclesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedTimeCyclesOptions]
  }
  
  extension [Self <: StockToolsGuiDefinitionsAdvancedTimeCyclesOptions](x: Self) {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
