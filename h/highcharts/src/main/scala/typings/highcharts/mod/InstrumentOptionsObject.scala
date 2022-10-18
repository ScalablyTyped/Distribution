package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of options for the Instrument class.
  */
trait InstrumentOptionsObject extends StObject {
  
  /**
    * A list of allowed frequencies for this instrument. If trying to play
    * a frequency not on this list, the closest frequency will be used. Set
    * to `null` to allow all frequencies to be used. Defaults to `null`.
    */
  var allowedFrequencies: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The unique ID of the instrument. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Options specific to oscillator instruments.
    */
  var oscillator: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.OscillatorOptionsObject
  ] = js.undefined
  
  /**
    * When using functions to determine frequency or other parameters
    * during playback, this options specifies how often to call the
    * callback functions. Number given in milliseconds. Defaults to 20.
    */
  var playCallbackInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of instrument. Currently only `oscillator` is supported.
    * Defaults to `oscillator`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object InstrumentOptionsObject {
  
  inline def apply(): InstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstrumentOptionsObject]
  }
  
  extension [Self <: InstrumentOptionsObject](x: Self) {
    
    inline def setAllowedFrequencies(value: js.Array[Double]): Self = StObject.set(x, "allowedFrequencies", value.asInstanceOf[js.Any])
    
    inline def setAllowedFrequenciesUndefined: Self = StObject.set(x, "allowedFrequencies", js.undefined)
    
    inline def setAllowedFrequenciesVarargs(value: Double*): Self = StObject.set(x, "allowedFrequencies", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOscillator(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.OscillatorOptionsObject): Self = StObject.set(x, "oscillator", value.asInstanceOf[js.Any])
    
    inline def setOscillatorUndefined: Self = StObject.set(x, "oscillator", js.undefined)
    
    inline def setPlayCallbackInterval(value: Double): Self = StObject.set(x, "playCallbackInterval", value.asInstanceOf[js.Any])
    
    inline def setPlayCallbackIntervalUndefined: Self = StObject.set(x, "playCallbackInterval", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
