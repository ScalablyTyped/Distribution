package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMacdSignalLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotMacdSignalLineStylesOptions] = js.native
  
  /**
    * (Highcharts, Highstock) An array defining zones within a series. Zones
    * can be applied to the X axis, Y axis or Z axis for bubbles, according to
    * the `zoneAxis` option. The zone definitions have to be in ascending order
    * regarding to the value.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-zone-{n}` class, or custom classed from the `className`
    * option (view live demo).
    */
  var zones: js.UndefOr[js.Array[SeriesZonesOptionsObject]] = js.native
}
object PlotMacdSignalLineOptions {
  
  @scala.inline
  def apply(): PlotMacdSignalLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdSignalLineOptions]
  }
  
  @scala.inline
  implicit class PlotMacdSignalLineOptionsMutableBuilder[Self <: PlotMacdSignalLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotMacdSignalLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setZones(value: js.Array[SeriesZonesOptionsObject]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: SeriesZonesOptionsObject*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
