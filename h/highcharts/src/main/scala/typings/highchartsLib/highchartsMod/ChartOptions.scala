package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  /**
    * When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks to
    * the axis or axes with the least ticks. This can be prevented by setting alignTicks to false. If the grid lines
    * look messy, it's a good idea to hide them for the secondary axis by setting gridLineWidth to 0.
    * @default true
    */
  var alignTicks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to
    * false here. It can be overridden for each individual API method as a function parameter. The only animation not
    * affected by this option is the initial series animation, see plotOptions.series.animation.
    *
    * The animation can either be set as a boolean or a configuration object. If true, it will use the 'swing' jQuery
    * easing and a duration of 500 ms.
    *
    * @default true
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * The background color or gradient for the outer chart area.
    * @default '#FFFFFF'
    */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The color of the outer chart border.
    * @default '#4572A7'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The corner radius of the outer chart border.
    * @default 0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel width of the outer chart border.
    * @default 0
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * A CSS class name to apply to the charts container div, allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In styled mode, this sets how many colors the class names should rotate between. With ten colors,
    * series (or points) are given class names like highcharts-color-0, highcharts-color-0 [...] highcharts-color-9.
    * The equivalent in non-styled mode is to set colors using the colors setting.
    * @since 5.0.0
    * @default 10
    */
  var colorCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias of type. Defaults to line.
    * @default 'line'
    * @deprecated
    */
  var defaultSeriesType: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Event listeners for the chart.
    */
  var events: js.UndefOr[ChartEvents] = js.undefined
  /**
    * An explicit height for the chart. If a number, the height is given in pixels. If given a percentage string (for example '56%'),
    * the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive sizes.
    * By default (when null) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
    * @default null
    * @since 5.0.8
    */
  var height: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /**
    * If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and
    * showing a series will not affect the axes or the other series. For stacks, once one series within the stack is
    * hidden, the rest of the stack will close in around it even if the axis is not affected.
    * @default true
    * @since 1.2.0
    */
  var ignoreHiddenSeries: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When true, the x axis is
    * reversed by default. If a bar series is present in the chart, it will be inverted automatically.
    * @default false
    */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right,
    * bottom and left respectively. Use the options marginTop, marginRight, marginBottom and marginLeft for shorthand
    * setting of one option.
    *
    * Since version 2.1, the margin is 0 by default. The actual space is dynamically calculated from the offset of axis
    * labels, axis title, title, subtitle and legend in addition to the spacingTop, spacingRight, spacingBottom and
    * spacingLeft options.
    */
  var margin: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
    * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for
    * the margin as opposed to the default dynamic margin. See also spacingBottom.
    * @since 2.0
    */
  var marginBottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for
    * the margin as opposed to the default dynamic margin. See also spacingLeft.
    * @since 2.0
    */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for
    * the margin as opposed to the default dynamic margin. See also spacingRight.
    * @since 2.0
    */
  var marginRight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the
    * margin as opposed to the default dynamic margin. See also spacingTop.
    * @since 2.0
    */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options to render charts in 3 dimensions. This feature requires highcharts-3d.js, found in the download package
    * or online at {@link code.highcharts.com/highcharts-3d.js}.
    */
  var options3d: js.UndefOr[ChartOptions3d] = js.undefined
  /**
    * Allows setting a key to switch between zooming and panning.
    * @since 4.0.3
    */
  var panKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow panning in a chart. Best used with panKey to combine zooming and panning.
    * @default false
    * @since 4.0.3
    */
  var panning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Equivalent to zoomType, but for multitouch gestures only. By default, the pinchType is the same as the zoomType
    * setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse
    * drag pans the chart, while pinching is enabled.
    * @default null
    * @since 3.0
    */
  var pinchType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The background color or gradient for the plot area.
    */
  var plotBackgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a
    * CSS background image to the container element. Note that for the image to be applied to exported charts, its URL
    * needs to be accessible by the export server.
    */
  var plotBackgroundImage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the inner chart or plot area border.
    * @default 0
    */
  var plotBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel width of the plot area border.
    * @default 0
    */
  var plotBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow
    * can be an object configuration containing color, offsetX, offsetY, opacity and width.
    * @default false
    */
  var plotShadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
    * When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system.
    * Requires highcharts-more.js.
    * @default false
    * @since 2.3.0
    */
  var polar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @default true
    * @since 2.1
    */
  var reflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML
    * element can also be passed by direct reference.
    */
  var renderTo: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /**
    * The button that appears after a selection zoom, allowing the user to reset zoom.
    */
  var resetZoomButton: js.UndefOr[ChartResetZoomButton] = js.undefined
  /**
    * Options for a scrollable plot area
    */
  var scrollablePlotArea: js.UndefOr[ScrollablePropArea] = js.undefined
  /**
    * The background color of the marker square when selecting (zooming in on) an area of the chart.
    * @default 'rgba(69,114,167,0.25)'
    * @since 2.1.7
    */
  var selectionMarkerFill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to apply a drop shadow to the outer chart area. Requires that backgroundColor be set. Since 2.3 the
    * shadow can be an object configuration containing color, offsetX, offsetY, opacity and width.
    * @default false
    */
  var shadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
    * Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes
    * are automatically added to cartesian series.
    * @default false
    * @since 1.2.5
    */
  var showAxes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The distance between the outer edge of the chart and the content, like title, legend, axis title or labels. The
    * numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop,
    * spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    * @default [10, 10, 15, 10]
    * @since 3.0.6
    */
  var spacing: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle
    * or legend in top position).
    * @default 15
    * @since 2.1
    */
  var spacingBottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle
    * or legend in top position).
    * @default 10
    * @since 2.1
    */
  var spacingLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    * The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle
    * or legend in top position).
    * @default 10
    * @since 2.1
    */
  var spacingRight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or
    * legend in top position).
    * @default 10
    * @since 2.1
    */
  var spacingTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Additional CSS styles to apply inline to the container div. Note that since the default font styles are applied
    * in the renderer, it is ignorant of the individual chart options and must be set globally.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * The default series type for the chart. Can be any of the chart types listed under plotOptions.
    * @default 'line'
    * @since 2.1.0
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A text description of the chart type.
    * If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region.
    * Highcharts will by default attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity.
    * @since 5.0.0
    * @default undefined
    */
  var typeDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An explicit width for the chart. By default the width is calculated from the offset width of the containing
    * element.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Decides in what dimensions the user can zoom by dragging the mouse. Can be one of x, y or xy.
    */
  var zoomType: js.UndefOr[java.lang.String] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    alignTicks: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    colorCount: scala.Int | scala.Double = null,
    defaultSeriesType: java.lang.String = null,
    description: java.lang.String = null,
    events: ChartEvents = null,
    height: scala.Double | java.lang.String = null,
    ignoreHiddenSeries: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Double | js.Array[scala.Double] = null,
    marginBottom: scala.Int | scala.Double = null,
    marginLeft: scala.Int | scala.Double = null,
    marginRight: scala.Int | scala.Double = null,
    marginTop: scala.Int | scala.Double = null,
    options3d: ChartOptions3d = null,
    panKey: java.lang.String = null,
    panning: js.UndefOr[scala.Boolean] = js.undefined,
    pinchType: java.lang.String = null,
    plotBackgroundColor: java.lang.String | Gradient = null,
    plotBackgroundImage: java.lang.String = null,
    plotBorderColor: java.lang.String = null,
    plotBorderWidth: scala.Int | scala.Double = null,
    plotShadow: scala.Boolean | Shadow = null,
    polar: js.UndefOr[scala.Boolean] = js.undefined,
    reflow: js.UndefOr[scala.Boolean] = js.undefined,
    renderTo: java.lang.String | stdLib.HTMLElement = null,
    resetZoomButton: ChartResetZoomButton = null,
    scrollablePlotArea: ScrollablePropArea = null,
    selectionMarkerFill: java.lang.String = null,
    shadow: scala.Boolean | Shadow = null,
    showAxes: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: js.Array[scala.Double] = null,
    spacingBottom: scala.Int | scala.Double = null,
    spacingLeft: scala.Int | scala.Double = null,
    spacingRight: scala.Int | scala.Double = null,
    spacingTop: scala.Int | scala.Double = null,
    style: CSSObject = null,
    `type`: java.lang.String = null,
    typeDescription: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    zoomType: java.lang.String = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (colorCount != null) __obj.updateDynamic("colorCount")(colorCount.asInstanceOf[js.Any])
    if (defaultSeriesType != null) __obj.updateDynamic("defaultSeriesType")(defaultSeriesType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHiddenSeries)) __obj.updateDynamic("ignoreHiddenSeries")(ignoreHiddenSeries)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (options3d != null) __obj.updateDynamic("options3d")(options3d)
    if (panKey != null) __obj.updateDynamic("panKey")(panKey)
    if (!js.isUndefined(panning)) __obj.updateDynamic("panning")(panning)
    if (pinchType != null) __obj.updateDynamic("pinchType")(pinchType)
    if (plotBackgroundColor != null) __obj.updateDynamic("plotBackgroundColor")(plotBackgroundColor.asInstanceOf[js.Any])
    if (plotBackgroundImage != null) __obj.updateDynamic("plotBackgroundImage")(plotBackgroundImage)
    if (plotBorderColor != null) __obj.updateDynamic("plotBorderColor")(plotBorderColor)
    if (plotBorderWidth != null) __obj.updateDynamic("plotBorderWidth")(plotBorderWidth.asInstanceOf[js.Any])
    if (plotShadow != null) __obj.updateDynamic("plotShadow")(plotShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar)
    if (!js.isUndefined(reflow)) __obj.updateDynamic("reflow")(reflow)
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (resetZoomButton != null) __obj.updateDynamic("resetZoomButton")(resetZoomButton)
    if (scrollablePlotArea != null) __obj.updateDynamic("scrollablePlotArea")(scrollablePlotArea)
    if (selectionMarkerFill != null) __obj.updateDynamic("selectionMarkerFill")(selectionMarkerFill)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showAxes)) __obj.updateDynamic("showAxes")(showAxes)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (spacingBottom != null) __obj.updateDynamic("spacingBottom")(spacingBottom.asInstanceOf[js.Any])
    if (spacingLeft != null) __obj.updateDynamic("spacingLeft")(spacingLeft.asInstanceOf[js.Any])
    if (spacingRight != null) __obj.updateDynamic("spacingRight")(spacingRight.asInstanceOf[js.Any])
    if (spacingTop != null) __obj.updateDynamic("spacingTop")(spacingTop.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeDescription != null) __obj.updateDynamic("typeDescription")(typeDescription)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomType != null) __obj.updateDynamic("zoomType")(zoomType)
    __obj.asInstanceOf[ChartOptions]
  }
}

