package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define an Instrument and the options for playing it.
  */
trait EarconInstrument extends js.Object {
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: typings.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
}

object EarconInstrument {
  @scala.inline
  def apply(
    instrument: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument,
    playOptions: typings.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject
  ): EarconInstrument = {
    val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], playOptions = playOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconInstrument]
  }
}

