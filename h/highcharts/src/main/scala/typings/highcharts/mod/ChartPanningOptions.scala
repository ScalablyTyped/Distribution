package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPanningOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable chart panning.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * pan the chart. Can be one of `x`, `y`, or `xy`.
    *
    * When this option is set to `y` or `xy`, yAxis.startOnTick and
    * yAxis.endOnTick are overwritten to `false`.
    */
  var `type`: js.UndefOr[OptionsChartPanningTypeValue] = js.undefined
}
object ChartPanningOptions {
  
  inline def apply(): ChartPanningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPanningOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartPanningOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setType(value: OptionsChartPanningTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
