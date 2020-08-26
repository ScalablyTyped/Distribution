package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationLabelAccessibilityOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
    * label for screen readers and other assistive technology.
    */
  var description: js.UndefOr[String] = js.native
}

object AnnotationLabelAccessibilityOptionsObject {
  @scala.inline
  def apply(): AnnotationLabelAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationLabelAccessibilityOptionsObject]
  }
  @scala.inline
  implicit class AnnotationLabelAccessibilityOptionsObjectOps[Self <: AnnotationLabelAccessibilityOptionsObject] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

