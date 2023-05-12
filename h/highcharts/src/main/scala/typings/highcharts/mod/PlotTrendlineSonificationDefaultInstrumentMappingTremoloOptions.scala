package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTrendlineSonificationDefaultInstrumentMappingTremoloOptions extends StObject {
  
  /**
    * (Highstock) Map to tremolo depth, from 0 to 1.
    *
    * This determines the intensity of the tremolo effect, how much the volume
    * changes.
    */
  var depth: js.UndefOr[
    Double | js.Object | String | js.Function | PlotTrendlineSonificationDefaultInstrumentMappingTremoloDepthOptions
  ] = js.undefined
  
  /**
    * (Highstock) Map to tremolo speed, from 0 to 1.
    *
    * This determines the speed of the tremolo effect, how fast the volume
    * changes.
    */
  var speed: js.UndefOr[
    Double | js.Object | String | js.Function | PlotTrendlineSonificationDefaultInstrumentMappingTremoloSpeedOptions
  ] = js.undefined
}
object PlotTrendlineSonificationDefaultInstrumentMappingTremoloOptions {
  
  inline def apply(): PlotTrendlineSonificationDefaultInstrumentMappingTremoloOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTrendlineSonificationDefaultInstrumentMappingTremoloOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTrendlineSonificationDefaultInstrumentMappingTremoloOptions] (val x: Self) extends AnyVal {
    
    inline def setDepth(
      value: Double | js.Object | String | js.Function | PlotTrendlineSonificationDefaultInstrumentMappingTremoloDepthOptions
    ): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setSpeed(
      value: Double | js.Object | String | js.Function | PlotTrendlineSonificationDefaultInstrumentMappingTremoloSpeedOptions
    ): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
