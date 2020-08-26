package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityTableOptions extends js.Object {
  var tableSummary: js.UndefOr[String] = js.native
  var viewAsDataTableButtonText: js.UndefOr[String] = js.native
}

object LangAccessibilityTableOptions {
  @scala.inline
  def apply(): LangAccessibilityTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityTableOptions]
  }
  @scala.inline
  implicit class LangAccessibilityTableOptionsOps[Self <: LangAccessibilityTableOptions] (val x: Self) extends AnyVal {
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
    def setTableSummary(value: String): Self = this.set("tableSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableSummary: Self = this.set("tableSummary", js.undefined)
    @scala.inline
    def setViewAsDataTableButtonText(value: String): Self = this.set("viewAsDataTableButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewAsDataTableButtonText: Self = this.set("viewAsDataTableButtonText", js.undefined)
  }
  
}

