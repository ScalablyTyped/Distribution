package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a scheduled event for a SonificationInstrument
  */
trait SonificationInstrumentScheduledEventOptionsObject extends StObject {
  
  /**
    * Note frequency in Hertz. Overrides note, if both are given.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * Frequency of the highpass filter, in Hertz.
    */
  var highpassFreq: js.UndefOr[Double] = js.undefined
  
  /**
    * Resonance of the highpass filter, in dB. Can be negative for a dip,
    * or positive for a bump.
    */
  var highpassResonance: js.UndefOr[Double] = js.undefined
  
  /**
    * Frequency of the lowpass filter, in Hertz.
    */
  var lowpassFreq: js.UndefOr[Double] = js.undefined
  
  /**
    * Resonance of the lowpass filter, in dB. Can be negative for a dip, or
    * positive for a bump.
    */
  var lowpassResonance: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of semitones from c0, or a note string - such as "c4" or
    * "F#6".
    */
  var note: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Duration to play the note in milliseconds. If not given, the note
    * keeps playing indefinitely
    */
  var noteDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Stereo panning value, from -1 (left) to 1 (right).
    */
  var pan: js.UndefOr[Double] = js.undefined
  
  /**
    * Depth/intensity of the tremolo effect - which is a periodic change in
    * volume. From 0 to 1.
    */
  var tremoloDepth: js.UndefOr[Double] = js.undefined
  
  /**
    * Speed of the tremolo effect, from 0 to 1.
    */
  var tremoloSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume of the instrument, from 0 to 1. Can be set independent of the
    * master/overall volume.
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object SonificationInstrumentScheduledEventOptionsObject {
  
  inline def apply(): SonificationInstrumentScheduledEventOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationInstrumentScheduledEventOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationInstrumentScheduledEventOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setHighpassFreq(value: Double): Self = StObject.set(x, "highpassFreq", value.asInstanceOf[js.Any])
    
    inline def setHighpassFreqUndefined: Self = StObject.set(x, "highpassFreq", js.undefined)
    
    inline def setHighpassResonance(value: Double): Self = StObject.set(x, "highpassResonance", value.asInstanceOf[js.Any])
    
    inline def setHighpassResonanceUndefined: Self = StObject.set(x, "highpassResonance", js.undefined)
    
    inline def setLowpassFreq(value: Double): Self = StObject.set(x, "lowpassFreq", value.asInstanceOf[js.Any])
    
    inline def setLowpassFreqUndefined: Self = StObject.set(x, "lowpassFreq", js.undefined)
    
    inline def setLowpassResonance(value: Double): Self = StObject.set(x, "lowpassResonance", value.asInstanceOf[js.Any])
    
    inline def setLowpassResonanceUndefined: Self = StObject.set(x, "lowpassResonance", js.undefined)
    
    inline def setNote(value: Double | String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteDuration(value: Double): Self = StObject.set(x, "noteDuration", value.asInstanceOf[js.Any])
    
    inline def setNoteDurationUndefined: Self = StObject.set(x, "noteDuration", js.undefined)
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setTremoloDepth(value: Double): Self = StObject.set(x, "tremoloDepth", value.asInstanceOf[js.Any])
    
    inline def setTremoloDepthUndefined: Self = StObject.set(x, "tremoloDepth", js.undefined)
    
    inline def setTremoloSpeed(value: Double): Self = StObject.set(x, "tremoloSpeed", value.asInstanceOf[js.Any])
    
    inline def setTremoloSpeedUndefined: Self = StObject.set(x, "tremoloSpeed", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
