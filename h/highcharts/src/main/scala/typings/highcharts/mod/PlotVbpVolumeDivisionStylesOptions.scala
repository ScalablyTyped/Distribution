package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVbpVolumeDivisionStylesOptions extends StObject {
  
  /**
    * (Highstock) Color of negative volume bars.
    */
  var negativeColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) Color of positive volume bars.
    */
  var positiveColor: js.UndefOr[ColorString] = js.undefined
}
object PlotVbpVolumeDivisionStylesOptions {
  
  @scala.inline
  def apply(): PlotVbpVolumeDivisionStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionStylesOptions]
  }
  
  @scala.inline
  implicit class PlotVbpVolumeDivisionStylesOptionsMutableBuilder[Self <: PlotVbpVolumeDivisionStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegativeColor(value: ColorString): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    @scala.inline
    def setPositiveColor(value: ColorString): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveColorUndefined: Self = StObject.set(x, "positiveColor", js.undefined)
  }
}
