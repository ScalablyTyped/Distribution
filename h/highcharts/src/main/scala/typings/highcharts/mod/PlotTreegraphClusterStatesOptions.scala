package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotTreegraphClusterStatesHoverOptions] = js.undefined
}
object PlotTreegraphClusterStatesOptions {
  
  inline def apply(): PlotTreegraphClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphClusterStatesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphClusterStatesOptions] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PlotTreegraphClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
