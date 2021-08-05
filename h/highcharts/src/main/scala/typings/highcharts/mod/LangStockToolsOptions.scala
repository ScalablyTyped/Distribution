package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangStockToolsOptions extends StObject {
  
  var gui: js.UndefOr[LangStockToolsGuiOptions] = js.undefined
}
object LangStockToolsOptions {
  
  inline def apply(): LangStockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangStockToolsOptions]
  }
  
  extension [Self <: LangStockToolsOptions](x: Self) {
    
    inline def setGui(value: LangStockToolsGuiOptions): Self = StObject.set(x, "gui", value.asInstanceOf[js.Any])
    
    inline def setGuiUndefined: Self = StObject.set(x, "gui", js.undefined)
  }
}
