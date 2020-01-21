package typings.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInstrumentOptionsObject extends js.Object {
  /**
    * The maximum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 2000.
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /**
    * The maximum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 2200.
    */
  var maxFrequency: js.UndefOr[Double] = js.undefined
  /**
    * The maximum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to 1 (fully right).
    */
  var maxPan: js.UndefOr[Double] = js.undefined
  /**
    * The maximum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 1.
    */
  var maxVolume: js.UndefOr[Double] = js.undefined
  /**
    * The minimum duration for a note when using a data property for
    * duration. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.duration. Defaults to 20.
    */
  var minDuration: js.UndefOr[Double] = js.undefined
  /**
    * The minimum frequency for a note when using a data property for
    * frequency. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.frequency. Defaults to 220.
    */
  var minFrequency: js.UndefOr[Double] = js.undefined
  /**
    * The minimum pan value for a note when using a data property for
    * panning. Can be overridden by using either a fixed number or a
    * function for instrumentMapping.pan. Defaults to -1 (fully left).
    */
  var minPan: js.UndefOr[Double] = js.undefined
  /**
    * The minimum volume for a note when using a data property for volume.
    * Can be overridden by using either a fixed number or a function for
    * instrumentMapping.volume. Defaults to 0.1.
    */
  var minVolume: js.UndefOr[Double] = js.undefined
}

object PointInstrumentOptionsObject {
  @scala.inline
  def apply(
    maxDuration: Int | Double = null,
    maxFrequency: Int | Double = null,
    maxPan: Int | Double = null,
    maxVolume: Int | Double = null,
    minDuration: Int | Double = null,
    minFrequency: Int | Double = null,
    minPan: Int | Double = null,
    minVolume: Int | Double = null
  ): PointInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (maxDuration != null) __obj.updateDynamic("maxDuration")(maxDuration.asInstanceOf[js.Any])
    if (maxFrequency != null) __obj.updateDynamic("maxFrequency")(maxFrequency.asInstanceOf[js.Any])
    if (maxPan != null) __obj.updateDynamic("maxPan")(maxPan.asInstanceOf[js.Any])
    if (maxVolume != null) __obj.updateDynamic("maxVolume")(maxVolume.asInstanceOf[js.Any])
    if (minDuration != null) __obj.updateDynamic("minDuration")(minDuration.asInstanceOf[js.Any])
    if (minFrequency != null) __obj.updateDynamic("minFrequency")(minFrequency.asInstanceOf[js.Any])
    if (minPan != null) __obj.updateDynamic("minPan")(minPan.asInstanceOf[js.Any])
    if (minVolume != null) __obj.updateDynamic("minVolume")(minVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentOptionsObject]
  }
}

