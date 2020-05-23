package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsVerticalLineTypeOptions extends js.Object {
  /**
    * (Highstock) Connector options.
    */
  var connector: js.UndefOr[AnnotationsVerticalLineTypeConnectorOptions] = js.undefined
  /**
    * (Highstock) Label options.
    */
  var label: js.UndefOr[AnnotationsVerticalLineTypeLabelOptions] = js.undefined
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsVerticalLineTypeLineOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsVerticalLineTypePointsOptions]] = js.undefined
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

object AnnotationsVerticalLineTypeOptions {
  @scala.inline
  def apply(
    connector: AnnotationsVerticalLineTypeConnectorOptions = null,
    label: AnnotationsVerticalLineTypeLabelOptions = null,
    line: AnnotationsVerticalLineTypeLineOptions = null,
    points: js.Array[AnnotationsVerticalLineTypePointsOptions] = null,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsVerticalLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsVerticalLineTypeOptions]
  }
}

