package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotStochasticSmoothedLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotStochasticSmoothedLineStylesOptions] = js.undefined
}
object PlotStochasticSmoothedLineOptions {
  
  inline def apply(): PlotStochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticSmoothedLineOptions]
  }
  
  extension [Self <: PlotStochasticSmoothedLineOptions](x: Self) {
    
    inline def setStyles(value: PlotStochasticSmoothedLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
