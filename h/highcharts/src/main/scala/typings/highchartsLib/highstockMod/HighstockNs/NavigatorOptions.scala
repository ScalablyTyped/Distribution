package typings
package highchartsLib.highstockMod.HighstockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorOptions extends js.Object {
  var adaptToUpdatedData: js.UndefOr[scala.Boolean] = js.undefined
  var baseSeries: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var handles: js.UndefOr[highchartsLib.Anon_BackgroundColor] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var maskFill: js.UndefOr[java.lang.String] = js.undefined
  var maskInside: js.UndefOr[scala.Boolean] = js.undefined
  var outlineColor: js.UndefOr[java.lang.String] = js.undefined
  var outlineWidth: js.UndefOr[scala.Double] = js.undefined
  var series: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions] = js.undefined
  var xAxis: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.AxisOptions] = js.undefined
  var yAxis: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.AxisOptions] = js.undefined
}

object NavigatorOptions {
  @scala.inline
  def apply(
    adaptToUpdatedData: js.UndefOr[scala.Boolean] = js.undefined,
    baseSeries: java.lang.String | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    handles: highchartsLib.Anon_BackgroundColor = null,
    height: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    maskFill: java.lang.String = null,
    maskInside: js.UndefOr[scala.Boolean] = js.undefined,
    outlineColor: java.lang.String = null,
    outlineWidth: scala.Int | scala.Double = null,
    series: highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions = null,
    xAxis: highchartsLib.highchartsMod.HighchartsNs.AxisOptions = null,
    yAxis: highchartsLib.highchartsMod.HighchartsNs.AxisOptions = null
  ): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptToUpdatedData)) __obj.updateDynamic("adaptToUpdatedData")(adaptToUpdatedData)
    if (baseSeries != null) __obj.updateDynamic("baseSeries")(baseSeries.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maskFill != null) __obj.updateDynamic("maskFill")(maskFill)
    if (!js.isUndefined(maskInside)) __obj.updateDynamic("maskInside")(maskInside)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    __obj.asInstanceOf[NavigatorOptions]
  }
}

