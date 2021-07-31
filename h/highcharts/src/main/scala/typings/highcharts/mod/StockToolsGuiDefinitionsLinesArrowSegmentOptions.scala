package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiDefinitionsLinesArrowSegmentOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.undefined
}
object StockToolsGuiDefinitionsLinesArrowSegmentOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsLinesArrowSegmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesArrowSegmentOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsLinesArrowSegmentOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsLinesArrowSegmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
