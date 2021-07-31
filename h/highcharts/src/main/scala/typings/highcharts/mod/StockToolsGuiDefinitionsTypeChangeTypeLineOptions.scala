package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsTypeChangeTypeLineOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsTypeChangeTypeLineOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsTypeChangeTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsTypeChangeTypeLineOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsTypeChangeTypeLineOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsTypeChangeTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
