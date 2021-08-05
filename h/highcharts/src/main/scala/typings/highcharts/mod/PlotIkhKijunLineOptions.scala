package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhKijunLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotIkhKijunLineStylesOptions] = js.undefined
}
object PlotIkhKijunLineOptions {
  
  inline def apply(): PlotIkhKijunLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhKijunLineOptions]
  }
  
  extension [Self <: PlotIkhKijunLineOptions](x: Self) {
    
    inline def setStyles(value: PlotIkhKijunLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
