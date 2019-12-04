package typings.highcharts.modulesSonificationMod.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global classes and objects related to sonification.
  */
trait SonificationObject extends js.Object {
  /**
    * The Earcon class.
    */
  var Earcon: js.Function
  /**
    * The Instrument class.
    */
  var Instrument: js.Function
  /**
    * Note fade-out-time in milliseconds. Most notes are faded out quickly
    * by default if there is time. This is to avoid abrupt stops which will
    * cause perceived clicks.
    */
  var fadeOutDuration: Double
  /**
    * Predefined instruments, given as an object with a map between the
    * instrument name and the Highcharts.Instrument object.
    */
  var instruments: js.Object
}

object SonificationObject {
  @scala.inline
  def apply(Earcon: js.Function, Instrument: js.Function, fadeOutDuration: Double, instruments: js.Object): SonificationObject = {
    val __obj = js.Dynamic.literal(Earcon = Earcon.asInstanceOf[js.Any], Instrument = Instrument.asInstanceOf[js.Any], fadeOutDuration = fadeOutDuration.asInstanceOf[js.Any], instruments = instruments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SonificationObject]
  }
}

