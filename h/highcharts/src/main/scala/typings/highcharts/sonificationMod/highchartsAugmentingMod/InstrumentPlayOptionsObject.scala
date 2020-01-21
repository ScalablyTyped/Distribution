package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for playing an instrument.
  */
trait InstrumentPlayOptionsObject extends js.Object {
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
  @scala.inline
  def apply(
    duration: Double,
    frequency: Double | js.Function,
    maxFrequency: Int | Double = null,
    minFrequency: Int | Double = null,
    onEnd: js.Function = null,
    pan: Double | js.Function = null,
    volume: Double | js.Function = null
  ): InstrumentPlayOptionsObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any])
    if (maxFrequency != null) __obj.updateDynamic("maxFrequency")(maxFrequency.asInstanceOf[js.Any])
    if (minFrequency != null) __obj.updateDynamic("minFrequency")(minFrequency.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentPlayOptionsObject]
  }
}

