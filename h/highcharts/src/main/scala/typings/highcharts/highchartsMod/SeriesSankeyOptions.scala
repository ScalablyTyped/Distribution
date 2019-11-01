package typings.highcharts.highchartsMod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import typings.highcharts.highchartsStrings.sankey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.highcharts.highchartsMod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, treemap, `type`, xAxis, yAxis */ trait SeriesSankeyOptions
  extends PlotSankeyOptions
     with SeriesOptionsType {
  /**
    * Not available
    */
  var borderRadius: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var crisp: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts) An array of data points for the series. For the `sankey`
    * series type, points can be given in the following way:
    *
    * An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of
    * data points exceeds the series' turboThreshold, this option is not
    * available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[SeriesSankeyDataOptions]] = js.undefined
  /**
    * Not available
    */
  var dataParser: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var dataURL: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var depth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var edgeColor: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var edgeWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var groupPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var groupZPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var grouping: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) A map data object containing a `path` definition and
    * optionally additional properties to join in the data as per the `joinBy`
    * option.
    */
  var mapData: js.UndefOr[js.Array[SeriesMapDataOptions] | js.Any] = js.undefined
  /**
    * Not available
    */
  var maxPointWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) A collection of options for the individual nodes. The nodes
    * in a sankey diagram are auto-generated instances of `Highcharts.Point`,
    * but options can be applied here and linked by the `id`.
    */
  var nodes: js.UndefOr[js.Array[SeriesSankeyNodesOptions]] = js.undefined
  /**
    * Not available
    */
  var pointPadding: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var pointWidth: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  var treemap: js.UndefOr[SeriesTreemapOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | sankey
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}

object SeriesSankeyOptions {
  @scala.inline
  def apply(
    `type`: sankey,
    accessibility: js.Object | PlotSankeyAccessibilityOptions = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject | PlotSankeyAnimationOptions = null,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[scala.Nothing] = js.undefined,
    borderWidth: Int | Double = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: Int | Double = null,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotSankeyConnectorsOptions = null,
    crisp: js.UndefOr[scala.Nothing] = js.undefined,
    cursor: String | CursorValue = null,
    curveFactor: Int | Double = null,
    data: js.Array[SeriesSankeyDataOptions] = null,
    dataGrouping: PlotSankeyDataGroupingOptions = null,
    dataLabels: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject] = null,
    dataParser: js.UndefOr[scala.Nothing] = js.undefined,
    dataURL: js.UndefOr[scala.Nothing] = js.undefined,
    depth: js.UndefOr[scala.Nothing] = js.undefined,
    description: String = null,
    edgeColor: js.UndefOr[scala.Nothing] = js.undefined,
    edgeWidth: js.UndefOr[scala.Nothing] = js.undefined,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: PlotSankeyEventsOptions = null,
    getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
    groupPadding: js.UndefOr[scala.Nothing] = js.undefined,
    groupZPadding: js.UndefOr[scala.Nothing] = js.undefined,
    grouping: js.UndefOr[scala.Nothing] = js.undefined,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    label: PlotSankeyLabelOptions = null,
    lastPrice: PlotSankeyLastPriceOptions = null,
    lastVisiblePrice: PlotSankeyLastVisiblePriceOptions = null,
    legendIndex: Int | Double = null,
    levels: js.Array[PlotSankeyLevelsOptions] = null,
    linkOpacity: Int | Double = null,
    linkedTo: String = null,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    maxPointWidth: js.UndefOr[scala.Nothing] = js.undefined,
    minLinkWidth: Int | Double = null,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    nodePadding: Int | Double = null,
    nodeWidth: Int | Double = null,
    nodes: js.Array[SeriesSankeyNodesOptions] = null,
    opacity: Int | Double = null,
    point: PlotSankeyPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointPadding: js.UndefOr[scala.Nothing] = js.undefined,
    pointWidth: js.UndefOr[scala.Nothing] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    stack: Double | String = null,
    states: PlotSankeyStatesOptions = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tooltip: PlotSankeyTooltipOptions = null,
    treemap: SeriesTreemapOptions = null,
    turboThreshold: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xAxis: Double | String = null,
    yAxis: Double | String = null,
    zIndex: Int | Double = null
  ): SeriesSankeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas)
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (curveFactor != null) __obj.updateDynamic("curveFactor")(curveFactor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(dataParser)) __obj.updateDynamic("dataParser")(dataParser)
    if (!js.isUndefined(dataURL)) __obj.updateDynamic("dataURL")(dataURL)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(edgeColor)) __obj.updateDynamic("edgeColor")(edgeColor)
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (!js.isUndefined(groupPadding)) __obj.updateDynamic("groupPadding")(groupPadding)
    if (!js.isUndefined(groupZPadding)) __obj.updateDynamic("groupZPadding")(groupZPadding)
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (label != null) __obj.updateDynamic("label")(label)
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice)
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice)
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointWidth)) __obj.updateDynamic("maxPointWidth")(maxPointWidth)
    if (minLinkWidth != null) __obj.updateDynamic("minLinkWidth")(minLinkWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions)
    if (nodePadding != null) __obj.updateDynamic("nodePadding")(nodePadding.asInstanceOf[js.Any])
    if (nodeWidth != null) __obj.updateDynamic("nodeWidth")(nodeWidth.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding)
    if (!js.isUndefined(pointWidth)) __obj.updateDynamic("pointWidth")(pointWidth)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator)
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (treemap != null) __obj.updateDynamic("treemap")(treemap)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyOptions]
  }
}

