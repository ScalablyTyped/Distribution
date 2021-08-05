package typings.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for playing an instrument.
  */
trait InstrumentPlayOptionsObject extends StObject {
  
  /**
    * The duration of the note in milliseconds.
    */
  var duration: Double
  
  /**
    * The frequency of the note to play. Can be a fixed number, or a
    * function. The function receives one argument: the relative time of
    * the note playing (0 being the start, and 1 being the end of the
    * note). It should return the frequency number for each point in time.
    * The poll interval of this function is specified by the
    * Instrument.playCallbackInterval option.
    */
  var frequency: Double | js.Function
  
  /**
    * The master volume multiplier to apply to the instrument, regardless
    * of other volume changes. Defaults to 1.
    */
  var masterVolume: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum frequency to allow. If the instrument has a set of
    * allowed frequencies, the closest frequency is used by default. Use
    * this option to stop too high frequencies from being used.
    */
  var maxFrequency: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum frequency to allow. If the instrument has a set of
    * allowed frequencies, the closest frequency is used by default. Use
    * this option to stop too low frequencies from being used.
    */
  var minFrequency: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback function to be called when the play is completed.
    */
  var onEnd: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The panning of the instrument. Can be a fixed number between -1 and
    * 1, or a function. The function receives one argument: the relative
    * time of the note playing (0 being the start, and 1 being the end of
    * the note). It should return the panning value for each point in time.
    * The poll interval of this function is specified by the
    * Instrument.playCallbackInterval option. Defaults to 0.
    */
  var pan: js.UndefOr[Double | js.Function] = js.undefined
  
  /**
    * The volume of the instrument. Can be a fixed number between 0 and 1,
    * or a function. The function receives one argument: the relative time
    * of the note playing (0 being the start, and 1 being the end of the
    * note). It should return the volume for each point in time. The poll
    * interval of this function is specified by the
    * Instrument.playCallbackInterval option. Defaults to 1.
    */
  var volume: js.UndefOr[Double | js.Function] = js.undefined
}
object InstrumentPlayOptionsObject {
  
  inline def apply(duration: Double, frequency: Double | js.Function): InstrumentPlayOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentPlayOptionsObject]
  }
  
  extension [Self <: InstrumentPlayOptionsObject](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Double | js.Function): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setMasterVolume(value: Double): Self = StObject.set(x, "masterVolume", value.asInstanceOf[js.Any])
    
    inline def setMasterVolumeUndefined: Self = StObject.set(x, "masterVolume", js.undefined)
    
    inline def setMaxFrequency(value: Double): Self = StObject.set(x, "maxFrequency", value.asInstanceOf[js.Any])
    
    inline def setMaxFrequencyUndefined: Self = StObject.set(x, "maxFrequency", js.undefined)
    
    inline def setMinFrequency(value: Double): Self = StObject.set(x, "minFrequency", value.asInstanceOf[js.Any])
    
    inline def setMinFrequencyUndefined: Self = StObject.set(x, "minFrequency", js.undefined)
    
    inline def setOnEnd(value: js.Function): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setPan(value: Double | js.Function): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setVolume(value: Double | js.Function): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
