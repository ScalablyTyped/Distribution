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
    accessibility: js.Object | XAxisAccessibilityOptions = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorString | GradientColorObject | PatternObject = null,
    breaks: js.Array[XAxisBreaksOptions] = null,
    categories: js.Array[String] = null,
    ceiling: Int | Double = null,
    className: String = null,
    crosshair: Boolean | XAxisCrosshairOptions = null,
    currentDateIndicator: Boolean | XAxisCurrentDateIndicatorOptions = null,
    dateTimeLabelFormats: XAxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: XAxisEventsOptions = null,
    floor: Int | Double = null,
    grid: XAxisGridOptions = null,
    gridLineColor: ColorString | GradientColorObject | PatternObject = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineWidth: Int | Double = null,
    gridZIndex: Int | Double = null,
    id: String = null,
    labels: XAxisLabelsOptions = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    linkedTo: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    maxPadding: Int | Double = null,
    maxRange: Int | Double = null,
    min: Int | Double = null,
    minPadding: Int | Double = null,
    minRange: Int | Double = null,
    minTickInterval: Int | Double = null,
    minorGridLineColor: ColorString | GradientColorObject | PatternObject = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: Int | Double = null,
    minorTickColor: ColorString | GradientColorObject | PatternObject = null,
    minorTickInterval: Double | String = null,
    minorTickLength: Int | Double = null,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: Int | Double = null,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    opposite: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: Int | Double = null,
    pane: Int | Double = null,
    plotBands: js.Array[XAxisPlotBandsOptions] = null,
    plotLines: js.Array[XAxisPlotLinesOptions] = null,
    range: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: XAxisScrollbarOptions = null,
    showEmpty: js.UndefOr[Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: Int | Double = null,
    softMin: Int | Double = null,
    startOfWeek: Int | Double = null,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    tickAmount: Int | Double = null,
    tickColor: ColorString | GradientColorObject | PatternObject = null,
    tickInterval: Int | Double = null,
    tickLength: Int | Double = null,
    tickPixelInterval: Int | Double = null,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: Int | Double = null,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    title: XAxisTitleOptions = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minTickInterval != null) __obj.updateDynamic("minTickInterval")(minTickInterval.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (overscroll != null) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.asInstanceOf[js.Any])
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.asInstanceOf[js.Any])
    if (tickAmount != null) __obj.updateDynamic("tickAmount")(tickAmount.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
  @scala.inline
  def YAxisOptions(
    accessibility: js.Object | YAxisAccessibilityOptions = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorString | GradientColorObject | PatternObject = null,
    angle: Int | Double = null,
    breaks: js.Array[YAxisBreaksOptions] = null,
    categories: js.Array[String] = null,
    ceiling: Int | Double = null,
    className: String = null,
    crosshair: Boolean | YAxisCrosshairOptions = null,
    dateTimeLabelFormats: YAxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: YAxisEventsOptions = null,
    floor: Int | Double = null,
    grid: YAxisGridOptions = null,
    gridLineColor: ColorString | GradientColorObject | PatternObject = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineInterpolation: OptionsGridLineInterpolationValue = null,
    gridLineWidth: Int | Double = null,
    gridZIndex: Int | Double = null,
    height: Double | String = null,
    id: String = null,
    labels: YAxisLabelsOptions = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    linkedTo: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    maxColor: ColorString | GradientColorObject | PatternObject = null,
    maxLength: Double | String = null,
    maxPadding: Int | Double = null,
    maxRange: Int | Double = null,
    min: Int | Double = null,
    minColor: ColorString | GradientColorObject | PatternObject = null,
    minLength: Double | String = null,
    minPadding: Int | Double = null,
    minRange: Int | Double = null,
    minTickInterval: Int | Double = null,
    minorGridLineColor: ColorString | GradientColorObject | PatternObject = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: Int | Double = null,
    minorTickColor: ColorString | GradientColorObject | PatternObject = null,
    minorTickInterval: Double | String = null,
    minorTickLength: Int | Double = null,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: Int | Double = null,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    opposite: js.UndefOr[Boolean] = js.undefined,
    pane: Int | Double = null,
    plotBands: js.Array[YAxisPlotBandsOptions] = null,
    plotLines: js.Array[YAxisPlotLinesOptions] = null,
    range: Int | Double = null,
    resize: YAxisResizeOptions = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: YAxisScrollbarOptions = null,
    showEmpty: js.UndefOr[Boolean] = js.undefined,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: Int | Double = null,
    softMin: Int | Double = null,
    stackLabels: YAxisStackLabelsOptions = null,
    startOfWeek: Int | Double = null,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    staticScale: Int | Double = null,
    stops: js.Array[GradientColorStopObject] = null,
    tickAmount: Int | Double = null,
    tickColor: ColorString | GradientColorObject | PatternObject = null,
    tickInterval: Int | Double = null,
    tickLength: Int | Double = null,
    tickPixelInterval: Int | Double = null,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: Int | Double = null,
    tickmarkPlacement: OptionsTickmarkPlacementValue = null,
    title: YAxisTitleOptions = null,
    tooltipValueFormat: String = null,
    top: Double | String = null,
    `type`: AxisTypeValue = null,
    uniqueNames: js.UndefOr[Boolean] = js.undefined,
    units: js.Array[js.Tuple2[String, js.Array[Double] | Null]] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): AxisOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineInterpolation != null) __obj.updateDynamic("gridLineInterpolation")(gridLineInterpolation.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxColor != null) __obj.updateDynamic("maxColor")(maxColor.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minColor != null) __obj.updateDynamic("minColor")(minColor.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minTickInterval != null) __obj.updateDynamic("minTickInterval")(minTickInterval.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmpty)) __obj.updateDynamic("showEmpty")(showEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.asInstanceOf[js.Any])
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (stackLabels != null) __obj.updateDynamic("stackLabels")(stackLabels.asInstanceOf[js.Any])
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.asInstanceOf[js.Any])
    if (staticScale != null) __obj.updateDynamic("staticScale")(staticScale.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (tickAmount != null) __obj.updateDynamic("tickAmount")(tickAmount.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipValueFormat != null) __obj.updateDynamic("tooltipValueFormat")(tooltipValueFormat.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
  @scala.inline
  def ZAxisOptions(
    accessibility: js.Object | ZAxisAccessibilityOptions = null,
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    alternateGridColor: ColorString | GradientColorObject | PatternObject = null,
    categories: js.Array[String] = null,
    ceiling: Int | Double = null,
    className: String = null,
    currentDateIndicator: Boolean | ZAxisCurrentDateIndicatorOptions = null,
    dateTimeLabelFormats: ZAxisDateTimeLabelFormatsOptions = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    events: ZAxisEventsOptions = null,
    floor: Int | Double = null,
    grid: ZAxisGridOptions = null,
    gridLineColor: ColorString | GradientColorObject | PatternObject = null,
    gridLineDashStyle: DashStyleValue = null,
    gridLineWidth: Int | Double = null,
    gridZIndex: Int | Double = null,
    id: String = null,
    labels: ZAxisLabelsOptions = null,
    linkedTo: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    maxPadding: Int | Double = null,
    maxRange: Int | Double = null,
    min: Int | Double = null,
    minPadding: Int | Double = null,
    minRange: Int | Double = null,
    minTickInterval: Int | Double = null,
    minorGridLineColor: ColorString | GradientColorObject | PatternObject = null,
    minorGridLineDashStyle: DashStyleValue = null,
    minorGridLineWidth: Int | Double = null,
    minorTickColor: ColorString | GradientColorObject | PatternObject = null,
    minorTickInterval: Double | String = null,
    minorTickLength: Int | Double = null,
    minorTickPosition: OptionsMinorTickPositionValue = null,
    minorTickWidth: Int | Double = null,
    minorTicks: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    opposite: js.UndefOr[Boolean] = js.undefined,
    ordinal: js.UndefOr[Boolean] = js.undefined,
    overscroll: Int | Double = null,
    pane: Int | Double = null,
    plotBands: js.Array[ZAxisPlotBandsOptions] = null,
    plotLines: js.Array[ZAxisPlotLinesOptions] = null,
    range: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    reversedStacks: js.UndefOr[Boolean] = js.undefined,
    scrollbar: ZAxisScrollbarOptions = null,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    showLastLabel: js.UndefOr[Boolean] = js.undefined,
    softMax: Int | Double = null,
    softMin: Int | Double = null,
    startOfWeek: Int | Double = null,
    startOnTick: js.UndefOr[Boolean] = js.undefined,
    tickAmount: Int | Double = null,
    tickColor: ColorString | GradientColorObject | PatternObject = null,
    tickInterval: Int | Double = null,
    tickLength: Int | Double = null,
    tickPixelInterval: Int | Double = null,
    tickPosition: OptionsTickPositionValue = null,
    tickPositioner: AxisTickPositionerCallbackFunction = null,
    tickPositions: js.Array[Double] = null,
    tickWidth: Int | Double = null,
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
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (alternateGridColor != null) __obj.updateDynamic("alternateGridColor")(alternateGridColor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentDateIndicator != null) __obj.updateDynamic("currentDateIndicator")(currentDateIndicator.asInstanceOf[js.Any])
    if (dateTimeLabelFormats != null) __obj.updateDynamic("dateTimeLabelFormats")(dateTimeLabelFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (gridLineDashStyle != null) __obj.updateDynamic("gridLineDashStyle")(gridLineDashStyle.asInstanceOf[js.Any])
    if (gridLineWidth != null) __obj.updateDynamic("gridLineWidth")(gridLineWidth.asInstanceOf[js.Any])
    if (gridZIndex != null) __obj.updateDynamic("gridZIndex")(gridZIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxPadding != null) __obj.updateDynamic("maxPadding")(maxPadding.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minPadding != null) __obj.updateDynamic("minPadding")(minPadding.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minTickInterval != null) __obj.updateDynamic("minTickInterval")(minTickInterval.asInstanceOf[js.Any])
    if (minorGridLineColor != null) __obj.updateDynamic("minorGridLineColor")(minorGridLineColor.asInstanceOf[js.Any])
    if (minorGridLineDashStyle != null) __obj.updateDynamic("minorGridLineDashStyle")(minorGridLineDashStyle.asInstanceOf[js.Any])
    if (minorGridLineWidth != null) __obj.updateDynamic("minorGridLineWidth")(minorGridLineWidth.asInstanceOf[js.Any])
    if (minorTickColor != null) __obj.updateDynamic("minorTickColor")(minorTickColor.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (minorTickLength != null) __obj.updateDynamic("minorTickLength")(minorTickLength.asInstanceOf[js.Any])
    if (minorTickPosition != null) __obj.updateDynamic("minorTickPosition")(minorTickPosition.asInstanceOf[js.Any])
    if (minorTickWidth != null) __obj.updateDynamic("minorTickWidth")(minorTickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.asInstanceOf[js.Any])
    if (!js.isUndefined(ordinal)) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (overscroll != null) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotBands != null) __obj.updateDynamic("plotBands")(plotBands.asInstanceOf[js.Any])
    if (plotLines != null) __obj.updateDynamic("plotLines")(plotLines.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(reversedStacks)) __obj.updateDynamic("reversedStacks")(reversedStacks.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastLabel)) __obj.updateDynamic("showLastLabel")(showLastLabel.asInstanceOf[js.Any])
    if (softMax != null) __obj.updateDynamic("softMax")(softMax.asInstanceOf[js.Any])
    if (softMin != null) __obj.updateDynamic("softMin")(softMin.asInstanceOf[js.Any])
    if (startOfWeek != null) __obj.updateDynamic("startOfWeek")(startOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(startOnTick)) __obj.updateDynamic("startOnTick")(startOnTick.asInstanceOf[js.Any])
    if (tickAmount != null) __obj.updateDynamic("tickAmount")(tickAmount.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickPixelInterval != null) __obj.updateDynamic("tickPixelInterval")(tickPixelInterval.asInstanceOf[js.Any])
    if (tickPosition != null) __obj.updateDynamic("tickPosition")(tickPosition.asInstanceOf[js.Any])
    if (tickPositioner != null) __obj.updateDynamic("tickPositioner")(tickPositioner.asInstanceOf[js.Any])
    if (tickPositions != null) __obj.updateDynamic("tickPositions")(tickPositions.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (tickmarkPlacement != null) __obj.updateDynamic("tickmarkPlacement")(tickmarkPlacement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueNames)) __obj.updateDynamic("uniqueNames")(uniqueNames.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisOptions]
  }
}

