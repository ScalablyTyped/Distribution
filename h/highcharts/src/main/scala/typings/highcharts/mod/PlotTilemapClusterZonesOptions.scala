package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTilemapClusterZonesOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Styled mode only. A custom class name for the
    * zone.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The value where the zone starts.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
    * zone.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The value where the zone ends.
    */
  var to: js.UndefOr[Double] = js.undefined
}
object PlotTilemapClusterZonesOptions {
  
  inline def apply(): PlotTilemapClusterZonesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapClusterZonesOptions]
  }
  
  extension [Self <: PlotTilemapClusterZonesOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
