package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsFibonacciOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsFibonacciControlPointOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsFibonacciLabelOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsFibonacciShapeOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsFibonacciTypeOptions] = js.undefined
}

object AnnotationsFibonacciOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationsFibonacciControlPointOptions = null,
    labelOptions: AnnotationsFibonacciLabelOptions = null,
    shapeOptions: AnnotationsFibonacciShapeOptions = null,
    typeOptions: AnnotationsFibonacciTypeOptions = null
  ): AnnotationsFibonacciOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions)
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions)
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions)
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions)
    __obj.asInstanceOf[AnnotationsFibonacciOptions]
  }
}

