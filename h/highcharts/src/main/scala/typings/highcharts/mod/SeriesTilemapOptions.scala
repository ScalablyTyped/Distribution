package typings.highcharts.mod

import typings.highcharts.highchartsNumbers.`0`
import typings.highcharts.highchartsNumbers.`100`
import typings.highcharts.highchartsStrings.tilemap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, `type`, xAxis, yAxis */ trait SeriesTilemapOptions
  extends PlotTilemapOptions
     with SeriesOptionsType {
  /**
    * (Highcharts, Highmaps) An array of data points for the series. For the
    * `tilemap` series type, points can be given in the following ways:
    *
    * 1. An array of arrays with 3 or 2 values. In this case, the values
    * correspond to `x,y,value`. If the first value is a string, it is applied
    * as the name of the point, and the `x` value is inferred. The `x` value
    * can also be omitted, in which case the inner arrays should be of length
    * 2\. Then the `x` value is automatically calculated, either starting at 0
    * and incremented by 1, or from `pointStart` and `pointInterval` given in
    * the series options. (see online documentation for example)
    *
    * 2. An array of objects with named values. The objects are point
    * configuration objects as seen below. If the total number of data points
    * exceeds the series' turboThreshold, this option is not available. (see
    * online documentation for example)
    *
    * Note that for some tileShapes the grid coordinates are offset.
    */
  var data: js.UndefOr[
    js.Array[
      (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | PointOptionsObject
    ]
  ] = js.undefined
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
    * Not available
    */
  var mapData: js.UndefOr[js.Any | js.Array[SeriesMapDataOptions]] = js.undefined
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
  var `type`: String | tilemap
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

object SeriesTilemapOptions {
  @scala.inline
  def apply(
    `type`: String | tilemap,
    accessibility: SeriesAccessibilityOptionsObject = null,
    allowPointSelect: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    boostBlending: OptionsBoostBlendingValue = null,
    boostThreshold: Int | Double = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    className: String = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorAxis: Boolean | Double | String = null,
    colorIndex: Int | Double = null,
    colorKey: String = null,
    colsize: Int | Double = null,
    compare: String = null,
    compareBase: `0` | `100` = null,
    compareStart: js.UndefOr[Boolean] = js.undefined,
    connectors: SeriesConnectorsOptionsObject = null,
    cropThreshold: Int | Double = null,
    cursor: String | CursorValue = null,
    data: js.Array[
      (js.Tuple2[Double | String, Double]) | (js.Tuple3[Double | String, Double, Double]) | PointOptionsObject
    ] = null,
    dataGrouping: DataGroupingOptionsObject = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    dataParser: js.UndefOr[scala.Nothing] = js.undefined,
    dataSorting: DataSortingOptionsObject | PlotTilemapDataSortingOptions = null,
    dataURL: js.UndefOr[scala.Nothing] = js.undefined,
    description: String = null,
    dragDrop: SeriesDragDropOptionsObject = null,
    enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
    events: SeriesEventsOptionsObject = null,
    gapSize: Int | Double = null,
    gapUnit: OptionsGapUnitValue = null,
    id: String = null,
    includeInDataExport: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    keys: js.Array[String] = null,
    label: SeriesLabelOptionsObject = null,
    lastPrice: SeriesLastPriceOptionsObject = null,
    lastVisiblePrice: SeriesLastVisiblePriceOptionsObject = null,
    legendIndex: Int | Double = null,
    linkedTo: String = null,
    mapData: js.Any | js.Array[SeriesMapDataOptions] | scala.Nothing = null,
    name: String = null,
    navigatorOptions: PlotSeriesOptions = null,
    negativeColor: ColorString | GradientColorObject | PatternObject = null,
    nullColor: ColorString | GradientColorObject | PatternObject = null,
    opacity: Int | Double = null,
    point: PlotSeriesPointOptions = null,
    pointDescriptionFormatter: js.Function = null,
    pointPadding: Int | Double = null,
    rowsize: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    showInNavigator: js.UndefOr[Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    stack: Double | scala.Nothing | String = null,
    states: SeriesStatesOptionsObject = null,
    stickyTracking: js.UndefOr[Boolean] = js.undefined,
    tileShape: TilemapShapeValue = null,
    tooltip: SeriesTooltipOptionsObject = null,
    turboThreshold: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xAxis: Double | String = null,
    yAxis: Double | String = null,
    zIndex: Int | Double = null,
    zoneAxis: String = null,
    zones: js.Array[SeriesZonesOptionsObject] = null
  ): SeriesTilemapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (boostBlending != null) __obj.updateDynamic("boostBlending")(boostBlending.asInstanceOf[js.Any])
    if (boostThreshold != null) __obj.updateDynamic("boostThreshold")(boostThreshold.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (colorKey != null) __obj.updateDynamic("colorKey")(colorKey.asInstanceOf[js.Any])
    if (colsize != null) __obj.updateDynamic("colsize")(colsize.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (compareBase != null) __obj.updateDynamic("compareBase")(compareBase.asInstanceOf[js.Any])
    if (!js.isUndefined(compareStart)) __obj.updateDynamic("compareStart")(compareStart.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(dataParser)) __obj.updateDynamic("dataParser")(dataParser.asInstanceOf[js.Any])
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(dataSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(dataURL)) __obj.updateDynamic("dataURL")(dataURL.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (gapUnit != null) __obj.updateDynamic("gapUnit")(gapUnit.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInDataExport)) __obj.updateDynamic("includeInDataExport")(includeInDataExport.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lastPrice != null) __obj.updateDynamic("lastPrice")(lastPrice.asInstanceOf[js.Any])
    if (lastVisiblePrice != null) __obj.updateDynamic("lastVisiblePrice")(lastVisiblePrice.asInstanceOf[js.Any])
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (mapData != null) __obj.updateDynamic("mapData")(mapData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigatorOptions != null) __obj.updateDynamic("navigatorOptions")(navigatorOptions.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (nullColor != null) __obj.updateDynamic("nullColor")(nullColor.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (rowsize != null) __obj.updateDynamic("rowsize")(rowsize.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(showInNavigator)) __obj.updateDynamic("showInNavigator")(showInNavigator.asInstanceOf[js.Any])
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking.asInstanceOf[js.Any])
    if (tileShape != null) __obj.updateDynamic("tileShape")(tileShape.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTilemapOptions]
  }
}

