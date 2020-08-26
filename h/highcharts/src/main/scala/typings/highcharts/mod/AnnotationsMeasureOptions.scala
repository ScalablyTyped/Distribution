package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsMeasureControlPointOptions] = js.native
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsMeasureTypeOptions] = js.native
}

object AnnotationsMeasureOptions {
  @scala.inline
  def apply(): AnnotationsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureOptionsOps[Self <: AnnotationsMeasureOptions] (val x: Self) extends AnyVal {
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
    def setControlPointOptions(value: AnnotationsMeasureControlPointOptions): Self = this.set("controlPointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlPointOptions: Self = this.set("controlPointOptions", js.undefined)
    @scala.inline
    def setTypeOptions(value: AnnotationsMeasureTypeOptions): Self = this.set("typeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeOptions: Self = this.set("typeOptions", js.undefined)
  }
  
}

