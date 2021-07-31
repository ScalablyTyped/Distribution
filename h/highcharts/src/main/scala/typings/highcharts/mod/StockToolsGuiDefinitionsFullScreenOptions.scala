package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsFullScreenOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsFullScreenOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsFullScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsFullScreenOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsFullScreenOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsFullScreenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
