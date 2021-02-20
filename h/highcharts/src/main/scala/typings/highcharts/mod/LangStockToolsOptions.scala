package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangStockToolsOptions extends StObject {
  
  var gui: js.UndefOr[LangStockToolsGuiOptions] = js.native
}
object LangStockToolsOptions {
  
  @scala.inline
  def apply(): LangStockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangStockToolsOptions]
  }
  
  @scala.inline
  implicit class LangStockToolsOptionsMutableBuilder[Self <: LangStockToolsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGui(value: LangStockToolsGuiOptions): Self = StObject.set(x, "gui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuiUndefined: Self = StObject.set(x, "gui", js.undefined)
  }
}
