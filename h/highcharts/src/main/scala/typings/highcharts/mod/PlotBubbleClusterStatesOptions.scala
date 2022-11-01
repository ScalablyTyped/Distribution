package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotBubbleClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotBubbleClusterStatesHoverOptions] = js.undefined
}
object PlotBubbleClusterStatesOptions {
  
  inline def apply(): PlotBubbleClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBubbleClusterStatesOptions]
  }
  
  extension [Self <: PlotBubbleClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotBubbleClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
