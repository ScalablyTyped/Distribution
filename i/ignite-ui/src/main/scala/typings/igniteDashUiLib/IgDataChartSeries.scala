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
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the axis annotation.
  	 */
  var axisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the color to use for the axis annotation backing. Leave unset for an automatic value.
  	 */
  var axisAnnotationBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var axisAnnotationInterpolatedValuePrecision: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the axis annotation outline. Leave unset for an automatic value.
  	 */
  var axisAnnotationOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingBottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingRight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the top padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var axisAnnotationPaddingTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness for the axis annotation backing. Leave unset for an automatic value.
  	 */
  var axisAnnotationStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the axis annotation text. Leave unset for an automatic value.
  	 */
  var axisAnnotationTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the width to use for the highlight region if highlighting items in a grid aligned series (line, spline, etc), with a banded shape.
  	 */
  var bandHighlightWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the series.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush that specifies how the backgrounds for the callouts of the layer are painted.
  	 */
  var calloutBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the strategy to use for avoiding collisions between the callouts in this layer. Leave unset for an automatic value.
  	 *
  	 * Valid values:
  	 * "auto" automatically decide the collision strategy.
  	 * "simulatedAnnealing" use a simulated annealing based collision strategy. This is higher quality, but takes longer, and is performed time-sliced in the background until an acceptable quality is reached.
  	 * "greedy" use a greedy algorithm to avoid collisions. This is cheap and predictable, but of comparatively low quality.
  	 * "greedyCenterOfMass" use a greedy algorithm with localized center of mass hints to avoid collisions. This is relatively cheap to perform, compared to the simulated annealing approach, but is of comparatively lower quality.
  	 */
  var calloutCollisionMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets a function which allows you to decide upon the content that gets used for an automatically created callout.
  	 */
  var calloutContentUpdating: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets or gets a function which allows you to decide upon the label that gets used for an automatically created callout.
  	 */
  var calloutLabelUpdating: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the brush that specifies how the leader lines for the callouts of the layer are painted.
  	 */
  var calloutLeaderBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush that specifies how the outlines for the callouts of the layer are painted.
  	 */
  var calloutOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingBottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingRight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the top padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPaddingTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the padding to add to the callout positioning. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var calloutPositionPadding: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets a function which allows you to decide upon the series that gets used for a data bound callout.
  	 */
  var calloutSeriesSelecting: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the stroke thickness for the callout backing. Leave unset for an automatic value.
  	 */
  var calloutStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the callout text. Leave unset for an automatic value.
  	 */
  var calloutTextColor: js.UndefOr[java.lang.String] = js.undefined
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
  	 * "median" Consolidated items will be positioned at the midpoint of the range.
  	 * "relativeMinimum" Consolidated items will be positioned using the value nearest to the reference value of the corresponding axis.
  	 * "relativeMaximum" Consolidated items will be positioned using the value farthest from the reference value of the corresponding axis.
  	 */
  var consolidatedColumnVerticalPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the content mapping property for the callouts.
  	 */
  var contentMemberPath: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
  	 *
  	 * Valid values:
  	 * "auto" a mode is selected automatically
  	 * "finalVisible" displays the last value visible.
  	 * "finalVisibleInterpolated" displays an interploated last value for when the series leaves view.
  	 * "final" displays the last value in the series, whether visible or not.
  	 */
  var finalValueSelectionMode: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the color to use for the horizontal line. Leave null for an automatic value.
  	 */
  var horizontalLineStroke: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets whether to draw annotations over the axes where the crosshair meets with them.
  	 */
  var isAxisAnnotationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether to allow the callouts to be variable distances from the target points, for suppporting collision modes.
  	 */
  var isCalloutOffsettingEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  	 * Gets or sets the key mapping property for the callouts.
  	 */
  var keyMemberPath: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the color to use for the vertical line. Leave null for an automatic value.
  	 */
  var verticalLineStroke: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the x axis annotation.
  	 */
  var xAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the color to use for the x axis annotation backing. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var xAxisAnnotationInterpolatedValuePrecision: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the x axis annotation outline. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingBottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingRight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the top padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var xAxisAnnotationPaddingTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness for the x axis annotation backing. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the x axis annotation text. Leave unset for an automatic value.
  	 */
  var xAxisAnnotationTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var xMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the effective y-axis for the current object.
  	 */
  var yAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the y axis annotation.
  	 */
  var yAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the color to use for the y axis annotation backing. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the precision to use displaying values for interpolated crosshair positions.
  	 */
  var yAxisAnnotationInterpolatedValuePrecision: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the y axis annotation outline. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingBottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingLeft: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingRight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the top padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
  	 */
  var yAxisAnnotationPaddingTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to use for the y axis annotation text. Leave unset for an automatic value.
  	 */
  var yAxisAnnotationTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var yMemberPath: js.UndefOr[java.lang.String] = js.undefined
}

object IgDataChartSeries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDataChartSeries
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    angleAxis: java.lang.String = null,
    angleMemberPath: scala.Int | scala.Double = null,
    areaFillOpacity: scala.Int | scala.Double = null,
    axisAnnoationFormatLabel: js.Any = null,
    axisAnnotationBackground: java.lang.String = null,
    axisAnnotationInterpolatedValuePrecision: scala.Int | scala.Double = null,
    axisAnnotationOutline: java.lang.String = null,
    axisAnnotationPaddingBottom: scala.Int | scala.Double = null,
    axisAnnotationPaddingLeft: scala.Int | scala.Double = null,
    axisAnnotationPaddingRight: scala.Int | scala.Double = null,
    axisAnnotationPaddingTop: scala.Int | scala.Double = null,
    axisAnnotationStrokeThickness: scala.Int | scala.Double = null,
    axisAnnotationTextColor: java.lang.String = null,
    bandHighlightWidth: scala.Int | scala.Double = null,
    brush: java.lang.String = null,
    calloutBackground: java.lang.String = null,
    calloutCollisionMode: java.lang.String = null,
    calloutContentUpdating: js.Any = null,
    calloutLabelUpdating: js.Any = null,
    calloutLeaderBrush: java.lang.String = null,
    calloutOutline: java.lang.String = null,
    calloutPaddingBottom: scala.Int | scala.Double = null,
    calloutPaddingLeft: scala.Int | scala.Double = null,
    calloutPaddingRight: scala.Int | scala.Double = null,
    calloutPaddingTop: scala.Int | scala.Double = null,
    calloutPositionPadding: scala.Int | scala.Double = null,
    calloutSeriesSelecting: js.Any = null,
    calloutStrokeThickness: scala.Int | scala.Double = null,
    calloutTextColor: java.lang.String = null,
    clipSeriesToBounds: js.UndefOr[scala.Boolean] = js.undefined,
    closeMemberPath: java.lang.String = null,
    coercionMethods: js.Any = null,
    consolidatedColumnVerticalPosition: java.lang.String = null,
    contentMemberPath: java.lang.String = null,
    cursorPosition: js.Any = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    discreteLegendItemTemplate: js.Any = null,
    displayType: java.lang.String = null,
    expectFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    fillMemberPath: java.lang.String = null,
    fillScale: js.Any = null,
    finalValueSelectionMode: java.lang.String = null,
    heatMaximum: scala.Int | scala.Double = null,
    heatMaximumColor: js.Any = null,
    heatMinimum: scala.Int | scala.Double = null,
    heatMinimumColor: js.Any = null,
    highMemberPath: java.lang.String = null,
    highlightType: java.lang.String = null,
    hitTestMode: java.lang.String = null,
    horizontalLineStroke: java.lang.String = null,
    horizontalLineVisibility: java.lang.String = null,
    ignoreFirst: scala.Int | scala.Double = null,
    isAxisAnnotationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isCalloutOffsettingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isCustomCategoryMarkerStyleAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    isCustomCategoryStyleAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    isDefaultCrosshairDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isDropShadowEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isTransitionInEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    keyMemberPath: java.lang.String = null,
    labelMemberPath: java.lang.String = null,
    legend: IgDataChartSeriesLegend = null,
    legendItemBadgeTemplate: js.Any = null,
    legendItemTemplate: js.Any = null,
    legendItemVisibility: java.lang.String = null,
    longPeriod: scala.Int | scala.Double = null,
    lowMemberPath: java.lang.String = null,
    markerBrush: java.lang.String = null,
    markerCollisionAvoidance: java.lang.String = null,
    markerOutline: java.lang.String = null,
    markerTemplate: js.Any = null,
    markerType: java.lang.String = null,
    maximumMarkers: scala.Int | scala.Double = null,
    mouseOverEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    negativeBrush: java.lang.String = null,
    openMemberPath: java.lang.String = null,
    outline: java.lang.String = null,
    period: scala.Int | scala.Double = null,
    progressiveLoad: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    radiusAxis: java.lang.String = null,
    radiusMemberPath: java.lang.String = null,
    radiusScale: js.Any = null,
    radiusX: scala.Int | scala.Double = null,
    radiusY: scala.Int | scala.Double = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    resolution: scala.Int | scala.Double = null,
    responseDataKey: java.lang.String = null,
    reverseLegendOrder: js.UndefOr[scala.Boolean] = js.undefined,
    series: js.Array[_] = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: js.Any = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    shortPeriod: scala.Int | scala.Double = null,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    skipUnknownValues: js.UndefOr[scala.Boolean] = js.undefined,
    splineType: java.lang.String = null,
    targetAxis: java.lang.String = null,
    targetSeries: java.lang.String = null,
    thickness: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    tooltipPosition: java.lang.String = null,
    tooltipTemplate: java.lang.String = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEasingFunction: js.Any = null,
    transitionInDuration: scala.Int | scala.Double = null,
    transitionInMode: java.lang.String = null,
    transitionInSpeedType: java.lang.String = null,
    trendLineBrush: java.lang.String = null,
    trendLinePeriod: scala.Int | scala.Double = null,
    trendLineThickness: scala.Int | scala.Double = null,
    trendLineType: java.lang.String = null,
    trendLineZIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    unknownValuePlotting: java.lang.String = null,
    useBruteForce: js.UndefOr[scala.Boolean] = js.undefined,
    useCartesianInterpolation: js.UndefOr[scala.Boolean] = js.undefined,
    useHighMarkerFidelity: js.UndefOr[scala.Boolean] = js.undefined,
    useIndex: js.UndefOr[scala.Boolean] = js.undefined,
    useInterpolation: js.UndefOr[scala.Boolean] = js.undefined,
    useLegend: js.UndefOr[scala.Boolean] = js.undefined,
    useSingleShadow: js.UndefOr[scala.Boolean] = js.undefined,
    useSquareCutoffStyle: js.UndefOr[scala.Boolean] = js.undefined,
    valueAxis: java.lang.String = null,
    valueMemberPath: java.lang.String = null,
    verticalLineStroke: java.lang.String = null,
    verticalLineVisibility: java.lang.String = null,
    volumeMemberPath: java.lang.String = null,
    xAxis: java.lang.String = null,
    xAxisAnnoationFormatLabel: js.Any = null,
    xAxisAnnotationBackground: java.lang.String = null,
    xAxisAnnotationInterpolatedValuePrecision: scala.Int | scala.Double = null,
    xAxisAnnotationOutline: java.lang.String = null,
    xAxisAnnotationPaddingBottom: scala.Int | scala.Double = null,
    xAxisAnnotationPaddingLeft: scala.Int | scala.Double = null,
    xAxisAnnotationPaddingRight: scala.Int | scala.Double = null,
    xAxisAnnotationPaddingTop: scala.Int | scala.Double = null,
    xAxisAnnotationStrokeThickness: scala.Int | scala.Double = null,
    xAxisAnnotationTextColor: java.lang.String = null,
    xMemberPath: java.lang.String = null,
    yAxis: java.lang.String = null,
    yAxisAnnoationFormatLabel: js.Any = null,
    yAxisAnnotationBackground: java.lang.String = null,
    yAxisAnnotationInterpolatedValuePrecision: scala.Int | scala.Double = null
  ): IgDataChartSeries = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (angleAxis != null) __obj.updateDynamic("angleAxis")(angleAxis)
    if (angleMemberPath != null) __obj.updateDynamic("angleMemberPath")(angleMemberPath.asInstanceOf[js.Any])
    if (areaFillOpacity != null) __obj.updateDynamic("areaFillOpacity")(areaFillOpacity.asInstanceOf[js.Any])
    if (axisAnnoationFormatLabel != null) __obj.updateDynamic("axisAnnoationFormatLabel")(axisAnnoationFormatLabel)
    if (axisAnnotationBackground != null) __obj.updateDynamic("axisAnnotationBackground")(axisAnnotationBackground)
    if (axisAnnotationInterpolatedValuePrecision != null) __obj.updateDynamic("axisAnnotationInterpolatedValuePrecision")(axisAnnotationInterpolatedValuePrecision.asInstanceOf[js.Any])
    if (axisAnnotationOutline != null) __obj.updateDynamic("axisAnnotationOutline")(axisAnnotationOutline)
    if (axisAnnotationPaddingBottom != null) __obj.updateDynamic("axisAnnotationPaddingBottom")(axisAnnotationPaddingBottom.asInstanceOf[js.Any])
    if (axisAnnotationPaddingLeft != null) __obj.updateDynamic("axisAnnotationPaddingLeft")(axisAnnotationPaddingLeft.asInstanceOf[js.Any])
    if (axisAnnotationPaddingRight != null) __obj.updateDynamic("axisAnnotationPaddingRight")(axisAnnotationPaddingRight.asInstanceOf[js.Any])
    if (axisAnnotationPaddingTop != null) __obj.updateDynamic("axisAnnotationPaddingTop")(axisAnnotationPaddingTop.asInstanceOf[js.Any])
    if (axisAnnotationStrokeThickness != null) __obj.updateDynamic("axisAnnotationStrokeThickness")(axisAnnotationStrokeThickness.asInstanceOf[js.Any])
    if (axisAnnotationTextColor != null) __obj.updateDynamic("axisAnnotationTextColor")(axisAnnotationTextColor)
    if (bandHighlightWidth != null) __obj.updateDynamic("bandHighlightWidth")(bandHighlightWidth.asInstanceOf[js.Any])
    if (brush != null) __obj.updateDynamic("brush")(brush)
    if (calloutBackground != null) __obj.updateDynamic("calloutBackground")(calloutBackground)
    if (calloutCollisionMode != null) __obj.updateDynamic("calloutCollisionMode")(calloutCollisionMode)
    if (calloutContentUpdating != null) __obj.updateDynamic("calloutContentUpdating")(calloutContentUpdating)
    if (calloutLabelUpdating != null) __obj.updateDynamic("calloutLabelUpdating")(calloutLabelUpdating)
    if (calloutLeaderBrush != null) __obj.updateDynamic("calloutLeaderBrush")(calloutLeaderBrush)
    if (calloutOutline != null) __obj.updateDynamic("calloutOutline")(calloutOutline)
    if (calloutPaddingBottom != null) __obj.updateDynamic("calloutPaddingBottom")(calloutPaddingBottom.asInstanceOf[js.Any])
    if (calloutPaddingLeft != null) __obj.updateDynamic("calloutPaddingLeft")(calloutPaddingLeft.asInstanceOf[js.Any])
    if (calloutPaddingRight != null) __obj.updateDynamic("calloutPaddingRight")(calloutPaddingRight.asInstanceOf[js.Any])
    if (calloutPaddingTop != null) __obj.updateDynamic("calloutPaddingTop")(calloutPaddingTop.asInstanceOf[js.Any])
    if (calloutPositionPadding != null) __obj.updateDynamic("calloutPositionPadding")(calloutPositionPadding.asInstanceOf[js.Any])
    if (calloutSeriesSelecting != null) __obj.updateDynamic("calloutSeriesSelecting")(calloutSeriesSelecting)
    if (calloutStrokeThickness != null) __obj.updateDynamic("calloutStrokeThickness")(calloutStrokeThickness.asInstanceOf[js.Any])
    if (calloutTextColor != null) __obj.updateDynamic("calloutTextColor")(calloutTextColor)
    if (!js.isUndefined(clipSeriesToBounds)) __obj.updateDynamic("clipSeriesToBounds")(clipSeriesToBounds)
    if (closeMemberPath != null) __obj.updateDynamic("closeMemberPath")(closeMemberPath)
    if (coercionMethods != null) __obj.updateDynamic("coercionMethods")(coercionMethods)
    if (consolidatedColumnVerticalPosition != null) __obj.updateDynamic("consolidatedColumnVerticalPosition")(consolidatedColumnVerticalPosition)
    if (contentMemberPath != null) __obj.updateDynamic("contentMemberPath")(contentMemberPath)
    if (cursorPosition != null) __obj.updateDynamic("cursorPosition")(cursorPosition)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (discreteLegendItemTemplate != null) __obj.updateDynamic("discreteLegendItemTemplate")(discreteLegendItemTemplate)
    if (displayType != null) __obj.updateDynamic("displayType")(displayType)
    if (!js.isUndefined(expectFunctions)) __obj.updateDynamic("expectFunctions")(expectFunctions)
    if (fillMemberPath != null) __obj.updateDynamic("fillMemberPath")(fillMemberPath)
    if (fillScale != null) __obj.updateDynamic("fillScale")(fillScale)
    if (finalValueSelectionMode != null) __obj.updateDynamic("finalValueSelectionMode")(finalValueSelectionMode)
    if (heatMaximum != null) __obj.updateDynamic("heatMaximum")(heatMaximum.asInstanceOf[js.Any])
    if (heatMaximumColor != null) __obj.updateDynamic("heatMaximumColor")(heatMaximumColor)
    if (heatMinimum != null) __obj.updateDynamic("heatMinimum")(heatMinimum.asInstanceOf[js.Any])
    if (heatMinimumColor != null) __obj.updateDynamic("heatMinimumColor")(heatMinimumColor)
    if (highMemberPath != null) __obj.updateDynamic("highMemberPath")(highMemberPath)
    if (highlightType != null) __obj.updateDynamic("highlightType")(highlightType)
    if (hitTestMode != null) __obj.updateDynamic("hitTestMode")(hitTestMode)
    if (horizontalLineStroke != null) __obj.updateDynamic("horizontalLineStroke")(horizontalLineStroke)
    if (horizontalLineVisibility != null) __obj.updateDynamic("horizontalLineVisibility")(horizontalLineVisibility)
    if (ignoreFirst != null) __obj.updateDynamic("ignoreFirst")(ignoreFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(isAxisAnnotationEnabled)) __obj.updateDynamic("isAxisAnnotationEnabled")(isAxisAnnotationEnabled)
    if (!js.isUndefined(isCalloutOffsettingEnabled)) __obj.updateDynamic("isCalloutOffsettingEnabled")(isCalloutOffsettingEnabled)
    if (!js.isUndefined(isCustomCategoryMarkerStyleAllowed)) __obj.updateDynamic("isCustomCategoryMarkerStyleAllowed")(isCustomCategoryMarkerStyleAllowed)
    if (!js.isUndefined(isCustomCategoryStyleAllowed)) __obj.updateDynamic("isCustomCategoryStyleAllowed")(isCustomCategoryStyleAllowed)
    if (!js.isUndefined(isDefaultCrosshairDisabled)) __obj.updateDynamic("isDefaultCrosshairDisabled")(isDefaultCrosshairDisabled)
    if (!js.isUndefined(isDropShadowEnabled)) __obj.updateDynamic("isDropShadowEnabled")(isDropShadowEnabled)
    if (!js.isUndefined(isHighlightingEnabled)) __obj.updateDynamic("isHighlightingEnabled")(isHighlightingEnabled)
    if (!js.isUndefined(isTransitionInEnabled)) __obj.updateDynamic("isTransitionInEnabled")(isTransitionInEnabled)
    if (keyMemberPath != null) __obj.updateDynamic("keyMemberPath")(keyMemberPath)
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemBadgeTemplate != null) __obj.updateDynamic("legendItemBadgeTemplate")(legendItemBadgeTemplate)
    if (legendItemTemplate != null) __obj.updateDynamic("legendItemTemplate")(legendItemTemplate)
    if (legendItemVisibility != null) __obj.updateDynamic("legendItemVisibility")(legendItemVisibility)
    if (longPeriod != null) __obj.updateDynamic("longPeriod")(longPeriod.asInstanceOf[js.Any])
    if (lowMemberPath != null) __obj.updateDynamic("lowMemberPath")(lowMemberPath)
    if (markerBrush != null) __obj.updateDynamic("markerBrush")(markerBrush)
    if (markerCollisionAvoidance != null) __obj.updateDynamic("markerCollisionAvoidance")(markerCollisionAvoidance)
    if (markerOutline != null) __obj.updateDynamic("markerOutline")(markerOutline)
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate)
    if (markerType != null) __obj.updateDynamic("markerType")(markerType)
    if (maximumMarkers != null) __obj.updateDynamic("maximumMarkers")(maximumMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseOverEnabled)) __obj.updateDynamic("mouseOverEnabled")(mouseOverEnabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negativeBrush != null) __obj.updateDynamic("negativeBrush")(negativeBrush)
    if (openMemberPath != null) __obj.updateDynamic("openMemberPath")(openMemberPath)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveLoad)) __obj.updateDynamic("progressiveLoad")(progressiveLoad)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusAxis != null) __obj.updateDynamic("radiusAxis")(radiusAxis)
    if (radiusMemberPath != null) __obj.updateDynamic("radiusMemberPath")(radiusMemberPath)
    if (radiusScale != null) __obj.updateDynamic("radiusScale")(radiusScale)
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (!js.isUndefined(reverseLegendOrder)) __obj.updateDynamic("reverseLegendOrder")(reverseLegendOrder)
    if (series != null) __obj.updateDynamic("series")(series)
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (shortPeriod != null) __obj.updateDynamic("shortPeriod")(shortPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (!js.isUndefined(skipUnknownValues)) __obj.updateDynamic("skipUnknownValues")(skipUnknownValues)
    if (splineType != null) __obj.updateDynamic("splineType")(splineType)
    if (targetAxis != null) __obj.updateDynamic("targetAxis")(targetAxis)
    if (targetSeries != null) __obj.updateDynamic("targetSeries")(targetSeries)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction)
    if (transitionInDuration != null) __obj.updateDynamic("transitionInDuration")(transitionInDuration.asInstanceOf[js.Any])
    if (transitionInMode != null) __obj.updateDynamic("transitionInMode")(transitionInMode)
    if (transitionInSpeedType != null) __obj.updateDynamic("transitionInSpeedType")(transitionInSpeedType)
    if (trendLineBrush != null) __obj.updateDynamic("trendLineBrush")(trendLineBrush)
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType)
    if (trendLineZIndex != null) __obj.updateDynamic("trendLineZIndex")(trendLineZIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting)
    if (!js.isUndefined(useBruteForce)) __obj.updateDynamic("useBruteForce")(useBruteForce)
    if (!js.isUndefined(useCartesianInterpolation)) __obj.updateDynamic("useCartesianInterpolation")(useCartesianInterpolation)
    if (!js.isUndefined(useHighMarkerFidelity)) __obj.updateDynamic("useHighMarkerFidelity")(useHighMarkerFidelity)
    if (!js.isUndefined(useIndex)) __obj.updateDynamic("useIndex")(useIndex)
    if (!js.isUndefined(useInterpolation)) __obj.updateDynamic("useInterpolation")(useInterpolation)
    if (!js.isUndefined(useLegend)) __obj.updateDynamic("useLegend")(useLegend)
    if (!js.isUndefined(useSingleShadow)) __obj.updateDynamic("useSingleShadow")(useSingleShadow)
    if (!js.isUndefined(useSquareCutoffStyle)) __obj.updateDynamic("useSquareCutoffStyle")(useSquareCutoffStyle)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    if (verticalLineStroke != null) __obj.updateDynamic("verticalLineStroke")(verticalLineStroke)
    if (verticalLineVisibility != null) __obj.updateDynamic("verticalLineVisibility")(verticalLineVisibility)
    if (volumeMemberPath != null) __obj.updateDynamic("volumeMemberPath")(volumeMemberPath)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisAnnoationFormatLabel != null) __obj.updateDynamic("xAxisAnnoationFormatLabel")(xAxisAnnoationFormatLabel)
    if (xAxisAnnotationBackground != null) __obj.updateDynamic("xAxisAnnotationBackground")(xAxisAnnotationBackground)
    if (xAxisAnnotationInterpolatedValuePrecision != null) __obj.updateDynamic("xAxisAnnotationInterpolatedValuePrecision")(xAxisAnnotationInterpolatedValuePrecision.asInstanceOf[js.Any])
    if (xAxisAnnotationOutline != null) __obj.updateDynamic("xAxisAnnotationOutline")(xAxisAnnotationOutline)
    if (xAxisAnnotationPaddingBottom != null) __obj.updateDynamic("xAxisAnnotationPaddingBottom")(xAxisAnnotationPaddingBottom.asInstanceOf[js.Any])
    if (xAxisAnnotationPaddingLeft != null) __obj.updateDynamic("xAxisAnnotationPaddingLeft")(xAxisAnnotationPaddingLeft.asInstanceOf[js.Any])
    if (xAxisAnnotationPaddingRight != null) __obj.updateDynamic("xAxisAnnotationPaddingRight")(xAxisAnnotationPaddingRight.asInstanceOf[js.Any])
    if (xAxisAnnotationPaddingTop != null) __obj.updateDynamic("xAxisAnnotationPaddingTop")(xAxisAnnotationPaddingTop.asInstanceOf[js.Any])
    if (xAxisAnnotationStrokeThickness != null) __obj.updateDynamic("xAxisAnnotationStrokeThickness")(xAxisAnnotationStrokeThickness.asInstanceOf[js.Any])
    if (xAxisAnnotationTextColor != null) __obj.updateDynamic("xAxisAnnotationTextColor")(xAxisAnnotationTextColor)
    if (xMemberPath != null) __obj.updateDynamic("xMemberPath")(xMemberPath)
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisAnnoationFormatLabel != null) __obj.updateDynamic("yAxisAnnoationFormatLabel")(yAxisAnnoationFormatLabel)
    if (yAxisAnnotationBackground != null) __obj.updateDynamic("yAxisAnnotationBackground")(yAxisAnnotationBackground)
    if (yAxisAnnotationInterpolatedValuePrecision != null) __obj.updateDynamic("yAxisAnnotationInterpolatedValuePrecision")(yAxisAnnotationInterpolatedValuePrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChartSeries]
  }
}

