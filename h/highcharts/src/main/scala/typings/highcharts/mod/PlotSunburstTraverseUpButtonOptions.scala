package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstTraverseUpButtonOptions extends StObject {
  
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotSunburstTraverseUpButtonPositionOptions] = js.undefined
}
object PlotSunburstTraverseUpButtonOptions {
  
  inline def apply(): PlotSunburstTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstTraverseUpButtonOptions]
  }
  
  extension [Self <: PlotSunburstTraverseUpButtonOptions](x: Self) {
    
    inline def setPosition(value: PlotSunburstTraverseUpButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
