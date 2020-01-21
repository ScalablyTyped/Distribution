package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeLabelStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
}

object AnnotationsMeasureTypeLabelStyleOptions {
  @scala.inline
  def apply(color: String = null, fontSize: String = null): AnnotationsMeasureTypeLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelStyleOptions]
  }
}

