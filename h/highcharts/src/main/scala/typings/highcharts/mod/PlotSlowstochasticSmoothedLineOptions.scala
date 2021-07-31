package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSlowstochasticSmoothedLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotSlowstochasticSmoothedLineStylesOptions] = js.undefined
}
object PlotSlowstochasticSmoothedLineOptions {
  
  @scala.inline
  def apply(): PlotSlowstochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticSmoothedLineOptions]
  }
  
  @scala.inline
  implicit class PlotSlowstochasticSmoothedLineOptionsMutableBuilder[Self <: PlotSlowstochasticSmoothedLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotSlowstochasticSmoothedLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
