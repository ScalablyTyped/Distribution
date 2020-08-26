package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityRangeSelectorOptions extends js.Object {
  var buttonText: js.UndefOr[String] = js.native
  var maxInputLabel: js.UndefOr[String] = js.native
  var minInputLabel: js.UndefOr[String] = js.native
}

object LangAccessibilityRangeSelectorOptions {
  @scala.inline
  def apply(): LangAccessibilityRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityRangeSelectorOptions]
  }
  @scala.inline
  implicit class LangAccessibilityRangeSelectorOptionsOps[Self <: LangAccessibilityRangeSelectorOptions] (val x: Self) extends AnyVal {
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
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setMaxInputLabel(value: String): Self = this.set("maxInputLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInputLabel: Self = this.set("maxInputLabel", js.undefined)
    @scala.inline
    def setMinInputLabel(value: String): Self = this.set("minInputLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinInputLabel: Self = this.set("minInputLabel", js.undefined)
  }
  
}

