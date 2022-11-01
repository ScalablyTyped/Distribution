package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScatter3dClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotScatter3dClusterStatesHoverOptions] = js.undefined
}
object PlotScatter3dClusterStatesOptions {
  
  inline def apply(): PlotScatter3dClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatter3dClusterStatesOptions]
  }
  
  extension [Self <: PlotScatter3dClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotScatter3dClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
