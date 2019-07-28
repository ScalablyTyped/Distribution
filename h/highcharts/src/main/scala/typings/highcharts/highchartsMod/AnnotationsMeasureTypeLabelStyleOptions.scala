package typings.highcharts.highchartsMod

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
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelStyleOptions]
  }
}

