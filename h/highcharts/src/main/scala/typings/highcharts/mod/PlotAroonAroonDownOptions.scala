package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAroonAroonDownOptions extends StObject {
  
  /**
    * (Highstock) Styles for an aroonDown line.
    */
  var styles: js.UndefOr[PlotAroonAroonDownStylesOptions] = js.undefined
}
object PlotAroonAroonDownOptions {
  
  inline def apply(): PlotAroonAroonDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonAroonDownOptions]
  }
  
  extension [Self <: PlotAroonAroonDownOptions](x: Self) {
    
    inline def setStyles(value: PlotAroonAroonDownStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
