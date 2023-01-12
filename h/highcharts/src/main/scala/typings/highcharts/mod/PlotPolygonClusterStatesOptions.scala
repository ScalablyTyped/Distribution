package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPolygonClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotPolygonClusterStatesHoverOptions] = js.undefined
}
object PlotPolygonClusterStatesOptions {
  
  inline def apply(): PlotPolygonClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPolygonClusterStatesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPolygonClusterStatesOptions] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PlotPolygonClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
