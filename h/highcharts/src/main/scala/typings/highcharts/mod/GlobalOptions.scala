package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
    * required by VML browsers in order to draw radial gradients.
    */
  var VMLRadialGradientURL: js.UndefOr[String] = js.native
}

object GlobalOptions {
  @scala.inline
  def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  @scala.inline
  implicit class GlobalOptionsOps[Self <: GlobalOptions] (val x: Self) extends AnyVal {
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
    def setVMLRadialGradientURL(value: String): Self = this.set("VMLRadialGradientURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVMLRadialGradientURL: Self = this.set("VMLRadialGradientURL", js.undefined)
  }
  
}

