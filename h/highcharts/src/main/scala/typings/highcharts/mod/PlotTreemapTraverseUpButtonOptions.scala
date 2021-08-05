package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapTraverseUpButtonOptions extends StObject {
  
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapTraverseUpButtonPositionOptions] = js.undefined
}
object PlotTreemapTraverseUpButtonOptions {
  
  inline def apply(): PlotTreemapTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonOptions]
  }
  
  extension [Self <: PlotTreemapTraverseUpButtonOptions](x: Self) {
    
    inline def setPosition(value: PlotTreemapTraverseUpButtonPositionOptions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
