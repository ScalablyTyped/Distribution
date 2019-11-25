package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisPlotLinePathOptionsObject extends js.Object {
  /**
    * Used in Highstock. When `true`, plot paths (crosshair, plotLines,
    * gridLines) will be rendered on all axes when defined on the first axis.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false`, the function will return null when it falls outside the axis
    * bounds. If `true`, the function will return a path aligned to the plot
    * area sides if it falls outside. If `pass`, it will return a path outside.
    */
  var force: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Line width used for calculation crisp line coordinates. Defaults to 1.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Use old coordinates (for resizing and rescaling). If not set, defaults to
    * `false`.
    */
  var old: js.UndefOr[Boolean] = js.undefined
  /**
    * Used in Polar axes. Reverse the positions for concatenation of polygonal
    * plot bands
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  /**
    * If given, return the plot line path of a pixel position on the axis.
    */
  var translatedValue: js.UndefOr[Double] = js.undefined
  /**
    * Axis value.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object AxisPlotLinePathOptionsObject {
  @scala.inline
  def apply(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    force: Boolean | String = null,
    lineWidth: Int | Double = null,
    old: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    translatedValue: Int | Double = null,
    value: Int | Double = null
  ): AxisPlotLinePathOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (translatedValue != null) __obj.updateDynamic("translatedValue")(translatedValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotLinePathOptionsObject]
  }
}

