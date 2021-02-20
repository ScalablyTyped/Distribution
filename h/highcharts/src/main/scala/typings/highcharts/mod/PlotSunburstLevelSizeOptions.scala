package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSunburstLevelSizeOptions extends StObject {
  
  /**
    * (Highcharts) How to interpret `levelSize.value`.
    *
    * - `percentage` gives a width relative to result of outer radius minus
    * inner radius.
    *
    * - `pixels` gives the ring a fixed width in pixels.
    *
    * - `weight` takes the remaining width after percentage and pixels, and
    * distributes it accross all "weighted" levels. The value relative to the
    * sum of all weights determines the width.
    */
  var unit: js.UndefOr[OptionsUnitValue] = js.native
  
  /**
    * (Highcharts) The value used for calculating the width of the ring. Its'
    * affect is determined by `levelSize.unit`.
    */
  var value: js.UndefOr[Double] = js.native
}
object PlotSunburstLevelSizeOptions {
  
  @scala.inline
  def apply(): PlotSunburstLevelSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstLevelSizeOptions]
  }
  
  @scala.inline
  implicit class PlotSunburstLevelSizeOptionsMutableBuilder[Self <: PlotSunburstLevelSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: OptionsUnitValue): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
