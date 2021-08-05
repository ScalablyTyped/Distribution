package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVennClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotVennClusterStatesHoverOptions] = js.undefined
}
object PlotVennClusterStatesOptions {
  
  inline def apply(): PlotVennClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVennClusterStatesOptions]
  }
  
  extension [Self <: PlotVennClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotVennClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
