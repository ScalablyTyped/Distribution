package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
}

object StockChartExportSVGOptions {
  @scala.inline
  def apply(): StockChartExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartExportSVGOptions]
  }
  @scala.inline
  implicit class StockChartExportSVGOptionsOps[Self <: StockChartExportSVGOptions] (val x: Self) extends AnyVal {
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

