package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsTunnelTypeOptions extends js.Object {
  /**
    * (Highstock) Background options.
    */
  var background: js.UndefOr[js.Object | AnnotationsTunnelTypeBackgroundOptions] = js.undefined
  /**
    * (Highstock) The height of the annotation in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Options for the control point which controls the annotation's
    * height.
    */
  var heightControlPoint: js.UndefOr[AnnotationsTunnelTypeHeightControlPointOptions] = js.undefined
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsTunnelTypeLineOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsTunnelTypePointsOptions]] = js.undefined
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

object AnnotationsTunnelTypeOptions {
  @scala.inline
  def apply(
    background: js.Object | AnnotationsTunnelTypeBackgroundOptions = null,
    height: Int | Double = null,
    heightControlPoint: AnnotationsTunnelTypeHeightControlPointOptions = null,
    line: AnnotationsTunnelTypeLineOptions = null,
    points: js.Array[AnnotationsTunnelTypePointsOptions] = null,
    xAxis: Int | Double = null,
    yAxis: Int | Double = null
  ): AnnotationsTunnelTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightControlPoint != null) __obj.updateDynamic("heightControlPoint")(heightControlPoint)
    if (line != null) __obj.updateDynamic("line")(line)
    if (points != null) __obj.updateDynamic("points")(points)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsTunnelTypeOptions]
  }
}

