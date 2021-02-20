package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsOptions extends StObject {
  
  /**
    * (Highstock) Definitions of buttons in Stock Tools GUI.
    */
  var gui: js.UndefOr[StockToolsGuiOptions] = js.native
}
object StockToolsOptions {
  
  @scala.inline
  def apply(): StockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsOptions]
  }
  
  @scala.inline
  implicit class StockToolsOptionsMutableBuilder[Self <: StockToolsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGui(value: StockToolsGuiOptions): Self = StObject.set(x, "gui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuiUndefined: Self = StObject.set(x, "gui", js.undefined)
  }
}
