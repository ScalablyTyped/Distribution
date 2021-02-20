package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of options for the Instrument class.
  */
@js.native
trait InstrumentOptionsObject extends StObject {
  
  /**
    * A list of allowed frequencies for this instrument. If trying to play
    * a frequency not on this list, the closest frequency will be used. Set
    * to `null` to allow all frequencies to be used. Defaults to `null`.
    */
  var allowedFrequencies: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The unique ID of the instrument. Generated if not supplied.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Options specific to oscillator instruments.
    */
  var oscillator: js.UndefOr[
    typings.highcharts.sonificationMod.highchartsAugmentingMod.OscillatorOptionsObject
  ] = js.native
  
  /**
    * When using functions to determine frequency or other parameters
    * during playback, this options specifies how often to call the
    * callback functions. Number given in milliseconds. Defaults to 20.
    */
  var playCallbackInterval: js.UndefOr[Double] = js.native
  
  /**
    * The type of instrument. Currently only `oscillator` is supported.
    * Defaults to `oscillator`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object InstrumentOptionsObject {
  
  @scala.inline
  def apply(): InstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstrumentOptionsObject]
  }
  
  @scala.inline
  implicit class InstrumentOptionsObjectMutableBuilder[Self <: InstrumentOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedFrequencies(value: js.Array[Double]): Self = StObject.set(x, "allowedFrequencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFrequenciesUndefined: Self = StObject.set(x, "allowedFrequencies", js.undefined)
    
    @scala.inline
    def setAllowedFrequenciesVarargs(value: Double*): Self = StObject.set(x, "allowedFrequencies", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOscillator(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.OscillatorOptionsObject): Self = StObject.set(x, "oscillator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOscillatorUndefined: Self = StObject.set(x, "oscillator", js.undefined)
    
    @scala.inline
    def setPlayCallbackInterval(value: Double): Self = StObject.set(x, "playCallbackInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayCallbackIntervalUndefined: Self = StObject.set(x, "playCallbackInterval", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
