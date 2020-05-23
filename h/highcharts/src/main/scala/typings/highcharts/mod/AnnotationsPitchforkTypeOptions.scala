package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsPitchforkTypeOptions extends js.Object {
  /**
    * (Highstock) Inner background options.
    */
  var innerBackground: js.UndefOr[AnnotationsPitchforkTypeInnerBackgroundOptions] = js.undefined
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsPitchforkTypeLineOptions] = js.undefined
  /**
    * (Highstock) Outer background options.
    */
  var outerBackground: js.UndefOr[AnnotationsPitchforkTypeOuterBackgroundOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsPitchforkTypePointsOptions]] = js.undefined
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

object AnnotationsPitchforkTypeOptions {
  @scala.inline
  def apply(
    innerBackground: AnnotationsPitchforkTypeInnerBackgroundOptions = null,
    line: AnnotationsPitchforkTypeLineOptions = null,
    outerBackground: AnnotationsPitchforkTypeOuterBackgroundOptions = null,
    points: js.Array[AnnotationsPitchforkTypePointsOptions] = null,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsPitchforkTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (innerBackground != null) __obj.updateDynamic("innerBackground")(innerBackground.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (outerBackground != null) __obj.updateDynamic("outerBackground")(outerBackground.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsPitchforkTypeOptions]
  }
}

