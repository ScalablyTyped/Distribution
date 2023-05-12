package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotGeoheatmapSonificationContextTracksMappingLowpassOptions extends StObject {
  
  /**
    * (Highmaps) Map to filter frequency in Hertz from 1 to 20,000Hz.
    */
  var frequency: js.UndefOr[
    Double | js.Object | String | js.Function | PlotGeoheatmapSonificationContextTracksMappingLowpassFrequencyOptions
  ] = js.undefined
  
  /**
    * (Highmaps) Map to filter resonance in dB. Can be negative to cause a dip,
    * or positive to cause a bump.
    */
  var resonance: js.UndefOr[
    Double | js.Object | String | js.Function | PlotGeoheatmapSonificationContextTracksMappingLowpassResonanceOptions
  ] = js.undefined
}
object PlotGeoheatmapSonificationContextTracksMappingLowpassOptions {
  
  inline def apply(): PlotGeoheatmapSonificationContextTracksMappingLowpassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGeoheatmapSonificationContextTracksMappingLowpassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotGeoheatmapSonificationContextTracksMappingLowpassOptions] (val x: Self) extends AnyVal {
    
    inline def setFrequency(
      value: Double | js.Object | String | js.Function | PlotGeoheatmapSonificationContextTracksMappingLowpassFrequencyOptions
    ): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setResonance(
      value: Double | js.Object | String | js.Function | PlotGeoheatmapSonificationContextTracksMappingLowpassResonanceOptions
    ): Self = StObject.set(x, "resonance", value.asInstanceOf[js.Any])
    
    inline def setResonanceUndefined: Self = StObject.set(x, "resonance", js.undefined)
  }
}
