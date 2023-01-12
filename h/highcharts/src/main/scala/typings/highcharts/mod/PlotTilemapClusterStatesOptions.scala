package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTilemapClusterStatesOptions extends StObject {
  
  var hover: js.UndefOr[PlotTilemapClusterStatesHoverOptions] = js.undefined
}
object PlotTilemapClusterStatesOptions {
  
  inline def apply(): PlotTilemapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapClusterStatesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTilemapClusterStatesOptions] (val x: Self) extends AnyVal {
    
    inline def setHover(value: PlotTilemapClusterStatesHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
