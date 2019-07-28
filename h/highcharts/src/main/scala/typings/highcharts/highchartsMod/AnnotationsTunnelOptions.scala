package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsTunnelOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsTunnelControlPointOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsTunnelLabelOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsTunnelShapeOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsTunnelTypeOptions] = js.undefined
}

object AnnotationsTunnelOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationsTunnelControlPointOptions = null,
    labelOptions: AnnotationsTunnelLabelOptions = null,
    shapeOptions: AnnotationsTunnelShapeOptions = null,
    typeOptions: AnnotationsTunnelTypeOptions = null
  ): AnnotationsTunnelOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions)
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions)
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions)
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions)
    __obj.asInstanceOf[AnnotationsTunnelOptions]
  }
}

