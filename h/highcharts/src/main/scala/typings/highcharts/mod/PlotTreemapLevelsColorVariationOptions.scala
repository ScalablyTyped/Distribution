package typings.highcharts.mod

import typings.highcharts.highchartsStrings.brightness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapLevelsColorVariationOptions extends js.Object {
  /**
    * (Highcharts) The key of a color variation. Currently supports
    * `brightness` only.
    */
  var key: js.UndefOr[brightness] = js.native
  /**
    * (Highcharts) The ending value of a color variation. The last sibling will
    * receive this value.
    */
  var to: js.UndefOr[Double] = js.native
}

object PlotTreemapLevelsColorVariationOptions {
  @scala.inline
  def apply(): PlotTreemapLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsColorVariationOptions]
  }
  @scala.inline
  implicit class PlotTreemapLevelsColorVariationOptionsOps[Self <: PlotTreemapLevelsColorVariationOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: brightness): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

