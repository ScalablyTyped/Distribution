package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMapClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotMapClusterStatesHoverOptions] = js.undefined
}
object PlotMapClusterStatesOptions {
  
  inline def apply(): PlotMapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMapClusterStatesOptions]
  }
  
  extension [Self <: PlotMapClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotMapClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
