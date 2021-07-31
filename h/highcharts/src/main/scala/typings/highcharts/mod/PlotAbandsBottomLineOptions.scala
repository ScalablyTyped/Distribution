package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAbandsBottomLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotAbandsBottomLineStylesOptions] = js.undefined
}
object PlotAbandsBottomLineOptions {
  
  @scala.inline
  def apply(): PlotAbandsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsBottomLineOptions]
  }
  
  @scala.inline
  implicit class PlotAbandsBottomLineOptionsMutableBuilder[Self <: PlotAbandsBottomLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotAbandsBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
