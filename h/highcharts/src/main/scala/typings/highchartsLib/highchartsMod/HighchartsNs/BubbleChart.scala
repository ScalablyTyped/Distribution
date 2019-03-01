package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn
  * as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to
  * the Z value.
  */
trait BubbleChart extends SeriesChart {
  /**
    * Whether to display negative sized bubbles. The threshold is given by the zThreshold option, and negative bubbles
    * can be visualized by setting negativeColor.
    * @default true
    * @since 3.0
    */
  var displayNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Maximum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of
    * each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width
    * and height.
    * @default '20%'
    * @since 3.0
    */
  var maxSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Minimum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of
    * each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width
    * and height.
    * @default 8
    * @since 3.0
    */
  var minSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Whether the bubble's value should be represented by the area or the width of the bubble. The default, area,
    * corresponds best to the human perception of the size of each bubble.
    * @default 'area'
    * @since 3.0.7
    */
  var sizeBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When this is true, the absolute value of z determines the size of the bubble. This means that with the default
    * zThreshold of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0
    * will have a smaller size according to minSize.
    * @default false
    * @since 4.1.9
    */
  var sizeByAbsoluteValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum for the Z value range. Defaults to the highest Z value in the data.
    * @default null
    * @since 4.0.3
    */
  var zMax: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The minimum for the Z value range. Defaults to the lowest Z value in the data.
    * @default null
    * @since 4.0.3
    */
  var zMin: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * When displayNegative is false, bubbles with lower Z values are skipped. When displayNegative is true and a
    * negativeColor is given, points with lower Z is colored.
    * @default 0
    * @since 3.0
    */
  var zThreshold: js.UndefOr[scala.Double] = js.undefined
}

object BubbleChart {
  @scala.inline
  def apply(
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    connectEnds: js.UndefOr[scala.Boolean] = js.undefined,
    connectNulls: js.UndefOr[scala.Boolean] = js.undefined,
    cropThreshold: scala.Int | scala.Double = null,
    cursor: java.lang.String = null,
    dashStyle: java.lang.String = null,
    dataLabels: DataLabels = null,
    displayNegative: js.UndefOr[scala.Boolean] = js.undefined,
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    maxSize: java.lang.String | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    minSize: java.lang.String | scala.Double = null,
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
    sizeBy: java.lang.String = null,
    sizeByAbsoluteValues: js.UndefOr[scala.Boolean] = js.undefined,
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverLineStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zMax: scala.Int | scala.Double = null,
    zMin: scala.Int | scala.Double = null,
    zThreshold: scala.Int | scala.Double = null,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): BubbleChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(connectEnds)) __obj.updateDynamic("connectEnds")(connectEnds)
    if (!js.isUndefined(connectNulls)) __obj.updateDynamic("connectNulls")(connectNulls)
    if (cropThreshold != null) __obj.updateDynamic("cropThreshold")(cropThreshold.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (!js.isUndefined(displayNegative)) __obj.updateDynamic("displayNegative")(displayNegative)
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
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
    if (sizeBy != null) __obj.updateDynamic("sizeBy")(sizeBy)
    if (!js.isUndefined(sizeByAbsoluteValues)) __obj.updateDynamic("sizeByAbsoluteValues")(sizeByAbsoluteValues)
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zMax != null) __obj.updateDynamic("zMax")(zMax.asInstanceOf[js.Any])
    if (zMin != null) __obj.updateDynamic("zMin")(zMin.asInstanceOf[js.Any])
    if (zThreshold != null) __obj.updateDynamic("zThreshold")(zThreshold.asInstanceOf[js.Any])
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[BubbleChart]
  }
}

