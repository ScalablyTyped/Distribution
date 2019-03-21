package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The size of the point shape is determined by its value relative to its siblings values. Requires the module
  * heatmap.js as well, if functionality such as the colorAxis is to be used.
  */
trait TreeMapChart extends SeriesChart {
  /**
    * When enabled the user can click on a point which is a parent and zoom in on its children.
    * @default false
    * @since 4.1.0
    */
  var allowDrillToNode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal. The
    * next levels starting direction will always be the opposite of the previous.
    * @default false
    * @since 4.1.0
    */
  var alternateStartingDirection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color of the border surrounding each tree map item.
    * @default '#E0E0E0'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using automatic point colors pulled from the options.colors collection, this option determines whether the
    * chart should receive one color per series or one color per point.
    * @default false
    * @since 2.0
    */
  var colorByPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /**
    * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is
    * undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
    * @since 4.1.2
    */
  var interactByLeaf: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of
    * 'sliceAndDice', 'stripes', 'squarified' or 'strip'.
    * @default 'sliceAndDice'
    * @since 4.1.0
    */
  var layoutAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines which direction the layout algorithm will start drawing. Possible values are 'vertical' and 'horizontal'.
    * @default 'vertical'
    * @since 4.1.0
    */
  var layoutStartingDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used together with the levels and allowDrillToNode options. When set to false the first level visible when
    * drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
    * @default true
    * @since 4.1.0
    */
  var levelIsConstant: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set options on specific levels. Takes precedence over series options, but not point options.
    */
  var levels: js.UndefOr[js.Array[TreeMapLevel]] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
    * columns from becoming too wide when there is a small number of points in the chart.
    * @default null
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The sort index of the point inside the treemap level.
    * @since 4.1.10
    */
  var sortIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_TreeMapChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
}

object TreeMapChart {
  @scala.inline
  def apply(
    allowDrillToNode: js.UndefOr[scala.Boolean] = js.undefined,
    allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined,
    alternateStartingDirection: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    borderColor: java.lang.String | Gradient = null,
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
    enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined,
    events: PlotEvents = null,
    findNearestPointBy: java.lang.String = null,
    getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined,
    interactByLeaf: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    layoutAlgorithm: java.lang.String = null,
    layoutStartingDirection: java.lang.String = null,
    levelIsConstant: js.UndefOr[scala.Boolean] = js.undefined,
    levels: js.Array[TreeMapLevel] = null,
    lineWidth: scala.Int | scala.Double = null,
    linecap: java.lang.String = null,
    linkedTo: java.lang.String = null,
    marker: Marker = null,
    maxFontSize: scala.Int | scala.Double = null,
    maxPointWidth: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
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
    softThreshold: js.UndefOr[scala.Boolean] = js.undefined,
    sortIndex: scala.Int | scala.Double = null,
    stacking: java.lang.String = null,
    states: highchartsLib.Anon_HoverBarStates = null,
    stickyTracking: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    tooltip: SeriesTooltipOptions = null,
    turboThreshold: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zoneAxis: java.lang.String = null,
    zones: js.Array[AreaZone] = null
  ): TreeMapChart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrillToNode)) __obj.updateDynamic("allowDrillToNode")(allowDrillToNode)
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect)
    if (!js.isUndefined(alternateStartingDirection)) __obj.updateDynamic("alternateStartingDirection")(alternateStartingDirection)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
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
    if (!js.isUndefined(enableMouseTracking)) __obj.updateDynamic("enableMouseTracking")(enableMouseTracking)
    if (events != null) __obj.updateDynamic("events")(events)
    if (findNearestPointBy != null) __obj.updateDynamic("findNearestPointBy")(findNearestPointBy)
    if (!js.isUndefined(getExtremesFromAll)) __obj.updateDynamic("getExtremesFromAll")(getExtremesFromAll)
    if (!js.isUndefined(interactByLeaf)) __obj.updateDynamic("interactByLeaf")(interactByLeaf)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm)
    if (layoutStartingDirection != null) __obj.updateDynamic("layoutStartingDirection")(layoutStartingDirection)
    if (!js.isUndefined(levelIsConstant)) __obj.updateDynamic("levelIsConstant")(levelIsConstant)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (linecap != null) __obj.updateDynamic("linecap")(linecap)
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (maxPointWidth != null) __obj.updateDynamic("maxPointWidth")(maxPointWidth.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
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
    if (!js.isUndefined(softThreshold)) __obj.updateDynamic("softThreshold")(softThreshold)
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    if (stacking != null) __obj.updateDynamic("stacking")(stacking)
    if (states != null) __obj.updateDynamic("states")(states)
    if (!js.isUndefined(stickyTracking)) __obj.updateDynamic("stickyTracking")(stickyTracking)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (turboThreshold != null) __obj.updateDynamic("turboThreshold")(turboThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zoneAxis != null) __obj.updateDynamic("zoneAxis")(zoneAxis)
    if (zones != null) __obj.updateDynamic("zones")(zones)
    __obj.asInstanceOf[TreeMapChart]
  }
}

