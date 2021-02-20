package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global classes and objects related to sonification.
  */
@js.native
trait SonificationObject extends StObject {
  
  /**
    * The Earcon class.
    */
  var Earcon: js.Function = js.native
  
  /**
    * The Instrument class.
    */
  var Instrument: js.Function = js.native
  
  /**
    * Note fade-out-time in milliseconds. Most notes are faded out quickly
    * by default if there is time. This is to avoid abrupt stops which will
    * cause perceived clicks.
    */
  var fadeOutDuration: Double = js.native
  
  /**
    * Predefined instruments, given as an object with a map between the
    * instrument name and the Highcharts.Instrument object.
    */
  var instruments: js.Object = js.native
}
object SonificationObject {
  
  @scala.inline
  def apply(Earcon: js.Function, Instrument: js.Function, fadeOutDuration: Double, instruments: js.Object): SonificationObject = {
    val __obj = js.Dynamic.literal(Earcon = Earcon.asInstanceOf[js.Any], Instrument = Instrument.asInstanceOf[js.Any], fadeOutDuration = fadeOutDuration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationObject]
  }
  
  @scala.inline
  implicit class SonificationObjectMutableBuilder[Self <: SonificationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarcon(value: js.Function): Self = StObject.set(x, "Earcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeOutDuration(value: Double): Self = StObject.set(x, "fadeOutDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrument(value: js.Function): Self = StObject.set(x, "Instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstruments(value: js.Object): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
  }
}
