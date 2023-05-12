package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesFlowmapDataMarkerEndOptions extends StObject {
  
  /**
    * (Highmaps) Enable or disable the `markerEnd`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highmaps) Height of the `markerEnd`. Can be a number in pixels or a
    * percentage based on the weight of the link.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highmaps) Change the shape of the `markerEnd`. Can be `arrow` or
    * `mushroom`.
    */
  var markerType: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) Width of the `markerEnd`. Can be a number in pixels or a
    * percentage based on the weight of the link.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object SeriesFlowmapDataMarkerEndOptions {
  
  inline def apply(): SeriesFlowmapDataMarkerEndOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesFlowmapDataMarkerEndOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesFlowmapDataMarkerEndOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMarkerType(value: String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
    
    inline def setMarkerTypeUndefined: Self = StObject.set(x, "markerType", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
