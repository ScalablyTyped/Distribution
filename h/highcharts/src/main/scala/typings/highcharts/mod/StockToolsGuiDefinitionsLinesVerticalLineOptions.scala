package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsLinesVerticalLineOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.native
}
object StockToolsGuiDefinitionsLinesVerticalLineOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsLinesVerticalLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesVerticalLineOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsLinesVerticalLineOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsLinesVerticalLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
