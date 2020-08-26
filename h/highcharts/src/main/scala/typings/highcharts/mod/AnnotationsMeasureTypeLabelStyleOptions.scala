package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeLabelStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
}

object AnnotationsMeasureTypeLabelStyleOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelStyleOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeLabelStyleOptionsOps[Self <: AnnotationsMeasureTypeLabelStyleOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
  }
  
}

