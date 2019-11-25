package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBulletDragDropDragHandleOptions extends js.Object {
  /**
    * (Highcharts) The class name of the drag handles. Defaults to
    * `highcharts-drag-handle`.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The fill color of the drag handles.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The mouse cursor to use for the drag handles. By default
    * this is intelligently switching between `ew-resize` and `ns-resize`
    * depending on the direction the point is being dragged.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The line color of the drag handles.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) The line width for the drag handles.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Function to define the SVG path to use for the drag handles.
    * Takes the point as argument. Should return an SVG path in array format.
    * The SVG path is automatically positioned on the point.
    */
  var pathFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts) The z index for the drag handles.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotBulletDragDropDragHandleOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    cursor: String = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    pathFormatter: js.Function = null,
    zIndex: Int | Double = null
  ): PlotBulletDragDropDragHandleOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (pathFormatter != null) __obj.updateDynamic("pathFormatter")(pathFormatter.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBulletDragDropDragHandleOptions]
  }
}

