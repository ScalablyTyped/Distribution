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
    maxDuration: js.UndefOr[Double] = js.undefined,
    maxFrequency: js.UndefOr[Double] = js.undefined,
    maxPan: js.UndefOr[Double] = js.undefined,
    maxVolume: js.UndefOr[Double] = js.undefined,
    minDuration: js.UndefOr[Double] = js.undefined,
    minFrequency: js.UndefOr[Double] = js.undefined,
    minPan: js.UndefOr[Double] = js.undefined,
    minVolume: js.UndefOr[Double] = js.undefined
  ): PointInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFrequency)) __obj.updateDynamic("maxFrequency")(maxFrequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPan)) __obj.updateDynamic("maxPan")(maxPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxVolume)) __obj.updateDynamic("maxVolume")(maxVolume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDuration)) __obj.updateDynamic("minDuration")(minDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minFrequency)) __obj.updateDynamic("minFrequency")(minFrequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPan)) __obj.updateDynamic("minPan")(minPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVolume)) __obj.updateDynamic("minVolume")(minVolume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInstrumentOptionsObject]
  }
}

