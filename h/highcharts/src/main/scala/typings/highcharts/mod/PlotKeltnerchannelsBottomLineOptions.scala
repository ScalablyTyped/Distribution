package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKeltnerchannelsBottomLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsBottomLineStylesOptions] = js.undefined
}
object PlotKeltnerchannelsBottomLineOptions {
  
  inline def apply(): PlotKeltnerchannelsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsBottomLineOptions]
  }
  
  extension [Self <: PlotKeltnerchannelsBottomLineOptions](x: Self) {
    
    inline def setStyles(value: PlotKeltnerchannelsBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
