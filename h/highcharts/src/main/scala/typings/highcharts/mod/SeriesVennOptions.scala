package typings.highcharts.mod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import typings.highcharts.highchartsStrings.venn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesVennOptions extends PlotVennOptions {
  /**
    * (Highcharts) An array of data points for the series. For the `scatter`
    * series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will
    * be interpreted as `y` options. The `x` values will be automatically
    * calculated, either starting at 0 and incremented by 1, or from
    * `pointStart` and `pointInterval` given in the series options. If the axis
    * has categories, these will be used. Example: (see online documentation
    * for example)
    *
    * 2. An array of arrays with 2 values. In this case, the values correspond
    * to `x,y`. If the first value is a string, it is applied as the name of
    * the point, and the `x` value is inferred. (see online documentation for
    * example)
    *
    * 3. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[PointOptionsObject]] = js.undefined
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
    * Not available
    */
  var steps: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | venn
  /**
    * Not available
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  /**
    * Not available
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}

object SeriesVennOptions {
  @scala.inline
  def apply(
    `type`: String | venn,
    accessibility: SeriesAccessibilityOptionsObject = null,
    allAreas: js.UndefOr[Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject = null,
    animationLimit: js.UndefOr[Double] = js.undefined,
    boostBlending: OptionsBoostBlendingValue = null,
    boostThreshold: js.UndefOr[Double] = js.undefined,
    borderColor: String = null,
    borderDashStyle: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    brighten: js.UndefOr[Double] = js.undefined,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    cluster: PlotVennClusterOptions = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorAxis: Boolean | Double | String = null,
    colorByPoint: js.UndefOr[Boolean] = js.undefined,
    colorIndex: js.UndefOr[Double] = js.undefined,
    colorKey: String = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: SeriesConnectorsOptionsObject = null,
    crisp: js.UndefOr[Boolean] = js.undefined,
    cursor: String | CursorValue = null,
    custom: Dictionary[_] = null,
    dashStyle: DashStyleValue = null,
    data: js.Array[PointOptionsObject] = null,
    dataGrouping: DataGroupingOptionsObject = null,
    dataLabels: PlotVennDataLabelsOptions | js.Array[PlotVennDataLabelsOptions] = null,
    description: String = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: SeriesEventsOptionsObject = null,
    gapSize: js.UndefOr[Double] = js.undefined,
    gapUnit: OptionsGapUnitValue = null,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    joinBy: String | js.Array[String] = null,
    keys: js.Array[String] = null,
    lastPrice: SeriesLastPriceOptionsObject = null,
    lastVisiblePrice: SeriesLastVisiblePriceOptionsObject = null,
    legendIndex: js.UndefOr[Double] = js.undefined,
    mapData: js.Array[SeriesMapDataOptions] | js.Any = null,
    marker: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    opacity: js.UndefOr[Double] = js.undefined,
    point: PlotSeriesPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointRange: js.UndefOr[Double] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    stack: Double | scala.Nothing | String = null,
    states: SeriesStatesOptionsObject = null,
    step: OptionsStepValue = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tooltip: SeriesTooltipOptionsObject = null,
    turboThreshold: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    xAxis: Double | scala.Nothing | String = null,
    yAxis: Double | scala.Nothing | String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SeriesVennOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allAreas)) __obj.updateDynamic("allAreas")(allAreas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(animationLimit)) __obj.updateDynamic("animationLimit")(animationLimit.get.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (!js.isUndefined(boostThreshold)) __obj.updateDynamic("boostThreshold")(boostThreshold.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashStyle != null) __obj.updateDynamic("borderDashStyle")(borderDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brighten)) __obj.updateDynamic("brighten")(brighten.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.get.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (colorKey != null) __obj.updateDynamic("colorKey")(colorKey.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.get.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(gapSize)) __obj.updateDynamic("gapSize")(gapSize.get.asInstanceOf[js.Any])
    if (gapUnit != null) __obj.updateDynamic("gapUnit")(gapUnit.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (joinBy != null) __obj.updateDynamic("joinBy")(joinBy.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (!js.isUndefined(legendIndex)) __obj.updateDynamic("legendIndex")(legendIndex.get.asInstanceOf[js.Any])
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (!js.isUndefined(marker)) __obj.updateDynamic("marker")(marker.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(pointRange)) __obj.updateDynamic("pointRange")(pointRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(turboThreshold)) __obj.updateDynamic("turboThreshold")(turboThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesVennOptions]
  }
}

