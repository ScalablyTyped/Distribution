package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var unit: js.UndefOr[OptionsUnitValue] = js.native
  /**
    * (Highcharts) The value used for calculating the width of the ring. Its'
    * affect is determined by `levelSize.unit`.
    */
  var value: js.UndefOr[Double] = js.native
}

object PlotSunburstLevelSizeOptions {
  @scala.inline
  def apply(): PlotSunburstLevelSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstLevelSizeOptions]
  }
  @scala.inline
  implicit class PlotSunburstLevelSizeOptionsOps[Self <: PlotSunburstLevelSizeOptions] (val x: Self) extends AnyVal {
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
    def setUnit(value: OptionsUnitValue): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

