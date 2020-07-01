package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
    * or more opposite axes will automatically be aligned by adding ticks to
    * the axis or axes with the least ticks, as if `tickAmount` were specified.
    *
    * This can be prevented by setting `alignTicks` to false. If the grid lines
    * look messy, it's a good idea to hide them for the secondary axis by
    * setting `gridLineWidth` to 0.
    *
    * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
    * the `alignTicks ` will be disabled for the Axis.
    *
    * Disabled for logarithmic axes.
    */
  var alignTicks: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the overall animation for
    * all chart updating. Animation can be disabled throughout the chart by
    * setting it to false here. It can be overridden for each individual API
    * method as a function parameter. The only animation not affected by this
    * option is the initial series animation, see plotOptions.series.animation.
    *
    * The animation can either be set as a boolean or a configuration object.
    * If `true`, it will use the 'swing' jQuery easing and a duration of 500
    * ms. If used as a configuration object, the following properties are
    * supported:
    *
    * - **duration**: The duration of the animation in milliseconds.
    *
    * - **easing**: A string reference to an easing function set on the `Math`
    * object. See the easing demo.
    *
    * When zooming on a series with less than 100 points, the chart redraw will
    * be done with animation, but in case of more data points, it is necessary
    * to set this option to ensure animation on zoom.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the outer chart area.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the outer chart
    * border.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The corner radius of the outer
    * chart border.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the outer
    * chart border.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
    * charts container `div`, allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In styled mode, this sets how
    * many colors the class names should rotate between. With ten colors,
    * series (or points) are given class names like `highcharts-color-0`,
    * `highcharts-color-0` [...] `highcharts-color-9`. The equivalent in
    * non-styled mode is to set colors using the colors setting.
    */
  var colorCount: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to display errors on the
    * chart. When `false`, the errors will be shown only in the console.
    */
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event listeners for the chart.
    */
  var events: js.UndefOr[ChartEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An explicit height for the
    * chart. If a _number_, the height is given in pixels. If given a
    * _percentage string_ (for example `'56%'`), the height is given as the
    * percentage of the actual chart width. This allows for preserving the
    * aspect ratio across responsive sizes.
    *
    * By default (when `null`) the height is calculated from the offset height
    * of the containing element, or 400 pixels if the containing element's
    * height is 0.
    */
  var height: js.UndefOr[Double | String | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) If true, the axes will scale to the
    * remaining visible series once one series is hidden. If false, hiding and
    * showing a series will not affect the axes or the other series. For
    * stacks, once one series within the stack is hidden, the rest of the stack
    * will close in around it even if the axis is not affected.
    */
  var ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to invert the axes so that the x
    * axis is vertical and y axis is horizontal. When `true`, the x axis is
    * reversed by default.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Default `mapData` for all series. If set to a string, it
    * functions as an index into the `Highcharts.maps` array. Otherwise it is
    * interpreted as map data.
    */
  var map: js.UndefOr[String | GeoJSON | js.Array[_]] = js.undefined
  /**
    * (Highmaps) Set lat/lon transformation definitions for the chart. If not
    * defined, these are extracted from the map data.
    */
  var mapTransforms: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the outer
    * edge of the chart and the plot area. The numbers in the array designate
    * top, right, bottom and left respectively. Use the options `marginTop`,
    * `marginRight`, `marginBottom` and `marginLeft` for shorthand setting of
    * one option.
    *
    * By default there is no margin. The actual space is dynamically calculated
    * from the offset of axis labels, axis title, title, subtitle and legend in
    * addition to the `spacingTop`, `spacingRight`, `spacingBottom` and
    * `spacingLeft` options.
    */
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the bottom
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingBottom`.
    */
  var marginBottom: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the left
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingLeft`.
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the right
    * outer edge of the chart and the plot area. Use this to set a fixed pixel
    * value for the margin as opposed to the default dynamic margin. See also
    * `spacingRight`.
    */
  var marginRight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the top outer
    * edge of the chart and the plot area. Use this to set a fixed pixel value
    * for the margin as opposed to the default dynamic margin. See also
    * `spacingTop`.
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to override
    * the default function that formats all the numbers in the chart. Returns a
    * string with the formatted number.
    */
  var numberFormatter: js.UndefOr[NumberFormatterCallbackFunction] = js.undefined
  /**
    * (Highcharts) Options to render charts in 3 dimensions. This feature
    * requires `highcharts-3d.js`, found in the download package or online at
    * code.highcharts.com/highcharts-3d.js.
    */
  var options3d: js.UndefOr[Chart3dOptions] = js.undefined
  /**
    * (Highcharts, Gantt) Allows setting a key to switch between zooming and
    * panning. Can be one of `alt`, `ctrl`, `meta` (the command key on Mac and
    * Windows key on Windows) or `shift`. The keys are mapped directly to the
    * key properties of the click event argument (`event.altKey`,
    * `event.ctrlKey`, `event.metaKey` and `event.shiftKey`).
    */
  var panKey: js.UndefOr[OptionsPanKeyValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
    * panKey to combine zooming and panning.
    *
    * On touch devices, when the tooltip.followTouchMove option is `true`
    * (default), panning requires two fingers. To allow panning with one
    * finger, set `followTouchMove` to `false`.
    */
  var panning: js.UndefOr[ChartPanningOptions] = js.undefined
  /**
    * (Highcharts) Common options for all yAxes rendered in a parallel
    * coordinates plot. This feature requires
    * `modules/parallel-coordinates.js`.
    *
    * The default options are: (see online documentation for example)
    */
  var parallelAxes: js.UndefOr[ChartParallelAxesOptions | js.Array[ChartParallelAxesOptions]] = js.undefined
  /**
    * (Highcharts) Flag to render charts as a parallel coordinates plot. In a
    * parallel coordinates plot (||-coords) by default all required yAxes are
    * generated and the legend is disabled. This feature requires
    * `modules/parallel-coordinates.js`.
    */
  var parallelCoordinates: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Equivalent to zoomType, but for multitouch
    * gestures only. By default, the `pinchType` is the same as the `zoomType`
    * setting. However, pinching can be enabled separately in some cases, for
    * example in stock charts where a mouse drag pans the chart, while pinching
    * is enabled. When tooltip.followTouchMove is true, pinchType only applies
    * to two-finger touches.
    */
  var pinchType: js.UndefOr[OptionsPinchTypeValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the plot area.
    */
  var plotBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
    * the plot background. To set an image as the background for the entire
    * chart, set a CSS background image to the container element. Note that for
    * the image to be applied to exported charts, its URL needs to be
    * accessible by the export server.
    */
  var plotBackgroundImage: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the inner chart or
    * plot area border.
    */
  var plotBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the plot area
    * border.
    */
  var plotBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the plot area. Requires that plotBackgroundColor be set. The shadow
    * can be an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var plotShadow: js.UndefOr[Boolean | CSSObject] = js.undefined
  /**
    * (Highcharts) When true, cartesian charts like line, spline, area and
    * column are transformed into the polar coordinate system. This produces
    * _polar charts_, also known as _radar charts_.
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) Allows to manually load the proj4 library from Highcharts
    * options instead of the `window`. In case of loading the library from a
    * `script` tag, this option is not needed, it will be loaded from there by
    * default.
    */
  var proj4: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reflow the chart to
    * fit the width of the container div on resizing the window.
    */
  var reflow: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML element where the chart
    * will be rendered. If it is a string, the element by that id is used. The
    * HTML element can also be passed by direct reference, or as the first
    * argument of the chart constructor, in which case the option is not
    * needed.
    */
  var renderTo: js.UndefOr[String | HTMLDOMElement] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The button that appears after a
    * selection zoom, allowing the user to reset zoom.
    */
  var resetZoomButton: js.UndefOr[ChartResetZoomButtonOptions] = js.undefined
  /**
    * (Highcharts, Gantt) Options for a scrollable plot area. This feature
    * provides a minimum size for the plot area of the chart. If the size gets
    * smaller than this, typically on mobile devices, a native browser
    * scrollbar is presented. This scrollbar provides smooth scrolling for the
    * contents of the plot area, whereas the title, legend and unaffected axes
    * are fixed.
    *
    * Since v7.1.2, a scrollable plot area can be defined for either horizontal
    * or vertical scrolling, depending on whether the `minWidth` or `minHeight`
    * option is set.
    */
  var scrollablePlotArea: js.UndefOr[ChartScrollablePlotAreaOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
    * marker square when selecting (zooming in on) an area of the chart.
    */
  var selectionMarkerFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the outer chart area. Requires that backgroundColor be set. The shadow
    * can be an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.undefined
  /**
    * (Highcharts, Gantt) Whether to show the axes initially. This only applies
    * to empty charts where series are added dynamically, as axes are
    * automatically added to cartesian series.
    */
  var showAxes: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The distance between the outer
    * edge of the chart and the content, like title or legend, or axis title
    * and labels if present. The numbers in the array designate top, right,
    * bottom and left respectively. Use the options spacingTop, spacingRight,
    * spacingBottom and spacingLeft options for shorthand setting of one
    * option.
    */
  var spacing: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the bottom
    * edge of the chart and the content (plot area, axis title and labels,
    * title, subtitle or legend in top position).
    */
  var spacingBottom: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the left edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingLeft: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the right edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingRight: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The space between the top edge
    * of the chart and the content (plot area, axis title and labels, title,
    * subtitle or legend in top position).
    */
  var spacingTop: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional CSS styles to apply
    * inline to the container `div`. Note that since the default font styles
    * are applied in the renderer, it is ignorant of the individual chart
    * options and must be set globally.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply styled mode.
    * When in styled mode, no presentational attributes or CSS are applied to
    * the chart SVG. Instead, CSS rules are required to style the chart. The
    * default style sheet is available from
    * `https://code.highcharts.com/css/highcharts.css`.
    */
  var styledMode: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default series type for the
    * chart. Can be any of the chart types listed under plotOptions and series
    * or can be a series provided by an additional module.
    *
    * In TypeScript this option has no effect in sense of typing and instead
    * the `type` option must always be set in the series.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An explicit width for the chart.
    * By default (when `null`) the width is calculated from the offset width of
    * the containing element.
    */
  var width: js.UndefOr[Double | String | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set a key to hold when dragging
    * to zoom the chart. This is useful to avoid zooming while moving points.
    * Should be set different than chart.panKey.
    */
  var zoomKey: js.UndefOr[OptionsZoomKeyValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * zoom by dragging the mouse. Can be one of `x`, `y` or `xy`.
    */
  var zoomType: js.UndefOr[OptionsZoomTypeValue] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    alignTicks: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject = null,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    colorCount: js.UndefOr[Double] = js.undefined,
    displayErrors: js.UndefOr[Boolean] = js.undefined,
    events: ChartEventsOptions = null,
    height: js.UndefOr[Null | Double | String] = js.undefined,
    ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    map: String | GeoJSON | js.Array[_] = null,
    mapTransforms: js.Any = null,
    margin: Double | js.Array[Double] = null,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    numberFormatter: (/* number */ Double, /* decimals */ Double, /* decimalPoint */ js.UndefOr[String], /* thousandsSep */ js.UndefOr[String]) => String = null,
    options3d: Chart3dOptions = null,
    panKey: OptionsPanKeyValue = null,
    panning: ChartPanningOptions = null,
    parallelAxes: ChartParallelAxesOptions | js.Array[ChartParallelAxesOptions] = null,
    parallelCoordinates: js.UndefOr[Boolean] = js.undefined,
    pinchType: OptionsPinchTypeValue = null,
    plotBackgroundColor: ColorString | GradientColorObject | PatternObject = null,
    plotBackgroundImage: String = null,
    plotBorderColor: ColorString | GradientColorObject | PatternObject = null,
    plotBorderWidth: js.UndefOr[Double] = js.undefined,
    plotShadow: Boolean | CSSObject = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    proj4: js.Function = null,
    reflow: js.UndefOr[Boolean] = js.undefined,
    renderTo: String | HTMLDOMElement = null,
    resetZoomButton: ChartResetZoomButtonOptions = null,
    scrollablePlotArea: ChartScrollablePlotAreaOptions = null,
    selectionMarkerFill: ColorString | GradientColorObject | PatternObject = null,
    shadow: Boolean | CSSObject = null,
    showAxes: js.UndefOr[Boolean] = js.undefined,
    spacing: js.Array[Double] = null,
    spacingBottom: js.UndefOr[Double] = js.undefined,
    spacingLeft: js.UndefOr[Double] = js.undefined,
    spacingRight: js.UndefOr[Double] = js.undefined,
    spacingTop: js.UndefOr[Double] = js.undefined,
    style: CSSObject = null,
    styledMode: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Null | Double | String] = js.undefined,
    zoomKey: OptionsZoomKeyValue = null,
    zoomType: OptionsZoomTypeValue = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTicks)) __obj.updateDynamic("alignTicks")(alignTicks.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colorCount)) __obj.updateDynamic("colorCount")(colorCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayErrors)) __obj.updateDynamic("displayErrors")(displayErrors.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHiddenSeries)) __obj.updateDynamic("ignoreHiddenSeries")(ignoreHiddenSeries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapTransforms != null) __obj.updateDynamic("mapTransforms")(mapTransforms.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (numberFormatter != null) __obj.updateDynamic("numberFormatter")(js.Any.fromFunction4(numberFormatter))
    if (options3d != null) __obj.updateDynamic("options3d")(options3d.asInstanceOf[js.Any])
    if (panKey != null) __obj.updateDynamic("panKey")(panKey.asInstanceOf[js.Any])
    if (panning != null) __obj.updateDynamic("panning")(panning.asInstanceOf[js.Any])
    if (parallelAxes != null) __obj.updateDynamic("parallelAxes")(parallelAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelCoordinates)) __obj.updateDynamic("parallelCoordinates")(parallelCoordinates.get.asInstanceOf[js.Any])
    if (pinchType != null) __obj.updateDynamic("pinchType")(pinchType.asInstanceOf[js.Any])
    if (plotBackgroundColor != null) __obj.updateDynamic("plotBackgroundColor")(plotBackgroundColor.asInstanceOf[js.Any])
    if (plotBackgroundImage != null) __obj.updateDynamic("plotBackgroundImage")(plotBackgroundImage.asInstanceOf[js.Any])
    if (plotBorderColor != null) __obj.updateDynamic("plotBorderColor")(plotBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(plotBorderWidth)) __obj.updateDynamic("plotBorderWidth")(plotBorderWidth.get.asInstanceOf[js.Any])
    if (plotShadow != null) __obj.updateDynamic("plotShadow")(plotShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.get.asInstanceOf[js.Any])
    if (proj4 != null) __obj.updateDynamic("proj4")(proj4.asInstanceOf[js.Any])
    if (!js.isUndefined(reflow)) __obj.updateDynamic("reflow")(reflow.get.asInstanceOf[js.Any])
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (resetZoomButton != null) __obj.updateDynamic("resetZoomButton")(resetZoomButton.asInstanceOf[js.Any])
    if (scrollablePlotArea != null) __obj.updateDynamic("scrollablePlotArea")(scrollablePlotArea.asInstanceOf[js.Any])
    if (selectionMarkerFill != null) __obj.updateDynamic("selectionMarkerFill")(selectionMarkerFill.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showAxes)) __obj.updateDynamic("showAxes")(showAxes.get.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingBottom)) __obj.updateDynamic("spacingBottom")(spacingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingLeft)) __obj.updateDynamic("spacingLeft")(spacingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingRight)) __obj.updateDynamic("spacingRight")(spacingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingTop)) __obj.updateDynamic("spacingTop")(spacingTop.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(styledMode)) __obj.updateDynamic("styledMode")(styledMode.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomKey != null) __obj.updateDynamic("zoomKey")(zoomKey.asInstanceOf[js.Any])
    if (zoomType != null) __obj.updateDynamic("zoomType")(zoomType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

