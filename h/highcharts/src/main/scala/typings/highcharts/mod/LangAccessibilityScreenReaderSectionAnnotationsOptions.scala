package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityScreenReaderSectionAnnotationsOptions extends js.Object {
  var descriptionMultiplePoints: js.UndefOr[String] = js.native
  var descriptionNoPoints: js.UndefOr[String] = js.native
  var descriptionSinglePoint: js.UndefOr[String] = js.native
  var heading: js.UndefOr[String] = js.native
}

object LangAccessibilityScreenReaderSectionAnnotationsOptions {
  @scala.inline
  def apply(): LangAccessibilityScreenReaderSectionAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionAnnotationsOptions]
  }
  @scala.inline
  implicit class LangAccessibilityScreenReaderSectionAnnotationsOptionsOps[Self <: LangAccessibilityScreenReaderSectionAnnotationsOptions] (val x: Self) extends AnyVal {
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
    def setDescriptionMultiplePoints(value: String): Self = this.set("descriptionMultiplePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionMultiplePoints: Self = this.set("descriptionMultiplePoints", js.undefined)
    @scala.inline
    def setDescriptionNoPoints(value: String): Self = this.set("descriptionNoPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionNoPoints: Self = this.set("descriptionNoPoints", js.undefined)
    @scala.inline
    def setDescriptionSinglePoint(value: String): Self = this.set("descriptionSinglePoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionSinglePoint: Self = this.set("descriptionSinglePoint", js.undefined)
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
  }
  
}

