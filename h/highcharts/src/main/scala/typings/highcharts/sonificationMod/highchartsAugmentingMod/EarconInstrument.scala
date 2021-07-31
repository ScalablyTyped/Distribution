package typings.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define an Instrument and the options for playing it.
  */
trait EarconInstrument extends StObject {
  
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | Instrument
  
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: InstrumentPlayOptionsObject
}
object EarconInstrument {
  
  @scala.inline
  def apply(instrument: String | Instrument, playOptions: InstrumentPlayOptionsObject): EarconInstrument = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], playOptions = playOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconInstrument]
  }
  
  @scala.inline
  implicit class EarconInstrumentMutableBuilder[Self <: EarconInstrument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstrument(value: String | Instrument): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayOptions(value: InstrumentPlayOptionsObject): Self = StObject.set(x, "playOptions", value.asInstanceOf[js.Any])
  }
}
