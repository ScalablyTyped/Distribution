package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PyramidChart extends SeriesChart {
  /**
    * The color of the border surrounding each slice
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The width of the border surrounding each slice
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area
    * height.
    * @default ['50%', '50%']
    * @since 3.0
    */
  var center: js.UndefOr[js.Tuple2[java.lang.String | scala.Double, java.lang.String | scala.Double]] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  @JSName("dataLabels")
  var dataLabels_PyramidChart: js.UndefOr[PieDataLabels] = js.undefined
  /**
    * The thickness of a 3D pie. Requires highcharts-3d.js
    * @default 0
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string
    * it is the percentage of the plot area height.
    * @since 3.0
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels
    * in side the plot area, but only to this size.
    * @default 80
    * @since 3.0
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pyramid is reversed by default, as opposed to the funnel, which shares the layout engine, and is not
    * reversed.
    * @default true
    * @since 3.0.10
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If a point is sliced, moved out from the center, how many pixels should it be moved?
    * @default 10
    */
  var slicedOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_PyramidChart: js.UndefOr[highchartsLib.Anon_HoverPieStates] = js.undefined
  /**
    * The width of the pyramid compared to the width of the plot area, or the pixel width if it is a number.
    * @default '90%'
    * @since 3.0
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object PyramidChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    borderColor: java.lang.String | Gradient = null,
    borderWidth: scala.Int | scala.Double = null,
    center: js.Tuple2[java.lang.String | scala.Double, java.lang.String | scala.Double] = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colors: js.Array[Color] = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    dataLabels: PieDataLabels = null,
    depth: scala.Int | scala.Double = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    minSize: scala.Int | scala.Double = null,
    negativeColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    slicedOffset: scala.Int | scala.Double = null,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverPieStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): PyramidChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (slicedOffset != null) __obj.updateDynamic("slicedOffset")(slicedOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[PyramidChart]
  }
}

