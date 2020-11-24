package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define an Instrument and the options for playing it.
  */
@js.native
trait EarconInstrument extends js.Object {
  
  /**
    * An instrument instance or the name of the instrument in the
    * Highcharts.sonification.instruments map.
    */
  var instrument: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument = js.native
  
  /**
    * The options to pass to Instrument.play.
    */
  var playOptions: typings.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject = js.native
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
  
  @scala.inline
  implicit class EarconInstrumentOps[Self <: EarconInstrument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstrument(value: String | typings.highcharts.sonificationMod.highchartsAugmentingMod.Instrument): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayOptions(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.InstrumentPlayOptionsObject): Self = this.set("playOptions", value.asInstanceOf[js.Any])
  }
}
