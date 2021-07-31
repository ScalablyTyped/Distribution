package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAbandsTopLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotAbandsTopLineStylesOptions] = js.undefined
}
object PlotAbandsTopLineOptions {
  
  @scala.inline
  def apply(): PlotAbandsTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsTopLineOptions]
  }
  
  @scala.inline
  implicit class PlotAbandsTopLineOptionsMutableBuilder[Self <: PlotAbandsTopLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotAbandsTopLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
