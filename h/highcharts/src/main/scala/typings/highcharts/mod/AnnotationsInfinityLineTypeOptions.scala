package typings.highcharts.mod

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
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsInfinityLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsInfinityLineTypeOptions]
  }
}

