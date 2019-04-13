package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordCloudChart extends BarChart {
  /**
    * For some series, there is a limit that shuts down initial animation by default when the total number of points
    * in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there
    * is more than 250 points totally. To disable this cap, set animationLimit to Infinity.
    * @default undefined
    * @since 6.0.0
    */
  var animationLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * By default, series are exposed to screen readers as regions. By enabling this option, the series element itself
    * will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity
    * in the chart, but you still want to attach a description to the series.
    * Requires the Accessibility module.
    * @default undefined
    * @since 5.0.12
    */
  var exposeElementToA11y: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option decides which algorithm is used for placement, and rotation of a word. The choice of algorith is
    * therefore a crucial part of the resulting layout of the wordcloud. It is possible for users to add their own
    * custom placement strategies for use in word cloud. Read more about it in our documentation
    * @default center
    * @since 6.0.0
    */
  var placementStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Same as accessibility.pointDescriptionFormatter, but for an individual series. Overrides the chart wide
    * configuration.
    * @default undefined
    * @since 5.0.12
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
    * Rotation options for the words in the wordcloud.
    * @since 6.0.0
    */
  var rotation: js.UndefOr[highchartsLib.Anon_From] = js.undefined
  /**
    * If set to True, the accessibility module will skip past the points in this series for keyboard navigation.
    * @default undefined
    * @since 5.0.12
    */
  var skipKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Spiral used for placing a word after the inital position experienced a collision with either another word or the
    * borders. It is possible for users to add their own custom spiralling algorithms for use in word cloud. Read more
    * about it in our documentation
    * @default rectangular
    * @since 6.0.0
    */
  var spiral: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS styles for the words.
    * @since 6.0.0
    */
  var style: js.UndefOr[highchartsLib.Anon_FontFamily] = js.undefined
}

object WordCloudChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    animationLimit: scala.Int | scala.Double = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    colorByPoint: js.UndefOr[scala.Boolean] = js.undefined,
    colors: js.Array[Color] = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    dataLabels: DataLabels | js.Array[DataLabels] = null,
    depth: scala.Int | scala.Double = null,
    edgeColor: java.lang.String = null,
    edgeWidth: scala.Int | scala.Double = null,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    exposeElementToA11y: js.UndefOr[scala.Boolean] = js.undefined,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    groupPadding: scala.Int | scala.Double = null,
    groupZPadding: scala.Int | scala.Double = null,
    grouping: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    maxPointWidth: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    minPointLength: scala.Int | scala.Double = null,
    negativeColor: java.lang.String = null,
    placementStrategy: java.lang.String = null,
    point: highchartsLib.Anon_Events = null,
    pointDescriptionFormatter: () => java.lang.String = null,
    pointInterval: scala.Int | scala.Double = null,
    pointIntervalUnit: java.lang.String = null,
    pointPadding: java.lang.String | scala.Double = null,
    pointPlacement: java.lang.String | scala.Double = null,
    pointRange: scala.Int | scala.Double = null,
    pointStart: scala.Int | scala.Double = null,
    pointWidth: scala.Int | scala.Double = null,
    rotation: highchartsLib.Anon_From = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    skipKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    spiral: java.lang.String = null,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverBarStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    style: highchartsLib.Anon_FontFamily = null,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): WordCloudChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationLimit != null) __obj.updateDynamic("animationLimit")(animationLimit.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByPoint)) __obj.updateDynamic("colorByPoint")(colorByPoint)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor)
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(exposeElementToA11y)) __obj.updateDynamic("exposeElementToA11y")(exposeElementToA11y)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (groupPadding != null) __obj.updateDynamic("groupPadding")(groupPadding.asInstanceOf[js.Any])
    if (groupZPadding != null) __obj.updateDynamic("groupZPadding")(groupZPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (maxPointWidth != null) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (minPointLength != null) __obj.updateDynamic("minPointLength")(minPointLength.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy)
    if (point != null) __obj.updateDynamic("point")(point)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(js.Any.fromFunction0(pointDescriptionFormatter))
    if (pointInterval != null) __obj.updateDynamic("pointInterval")(pointInterval.asInstanceOf[js.Any])
    if (pointIntervalUnit != null) __obj.updateDynamic("pointIntervalUnit")(pointIntervalUnit)
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (pointPlacement != null) __obj.updateDynamic("pointPlacement")(pointPlacement.asInstanceOf[js.Any])
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (pointStart != null) __obj.updateDynamic("pointStart")(pointStart.asInstanceOf[js.Any])
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(skipKeyboardNavigation)) __obj.updateDynamic("skipKeyboardNavigation")(skipKeyboardNavigation)
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (spiral != null) __obj.updateDynamic("spiral")(spiral)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (style != null) __obj.updateDynamic("style")(style)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[WordCloudChart]
  }
}

