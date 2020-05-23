package typings.highcharts.mod

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
    controlPoint: js.UndefOr[Double] = js.undefined,
    label: AnnotationsElliottWaveTypePointsLabelOptions = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): AnnotationsElliottWaveTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controlPoint)) __obj.updateDynamic("controlPoint")(controlPoint.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsOptions]
  }
}

