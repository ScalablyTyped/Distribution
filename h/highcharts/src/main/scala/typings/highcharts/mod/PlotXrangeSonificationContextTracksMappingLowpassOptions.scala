package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotXrangeSonificationContextTracksMappingLowpassOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Map to filter frequency in Hertz from 1 to
    * 20,000Hz.
    */
  var frequency: js.UndefOr[
    Double | js.Object | String | js.Function | PlotXrangeSonificationContextTracksMappingLowpassFrequencyOptions
  ] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Map to filter resonance in dB. Can be
    * negative to cause a dip, or positive to cause a bump.
    */
  var resonance: js.UndefOr[
    Double | js.Object | String | js.Function | PlotXrangeSonificationContextTracksMappingLowpassResonanceOptions
  ] = js.undefined
}
object PlotXrangeSonificationContextTracksMappingLowpassOptions {
  
  inline def apply(): PlotXrangeSonificationContextTracksMappingLowpassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotXrangeSonificationContextTracksMappingLowpassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotXrangeSonificationContextTracksMappingLowpassOptions] (val x: Self) extends AnyVal {
    
    inline def setFrequency(
      value: Double | js.Object | String | js.Function | PlotXrangeSonificationContextTracksMappingLowpassFrequencyOptions
    ): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setResonance(
      value: Double | js.Object | String | js.Function | PlotXrangeSonificationContextTracksMappingLowpassResonanceOptions
    ): Self = StObject.set(x, "resonance", value.asInstanceOf[js.Any])
    
    inline def setResonanceUndefined: Self = StObject.set(x, "resonance", js.undefined)
  }
}
