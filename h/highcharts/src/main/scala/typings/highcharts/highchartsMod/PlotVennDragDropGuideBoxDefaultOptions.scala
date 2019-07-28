package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVennDragDropGuideBoxDefaultOptions extends js.Object {
  /**
    * (Highcharts) CSS class name of the guide box in this state. Defaults to
    * `highcharts-drag-box-default`.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Guide box fill color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) Guide box cursor.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Color of the border around the guide box.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) Width of the line around the guide box.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Guide box zIndex.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotVennDragDropGuideBoxDefaultOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    cursor: String = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    zIndex: Int | Double = null
  ): PlotVennDragDropGuideBoxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVennDragDropGuideBoxDefaultOptions]
  }
}

