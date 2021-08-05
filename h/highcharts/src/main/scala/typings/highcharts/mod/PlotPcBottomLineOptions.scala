package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPcBottomLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotPcBottomLineStylesOptions] = js.undefined
}
object PlotPcBottomLineOptions {
  
  inline def apply(): PlotPcBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcBottomLineOptions]
  }
  
  extension [Self <: PlotPcBottomLineOptions](x: Self) {
    
    inline def setStyles(value: PlotPcBottomLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
