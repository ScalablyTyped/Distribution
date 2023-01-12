package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotTreemapClusterStatesHoverOptions] = js.undefined
}
object PlotTreemapClusterStatesOptions {
  
  inline def apply(): PlotTreemapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterStatesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreemapClusterStatesOptions] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PlotTreemapClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
