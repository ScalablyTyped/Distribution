package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthPatchPassFilter extends StObject {
  
  /**
    * Filter resonance bump/dip in dB. Defaults to 0.
    */
  var Q: js.UndefOr[Double] = js.undefined
  
  /**
    * Filter frequency.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * A pitch tracking multiplier similarly to the one for oscillator volume.
    * Affects the filter frequency.
    */
  var frequencyPitchTrackingMultiplier: js.UndefOr[Double] = js.undefined
}
object SynthPatchPassFilter {
  
  inline def apply(): SynthPatchPassFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthPatchPassFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthPatchPassFilter] (val x: Self) extends AnyVal {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyPitchTrackingMultiplier(value: Double): Self = StObject.set(x, "frequencyPitchTrackingMultiplier", value.asInstanceOf[js.Any])
    
    inline def setFrequencyPitchTrackingMultiplierUndefined: Self = StObject.set(x, "frequencyPitchTrackingMultiplier", js.undefined)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setQ(value: Double): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
  }
}
