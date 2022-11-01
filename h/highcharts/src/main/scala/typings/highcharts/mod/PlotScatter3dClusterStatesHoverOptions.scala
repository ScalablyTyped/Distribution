package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotScatter3dClusterStatesHoverOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.undefined
}
object PlotScatter3dClusterStatesHoverOptions {
  
  inline def apply(): PlotScatter3dClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatter3dClusterStatesHoverOptions]
  }
  
  extension [Self <: PlotScatter3dClusterStatesHoverOptions](x: Self) {
    
    inline def setFillColor(value: ColorType): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
  }
}
