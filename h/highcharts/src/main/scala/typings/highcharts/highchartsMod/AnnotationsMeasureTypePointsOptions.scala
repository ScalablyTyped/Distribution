package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypePointsOptions extends js.Object {
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

object AnnotationsMeasureTypePointsOptions {
  @scala.inline
  def apply(controlPoint: Int | Double = null, x: Int | Double = null, y: Int | Double = null): AnnotationsMeasureTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPoint != null) __obj.updateDynamic("controlPoint")(controlPoint.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypePointsOptions]
  }
}

