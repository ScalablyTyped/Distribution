package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthPatchOscillatorOptionsObject extends StObject {
  
  /**
    * Volume envelope for note attack, specific to this oscillator.
    */
  var attackEnvelope: js.UndefOr[SynthEnvelope] = js.undefined
  
  /**
    * Applies a detuning of all frequencies. Set in cents. Defaults to 0.
    */
  var detune: js.UndefOr[Double] = js.undefined
  
  /**
    * Play a fixed frequency for the oscillator - ignoring input frequency. The
    * frequency multiplier is still applied.
    */
  var fixedFrequency: js.UndefOr[Double] = js.undefined
  
  /**
    * Index of another oscillator to use as carrier, with this oscillator being
    * used as a frequency modulator. Note: If the carrier is a pulse
    * oscillator, the modulation will be on pulse width instead of frequency,
    * allowing for PWM effects.
    */
  var fmOscillator: js.UndefOr[Double] = js.undefined
  
  /**
    * A multiplier for the input frequency of the oscillator. Defaults to 1. If
    * this is for example set to 4, an input frequency of 220Hz will cause the
    * oscillator to play at 880Hz.
    */
  var freqMultiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * Highpass filter options for the oscillator.
    */
  var highpass: js.UndefOr[SynthPatchPassFilter] = js.undefined
  
  /**
    * Lowpass filter options for the oscillator.
    */
  var lowpass: js.UndefOr[SynthPatchPassFilter] = js.undefined
  
  /**
    * Width of the pulse waveform. Only applies to "pulse" type oscillators. A
    * width of 0.5 is roughly equal to a square wave. This is the default.
    */
  var pulseWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume envelope for note release, specific to this oscillator.
    */
  var releaseEnvelope: js.UndefOr[SynthEnvelope] = js.undefined
  
  /**
    * The type of oscillator. This describes the waveform of the oscillator.
    */
  var `type`: js.UndefOr[SynthPatchOscillatorType] = js.undefined
  
  /**
    * Index of another oscillator to use as carrier, with this oscillator being
    * used as a volume modulator. The first oscillator in the array has index
    * 0, and so on. This option can be used to produce tremolo effects.
    */
  var vmOscillator: js.UndefOr[Double] = js.undefined
  
  /**
    * A volume modifier for the oscillator. Defaults to 1.
    */
  var volume: js.UndefOr[Double] = js.undefined
  
  /**
    * A tracking multiplier used for frequency dependent behavior. For example,
    * by setting the volume tracking multiplier to 0.01, the volume will be
    * lower at higher notes. The multiplier is a logarithmic function, where 1
    * is at ca 50Hz, and you define the output multiplier for an input
    * frequency around 3.2kHz.
    */
  var volumePitchTrackingMultiplier: js.UndefOr[Double] = js.undefined
}
object SynthPatchOscillatorOptionsObject {
  
  inline def apply(): SynthPatchOscillatorOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthPatchOscillatorOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthPatchOscillatorOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setAttackEnvelope(value: SynthEnvelope): Self = StObject.set(x, "attackEnvelope", value.asInstanceOf[js.Any])
    
    inline def setAttackEnvelopeUndefined: Self = StObject.set(x, "attackEnvelope", js.undefined)
    
    inline def setAttackEnvelopeVarargs(value: SynthEnvelopePoint*): Self = StObject.set(x, "attackEnvelope", js.Array(value*))
    
    inline def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    inline def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    inline def setFixedFrequency(value: Double): Self = StObject.set(x, "fixedFrequency", value.asInstanceOf[js.Any])
    
    inline def setFixedFrequencyUndefined: Self = StObject.set(x, "fixedFrequency", js.undefined)
    
    inline def setFmOscillator(value: Double): Self = StObject.set(x, "fmOscillator", value.asInstanceOf[js.Any])
    
    inline def setFmOscillatorUndefined: Self = StObject.set(x, "fmOscillator", js.undefined)
    
    inline def setFreqMultiplier(value: Double): Self = StObject.set(x, "freqMultiplier", value.asInstanceOf[js.Any])
    
    inline def setFreqMultiplierUndefined: Self = StObject.set(x, "freqMultiplier", js.undefined)
    
    inline def setHighpass(value: SynthPatchPassFilter): Self = StObject.set(x, "highpass", value.asInstanceOf[js.Any])
    
    inline def setHighpassUndefined: Self = StObject.set(x, "highpass", js.undefined)
    
    inline def setLowpass(value: SynthPatchPassFilter): Self = StObject.set(x, "lowpass", value.asInstanceOf[js.Any])
    
    inline def setLowpassUndefined: Self = StObject.set(x, "lowpass", js.undefined)
    
    inline def setPulseWidth(value: Double): Self = StObject.set(x, "pulseWidth", value.asInstanceOf[js.Any])
    
    inline def setPulseWidthUndefined: Self = StObject.set(x, "pulseWidth", js.undefined)
    
    inline def setReleaseEnvelope(value: SynthEnvelope): Self = StObject.set(x, "releaseEnvelope", value.asInstanceOf[js.Any])
    
    inline def setReleaseEnvelopeUndefined: Self = StObject.set(x, "releaseEnvelope", js.undefined)
    
    inline def setReleaseEnvelopeVarargs(value: SynthEnvelopePoint*): Self = StObject.set(x, "releaseEnvelope", js.Array(value*))
    
    inline def setType(value: SynthPatchOscillatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVmOscillator(value: Double): Self = StObject.set(x, "vmOscillator", value.asInstanceOf[js.Any])
    
    inline def setVmOscillatorUndefined: Self = StObject.set(x, "vmOscillator", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumePitchTrackingMultiplier(value: Double): Self = StObject.set(x, "volumePitchTrackingMultiplier", value.asInstanceOf[js.Any])
    
    inline def setVolumePitchTrackingMultiplierUndefined: Self = StObject.set(x, "volumePitchTrackingMultiplier", js.undefined)
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
