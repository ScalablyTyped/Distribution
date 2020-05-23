package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeOptions extends js.Object {
  var background: js.UndefOr[AnnotationsMeasureTypeBackgroundOptions] = js.undefined
  /**
    * (Highstock) Configure a crosshair that is horizontally placed in middle
    * of rectangle.
    */
  var crosshairX: js.UndefOr[AnnotationsMeasureTypeCrosshairXOptions] = js.undefined
  /**
    * (Highstock) Configure a crosshair that is vertically placed in middle of
    * rectangle.
    */
  var crosshairY: js.UndefOr[AnnotationsMeasureTypeCrosshairYOptions] = js.undefined
  var label: js.UndefOr[AnnotationsMeasureTypeLabelOptions] = js.undefined
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsMeasureTypeLineOptions] = js.undefined
  var points: js.UndefOr[js.Array[AnnotationsMeasureTypePointsOptions]] = js.undefined
  /**
    * (Highstock) Decides in what dimensions the user can resize by dragging
    * the mouse. Can be one of x, y or xy.
    */
  var selectType: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the yAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeOptions {
  @scala.inline
  def apply(
    background: AnnotationsMeasureTypeBackgroundOptions = null,
    crosshairX: AnnotationsMeasureTypeCrosshairXOptions = null,
    crosshairY: AnnotationsMeasureTypeCrosshairYOptions = null,
    label: AnnotationsMeasureTypeLabelOptions = null,
    line: AnnotationsMeasureTypeLineOptions = null,
    points: js.Array[AnnotationsMeasureTypePointsOptions] = null,
    selectType: String = null,
    xAxis: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Double] = js.undefined
  ): AnnotationsMeasureTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (crosshairX != null) __obj.updateDynamic("crosshairX")(crosshairX.asInstanceOf[js.Any])
    if (crosshairY != null) __obj.updateDynamic("crosshairY")(crosshairY.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (selectType != null) __obj.updateDynamic("selectType")(selectType.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeOptions]
  }
}

