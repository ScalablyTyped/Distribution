package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScatterClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotScatterClusterStatesHoverOptions] = js.undefined
}
object PlotScatterClusterStatesOptions {
  
  inline def apply(): PlotScatterClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterClusterStatesOptions]
  }
  
  extension [Self <: PlotScatterClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotScatterClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
