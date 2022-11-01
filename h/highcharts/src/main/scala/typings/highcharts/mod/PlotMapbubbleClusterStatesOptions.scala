package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMapbubbleClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotMapbubbleClusterStatesHoverOptions] = js.undefined
}
object PlotMapbubbleClusterStatesOptions {
  
  inline def apply(): PlotMapbubbleClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMapbubbleClusterStatesOptions]
  }
  
  extension [Self <: PlotMapbubbleClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotMapbubbleClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
