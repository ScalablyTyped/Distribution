package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.mod.XAxisOptions
  - typings.highcharts.mod.YAxisOptions
  - typings.highcharts.mod.ZAxisOptions
*/
trait AxisOptions extends js.Object

object AxisOptions {
  @scala.inline
  def XAxisOptions(
    accessibility: AxisAccessibilityOptionsObject = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorType = null,
    angle: js.UndefOr[Double] = js.undefined,
    breaks: js.Array[XAxisBreaksOptions] = null,
    categories: js.Array[String] = null,
    ceiling: js.UndefOr[Double] = js.undefined,
    className: String = null,
    crosshair: Boolean | AxisCrosshairOptions = null,
    currentDateIndicator: Boolean | AxisCurrentDateIndicatorOptions = null,
    dateTimeLabelFormats: AxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: XAxisEventsOptions = null,
    floor: js.UndefOr[Double] = js.undefined,
    grid: XAxisGridOptions = null,
    gridLineColor: ColorType = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineInterpolation: OptionsGridLineInterpolationValue = null,
    gridLineWidth: js.UndefOr[Double] = js.undefined,
    gridZIndex: js.UndefOr[Double] = js.undefined,
    height: Double | String = null,
    id: String = null,
    labels: XAxisLabelsOptions = null,
    left: Double | String = null,
    lineColor: ColorType = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    linkedTo: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Null | Double] = js.undefined,
    maxPadding: js.UndefOr[Double] = js.undefined,
    maxRange: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Null | Double] = js.undefined,
    minPadding: js.UndefOr[Double] = js.undefined,
    minRange: js.UndefOr[Double] = js.undefined,
    minTickInterval: js.UndefOr[Double] = js.undefined,
    minorGridLineColor: ColorType = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: js.UndefOr[Double] = js.undefined,
    minorTickColor: ColorType = null,
    minorTickInterval: js.UndefOr[Null | Double | String] = js.undefined,
    minorTickLength: js.UndefOr[Double] = js.undefined,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: js.UndefOr[Double] = js.undefined,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    opposite: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: js.UndefOr[Double] = js.undefined,
    pane: js.UndefOr[Double] = js.undefined,
    plotBands: js.Array[XAxisPlotBandsOptions] = null,
    plotLines: js.Array[XAxisPlotLinesOptions] = null,
    range: js.UndefOr[Double] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: XAxisScrollbarOptions = null,
    showEmpty: js.UndefOr[Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: js.UndefOr[Double] = js.undefined,
    softMin: js.UndefOr[Double] = js.undefined,
    startOfWeek: js.UndefOr[Double] = js.undefined,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    tickAmount: js.UndefOr[Double] = js.undefined,
    tickColor: ColorType = null,
    tickInterval: js.UndefOr[Double] = js.undefined,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickPixelInterval: js.UndefOr[Double] = js.undefined,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: js.UndefOr[Double] = js.undefined,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    title: XAxisTitleOptions = null,
    top: Double | String = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(ceiling)) __obj.updateDynamic("ceiling")(ceiling.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(floor)) __obj.updateDynamic("floor")(floor.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineInterpolation != null) __obj.updateDynamic("gridLineInterpolation")(gridLineInterpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineWidth)) __obj.updateDynamic("gridLineWidth")(gridLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridZIndex)) __obj.updateDynamic("gridZIndex")(gridZIndex.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedTo)) __obj.updateDynamic("linkedTo")(linkedTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPadding)) __obj.updateDynamic("maxPadding")(maxPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRange)) __obj.updateDynamic("maxRange")(maxRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minPadding)) __obj.updateDynamic("minPadding")(minPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRange)) __obj.updateDynamic("minRange")(minRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTickInterval)) __obj.updateDynamic("minTickInterval")(minTickInterval.get.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(minorGridLineWidth)) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.get.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickLength)) __obj.updateDynamic("minorTickLength")(minorTickLength.get.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickWidth)) __obj.updateDynamic("minorTickWidth")(minorTickWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscroll)) __obj.updateDynamic("overscroll")(overscroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pane)) __obj.updateDynamic("pane")(pane.get.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.get.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMax)) __obj.updateDynamic("softMax")(softMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMin)) __obj.updateDynamic("softMin")(softMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOfWeek)) __obj.updateDynamic("startOfWeek")(startOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickAmount)) __obj.updateDynamic("tickAmount")(tickAmount.get.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickPixelInterval)) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.get.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(tickWidth)) __obj.updateDynamic("tickWidth")(tickWidth.get.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
  @scala.inline
  def YAxisOptions(
    accessibility: AxisAccessibilityOptionsObject = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorType = null,
    angle: js.UndefOr[Double] = js.undefined,
    breaks: js.Array[YAxisBreaksOptions] = null,
    categories: js.Array[String] = null,
    ceiling: js.UndefOr[Double] = js.undefined,
    className: String = null,
    crosshair: Boolean | AxisCrosshairOptions = null,
    dateTimeLabelFormats: AxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: YAxisEventsOptions = null,
    floor: js.UndefOr[Double] = js.undefined,
    grid: YAxisGridOptions = null,
    gridLineColor: ColorType = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineInterpolation: OptionsGridLineInterpolationValue = null,
    gridLineWidth: js.UndefOr[Double] = js.undefined,
    gridZIndex: js.UndefOr[Double] = js.undefined,
    height: Double | String = null,
    id: String = null,
    labels: YAxisLabelsOptions = null,
    left: Double | String = null,
    lineColor: ColorType = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    linkedTo: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Null | Double] = js.undefined,
    maxColor: ColorType = null,
    maxLength: Double | String = null,
    maxPadding: js.UndefOr[Double] = js.undefined,
    maxRange: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Null | Double] = js.undefined,
    minColor: ColorType = null,
    minLength: Double | String = null,
    minPadding: js.UndefOr[Double] = js.undefined,
    minRange: js.UndefOr[Double] = js.undefined,
    minTickInterval: js.UndefOr[Double] = js.undefined,
    minorGridLineColor: ColorType = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: js.UndefOr[Double] = js.undefined,
    minorTickColor: ColorType = null,
    minorTickInterval: js.UndefOr[Null | Double | String] = js.undefined,
    minorTickLength: js.UndefOr[Double] = js.undefined,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: js.UndefOr[Double] = js.undefined,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    opposite: js.UndefOr[Boolean] = js.undefined,
    pane: js.UndefOr[Double] = js.undefined,
    plotBands: js.Array[YAxisPlotBandsOptions] = null,
    plotLines: js.Array[YAxisPlotLinesOptions] = null,
    range: js.UndefOr[Double] = js.undefined,
    resize: YAxisResizeOptions = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: YAxisScrollbarOptions = null,
    showEmpty: js.UndefOr[Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: js.UndefOr[Double] = js.undefined,
    softMin: js.UndefOr[Double] = js.undefined,
    stackLabels: YAxisStackLabelsOptions = null,
    startOfWeek: js.UndefOr[Double] = js.undefined,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    staticScale: js.UndefOr[Double] = js.undefined,
    stops: js.Array[GradientColorStopObject] = null,
    tickAmount: js.UndefOr[Double] = js.undefined,
    tickColor: ColorType = null,
    tickInterval: js.UndefOr[Double] = js.undefined,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickPixelInterval: js.UndefOr[Double] = js.undefined,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: js.UndefOr[Double] = js.undefined,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    title: YAxisTitleOptions = null,
    tooltipValueFormat: String = null,
    top: Double | String = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(ceiling)) __obj.updateDynamic("ceiling")(ceiling.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(floor)) __obj.updateDynamic("floor")(floor.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineInterpolation != null) __obj.updateDynamic("gridLineInterpolation")(gridLineInterpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineWidth)) __obj.updateDynamic("gridLineWidth")(gridLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridZIndex)) __obj.updateDynamic("gridZIndex")(gridZIndex.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedTo)) __obj.updateDynamic("linkedTo")(linkedTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPadding)) __obj.updateDynamic("maxPadding")(maxPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRange)) __obj.updateDynamic("maxRange")(maxRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(minPadding)) __obj.updateDynamic("minPadding")(minPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRange)) __obj.updateDynamic("minRange")(minRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTickInterval)) __obj.updateDynamic("minTickInterval")(minTickInterval.get.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(minorGridLineWidth)) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.get.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickLength)) __obj.updateDynamic("minorTickLength")(minorTickLength.get.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickWidth)) __obj.updateDynamic("minorTickWidth")(minorTickWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pane)) __obj.updateDynamic("pane")(pane.get.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.get.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMax)) __obj.updateDynamic("softMax")(softMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMin)) __obj.updateDynamic("softMin")(softMin.get.asInstanceOf[js.Any])
    if (stackLabels != null) __obj.updateDynamic("stackLabels")(stackLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(startOfWeek)) __obj.updateDynamic("startOfWeek")(startOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticScale)) __obj.updateDynamic("staticScale")(staticScale.get.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (!js.isUndefined(tickAmount)) __obj.updateDynamic("tickAmount")(tickAmount.get.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickPixelInterval)) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.get.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(tickWidth)) __obj.updateDynamic("tickWidth")(tickWidth.get.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipValueFormat != null) __obj.updateDynamic("tooltipValueFormat")(tooltipValueFormat.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
  @scala.inline
  def ZAxisOptions(
    accessibility: AxisAccessibilityOptionsObject = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorType = null,
    angle: js.UndefOr[Double] = js.undefined,
    categories: js.Array[String] = null,
    ceiling: js.UndefOr[Double] = js.undefined,
    className: String = null,
    currentDateIndicator: Boolean | AxisCurrentDateIndicatorOptions = null,
    dateTimeLabelFormats: AxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: ZAxisEventsOptions = null,
    floor: js.UndefOr[Double] = js.undefined,
    grid: ZAxisGridOptions = null,
    gridLineColor: ColorType = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineInterpolation: OptionsGridLineInterpolationValue = null,
    gridLineWidth: js.UndefOr[Double] = js.undefined,
    gridZIndex: js.UndefOr[Double] = js.undefined,
    id: String = null,
    labels: ZAxisLabelsOptions = null,
    linkedTo: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Null | Double] = js.undefined,
    maxPadding: js.UndefOr[Double] = js.undefined,
    maxRange: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Null | Double] = js.undefined,
    minPadding: js.UndefOr[Double] = js.undefined,
    minRange: js.UndefOr[Double] = js.undefined,
    minTickInterval: js.UndefOr[Double] = js.undefined,
    minorGridLineColor: ColorType = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: js.UndefOr[Double] = js.undefined,
    minorTickColor: ColorType = null,
    minorTickInterval: js.UndefOr[Null | Double | String] = js.undefined,
    minorTickLength: js.UndefOr[Double] = js.undefined,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: js.UndefOr[Double] = js.undefined,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    opposite: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: js.UndefOr[Double] = js.undefined,
    pane: js.UndefOr[Double] = js.undefined,
    plotBands: js.Array[ZAxisPlotBandsOptions] = null,
    plotLines: js.Array[ZAxisPlotLinesOptions] = null,
    range: js.UndefOr[Double] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: ZAxisScrollbarOptions = null,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: js.UndefOr[Double] = js.undefined,
    softMin: js.UndefOr[Double] = js.undefined,
    startOfWeek: js.UndefOr[Double] = js.undefined,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    tickAmount: js.UndefOr[Double] = js.undefined,
    tickColor: ColorType = null,
    tickInterval: js.UndefOr[Double] = js.undefined,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickPixelInterval: js.UndefOr[Double] = js.undefined,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: js.UndefOr[Double] = js.undefined,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    title: ZAxisTitleOptions = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(ceiling)) __obj.updateDynamic("ceiling")(ceiling.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(floor)) __obj.updateDynamic("floor")(floor.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineInterpolation != null) __obj.updateDynamic("gridLineInterpolation")(gridLineInterpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(gridLineWidth)) __obj.updateDynamic("gridLineWidth")(gridLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridZIndex)) __obj.updateDynamic("gridZIndex")(gridZIndex.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedTo)) __obj.updateDynamic("linkedTo")(linkedTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPadding)) __obj.updateDynamic("maxPadding")(maxPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRange)) __obj.updateDynamic("maxRange")(maxRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minPadding)) __obj.updateDynamic("minPadding")(minPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRange)) __obj.updateDynamic("minRange")(minRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTickInterval)) __obj.updateDynamic("minTickInterval")(minTickInterval.get.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(minorGridLineWidth)) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.get.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickInterval)) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickLength)) __obj.updateDynamic("minorTickLength")(minorTickLength.get.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickWidth)) __obj.updateDynamic("minorTickWidth")(minorTickWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overscroll)) __obj.updateDynamic("overscroll")(overscroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pane)) __obj.updateDynamic("pane")(pane.get.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.get.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMax)) __obj.updateDynamic("softMax")(softMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softMin)) __obj.updateDynamic("softMin")(softMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOfWeek)) __obj.updateDynamic("startOfWeek")(startOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickAmount)) __obj.updateDynamic("tickAmount")(tickAmount.get.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickPixelInterval)) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.get.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(tickWidth)) __obj.updateDynamic("tickWidth")(tickWidth.get.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
}

