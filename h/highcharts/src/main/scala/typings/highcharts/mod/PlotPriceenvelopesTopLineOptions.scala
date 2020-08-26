package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPriceenvelopesTopLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPriceenvelopesTopLineStylesOptions] = js.native
}

object PlotPriceenvelopesTopLineOptions {
  @scala.inline
  def apply(): PlotPriceenvelopesTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesTopLineOptions]
  }
  @scala.inline
  implicit class PlotPriceenvelopesTopLineOptionsOps[Self <: PlotPriceenvelopesTopLineOptions] (val x: Self) extends AnyVal {
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
    def setStyles(value: PlotPriceenvelopesTopLineStylesOptions): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

