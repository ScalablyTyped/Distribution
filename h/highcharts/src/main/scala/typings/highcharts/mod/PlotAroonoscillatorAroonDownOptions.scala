package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAroonoscillatorAroonDownOptions extends StObject {
  
  /**
    * (Highstock) Styles for an aroonDown line.
    */
  var styles: js.UndefOr[PlotAroonoscillatorAroonDownStylesOptions] = js.undefined
}
object PlotAroonoscillatorAroonDownOptions {
  
  inline def apply(): PlotAroonoscillatorAroonDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonoscillatorAroonDownOptions]
  }
  
  extension [Self <: PlotAroonoscillatorAroonDownOptions](x: Self) {
    
    inline def setStyles(value: PlotAroonoscillatorAroonDownStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
