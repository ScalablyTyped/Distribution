package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotHeatmapClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotHeatmapClusterStatesHoverOptions] = js.undefined
}
object PlotHeatmapClusterStatesOptions {
  
  inline def apply(): PlotHeatmapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotHeatmapClusterStatesOptions]
  }
  
  extension [Self <: PlotHeatmapClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotHeatmapClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
