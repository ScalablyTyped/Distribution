package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsTunnelTypePointsOptions extends js.Object {
  var controlPoint: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsTunnelTypePointsOptions {
  @scala.inline
  def apply(
    controlPoint: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): AnnotationsTunnelTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controlPoint)) __obj.updateDynamic("controlPoint")(controlPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsTunnelTypePointsOptions]
  }
}

