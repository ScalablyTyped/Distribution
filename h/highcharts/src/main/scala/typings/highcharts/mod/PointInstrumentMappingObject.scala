package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define the parameter mapping for an instrument.
  */
@js.native
trait PointInstrumentMappingObject extends js.Object {
  /**
    * Define the duration of the notes for this instrument. This can be a
    * string with a data property name, e.g. `'y'`, in which case this data
    * property is used to define the duration relative to the `y`-values of
    * the other points. A higher `y` value would then result in a longer
    * duration. This option can also be a fixed number or a function. If it
    * is a function, this function is called once before the note starts
    * playing, and should return the duration in milliseconds. It receives
    * two arguments: The point, and the dataExtremes.
    */
  var duration: Double | String | js.Function = js.native
  /**
    * Define the frequency of the instrument. This can be a string with a
    * data property name, e.g. `'y'`, in which case this data property is
    * used to define the frequency relative to the `y`-values of the other
    * points. A higher `y` value would then result in a higher frequency.
    * This option can also be a fixed number or a function. If it is a
    * function, this function is called in regular intervals while the note
    * is playing. It receives three arguments: The point, the dataExtremes,
    * and the current relative time - where 0 is the beginning of the note
    * and 1 is the end. The function should return the frequency of the
    * note as a number (in Hz).
    */
  var frequency: Double | String | js.Function = js.native
  /**
    * Define the panning of the instrument. This can be a string with a
    * data property name, e.g. `'x'`, in which case this data property is
    * used to define the panning relative to the `x`-values of the other
    * points. A higher `x` value would then result in a higher panning
    * value (panned further to the right). This option can also be a fixed
    * number or a function. If it is a function, this function is called in
    * regular intervals while the note is playing. It receives three
    * arguments: The point, the dataExtremes, and the current relative time
    * - where 0 is the beginning of the note and 1 is the end. The function
    * should return the panning of the note as a number between -1 and 1.
    */
  var pan: js.UndefOr[Double | String | js.Function] = js.native
  /**
    * Define the volume of the instrument. This can be a string with a data
    * property name, e.g. `'y'`, in which case this data property is used
    * to define the volume relative to the `y`-values of the other points.
    * A higher `y` value would then result in a higher volume. This option
    * can also be a fixed number or a function. If it is a function, this
    * function is called in regular intervals while the note is playing. It
    * receives three arguments: The point, the dataExtremes, and the
    * current relative time - where 0 is the beginning of the note and 1 is
    * the end. The function should return the volume of the note as a
    * number between 0 and 1.
    */
  var volume: Double | String | js.Function = js.native
}

object PointInstrumentMappingObject {
  @scala.inline
  def apply(
    duration: Double | String | js.Function,
    frequency: Double | String | js.Function,
    volume: Double | String | js.Function
  ): PointInstrumentMappingObject = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentMappingObject]
  }
  @scala.inline
  implicit class PointInstrumentMappingObjectOps[Self <: PointInstrumentMappingObject] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double | String | js.Function): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequency(value: Double | String | js.Function): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double | String | js.Function): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def setPan(value: Double | String | js.Function): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
  }
  
}

