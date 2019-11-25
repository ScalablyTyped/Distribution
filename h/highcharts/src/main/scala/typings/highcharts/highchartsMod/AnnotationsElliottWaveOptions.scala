package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsElliottWaveOptions extends js.Object {
  var controlPointOptions: js.UndefOr[AnnotationsElliottWaveControlPointOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsElliottWaveLabelOptions] = js.undefined
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsElliottWaveShapeOptions] = js.undefined
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsElliottWaveTypeOptions] = js.undefined
}

object AnnotationsElliottWaveOptions {
  @scala.inline
  def apply(
    controlPointOptions: AnnotationsElliottWaveControlPointOptions = null,
    labelOptions: AnnotationsElliottWaveLabelOptions = null,
    shapeOptions: AnnotationsElliottWaveShapeOptions = null,
    typeOptions: AnnotationsElliottWaveTypeOptions = null
  ): AnnotationsElliottWaveOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions.asInstanceOf[js.Any])
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (typeOptions != null) __obj.updateDynamic("typeOptions")(typeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsElliottWaveOptions]
  }
}

