package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomingMouseWheelOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Zooming with the mouse wheel can
    * be disabled by setting this option to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Adjust the sensitivity of the
    * zoom. Sensitivity of mouse wheel or trackpad scrolling. `1` is no
    * sensitivity, while with `2`, one mouse wheel delta will zoom in `50%`.
    */
  var sensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decides in what dimensions the
    * user can zoom scrolling the wheel. Can be one of `x`, `y` or `xy`. If not
    * specified here, it will inherit the type from chart.zooming.type.
    *
    * Note that particularly with mouse wheel in the y direction, the zoom is
    * affected by the default yAxis.startOnTick and endOnTick) settings. In
    * order to respect these settings, the zoom level will adjust after the
    * user has stopped zooming. To prevent this, consider setting `startOnTick`
    * and `endOnTick` to `false`.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.undefined
}
object ChartZoomingMouseWheelOptions {
  
  inline def apply(): ChartZoomingMouseWheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomingMouseWheelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartZoomingMouseWheelOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setType(value: OptionsTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
