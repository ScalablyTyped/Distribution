package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- highchartsLib.highchartsMod.HighchartsNs.IndividualSeriesOptions because var conflicts: color, cursor, linkedTo, maxFontSize, minFontSize, visible. Inlined size, innerSize, `type`, colorIndex, crisp, data, description, id, index, legendIndex, name, pointWidth, stack, xAxis, yAxis, zIndex */ trait AreaChartSeriesOptions extends AreaChart {
  /**
    * Styled mode only. A specific color index to use for the point, so its graphic representations are given the class name highcharts-color-{n}.
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * When true, each column edge is rounded to its nearest pixel in order to render sharp on screen.
    * In some cases, when there are a lot of densely packed columns, this leads to visible difference
    * in column widths or distance between columns. In these cases, setting crisp to false may look
    * better, even though each column is rendered blurry.
    * @default true
    * @since 5.0.10
    */
  var crisp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of data points for the series. For the area series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will be interpreted as y options. The x
    *    values will be automatically calculated, either starting at 0 and incremented by 1, or from pointStart and
    *    pointInterval given in the series options. If the axis has categories, these will be used. Example:
    *        data: [0, 5, 3, 5]
    *
    * 2. An array of arrays with 2 values. In this case, the values correspond to x,y. If the first value is a string,
    *    it is applied as the name of the point, and the x value is inferred.
    *        data: [
    *            [0, 9],
    *            [1, 7],
    *            [2, 6]
    *        ]
    *
    * 3. An array of objects with named values. The objects are point configuration objects as seen below. If the total
    *    number of data points exceeds the series' turboThreshold, this option is not available.
    *        data: [{
    *            x: 1,
    *            y: 9,
    *            name: 'Point2',
    *            color: '#00FF00'
    *        }, {
    *            x: 1,
    *            y: 6,
    *            name: 'Point1',
    *            color: '#FF00FF'
    *        }]
    *
    * 4. An array of arrays with three values for ranges. In this case the values correspond x, yMin and yMax. If the
    *    first value is a string it is applied as the name of the point, and the x value is inferred.
    *        data: [
    *            [1, 2, 3],
    *            [2, 4, 6],
    *            [3, 7, 8]
    *
    */
  var data: js.UndefOr[
    js.Array[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[java.lang.String, scala.Double]) | (js.Tuple3[java.lang.String, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | DataPoint
    ]
  ] = js.undefined
  /**
    * A description of the series to add to the screen reader information about the series.
    * @since 5.0.0
    * @default undefined
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through
    * chart.get().
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the series in the chart, affecting the internal index in the chart.series array, the visible Z index
    * as well as the order in the legend.
    * @since 2.3.0
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  var innerSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The sequential index of the series in the legend.
    */
  var legendIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pixel value specifying a fixed width for each column or bar. When null, the width is calculated from
    * the pointPadding and groupPadding.
    */
  var pointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * This option allows grouping series in a stacked chart. The stack option can be a string or a number or anything
    * else, as long as the grouped series' stack options match each other.
    * @since 2.1
    */
  var stack: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first.
    * @default 0
    */
  var xAxis: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first.
    * @default 0
    */
  var yAxis: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Define the visual z index of the series.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object AreaChartSeriesOptions {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colorIndex: scala.Int | scala.Double = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    crisp: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    data: js.Array[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[java.lang.String, scala.Double]) | (js.Tuple3[java.lang.String, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | DataPoint
    ] = null,
    dataLabels: DataLabels = null,
    description: java.lang.String = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    fillColor: java.lang.String | Gradient = null,
    fillOpacity: scala.Int | scala.Double = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    innerSize: scala.Double | java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    legendIndex: scala.Int | scala.Double = null,
    lineColor: java.lang.String | Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    negativeColor: java.lang.String = null,
    negativeFillColor: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    pointWidth: scala.Int | scala.Double = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Double | java.lang.String = null,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stack: js.Any = null,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverLineStates = null,
    step: java.lang.String = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    trackByArea: js.UndefOr[scala.Boolean] = js.undefined,
    turboThreshold: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xAxis: java.lang.String | scala.Double = null,
    yAxis: java.lang.String | scala.Double = null,
    zIndex: scala.Int | scala.Double = null,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): AreaChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (negativeFillColor != null) __obj.updateDynamic("negativeFillColor")(negativeFillColor)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (step != null) __obj.updateDynamic("step")(step)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(trackByArea)) __obj.updateDynamic("trackByArea")(trackByArea)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[AreaChartSeriesOptions]
  }
}

