package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsCrookedLinesCrooked5Options extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsCrookedLinesCrooked5Options {
  
  inline def apply(): StockToolsGuiDefinitionsCrookedLinesCrooked5Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesCrooked5Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockToolsGuiDefinitionsCrookedLinesCrooked5Options] (val x: Self) extends AnyVal {
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
