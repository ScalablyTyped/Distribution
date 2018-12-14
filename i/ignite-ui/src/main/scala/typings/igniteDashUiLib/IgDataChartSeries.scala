package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgDataChartSeries
  extends /**
	 * Option for IgDataChartSeries
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets the effective angle axis for the current series object.
  	 */
  var angleAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var angleMemberPath: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the opacity modifier to apply to the area fill shape of the series, if applicable.
  	 */
  var areaFillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width to use for the highlight region if highlighting items in a grid aligned series (line, spline, etc), with a banded shape.
  	 */
  var bandHighlightWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the series.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether to clip the series to the bounds.
  	 * Setting this to true can effect performance.
  	 */
  var clipSeriesToBounds: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the close mapping property for the current series object.
  	 */
  var closeMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or gets the coercion methods to use when loading data from data sources.
  	 * Should be specified before setting any member paths, if being used. Setting it later
  	 * will not cause data to be reimported into the chart.
  	 */
  var coercionMethods: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets value that is used to determine positioning logic for data items which have been consolidated into a single visual element.
  	 *
  	 * Valid values:
  	 * "maximum" Consolidated items will be positioned using their maximum value.
  	 * "minimum" Consolidated items will be positioned using their minimum value.
  	 * "median" Consolidated items will be positioned using their median value.
  	 * "relativeMinimum" Consolidated items will be positioned using the value nearest to the reference value of the corresponding axis.
  	 * "relativeMaximum" Consolidated items will be positioned using the value farthest from the reference value of the corresponding axis.
  	 */
  var consolidatedColumnVerticalPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets the position a cursor position to use instead of the current mouse cursor position for displaying the annotations in this layer.
  	 * Should be an object with an x and a y property in world coordinates (ranging from 0 to 1)
  	 */
  var cursorPosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the DiscreteLegendItemTemplate property.
  	 * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the display for the current FinancialIndicator object.
  	 *
  	 * Valid values:
  	 * "candlestick" Displays prices as a Japanese Candlestick.
  	 * "OHLC" Displays prices as an OHLC bar.
  	 */
  var displayType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether the series should expect that its data source members need to be called as functions to get their values.
  	 */
  var expectFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the fill mapping property for the current series object.
  	 */
  var fillMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush scale for the marker brush.
  	 */
  var fillScale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the value that maps to the maximum heat color.
  	 */
  var heatMaximum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the maximum heat color for the density scale.
  	 */
  var heatMaximumColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the density value that maps to the minimum heat color.
  	 */
  var heatMinimum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the minimum heat color for the density scale.
  	 */
  var heatMinimumColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var highMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets which type of highlight shape to use when highlighting items.
  	 *
  	 * Valid values:
  	 * "auto" use an automatic highlight type for this series.
  	 * "marker" use a marker highlight type for this series.
  	 * "shape" use a shape highlight type for this series.
  	 */
  var highlightType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets which type of hit testing the series should use.
  	 *
  	 * Valid values:
  	 * "auto" automatically decide the appropriate hit test mode for the series.
  	 * "computational" use a computational based approach to determine whether the series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
  	 * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
  	 */
  var hitTestMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether the horizontal crosshair portion of the layer should be visible.
  	 *
  	 * Valid values:
  	 * "visible" the horizontal crosshair portion of the layer should be visible.
  	 * "collapsed" the horizontal crosshair portion of the layer should not be visible.
  	 */
  var horizontalLineVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the number of values to hide at the beginning of the indicator.
  	 */
  var ignoreFirst: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether a custom category marker style is allowed. Setting this to true will case the assigningCategoryMarkerStyle event to get fired, if provided.
  	 */
  var isCustomCategoryMarkerStyleAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether a custom category style is allowed. Setting this to true will case the assigningCategoryStyle event to get fired, if provided.
  	 */
  var isCustomCategoryStyleAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets if the presence of this layer should disable the default crosshair behavior of the chart, if present.
  	 */
  var isDefaultCrosshairDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether drop shadow should be enabled for this series.
  	 */
  var isDropShadowEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether highlighting should be enabled for the series, if supported.
  	 */
  var isHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets if the series should play a transition in animation when the data source is assigned. Note: Transitions are not currently supported for stacked series.
  	 */
  var isTransitionInEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the Label mapping property for the current series object.
  	 */
  var labelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
  	 */
  var legend: js.UndefOr[IgDataChartSeriesLegend] = js.undefined
  /**
  	 * Gets or sets the LegendItemBadgeTemplate property.
  	 * The legend item badge is created according to the LegendItemBadgeTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure.
  	 * These are functions which will be called that will be called to handle the user specified custom rendering.
  	 * measure will be passed an object that looks like this:
  	 * {
  	 * context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 * width: [if value is present, specifies the available width, user may set to desired width for content],
  	 * height: [if value is present, specifies the available height, user may set to desired height for content],
  	 * isConstant: [user should set to true if desired with and height will always be the same for this template],
  	 * data: [if present, represents the contextual data for this template]
  	 * }
  	 * render will be passed an object that looks like this:
  	 * {
  	 * context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
  	 * xPosition: [if present, specifies the x position at which to render the content],
  	 * yPosition: [if present, specifies the y position at which to render the content],
  	 * availableWidth: [if present, specifies the available width in which to render the content],
  	 * availableHeight: [if present, specifies the available height in which to render the content],
  	 * data: [if present, specifies the data that is in context for this content],
  	 * isHitTestRender: [if true, indicates that this is a special render pass for hit testing, in which case the brushes from the data should be used]
  	 * }
  	 */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the LegendItemTemplate property.
  	 * The legend item control content is created according to the LegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the legend item visibility for the current series object.
  	 *
  	 * Valid values:
  	 * "visible" The legend item should be visible.
  	 * "collapsed" The legend item should not be visible.
  	 */
  var legendItemVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for long AVO periods is 30.
  	 */
  var longPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var lowMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush that specifies how the current series object's marker interiors are painted.
  	 */
  var markerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the MarkerCollisionAvoidance
  	 *
  	 * Valid values:
  	 * "none" No collision avoidance is attempted.
  	 * "omit" Markers that collide will be omitted.
  	 * "fade" Markers that collide will be faded in opacity.
  	 * "omitAndShift" Markers that collide may be shifted or omitted.
  	 */
  var markerCollisionAvoidance: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush that specifies how the current series object's marker outlines are painted.
  	 */
  var markerOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the MarkerTemplate for the current series object.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var markerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the marker type for the current series object. If the MarkerTemplate property is set, the setting of the MarkerType property will be ignored.
  	 *
  	 * Valid values:
  	 * "unset" Marker hasn't been set.
  	 * "none" No markerItems.
  	 * "automatic" Automatic marker shape.
  	 * "circle" Circle marker shape.
  	 * "triangle" Flat-top triangle marker shape.
  	 * "pyramid" Flat-base triangle marker shape.
  	 * "square" Square marker shape.
  	 * "diamond" Diamond marker shape.
  	 * "pentagon" Pentagon marker shape.
  	 * "hexagon" Hexagon marker shape.
  	 * "tetragram" Four-pointed star marker shape.
  	 * "pentagram" Five-pointed star marker shape.
  	 * "hexagram" Six-pointed star marker shape.
  	 */
  var markerType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the maximum number of markerItems displayed by the current series.
  	 * If more than the specified number of markerItems are visible, the series will automatically
  	 * choose a representative set.
  	 */
  var maximumMarkers: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether the chart reacts to mouse move events.
  	 */
  var mouseOverEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The unique identifier of the series.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for negative portions of the series.
  	 */
  var negativeBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the open mapping property for the current series object.
  	 */
  var openMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the series.
  	 * Some series types, such as LineSeries, do not display outlines.  Therefore, this property does not affect some charts.
  	 */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
  	 * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
  	 */
  var period: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether to progressively load the data into the chart.
  	 */
  var progressiveLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the corner radius to use for the series, if applicable.
  	 */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the effective radius axis for the current series object.
  	 */
  var radiusAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the radius mapping property for the current series object.
  	 */
  var radiusMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the radius size scale for the bubbles.
  	 */
  var radiusScale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var radiusX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the y-radius of the ellipse that is used to round the corners of the column.
  	 */
  var radiusY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set to true in order to have an existing series removed from the chart, by name
  	 */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the current series object's rendering resolution.
  	 */
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets whether the order of the fragment series should be reversed in the legend. Note: Reversing the legend order is only supported on stacked series.
  	 */
  var reverseLegendOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the series for stacked charts. It should contain array of series objects. Each item in array should represent a series with  and it may have most options supported by top-level series object, such as xAxis, yAxis, valueMemberPath, etc.
  	 */
  var series: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets or sets the blur amount to use for the drop shadow.
  	 */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the drop shadow.
  	 */
  var shadowColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the x offset amount to use for the drop shadow.
  	 */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the y offset amount to use for the drop shadow.
  	 */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for short AVO periods is 10.
  	 */
  var shortPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether the chart should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the hover layer should skip unknown values when trying to find the closest values.
  	 */
  var skipUnknownValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the type of spline to be rendered.
  	 *
  	 * Valid values:
  	 * "natural" Calculates the spline using a natural spline calculation formula.
  	 * "clamped" Calculated the spline using a clamped spline calculation formula.
  	 */
  var splineType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the name of the target axis for the layer, if desired. Setting the target axis will scope the layer to target just that axis.
  	 */
  var targetAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the name of the target series for the layer, if desired. Setting the target series will scope the layer to target just that series.
  	 */
  var targetSeries: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the width of the current series object's line thickness.
  	 */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the Title property.
  	 * The legend item control is created according to the Title on-demand by
  	 * the series object itself.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the Position to apply to the tooltip containers.
  	 *
  	 * Valid values:
  	 * "auto" use an automatic position for the category tooltips.
  	 * "outsideStart" position the category tooltip at the outside start of the value axis.
  	 * "insideStart" position the category tooltip at the inside start of the value axis.
  	 * "insideEnd" position the category tooltip at the inside end of the value axis.
  	 * "outsideEnd" position the category tooltip at the outside end of the value axis.
  	 */
  var tooltipPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the duration of the current series's morph.
  	 */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Provides an easing function to use for the transitions. This should either be a well known name of an easing function (The only currently supported name is cubic), or it should be a function that takes a number and returns the output with the function applied.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the duration of the current series's transition in morph in milliseconds.
  	 */
  var transitionInDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the method to transition in the series. Note: Transitions are not currently supported for stacked series.
  	 *
  	 * Valid values:
  	 * "auto" Series transitions in an automatically chosen way.
  	 * "fromZero" Series transitions in from the reference value of the value axis.
  	 * "sweepFromLeft" Series sweeps in from the left.
  	 * "sweepFromRight" Series sweeps in from the right.
  	 * "sweepFromTop" Series sweeps in from the top.
  	 * "sweepFromBottom" Series sweeps in from the bottom.
  	 * "sweepFromCenter" Series sweeps in from the center.
  	 * "accordionFromLeft" Series accordions in from the left.
  	 * "accordionFromRight" Series accordions in from the right.
  	 * "accordionFromTop" Series accordions in from the top.
  	 * "accordionFromBottom" Series accordions in from the bottom.
  	 * "expand" Series expands from the value midpoints.
  	 * "sweepFromCategoryAxisMinimum" Series sweeps in from the category axis minimum.
  	 * "sweepFromCategoryAxisMaximum" Series sweeps in from the category axis maximum.
  	 * "sweepFromValueAxisMinimum" Series sweeps in from the value axis minimum.
  	 * "sweepFromValueAxisMaximum" Series sweeps in from the value axis maximum.
  	 * "accordionFromCategoryAxisMinimum" Series accordions in from the category axis minimum.
  	 * "accordionFromCategoryAxisMaximum" Series accordions in from the category axis maximum.
  	 * "accordionFromValueAxisMinimum" Series accordions in from the value axis minimum.
  	 * "accordionFromValueAxisMaximum" Series accordions in from the value axis maximum.
  	 */
  var transitionInMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the speed to transition in the series data points.
  	 *
  	 * Valid values:
  	 * "auto" A speed type is automatically selected.
  	 * "normal" All speeds are normal, data points will arrive at the same time.
  	 * "valueScaled" Data points will arrive later if their value is further from the start point.
  	 * "indexScaled" Data points will arrive later if their index is further from the axis origin.
  	 * "random" Data points will arrive at random times.
  	 */
  var transitionInSpeedType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use to draw the trend line.
  	 */
  var trendLineBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the moving average period for the current scatter series object.
  	 * The typical, and initial, value for trend line period is 7.
  	 */
  var trendLinePeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the current scatter series object's trend line.
  	 */
  var trendLineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the trend type for the current scatter series.
  	 *
  	 * Valid values:
  	 * "none" No trendline should display.
  	 * "linearFit" Linear fit.
  	 * "quadraticFit" Quadratic polynomial fit.
  	 * "cubicFit" Cubic polynomial fit.
  	 * "quarticFit" Quartic polynomial fit.
  	 * "quinticFit" Quintic polynomial fit.
  	 * "logarithmicFit" Logarithmic fit.
  	 * "exponentialFit" Exponential fit.
  	 * "powerLawFit" Powerlaw fit.
  	 * "simpleAverage" Simple moving average.
  	 * "exponentialAverage" Exponential moving average.
  	 * "modifiedAverage" Modified moving average.
  	 * "cumulativeAverage" Cumulative moving average.
  	 * "weightedAverage" Weighted moving average.
  	 */
  var trendLineType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the Z-Index of the trend line.  Values greater than 1000 will result in the trend line being rendered in front of the series data.
  	 */
  var trendLineZIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Type of the series.
  	 *
  	 * Valid values:
  	 * "area" Specify the series as Area series.
  	 * "bar" Specify the series as Bar series.
  	 * "column" Specify the series as Column series.
  	 * "line" Specify the series as Line series.
  	 * "rangeArea" Specify the series as Range Area series.
  	 * "rangeColumn" Specify the series as Range Column series.
  	 * "splineArea" Specify the series as Spline Area series.
  	 * "spline" Specify the series as Spline series.
  	 * "stepArea" Specify the series as Step Area series.
  	 * "stepLine" Specify the series as Step Line series.
  	 * "waterfall" Specify the series as Waterfall series.
  	 * "financial" Specify the series as Financial series.
  	 * "typicalPriceIndicator" Specify the series as Typical Price Indicator series.
  	 * "point" Specify the series as Point series.
  	 * "polarSplineArea" Specify the series as Polar Spline Area series.
  	 * "polarSpline" Specify the series as Polar Spline series.
  	 * "polarArea" Specify the series as Polar Area series.
  	 * "polarLine" Specify the series as Polar Line series.
  	 * "polarScatter" Specify the series as Polar Scatter series.
  	 * "radialColumn" Specify the series as Radial Column series.
  	 * "radialLine" Specify the series as Radial Line series.
  	 * "radialPie" Specify the series as Radial Pie series.
  	 * "radialArea" Specify the series as Radial Area series.
  	 * "scatter" Specify the series as Scatter series.
  	 * "scatterLine" Specify the series as Scatter Line series.
  	 * "scatterSpline" Specify the series as Scatter Spline series.
  	 * "scatterArea" Specify the series as Scatter Area series.
  	 * "scatterContour" Specify the series as Scatter Contour series.
  	 * "scatterPolygon" Specify the series as Scatter Polygon series.
  	 * "scatterPolyline" Specify the series as Scatter Polyline series.
  	 * "bubble" Specify the series as Bubble series.
  	 * "absoluteVolumeOscillatorIndicator" Specify the series as Absolute Volume Oscillator Indicator series.
  	 * "averageTrueRangeIndicator" Specify the series as Average True Range Indicator series.
  	 * "accumulationDistributionIndicator" Specify the series as Accumulation Distribution Indicator series
  	 * "averageDirectionalIndexIndicator" Specify the series as Average Directional Index Indicator series.
  	 * "bollingerBandWidthIndicator" Specify the series as Bollinger Band Width Indicator series.
  	 * "chaikinOscillatorIndicator" Specify the series as Chaikin Oscillator Indicator series.
  	 * "chaikinVolatilityIndicator" Specify the series as Chaikin Volitility Indicator series.
  	 * "commodityChannelIndexIndicator" Specify the series as Commodity Channel Index Indicator series.
  	 * "detrendedPriceOscillatorIndicator" Specify the series as Detrended Price Oscillator Indicator series.
  	 * "easeOfMovementIndicator" Specify the series as Ease Of Movement Indicator series.
  	 * "fastStochasticOscillatorIndicator" Specify the series as Fast Stochastic Oscillator Indicator series.
  	 * "forceIndexIndicator" Specify the series as Force Index Indicator series.
  	 * "fullStochasticOscillatorIndicator" Specify the series as Full Stochastic Oscillator Indicator series.
  	 * "marketFacilitationIndexIndicator" Specify the series as Market Facilitation Index Indicator series.
  	 * "massIndexIndicator" Specify the series as Mass Index Indicator series.
  	 * "medianPriceIndicator" Specify the series as Median Price Indicator series.
  	 * "moneyFlowIndexIndicator" Specify the series as Money Flow Index Indicator series.
  	 * "movingAverageConvergenceDivergenceIndicator" Specify the series as Moving Average Convergence Divergence Indicator series.
  	 * "negativeVolumeIndexIndicator" Specify the series as Negative Volume Index Indicator series.
  	 * "onBalanceVolumeIndicator" Specify the series as On Balance Volume Indicator series.
  	 * "percentagePriceOscillatorIndicator" Specify the series as Percentage Price Oscillator Indicator series.
  	 * "percentageVolumeOscillatorIndicator" Specify the series as Percentage Volume Oscillator Indicator series.
  	 * "positiveVolumeIndexIndicator" Specify the series as Positive Volume Index Indicator series.
  	 * "priceVolumeTrendIndictor" Specify the series as Price Volume Trend Indictor series.
  	 * "rateOfChangeAndMomentumIndicator" Specify the series as Rate Of Change And Momentum Indicator series.
  	 * "relativeStrengthIndexIndicator" Specify the series as Relative Strength Index Indicator series.
  	 * "slowStochasticOscillatorIndicator" Specify the series as Slow Stochastic Oscillator Indicator series.
  	 * "standardDeviationIndicator" Specify the series as Standard Deviation Indicator series.
  	 * "stochRSIIndicator" Specify the series as Stoch RSI Indicator series.
  	 * "trixIndicator" Specify the series as Trix Indicator series.
  	 * "ultimateOscillatorIndicator" Specify the series as Ultimate Oscillator Indicator series.
  	 * "weightedCloseIndicator" Specify the series as Weighted Close Indicator series.
  	 * "williamsPercentRIndicator" Specify the series as Williams Percent R Indicator series.
  	 * "bollingerBandsOverlay" Specify the series as Bollinger Bands Overlay series.
  	 * "priceChannelOverlay" Specify the series as Price Channel Overlay series.
  	 * "customIndicator" Specify the series as Custom Indicator series.
  	 * "stackedBar" Specify the series as Stacked Bar series.
  	 * "stacked100Bar" Specify the series as Stacked 100 Bar series.
  	 * "stackedArea" Specify the series as Stacked Area series.
  	 * "stacked100Area" Specify the series as Stacked 100 Area series.
  	 * "stackedColumn" Specify the series as Stacked Column series.
  	 * "stacked100Column" Specify the series as Stacked 100 Column series.
  	 * "stackedLine" Specify the series as Stacked Line series.
  	 * "stacked100Line" Specify the series as Stacked 100 Line series.
  	 * "stackedSpline" Specify the series as Stacked Spline series.
  	 * "stacked100Spline" Specify the series as Stacked 100 Spline series.
  	 * "stackedSplineArea" Specify the series as Stacked Spline Area series.
  	 * "stacked100SplineArea" Specify the series as Stacked 100 Spline Area series.
  	 * "crosshairLayer" Specify the series as a crosshair layer.
  	 * "categoryHighlightLayer" Specify the series as a category highlight layer.
  	 * "categoryItemHighlightLayer" Specify the series as a category item highlight layer.
  	 * "itemToolTipLayer" Specify the series as an item tooltip layer.
  	 * "categoryToolTipLayer" Specify the series as a category tooltip layer.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines how unknown values will be plotted on the chart. Null and Double.NaN are two examples of unknown values.
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether to use use brute force mode.
  	 */
  var useBruteForce: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
  	 * spiral based interpolation.
  	 */
  var useCartesianInterpolation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets or Gets whether to increase marker fidelity for extreme data shapes that have lots of Y variation over short X intervals.
  	 */
  var useHighMarkerFidelity: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets if the current layer should take up a brush/ordering index in the series collection to derive its color automatically.
  	 */
  var useIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the hover layer should use interpolation to position itself relative the closest values.
  	 */
  var useInterpolation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets if the current layer should have an entry in the legend of the chart. By default annotation layers are not present in the legend.
  	 */
  var useLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether drop shadow is applied to the whole series visual or to each of the individual shapes forming the series.
  	 */
  var useSingleShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether to use squares when halting a render traversal rather than the shape of the coalesced area.
  	 */
  var useSquareCutoffStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the effective value axis for the current series object.
  	 */
  var valueAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the item path that provides the values for the current series.
  	 */
  var valueMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether the vertical crosshair portion of the layer should be visible.
  	 *
  	 * Valid values:
  	 * "visible" the vertical crosshair portion of the layer should be visible.
  	 * "collapsed" the vertical crosshair portion of the layer should not be visible.
  	 */
  var verticalLineVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the volume mapping property for the current series object.
  	 */
  var volumeMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the effective x-axis for the current object.
  	 */
  var xAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var xMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the effective y-axis for the current object.
  	 */
  var yAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var yMemberPath: js.UndefOr[java.lang.String] = js.undefined
}

