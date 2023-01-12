package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVectorClusterEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Fires when the cluster point is clicked and
    * `drillToCluster` is enabled. One parameter, `event`, is passed to the
    * function. The default action is to zoom to the cluster points range. This
    * can be prevented by calling `event.preventDefault()`.
    */
  var drillToCluster: js.UndefOr[MarkerClusterDrillCallbackFunction] = js.undefined
}
object PlotVectorClusterEventsOptions {
  
  inline def apply(): PlotVectorClusterEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorClusterEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotVectorClusterEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setDrillToCluster(value: MarkerClusterDrillCallbackFunction): Self = StObject.set(x, "drillToCluster", value.asInstanceOf[js.Any])
    
    inline def setDrillToClusterUndefined: Self = StObject.set(x, "drillToCluster", js.undefined)
  }
}
