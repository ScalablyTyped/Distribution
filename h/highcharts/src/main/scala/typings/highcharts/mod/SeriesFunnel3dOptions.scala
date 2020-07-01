package typings.highcharts.mod

import typings.highcharts.highchartsStrings.funnel3d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesFunnel3dOptions extends PlotFunnel3dOptions {
  /**
    * (Highcharts) An array of data points for the series. For the `funnel3d`
    * series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. The `x` values will be automatically
    * calculated, either starting at 0 and incremented by 1, or from
    * `pointStart` and `pointInterval` given in the series options. If the axis
    * has categories, these will be used. Example: (see online documentation
    * for example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[Double | js.Array[Double] | PointOptionsObject]] = js.undefined
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
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | funnel3d
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

object SeriesFunnel3dOptions {
  @scala.inline
  def apply(
    `type`: String | funnel3d,
    accessibility: SeriesAccessibilityOptionsObject = null,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationLimit: js.UndefOr[Double] = js.undefined,
    boostBlending: OptionsBoostBlendingValue = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    centerInCategory: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Double] = js.undefined,
    colorKey: String = null,
    colors: js.Array[ColorString | GradientColorObject | PatternObject] = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: SeriesConnectorsOptionsObject = null,
    crisp: js.UndefOr[Boolean] = js.undefined,
    cropThreshold: js.UndefOr[Double] = js.undefined,
    cursor: String | CursorValue = null,
    custom: Dictionary[_] = null,
    dashStyle: DashStyleValue = null,
    data: js.Array[Double | js.Array[Double] | PointOptionsObject] = null,
    dataGrouping: DataGroupingOptionsObject = null,
    dataLabels: PlotFunnel3dDataLabelsOptions | js.Array[PlotFunnel3dDataLabelsOptions] = null,
    depth: js.UndefOr[Double] = js.undefined,
    description: String = null,
    dragDrop: SeriesDragDropOptionsObject = null,
    edgeColor: ColorString = null,
    edgeWidth: js.UndefOr[Double] = js.undefined,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: SeriesEventsOptionsObject = null,
    findNearestPointBy: OptionsFindNearestPointByValue = null,
    getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
    gradientForSides: js.UndefOr[Boolean] = js.undefined,
    groupPadding: js.UndefOr[Double] = js.undefined,
    groupZPadding: js.UndefOr[Double] = js.undefined,
    grouping: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    label: SeriesLabelOptionsObject = null,
    lastPrice: SeriesLastPriceOptionsObject = null,
    lastVisiblePrice: SeriesLastVisiblePriceOptionsObject = null,
    legendIndex: js.UndefOr[Double] = js.undefined,
    linkedTo: String = null,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    maxPointWidth: js.UndefOr[Double] = js.undefined,
    minPointLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    neckHeight: Double | String = null,
    neckWidth: Double | String = null,
    negativeColor: ColorString | GradientColorObject | PatternObject = null,
    opacity: js.UndefOr[Double] = js.undefined,
    point: PlotSeriesPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointInterval: js.UndefOr[Double] = js.undefined,
    pointIntervalUnit: OptionsPointIntervalUnitValue = null,
    pointPadding: js.UndefOr[Double] = js.undefined,
    pointPlacement: Double | String = null,
    pointRange: js.UndefOr[Null | Double] = js.undefined,
    pointStart: js.UndefOr[Double] = js.undefined,
    pointWidth: js.UndefOr[Double] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    shadow: Boolean | ShadowOptionsObject = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    softThreshold: js.UndefOr[Boolean] = js.undefined,
    stack: Double | String = null,
    stacking: OptionsStackingValue = null,
    states: SeriesStatesOptionsObject = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Null | Double] = js.undefined,
    tooltip: SeriesTooltipOptionsObject = null,
    turboThreshold: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    xAxis: Double | String = null,
    yAxis: Double | String = null,
    zIndex: js.UndefOr[Double] = js.undefined,
    zoneAxis: String = null,
    zones: js.Array[SeriesZonesOptionsObject] = null
  ): SeriesFunnel3dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationLimit)) __obj.updateDynamic("animationLimit")(animationLimit.get.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerInCategory)) __obj.updateDynamic("centerInCategory")(centerInCategory.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (colorKey != null) __obj.updateDynamic("colorKey")(colorKey.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.get.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cropThreshold)) __obj.updateDynamic("cropThreshold")(cropThreshold.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy.asInstanceOf[js.Any])
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientForSides)) __obj.updateDynamic("gradientForSides")(gradientForSides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupPadding)) __obj.updateDynamic("groupPadding")(groupPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupZPadding)) __obj.updateDynamic("groupZPadding")(groupZPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (!js.isUndefined(legendIndex)) __obj.updateDynamic("legendIndex")(legendIndex.get.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointWidth)) __obj.updateDynamic("maxPointWidth")(maxPointWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointLength)) __obj.updateDynamic("minPointLength")(minPointLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions.asInstanceOf[js.Any])
    if (neckHeight != null) __obj.updateDynamic("neckHeight")(neckHeight.asInstanceOf[js.Any])
    if (neckWidth != null) __obj.updateDynamic("neckWidth")(neckWidth.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(pointInterval)) __obj.updateDynamic("pointInterval")(pointInterval.get.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(pointPadding)) __obj.updateDynamic("pointPadding")(pointPadding.get.asInstanceOf[js.Any])
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(pointRange)) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (!js.isUndefined(pointStart)) __obj.updateDynamic("pointStart")(pointStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointWidth)) __obj.updateDynamic("pointWidth")(pointWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stacking != null) __obj.updateDynamic("stacking")(stacking.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(turboThreshold)) __obj.updateDynamic("turboThreshold")(turboThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesFunnel3dOptions]
  }
}

