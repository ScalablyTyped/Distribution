package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeLineOptions extends js.Object {
  var fill: js.UndefOr[String] = js.native
}

object AnnotationsMeasureTypeLineOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLineOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeLineOptionsOps[Self <: AnnotationsMeasureTypeLineOptions] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
  }
  
}

