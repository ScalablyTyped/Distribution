package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityExportingOptions extends js.Object {
  var chartMenuLabel: js.UndefOr[String] = js.native
  var exportRegionLabel: js.UndefOr[String] = js.native
  var menuButtonLabel: js.UndefOr[String] = js.native
}

object LangAccessibilityExportingOptions {
  @scala.inline
  def apply(): LangAccessibilityExportingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityExportingOptions]
  }
  @scala.inline
  implicit class LangAccessibilityExportingOptionsOps[Self <: LangAccessibilityExportingOptions] (val x: Self) extends AnyVal {
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
    def setChartMenuLabel(value: String): Self = this.set("chartMenuLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartMenuLabel: Self = this.set("chartMenuLabel", js.undefined)
    @scala.inline
    def setExportRegionLabel(value: String): Self = this.set("exportRegionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportRegionLabel: Self = this.set("exportRegionLabel", js.undefined)
    @scala.inline
    def setMenuButtonLabel(value: String): Self = this.set("menuButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuButtonLabel: Self = this.set("menuButtonLabel", js.undefined)
  }
  
}

