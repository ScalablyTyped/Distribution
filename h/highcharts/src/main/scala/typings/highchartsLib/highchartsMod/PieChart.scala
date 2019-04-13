package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
  */
trait PieChart extends SeriesChart {
  /**
    * The color of the border surrounding each slice. When null, the border takes the same color as the slice fill.
    * This can be used together with a borderWidth to fill drawing gaps created by antialiazing artefacts in
    * borderless pies.
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour
    * (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence,
    * the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the
    * center should be explicitly set, for example to ['50%', '50%'].
    * @default [null, null]
    */
  var center: js.UndefOr[
    js.Tuple2[
      java.lang.String | scala.Double | scala.Null, 
      java.lang.String | scala.Double | scala.Null
    ]
  ] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  @JSName("dataLabels")
  var dataLabels_PieChart: js.UndefOr[PieDataLabels] = js.undefined
  /**
    * The thickness of a 3D pie. Requires highcharts-3d.js
    * @default 0
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to startAngle plus 360.
    * @default null
    * @since 1.3.6
    */
  var endAngle: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Equivalent to chart.ignoreHiddenSeries, this option tells whether the series shall be redrawn as if the hidden
    * point were null.
    *
    * The default value changed from false to true with Highcharts 3.0.
    *
    * @default true
    * @since 2.3.0
    */
  var ignoreHiddenPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or
    * pixel value. Percentages are relative to the pie size. Pixel values are given as integers.
    *
    * Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.
    * @default 0
    * @since 2.0
    */
  var innerSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels
    * in side the plot area, but only to this size.
    * @default 80
    * @since 3.0
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as
    * integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the
    * plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In
    * that case it is best to set a fixed value, for example '75%'.
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * If a point is sliced, moved out from the center, how many pixels should it be moved?
    * @default 10
    */
  var slicedOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The start angle of the pie slices in degrees where 0 is top and 90 right.
    * @default 0
    * @since 2.3.4
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_PieChart: js.UndefOr[highchartsLib.Anon_HoverPieStates] = js.undefined
}

object PieChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    borderColor: java.lang.String | Gradient = null,
    borderWidth: scala.Int | scala.Double = null,
    center: js.Tuple2[
      java.lang.String | scala.Double | scala.Null, 
      java.lang.String | scala.Double | scala.Null
    ] = null,
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
    endAngle: scala.Int | scala.Double = null,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreHiddenPoint: js.UndefOr[scala.Boolean] = js.undefined,
    innerSize: scala.Double | java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    negativeColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | java.lang.String = null,
    slicedOffset: scala.Int | scala.Double = null,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stacking: java.lang.String = null,
    startAngle: scala.Int | scala.Double = null,
    states: highchartsLib.Anon_HoverPieStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): PieChart = {
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
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (!js.isUndefined(ignoreHiddenPoint)) __obj.updateDynamic("ignoreHiddenPoint")(ignoreHiddenPoint)
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slicedOffset != null) __obj.updateDynamic("slicedOffset")(slicedOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[PieChart]
  }
}

