package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsForHtmlFileAsValidationTargetAndObjectAsResult extends OptionsForHtmlFileAsValidationTarget {
  var format: js.UndefOr[json] = js.native
}

object OptionsForHtmlFileAsValidationTargetAndObjectAsResult {
  @scala.inline
  def apply(data: String): OptionsForHtmlFileAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndObjectAsResult]
  }
  @scala.inline
  implicit class OptionsForHtmlFileAsValidationTargetAndObjectAsResultOps[Self <: OptionsForHtmlFileAsValidationTargetAndObjectAsResult] (val x: Self) extends AnyVal {
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
    def setFormat(value: json): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

