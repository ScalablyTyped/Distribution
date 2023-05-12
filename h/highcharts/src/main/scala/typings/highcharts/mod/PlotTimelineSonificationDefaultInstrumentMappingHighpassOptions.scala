package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTimelineSonificationDefaultInstrumentMappingHighpassOptions extends StObject {
  
  /**
    * (Highcharts) Map to filter frequency in Hertz from 1 to 20,000Hz.
    */
  var frequency: js.UndefOr[
    Double | js.Object | String | js.Function | PlotTimelineSonificationDefaultInstrumentMappingHighpassFrequencyOptions
  ] = js.undefined
  
  /**
    * (Highcharts) Map to filter resonance in dB. Can be negative to cause a
    * dip, or positive to cause a bump.
    */
  var resonance: js.UndefOr[
    Double | js.Object | String | js.Function | PlotTimelineSonificationDefaultInstrumentMappingHighpassResonanceOptions
  ] = js.undefined
}
object PlotTimelineSonificationDefaultInstrumentMappingHighpassOptions {
  
  inline def apply(): PlotTimelineSonificationDefaultInstrumentMappingHighpassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTimelineSonificationDefaultInstrumentMappingHighpassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTimelineSonificationDefaultInstrumentMappingHighpassOptions] (val x: Self) extends AnyVal {
    
    inline def setFrequency(
      value: Double | js.Object | String | js.Function | PlotTimelineSonificationDefaultInstrumentMappingHighpassFrequencyOptions
    ): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setResonance(
      value: Double | js.Object | String | js.Function | PlotTimelineSonificationDefaultInstrumentMappingHighpassResonanceOptions
    ): Self = StObject.set(x, "resonance", value.asInstanceOf[js.Any])
    
    inline def setResonanceUndefined: Self = StObject.set(x, "resonance", js.undefined)
  }
}
