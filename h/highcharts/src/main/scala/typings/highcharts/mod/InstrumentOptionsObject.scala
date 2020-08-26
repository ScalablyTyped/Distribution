package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of options for the Instrument class.
  */
@js.native
trait InstrumentOptionsObject extends js.Object {
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
  implicit class InstrumentOptionsObjectOps[Self <: InstrumentOptionsObject] (val x: Self) extends AnyVal {
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
    def setAllowedFrequenciesVarargs(value: Double*): Self = this.set("allowedFrequencies", js.Array(value :_*))
    @scala.inline
    def setAllowedFrequencies(value: js.Array[Double]): Self = this.set("allowedFrequencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedFrequencies: Self = this.set("allowedFrequencies", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOscillator(value: typings.highcharts.sonificationMod.highchartsAugmentingMod.OscillatorOptionsObject): Self = this.set("oscillator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOscillator: Self = this.set("oscillator", js.undefined)
    @scala.inline
    def setPlayCallbackInterval(value: Double): Self = this.set("playCallbackInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayCallbackInterval: Self = this.set("playCallbackInterval", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

