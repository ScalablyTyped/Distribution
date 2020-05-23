package typings.highcharts.mod

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
    lineWidth: js.UndefOr[Double] = js.undefined,
    old: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    translatedValue: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): AxisPlotLinePathOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translatedValue)) __obj.updateDynamic("translatedValue")(translatedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotLinePathOptionsObject]
  }
}

