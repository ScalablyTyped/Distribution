package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsOptions extends StObject {
  
  /**
    * (Highstock) Definitions of buttons in Stock Tools GUI.
    */
  var gui: js.UndefOr[StockToolsGuiOptions] = js.undefined
}
object StockToolsOptions {
  
  inline def apply(): StockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsOptions]
  }
  
  extension [Self <: StockToolsOptions](x: Self) {
    
    inline def setGui(value: StockToolsGuiOptions): Self = StObject.set(x, "gui", value.asInstanceOf[js.Any])
    
    inline def setGuiUndefined: Self = StObject.set(x, "gui", js.undefined)
  }
}
