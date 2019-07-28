package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsMeasureControlPointOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsMeasureTypeOptions] = js.undefined
}

object AnnotationsMeasureOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationsMeasureControlPointOptions = null,
    typeOptions: AnnotationsMeasureTypeOptions = null
  ): AnnotationsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions)
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions)
    __obj.asInstanceOf[AnnotationsMeasureOptions]
  }
}

