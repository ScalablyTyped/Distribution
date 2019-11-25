package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineOptions extends js.Object {
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsVerticalLineLabelOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsVerticalLineShapeOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsVerticalLineTypeOptions] = js.undefined
}

object AnnotationsVerticalLineOptions {
  @scala.inline
  def apply(
    labelOptions: AnnotationsVerticalLineLabelOptions = null,
    shapeOptions: AnnotationsVerticalLineShapeOptions = null,
    typeOptions: AnnotationsVerticalLineTypeOptions = null
  ): AnnotationsVerticalLineOptions = {
    val __obj = js.Dynamic.literal()
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineOptions]
  }
}

