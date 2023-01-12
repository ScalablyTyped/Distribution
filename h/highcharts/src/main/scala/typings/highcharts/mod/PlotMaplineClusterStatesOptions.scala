package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMaplineClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotMaplineClusterStatesHoverOptions] = js.undefined
}
object PlotMaplineClusterStatesOptions {
  
  inline def apply(): PlotMaplineClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMaplineClusterStatesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotMaplineClusterStatesOptions] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PlotMaplineClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
