package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsInfinityLineTypeOptions extends js.Object {
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsInfinityLineTypeLineOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsInfinityLineTypePointsOptions]] = js.undefined
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

object AnnotationsInfinityLineTypeOptions {
  @scala.inline
  def apply(
    line: AnnotationsInfinityLineTypeLineOptions = null,
    points: js.Array[AnnotationsInfinityLineTypePointsOptions] = null,
    xAxis: Int | Double = null,
    yAxis: Int | Double = null
  ): AnnotationsInfinityLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    if (points != null) __obj.updateDynamic("points")(points)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsInfinityLineTypeOptions]
  }
}

