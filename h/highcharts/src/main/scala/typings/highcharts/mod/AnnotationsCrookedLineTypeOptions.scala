package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsCrookedLineTypeOptions extends js.Object {
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsCrookedLineTypeLineOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsCrookedLineTypePointsOptions]] = js.undefined
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnnotationsCrookedLineTypeOptions {
  @scala.inline
  def apply(
    line: AnnotationsCrookedLineTypeLineOptions = null,
    points: js.Array[AnnotationsCrookedLineTypePointsOptions] = null,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsCrookedLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsCrookedLineTypeOptions]
  }
}

