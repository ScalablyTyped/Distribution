package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDmiMinusDILineOptions extends StObject {
  
  /**
    * (Highstock) Styles for the -DI line.
    */
  var styles: js.UndefOr[PlotDmiMinusDILineStylesOptions] = js.undefined
}
object PlotDmiMinusDILineOptions {
  
  inline def apply(): PlotDmiMinusDILineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDmiMinusDILineOptions]
  }
  
  extension [Self <: PlotDmiMinusDILineOptions](x: Self) {
    
    inline def setStyles(value: PlotDmiMinusDILineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
