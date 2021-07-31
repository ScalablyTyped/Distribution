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
  
  @scala.inline
  def apply(): PlotStochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticSmoothedLineOptions]
  }
  
  @scala.inline
  implicit class PlotStochasticSmoothedLineOptionsMutableBuilder[Self <: PlotStochasticSmoothedLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotStochasticSmoothedLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
