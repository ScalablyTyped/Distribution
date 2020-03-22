package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationLabelAccessibilityOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
    * label for screen readers and other assistive technology.
    */
  var description: js.UndefOr[String] = js.undefined
}

object AnnotationLabelAccessibilityOptionsObject {
  @scala.inline
  def apply(description: String = null): AnnotationLabelAccessibilityOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationLabelAccessibilityOptionsObject]
  }
}

