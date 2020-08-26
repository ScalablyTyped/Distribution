package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityLegendOptions extends js.Object {
  var legendItem: js.UndefOr[String] = js.native
  var legendLabel: js.UndefOr[String] = js.native
}

object LangAccessibilityLegendOptions {
  @scala.inline
  def apply(): LangAccessibilityLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityLegendOptions]
  }
  @scala.inline
  implicit class LangAccessibilityLegendOptionsOps[Self <: LangAccessibilityLegendOptions] (val x: Self) extends AnyVal {
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
    def setLegendItem(value: String): Self = this.set("legendItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendItem: Self = this.set("legendItem", js.undefined)
    @scala.inline
    def setLegendLabel(value: String): Self = this.set("legendLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendLabel: Self = this.set("legendLabel", js.undefined)
  }
  
}

