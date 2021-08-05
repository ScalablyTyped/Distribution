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
  
  inline def apply(): PlotVbpVolumeDivisionStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionStylesOptions]
  }
  
  extension [Self <: PlotVbpVolumeDivisionStylesOptions](x: Self) {
    
    inline def setNegativeColor(value: ColorString): Self = StObject.set(x, "negativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "negativeColor", js.undefined)
    
    inline def setPositiveColor(value: ColorString): Self = StObject.set(x, "positiveColor", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorUndefined: Self = StObject.set(x, "positiveColor", js.undefined)
  }
}
