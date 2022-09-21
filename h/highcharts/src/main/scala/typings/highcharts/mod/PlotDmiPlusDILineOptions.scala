package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDmiPlusDILineOptions extends StObject {
  
  /**
    * (Highstock) Styles for the +DI line.
    */
  var styles: js.UndefOr[PlotDmiPlusDILineStylesOptions] = js.undefined
}
object PlotDmiPlusDILineOptions {
  
  inline def apply(): PlotDmiPlusDILineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDmiPlusDILineOptions]
  }
  
  extension [Self <: PlotDmiPlusDILineOptions](x: Self) {
    
    inline def setStyles(value: PlotDmiPlusDILineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
