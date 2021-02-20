package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhTenkanLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhTenkanLineStylesOptions] = js.native
}
object PlotIkhTenkanLineOptions {
  
  @scala.inline
  def apply(): PlotIkhTenkanLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhTenkanLineOptions]
  }
  
  @scala.inline
  implicit class PlotIkhTenkanLineOptionsMutableBuilder[Self <: PlotIkhTenkanLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotIkhTenkanLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
