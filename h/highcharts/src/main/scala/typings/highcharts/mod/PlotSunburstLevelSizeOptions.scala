package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstLevelSizeOptions extends js.Object {
  /**
    * (Highcharts) How to interpret `levelSize.value`.
    *
    * - `percentage` gives a width relative to result of outer radius minus
    * inner radius.
    *
    * - `pixels` gives the ring a fixed width in pixels.
    *
    * - `weight` takes the remaining width after percentage and pixels, and
    * distributes it accross all "weighted" levels. The value relative to the
    * sum of all weights determines the width.
    */
  var unit: js.UndefOr[OptionsUnitValue] = js.undefined
  /**
    * (Highcharts) The value used for calculating the width of the ring. Its'
    * affect is determined by `levelSize.unit`.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object PlotSunburstLevelSizeOptions {
  @scala.inline
  def apply(unit: OptionsUnitValue = null, value: Int | Double = null): PlotSunburstLevelSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSunburstLevelSizeOptions]
  }
}

