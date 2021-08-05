package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotBbBottomLineOptions extends StObject {
  
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotBbBottomLineStylesOptions] = js.undefined
}
object PlotBbBottomLineOptions {
  
  inline def apply(): PlotBbBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBbBottomLineOptions]
  }
  
  extension [Self <: PlotBbBottomLineOptions](x: Self) {
    
    inline def setStyles(value: PlotBbBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
