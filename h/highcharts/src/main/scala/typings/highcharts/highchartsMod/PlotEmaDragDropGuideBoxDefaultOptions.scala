package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotEmaDragDropGuideBoxDefaultOptions extends js.Object {
  /**
    * (Highstock) CSS class name of the guide box in this state. Defaults to
    * `highcharts-drag-box-default`.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Guide box fill color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Guide box cursor.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Color of the border around the guide box.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Width of the line around the guide box.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Guide box zIndex.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotEmaDragDropGuideBoxDefaultOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    cursor: String = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    zIndex: Int | Double = null
  ): PlotEmaDragDropGuideBoxDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotEmaDragDropGuideBoxDefaultOptions]
  }
}

