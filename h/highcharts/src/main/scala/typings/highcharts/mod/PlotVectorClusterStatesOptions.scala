package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVectorClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotVectorClusterStatesHoverOptions] = js.undefined
}
object PlotVectorClusterStatesOptions {
  
  inline def apply(): PlotVectorClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorClusterStatesOptions]
  }
  
  extension [Self <: PlotVectorClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotVectorClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
