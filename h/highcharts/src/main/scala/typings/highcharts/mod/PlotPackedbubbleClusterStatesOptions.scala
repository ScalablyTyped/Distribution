package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPackedbubbleClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotPackedbubbleClusterStatesHoverOptions] = js.undefined
}
object PlotPackedbubbleClusterStatesOptions {
  
  inline def apply(): PlotPackedbubbleClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleClusterStatesOptions]
  }
  
  extension [Self <: PlotPackedbubbleClusterStatesOptions](x: Self) {
    
    inline def setHover(value: PlotPackedbubbleClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
