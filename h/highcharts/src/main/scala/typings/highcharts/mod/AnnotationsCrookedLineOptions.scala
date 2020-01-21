package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsCrookedLineOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsCrookedLineControlPointOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsCrookedLineLabelOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsCrookedLineShapeOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsCrookedLineTypeOptions] = js.undefined
}

object AnnotationsCrookedLineOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationsCrookedLineControlPointOptions = null,
    labelOptions: AnnotationsCrookedLineLabelOptions = null,
    shapeOptions: AnnotationsCrookedLineShapeOptions = null,
    typeOptions: AnnotationsCrookedLineTypeOptions = null
  ): AnnotationsCrookedLineOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions.asInstanceOf[js.Any])
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsCrookedLineOptions]
  }
}

