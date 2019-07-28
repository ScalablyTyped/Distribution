package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsElliottWaveTypePointsOptions extends js.Object {
  var controlPoint: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var label: js.UndefOr[AnnotationsElliottWaveTypePointsLabelOptions] = js.undefined
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsElliottWaveTypePointsOptions {
  @scala.inline
  def apply(
    controlPoint: Int | Double = null,
    label: AnnotationsElliottWaveTypePointsLabelOptions = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnnotationsElliottWaveTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPoint != null) __obj.updateDynamic("controlPoint")(controlPoint.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsOptions]
  }
}

