package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsFibonacciTypeOptions extends js.Object {
  /**
    * (Highstock) An array of background colors: Default to: (see online
    * documentation for example)
    */
  var backgroundColors: js.UndefOr[js.Object] = js.undefined
  /**
    * (Highstock) The height of the fibonacci in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) An array with options for the labels.
    */
  var labels: js.UndefOr[js.Array[AnnotationsFibonacciTypeLabelsOptions]] = js.undefined
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsFibonacciTypeLineOptions] = js.undefined
  /**
    * (Highstock) The color of line.
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) An array of colors for the lines.
    */
  var lineColors: js.UndefOr[js.Object] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsFibonacciTypePointsOptions]] = js.undefined
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

object AnnotationsFibonacciTypeOptions {
  @scala.inline
  def apply(
    backgroundColors: js.Object = null,
    height: js.UndefOr[Double] = js.undefined,
    labels: js.Array[AnnotationsFibonacciTypeLabelsOptions] = null,
    line: AnnotationsFibonacciTypeLineOptions = null,
    lineColor: String = null,
    lineColors: js.Object = null,
    points: js.Array[AnnotationsFibonacciTypePointsOptions] = null,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsFibonacciTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColors != null) __obj.updateDynamic("backgroundColors")(backgroundColors.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsFibonacciTypeOptions]
  }
}

