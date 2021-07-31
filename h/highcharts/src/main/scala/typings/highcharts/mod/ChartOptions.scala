package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptions extends StObject {
  
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
    * - `defer`: The animation delay time in milliseconds.
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: A string reference to an easing function set on the `Math`
    * object. See the easing demo.
    *
    * When zooming on a series with less than 100 points, the chart redraw will
    * be done with animation, but in case of more data points, it is necessary
    * to set this option to ensure animation on zoom.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
  
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
  var map: js.UndefOr[String | GeoJSON | js.Array[js.Any]] = js.undefined
  
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
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignTicks(value: Boolean): Self = StObject.set(x, "alignTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTicksUndefined: Self = StObject.set(x, "alignTicks", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColorCount(value: Double): Self = StObject.set(x, "colorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCountUndefined: Self = StObject.set(x, "colorCount", js.undefined)
    
    @scala.inline
    def setDisplayErrors(value: Boolean): Self = StObject.set(x, "displayErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayErrorsUndefined: Self = StObject.set(x, "displayErrors", js.undefined)
    
    @scala.inline
    def setEvents(value: ChartEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIgnoreHiddenSeries(value: Boolean): Self = StObject.set(x, "ignoreHiddenSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreHiddenSeriesUndefined: Self = StObject.set(x, "ignoreHiddenSeries", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    @scala.inline
    def setMap(value: String | GeoJSON | js.Array[js.Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTransforms(value: js.Any): Self = StObject.set(x, "mapTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTransformsUndefined: Self = StObject.set(x, "mapTransforms", js.undefined)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: js.Any*): Self = StObject.set(x, "map", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormatter(
      value: (/* number */ Double, /* decimals */ Double, /* decimalPoint */ js.UndefOr[String], /* thousandsSep */ js.UndefOr[String]) => String
    ): Self = StObject.set(x, "numberFormatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNumberFormatterUndefined: Self = StObject.set(x, "numberFormatter", js.undefined)
    
    @scala.inline
    def setOptions3d(value: Chart3dOptions): Self = StObject.set(x, "options3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions3dUndefined: Self = StObject.set(x, "options3d", js.undefined)
    
    @scala.inline
    def setPanKey(value: OptionsPanKeyValue): Self = StObject.set(x, "panKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanKeyUndefined: Self = StObject.set(x, "panKey", js.undefined)
    
    @scala.inline
    def setPanning(value: ChartPanningOptions): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningUndefined: Self = StObject.set(x, "panning", js.undefined)
    
    @scala.inline
    def setParallelAxes(value: ChartParallelAxesOptions | js.Array[ChartParallelAxesOptions]): Self = StObject.set(x, "parallelAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelAxesUndefined: Self = StObject.set(x, "parallelAxes", js.undefined)
    
    @scala.inline
    def setParallelAxesVarargs(value: ChartParallelAxesOptions*): Self = StObject.set(x, "parallelAxes", js.Array(value :_*))
    
    @scala.inline
    def setParallelCoordinates(value: Boolean): Self = StObject.set(x, "parallelCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelCoordinatesUndefined: Self = StObject.set(x, "parallelCoordinates", js.undefined)
    
    @scala.inline
    def setPinchType(value: OptionsPinchTypeValue): Self = StObject.set(x, "pinchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchTypeUndefined: Self = StObject.set(x, "pinchType", js.undefined)
    
    @scala.inline
    def setPlotBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "plotBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundColorUndefined: Self = StObject.set(x, "plotBackgroundColor", js.undefined)
    
    @scala.inline
    def setPlotBackgroundImage(value: String): Self = StObject.set(x, "plotBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundImageUndefined: Self = StObject.set(x, "plotBackgroundImage", js.undefined)
    
    @scala.inline
    def setPlotBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "plotBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBorderColorUndefined: Self = StObject.set(x, "plotBorderColor", js.undefined)
    
    @scala.inline
    def setPlotBorderWidth(value: Double): Self = StObject.set(x, "plotBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBorderWidthUndefined: Self = StObject.set(x, "plotBorderWidth", js.undefined)
    
    @scala.inline
    def setPlotShadow(value: Boolean | CSSObject): Self = StObject.set(x, "plotShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotShadowUndefined: Self = StObject.set(x, "plotShadow", js.undefined)
    
    @scala.inline
    def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    @scala.inline
    def setProj4(value: js.Function): Self = StObject.set(x, "proj4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProj4Undefined: Self = StObject.set(x, "proj4", js.undefined)
    
    @scala.inline
    def setReflow(value: Boolean): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
    
    @scala.inline
    def setRenderTo(value: String | HTMLDOMElement): Self = StObject.set(x, "renderTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToUndefined: Self = StObject.set(x, "renderTo", js.undefined)
    
    @scala.inline
    def setResetZoomButton(value: ChartResetZoomButtonOptions): Self = StObject.set(x, "resetZoomButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetZoomButtonUndefined: Self = StObject.set(x, "resetZoomButton", js.undefined)
    
    @scala.inline
    def setScrollablePlotArea(value: ChartScrollablePlotAreaOptions): Self = StObject.set(x, "scrollablePlotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollablePlotAreaUndefined: Self = StObject.set(x, "scrollablePlotArea", js.undefined)
    
    @scala.inline
    def setSelectionMarkerFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "selectionMarkerFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMarkerFillUndefined: Self = StObject.set(x, "selectionMarkerFill", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | CSSObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShowAxes(value: Boolean): Self = StObject.set(x, "showAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxesUndefined: Self = StObject.set(x, "showAxes", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Array[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingBottom(value: Double): Self = StObject.set(x, "spacingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingBottomUndefined: Self = StObject.set(x, "spacingBottom", js.undefined)
    
    @scala.inline
    def setSpacingLeft(value: Double): Self = StObject.set(x, "spacingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingLeftUndefined: Self = StObject.set(x, "spacingLeft", js.undefined)
    
    @scala.inline
    def setSpacingRight(value: Double): Self = StObject.set(x, "spacingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingRightUndefined: Self = StObject.set(x, "spacingRight", js.undefined)
    
    @scala.inline
    def setSpacingTop(value: Double): Self = StObject.set(x, "spacingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingTopUndefined: Self = StObject.set(x, "spacingTop", js.undefined)
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setSpacingVarargs(value: Double*): Self = StObject.set(x, "spacing", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyledMode(value: Boolean): Self = StObject.set(x, "styledMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyledModeUndefined: Self = StObject.set(x, "styledMode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoomKey(value: OptionsZoomKeyValue): Self = StObject.set(x, "zoomKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomKeyUndefined: Self = StObject.set(x, "zoomKey", js.undefined)
    
    @scala.inline
    def setZoomType(value: OptionsZoomTypeValue): Self = StObject.set(x, "zoomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTypeUndefined: Self = StObject.set(x, "zoomType", js.undefined)
  }
}
