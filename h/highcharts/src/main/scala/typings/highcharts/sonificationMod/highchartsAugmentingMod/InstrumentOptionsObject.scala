package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of options for the Instrument class.
  */
trait InstrumentOptionsObject extends js.Object {
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
  var oscillator: js.UndefOr[OscillatorOptionsObject] = js.undefined
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
  @scala.inline
  def apply(
    allowedFrequencies: js.Array[Double] = null,
    id: String = null,
    oscillator: OscillatorOptionsObject = null,
    playCallbackInterval: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): InstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (allowedFrequencies != null) __obj.updateDynamic("allowedFrequencies")(allowedFrequencies.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (oscillator != null) __obj.updateDynamic("oscillator")(oscillator.asInstanceOf[js.Any])
    if (!js.isUndefined(playCallbackInterval)) __obj.updateDynamic("playCallbackInterval")(playCallbackInterval.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentOptionsObject]
  }
}

