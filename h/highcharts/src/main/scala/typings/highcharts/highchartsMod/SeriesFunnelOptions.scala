package typings.highcharts.highchartsMod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import typings.highcharts.highchartsStrings.funnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.highcharts.highchartsMod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesFunnelOptions
  extends PlotFunnelOptions
     with SeriesOptionsType {
  /**
    * (Highcharts) An array of data points for the series. For the `funnel`
    * series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. Example: (see online documentation for
    * example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[Double | Null | SeriesFunnelDataOptions]] = js.undefined
  /**
    * Not available
    */
  var dataParser: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Not available
    */
  var dataURL: js.UndefOr[scala.Nothing] = js.undefined
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
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Not available
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | funnel
  /**
    * Not available
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  /**
    * Not available
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}

object SeriesFunnelOptions {
  @scala.inline
  def apply(
    `type`: funnel,
    accessibility: js.Object | PlotFunnelAccessibilityOptions = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | PlotFunnelAnimationOptions = null,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    center: js.Array[Double | String] = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorAxis: js.UndefOr[Boolean] = js.undefined,
    colorIndex: Int | Double = null,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: PlotFunnelConnectorsOptions = null,
    cursor: String | CursorValue = null,
    data: js.Array[Double | Null | SeriesFunnelDataOptions] = null,
    dataGrouping: PlotFunnelDataGroupingOptions = null,
    dataLabels: SeriesPieDataLabelsOptionsObject | js.Array[SeriesPieDataLabelsOptionsObject] = null,
    dataParser: js.UndefOr[scala.Nothing] = js.undefined,
    dataURL: js.UndefOr[scala.Nothing] = js.undefined,
    depth: Int | Double = null,
    description: String = null,
    dragDrop: PlotFunnelDragDropOptions = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    endAngle: Int | Double = null,
    events: PlotFunnelEventsOptions = null,
    gapSize: Int | Double = null,
    gapUnit: OptionsGapUnitValue = null,
    height: Double | String = null,
    id: String = null,
    ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    lastPrice: PlotFunnelLastPriceOptions = null,
    lastVisiblePrice: PlotFunnelLastVisiblePriceOptions = null,
    legendIndex: Int | Double = null,
    linecap: SeriesLinecapValue = null,
    linkedTo: String = null,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    minSize: Double | String = null,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    neckHeight: Double | String = null,
    neckWidth: Double | String = null,
    opacity: Int | Double = null,
    point: PlotFunnelPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointRange: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    shadow: Boolean | ShadowOptionsObject = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    slicedOffset: Int | Double = null,
    stack: js.UndefOr[scala.Nothing] = js.undefined,
    startAngle: Int | Double = null,
    states: PlotFunnelStatesOptions = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tooltip: PlotFunnelTooltipOptions = null,
    useOhlcData: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    xAxis: js.UndefOr[scala.Nothing] = js.undefined,
    yAxis: js.UndefOr[scala.Nothing] = js.undefined,
    zIndex: Int | Double = null
  ): SeriesFunnelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas)
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorAxis)) __obj.updateDynamic("colorAxis")(colorAxis)
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(dataParser)) __obj.updateDynamic("dataParser")(dataParser)
    if (!js.isUndefined(dataURL)) __obj.updateDynamic("dataURL")(dataURL)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (gapUnit != null) __obj.updateDynamic("gapUnit")(gapUnit)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreHiddenPoint)) __obj.updateDynamic("ignoreHiddenPoint")(ignoreHiddenPoint)
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice)
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice)
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions)
    if (neckHeight != null) __obj.updateDynamic("neckHeight")(neckHeight.asInstanceOf[js.Any])
    if (neckWidth != null) __obj.updateDynamic("neckWidth")(neckWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator)
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation)
    if (slicedOffset != null) __obj.updateDynamic("slicedOffset")(slicedOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(useOhlcData)) __obj.updateDynamic("useOhlcData")(useOhlcData)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis)
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnelOptions]
  }
}

