package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsZoomChangeZoomXOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsZoomChangeZoomXOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsZoomChangeZoomXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsZoomChangeZoomXOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsZoomChangeZoomXOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsZoomChangeZoomXOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
