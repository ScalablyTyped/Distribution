package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSupertrendChangeTrendLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotSupertrendChangeTrendLineStylesOptions] = js.undefined
}
object PlotSupertrendChangeTrendLineOptions {
  
  inline def apply(): PlotSupertrendChangeTrendLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineOptions]
  }
  
  extension [Self <: PlotSupertrendChangeTrendLineOptions](x: Self) {
    
    inline def setStyles(value: PlotSupertrendChangeTrendLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
