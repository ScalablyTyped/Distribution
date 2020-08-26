package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChartSeries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets the effective angle axis for the current series object.
    */
  var angleAxis: js.UndefOr[String] = js.native
  /**
    * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
    */
  var angleMemberPath: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the opacity modifier to apply to the area fill shape of the series, if applicable.
    */
  var areaFillOpacity: js.UndefOr[Double] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the axis annotation.
    */
  var axisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the color to use for the axis annotation backing. Leave unset for an automatic value.
    */
  var axisAnnotationBackground: js.UndefOr[String] = js.native
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var axisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the axis annotation outline. Leave unset for an automatic value.
    */
  var axisAnnotationOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the bottom padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the left padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the right padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the top padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness for the axis annotation backing. Leave unset for an automatic value.
    */
  var axisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the axis annotation text. Leave unset for an automatic value.
    */
  var axisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets the width to use for the highlight region if highlighting items in a grid aligned series (line, spline, etc), with a banded shape.
    */
  var bandHighlightWidth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the series.
    */
  var brush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush that specifies how the backgrounds for the callouts of the layer are painted.
    */
  var calloutBackground: js.UndefOr[String] = js.native
  /**
    * Gets or sets the strategy to use for avoiding collisions between the callouts in this layer. Leave unset for an automatic value.
    *
    * Valid values:
    * "auto" automatically decide the collision strategy.
    * "simulatedAnnealing" use a simulated annealing based collision strategy. This is higher quality, but takes longer, and is performed time-sliced in the background until an acceptable quality is reached.
    * "greedy" use a greedy algorithm to avoid collisions. This is cheap and predictable, but of comparatively low quality.
    * "greedyCenterOfMass" use a greedy algorithm with localized center of mass hints to avoid collisions. This is relatively cheap to perform, compared to the simulated annealing approach, but is of comparatively lower quality.
    */
  var calloutCollisionMode: js.UndefOr[String] = js.native
  /**
    * Sets or gets a function which lets you modify or provide the content for an automatically created callout.
    */
  var calloutContentUpdating: js.UndefOr[js.Any] = js.native
  /**
    * Sets or gets a function which lets you modify or provide the label for an automatically created callout.
    */
  var calloutLabelUpdating: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the brush that specifies how the leader lines for the callouts of the layer are painted.
    */
  var calloutLeaderBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush that specifies how the outlines for the callouts of the layer are painted.
    */
  var calloutOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the bottom padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingBottom: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the left padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingLeft: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the right padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingRight: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the top padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingTop: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the padding to add to the callout positioning. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPositionPadding: js.UndefOr[Double] = js.native
  /**
    * Sets or gets a function which lets you modify or provide the associated series for a data source provided callout.
    */
  var calloutSeriesSelecting: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the stroke thickness for the callout backing. Leave unset for an automatic value.
    */
  var calloutStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the callout text. Leave unset for an automatic value.
    */
  var calloutTextColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether to clip the series to the bounds.
    * Setting this to true can effect performance.
    */
  var clipSeriesToBounds: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the close mapping property for the current series object.
    */
  var closeMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or gets the coercion methods to use when loading data from data sources.
    * Should be specified before setting any member paths, if being used. Setting it later
    * will not cause data to be reimported into the chart.
    */
  var coercionMethods: js.UndefOr[js.Any] = js.native
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
  var consolidatedColumnVerticalPosition: js.UndefOr[String] = js.native
  /**
    * Gets or sets the content mapping property for the callouts.
    */
  var contentMemberPath: js.UndefOr[String] = js.native
  /**
    * Sets the position a cursor position to use instead of the current mouse cursor position for displaying the annotations in this layer.
    * Should be an object with an x and a y property in world coordinates (ranging from 0 to 1)
    */
  var cursorPosition: js.UndefOr[js.Any] = js.native
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Gets or sets the DiscreteLegendItemTemplate property.
    * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
    * the series object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the display for the current FinancialIndicator object.
    *
    * Valid values:
    * "candlestick" Displays prices as a Japanese Candlestick.
    * "OHLC" Displays prices as an OHLC bar.
    */
  var displayType: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether the series should expect that its data source members need to be called as functions to get their values.
    */
  var expectFunctions: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the fill mapping property for the current series object.
    */
  var fillMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush scale for the marker brush.
    */
  var fillScale: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
    *
    * Valid values:
    * "auto" a mode is selected automatically
    * "finalVisible" displays the last value visible.
    * "finalVisibleInterpolated" displays an interploated last value for when the series leaves view.
    * "final" displays the last value in the series, whether visible or not.
    */
  var finalValueSelectionMode: js.UndefOr[String] = js.native
  /**
    * Gets or sets the value that maps to the maximum heat color.
    */
  var heatMaximum: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the maximum heat color for the density scale.
    */
  var heatMaximumColor: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the density value that maps to the minimum heat color.
    */
  var heatMinimum: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the minimum heat color for the density scale.
    */
  var heatMinimumColor: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var highMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets which type of highlight shape to use when highlighting items.
    *
    * Valid values:
    * "auto" use an automatic highlight type for this series.
    * "marker" use a marker highlight type for this series.
    * "shape" use a shape highlight type for this series.
    */
  var highlightType: js.UndefOr[String] = js.native
  /**
    * Gets or sets which type of hit testing the series should use.
    *
    * Valid values:
    * "auto" automatically decide the appropriate hit test mode for the series.
    * "computational" use a computational based approach to determine whether the series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
    * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
    */
  var hitTestMode: js.UndefOr[String] = js.native
  /**
    * Gets or sets the color to use for the horizontal line. Leave null for an automatic value.
    */
  var horizontalLineStroke: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether the horizontal crosshair portion of the layer should be visible.
    *
    * Valid values:
    * "visible" the horizontal crosshair portion of the layer should be visible.
    * "collapsed" the horizontal crosshair portion of the layer should not be visible.
    */
  var horizontalLineVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the number of values to hide at the beginning of the indicator.
    */
  var ignoreFirst: js.UndefOr[Double] = js.native
  /**
    * Gets or sets whether to draw annotations over the axes where the crosshair meets with them.
    */
  var isAxisAnnotationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether to allow the callouts to be variable distances from the target points, for suppporting collision modes.
    */
  var isCalloutOffsettingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether a custom category marker style is allowed. Setting this to true will case the assigningCategoryMarkerStyle event to get fired, if provided.
    */
  var isCustomCategoryMarkerStyleAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether a custom category style is allowed. Setting this to true will case the assigningCategoryStyle event to get fired, if provided.
    */
  var isCustomCategoryStyleAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Sets if the presence of this layer should disable the default crosshair behavior of the chart, if present.
    */
  var isDefaultCrosshairDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether drop shadow should be enabled for this series.
    */
  var isDropShadowEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether highlighting should be enabled for the series, if supported.
    */
  var isHighlightingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets if the series should play a transition in animation when the data source is assigned. Note: Transitions are not currently supported for stacked series.
    */
  var isTransitionInEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the key mapping property for the callouts.
    */
  var keyMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the Label mapping property for the current series object.
    */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
    * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
    */
  var legend: js.UndefOr[IgDataChartSeriesLegend] = js.native
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
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the LegendItemTemplate property.
    * The legend item control content is created according to the LegendItemTemplate on-demand by
    * the series object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var legendItemTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the legend item visibility for the current series object.
    *
    * Valid values:
    * "visible" The legend item should be visible.
    * "collapsed" The legend item should not be visible.
    */
  var legendItemVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for long AVO periods is 30.
    */
  var longPeriod: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var lowMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush that specifies how the current series object's marker interiors are painted.
    */
  var markerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the MarkerCollisionAvoidance
    *
    * Valid values:
    * "none" No collision avoidance is attempted.
    * "omit" Markers that collide will be omitted.
    * "fade" Markers that collide will be faded in opacity.
    * "omitAndShift" Markers that collide may be shifted or omitted.
    */
  var markerCollisionAvoidance: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush that specifies how the current series object's marker outlines are painted.
    */
  var markerOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the MarkerTemplate for the current series object.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var markerTemplate: js.UndefOr[js.Any] = js.native
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
  var markerType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the maximum number of markerItems displayed by the current series.
    * If more than the specified number of markerItems are visible, the series will automatically
    * choose a representative set.
    */
  var maximumMarkers: js.UndefOr[Double] = js.native
  /**
    * Gets or sets whether the chart reacts to mouse move events.
    */
  var mouseOverEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier of the series.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush to use for negative portions of the series.
    */
  var negativeBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the open mapping property for the current series object.
    */
  var openMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush to use for the outline of the series.
    * Some series types, such as LineSeries, do not display outlines.  Therefore, this property does not affect some charts.
    */
  var outline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
    * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * Gets or sets whether to progressively load the data into the chart.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the corner radius to use for the series, if applicable.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Gets the effective radius axis for the current series object.
    */
  var radiusAxis: js.UndefOr[String] = js.native
  /**
    * Gets or sets the radius mapping property for the current series object.
    */
  var radiusMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the radius size scale for the bubbles.
    */
  var radiusScale: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
    */
  var radiusX: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the y-radius of the ellipse that is used to round the corners of the column.
    */
  var radiusY: js.UndefOr[Double] = js.native
  /**
    * Set to true in order to have an existing series removed from the chart, by name
    */
  var remove: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the current series object's rendering resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * Sets whether the order of the fragment series should be reversed in the legend. Note: Reversing the legend order is only supported on stacked series.
    */
  var reverseLegendOrder: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the series for stacked charts. It should contain array of series objects. Each item in array should represent a series with  and it may have most options supported by top-level series object, such as xAxis, yAxis, valueMemberPath, etc.
    */
  var series: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets or sets the blur amount to use for the drop shadow.
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the drop shadow.
    */
  var shadowColor: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the x offset amount to use for the drop shadow.
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the y offset amount to use for the drop shadow.
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for short AVO periods is 10.
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  /**
    * Whether the chart should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether the hover layer should skip unknown values when trying to find the closest values.
    */
  var skipUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the type of spline to be rendered.
    *
    * Valid values:
    * "natural" Calculates the spline using a natural spline calculation formula.
    * "clamped" Calculated the spline using a clamped spline calculation formula.
    */
  var splineType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the name of the target axis for the layer, if desired. Setting the target axis will scope the layer to target just that axis.
    */
  var targetAxis: js.UndefOr[String] = js.native
  /**
    * Gets or sets the name of the target series for the layer, if desired. Setting the target series will scope the layer to target just that series.
    */
  var targetSeries: js.UndefOr[String] = js.native
  /**
    * Gets or sets the width of the current series object's line thickness.
    */
  var thickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the Title property.
    * The legend item control is created according to the Title on-demand by
    * the series object itself.
    */
  var title: js.UndefOr[String] = js.native
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
  var tooltipPosition: js.UndefOr[String] = js.native
  /**
    * The name of template or the template itself that chart tooltip will use to render.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the duration of the current series's morph.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Provides an easing function to use for the transitions. This should either be a well known name of an easing function (The only currently supported name is cubic), or it should be a function that takes a number and returns the output with the function applied.
    */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the duration of the current series's transition in morph in milliseconds.
    */
  var transitionInDuration: js.UndefOr[Double] = js.native
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
  var transitionInMode: js.UndefOr[String] = js.native
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
  var transitionInSpeedType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush to use to draw the trend line.
    */
  var trendLineBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the moving average period for the current scatter series object.
    * The typical, and initial, value for trend line period is 7.
    */
  var trendLinePeriod: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the thickness of the current scatter series object's trend line.
    */
  var trendLineThickness: js.UndefOr[Double] = js.native
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
  var trendLineType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the Z-Index of the trend line.  Values greater than 1000 will result in the trend line being rendered in front of the series data.
    */
  var trendLineZIndex: js.UndefOr[Double] = js.native
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
    * "calloutLayer" Specify the series as a callout layer.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Determines how unknown values will be plotted on the chart. Null and Double.NaN are two examples of unknown values.
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the chart.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether to use use brute force mode.
    */
  var useBruteForce: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
    * spiral based interpolation.
    */
  var useCartesianInterpolation: js.UndefOr[Boolean] = js.native
  /**
    * Sets or Gets whether to increase marker fidelity for extreme data shapes that have lots of Y variation over short X intervals.
    */
  var useHighMarkerFidelity: js.UndefOr[Boolean] = js.native
  /**
    * Sets if the current layer should take up a brush/ordering index in the series collection to derive its color automatically.
    */
  var useIndex: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether the hover layer should use interpolation to position itself relative the closest values.
    */
  var useInterpolation: js.UndefOr[Boolean] = js.native
  /**
    * Sets if the current layer should have an entry in the legend of the chart. By default annotation layers are not present in the legend.
    */
  var useLegend: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether drop shadow is applied to the whole series visual or to each of the individual shapes forming the series.
    */
  var useSingleShadow: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets whether to use squares when halting a render traversal rather than the shape of the coalesced area.
    */
  var useSquareCutoffStyle: js.UndefOr[Boolean] = js.native
  /**
    * Gets the effective value axis for the current series object.
    */
  var valueAxis: js.UndefOr[String] = js.native
  /**
    * Gets or sets the item path that provides the values for the current series.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the color to use for the vertical line. Leave null for an automatic value.
    */
  var verticalLineStroke: js.UndefOr[String] = js.native
  /**
    * Gets or sets whether the vertical crosshair portion of the layer should be visible.
    *
    * Valid values:
    * "visible" the vertical crosshair portion of the layer should be visible.
    * "collapsed" the vertical crosshair portion of the layer should not be visible.
    */
  var verticalLineVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the volume mapping property for the current series object.
    */
  var volumeMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the effective x-axis for the current object.
    */
  var xAxis: js.UndefOr[String] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the x axis annotation.
    */
  var xAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the color to use for the x axis annotation backing. Leave unset for an automatic value.
    */
  var xAxisAnnotationBackground: js.UndefOr[String] = js.native
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var xAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the x axis annotation outline. Leave unset for an automatic value.
    */
  var xAxisAnnotationOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the bottom padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the left padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the right padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the top padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness for the x axis annotation backing. Leave unset for an automatic value.
    */
  var xAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the x axis annotation text. Leave unset for an automatic value.
    */
  var xAxisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var xMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the effective y-axis for the current object.
    */
  var yAxis: js.UndefOr[String] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the y axis annotation.
    */
  var yAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the color to use for the y axis annotation backing. Leave unset for an automatic value.
    */
  var yAxisAnnotationBackground: js.UndefOr[String] = js.native
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var yAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the y axis annotation outline. Leave unset for an automatic value.
    */
  var yAxisAnnotationOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the bottom padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the left padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the right padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingRight: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the top padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingTop: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
    */
  var yAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the color to use for the y axis annotation text. Leave unset for an automatic value.
    */
  var yAxisAnnotationTextColor: js.UndefOr[String] = js.native
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var yMemberPath: js.UndefOr[String] = js.native
}

object IgDataChartSeries {
  @scala.inline
  def apply(): IgDataChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartSeries]
  }
  @scala.inline
  implicit class IgDataChartSeriesOps[Self <: IgDataChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngleAxis(value: String): Self = this.set("angleAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleAxis: Self = this.set("angleAxis", js.undefined)
    @scala.inline
    def setAngleMemberPath(value: Double): Self = this.set("angleMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleMemberPath: Self = this.set("angleMemberPath", js.undefined)
    @scala.inline
    def setAreaFillOpacity(value: Double): Self = this.set("areaFillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaFillOpacity: Self = this.set("areaFillOpacity", js.undefined)
    @scala.inline
    def setAxisAnnoationFormatLabel(value: js.Any): Self = this.set("axisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnoationFormatLabel: Self = this.set("axisAnnoationFormatLabel", js.undefined)
    @scala.inline
    def setAxisAnnotationBackground(value: String): Self = this.set("axisAnnotationBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationBackground: Self = this.set("axisAnnotationBackground", js.undefined)
    @scala.inline
    def setAxisAnnotationInterpolatedValuePrecision(value: Double): Self = this.set("axisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationInterpolatedValuePrecision: Self = this.set("axisAnnotationInterpolatedValuePrecision", js.undefined)
    @scala.inline
    def setAxisAnnotationOutline(value: String): Self = this.set("axisAnnotationOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationOutline: Self = this.set("axisAnnotationOutline", js.undefined)
    @scala.inline
    def setAxisAnnotationPaddingBottom(value: Double): Self = this.set("axisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationPaddingBottom: Self = this.set("axisAnnotationPaddingBottom", js.undefined)
    @scala.inline
    def setAxisAnnotationPaddingLeft(value: Double): Self = this.set("axisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationPaddingLeft: Self = this.set("axisAnnotationPaddingLeft", js.undefined)
    @scala.inline
    def setAxisAnnotationPaddingRight(value: Double): Self = this.set("axisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationPaddingRight: Self = this.set("axisAnnotationPaddingRight", js.undefined)
    @scala.inline
    def setAxisAnnotationPaddingTop(value: Double): Self = this.set("axisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationPaddingTop: Self = this.set("axisAnnotationPaddingTop", js.undefined)
    @scala.inline
    def setAxisAnnotationStrokeThickness(value: Double): Self = this.set("axisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationStrokeThickness: Self = this.set("axisAnnotationStrokeThickness", js.undefined)
    @scala.inline
    def setAxisAnnotationTextColor(value: String): Self = this.set("axisAnnotationTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisAnnotationTextColor: Self = this.set("axisAnnotationTextColor", js.undefined)
    @scala.inline
    def setBandHighlightWidth(value: Double): Self = this.set("bandHighlightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandHighlightWidth: Self = this.set("bandHighlightWidth", js.undefined)
    @scala.inline
    def setBrush(value: String): Self = this.set("brush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrush: Self = this.set("brush", js.undefined)
    @scala.inline
    def setCalloutBackground(value: String): Self = this.set("calloutBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutBackground: Self = this.set("calloutBackground", js.undefined)
    @scala.inline
    def setCalloutCollisionMode(value: String): Self = this.set("calloutCollisionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutCollisionMode: Self = this.set("calloutCollisionMode", js.undefined)
    @scala.inline
    def setCalloutContentUpdating(value: js.Any): Self = this.set("calloutContentUpdating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutContentUpdating: Self = this.set("calloutContentUpdating", js.undefined)
    @scala.inline
    def setCalloutLabelUpdating(value: js.Any): Self = this.set("calloutLabelUpdating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutLabelUpdating: Self = this.set("calloutLabelUpdating", js.undefined)
    @scala.inline
    def setCalloutLeaderBrush(value: String): Self = this.set("calloutLeaderBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutLeaderBrush: Self = this.set("calloutLeaderBrush", js.undefined)
    @scala.inline
    def setCalloutOutline(value: String): Self = this.set("calloutOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutOutline: Self = this.set("calloutOutline", js.undefined)
    @scala.inline
    def setCalloutPaddingBottom(value: Double): Self = this.set("calloutPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutPaddingBottom: Self = this.set("calloutPaddingBottom", js.undefined)
    @scala.inline
    def setCalloutPaddingLeft(value: Double): Self = this.set("calloutPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutPaddingLeft: Self = this.set("calloutPaddingLeft", js.undefined)
    @scala.inline
    def setCalloutPaddingRight(value: Double): Self = this.set("calloutPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutPaddingRight: Self = this.set("calloutPaddingRight", js.undefined)
    @scala.inline
    def setCalloutPaddingTop(value: Double): Self = this.set("calloutPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutPaddingTop: Self = this.set("calloutPaddingTop", js.undefined)
    @scala.inline
    def setCalloutPositionPadding(value: Double): Self = this.set("calloutPositionPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutPositionPadding: Self = this.set("calloutPositionPadding", js.undefined)
    @scala.inline
    def setCalloutSeriesSelecting(value: js.Any): Self = this.set("calloutSeriesSelecting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutSeriesSelecting: Self = this.set("calloutSeriesSelecting", js.undefined)
    @scala.inline
    def setCalloutStrokeThickness(value: Double): Self = this.set("calloutStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutStrokeThickness: Self = this.set("calloutStrokeThickness", js.undefined)
    @scala.inline
    def setCalloutTextColor(value: String): Self = this.set("calloutTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutTextColor: Self = this.set("calloutTextColor", js.undefined)
    @scala.inline
    def setClipSeriesToBounds(value: Boolean): Self = this.set("clipSeriesToBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipSeriesToBounds: Self = this.set("clipSeriesToBounds", js.undefined)
    @scala.inline
    def setCloseMemberPath(value: String): Self = this.set("closeMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseMemberPath: Self = this.set("closeMemberPath", js.undefined)
    @scala.inline
    def setCoercionMethods(value: js.Any): Self = this.set("coercionMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoercionMethods: Self = this.set("coercionMethods", js.undefined)
    @scala.inline
    def setConsolidatedColumnVerticalPosition(value: String): Self = this.set("consolidatedColumnVerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsolidatedColumnVerticalPosition: Self = this.set("consolidatedColumnVerticalPosition", js.undefined)
    @scala.inline
    def setContentMemberPath(value: String): Self = this.set("contentMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMemberPath: Self = this.set("contentMemberPath", js.undefined)
    @scala.inline
    def setCursorPosition(value: js.Any): Self = this.set("cursorPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorPosition: Self = this.set("cursorPosition", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    @scala.inline
    def setDiscreteLegendItemTemplate(value: js.Any): Self = this.set("discreteLegendItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscreteLegendItemTemplate: Self = this.set("discreteLegendItemTemplate", js.undefined)
    @scala.inline
    def setDisplayType(value: String): Self = this.set("displayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    @scala.inline
    def setExpectFunctions(value: Boolean): Self = this.set("expectFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectFunctions: Self = this.set("expectFunctions", js.undefined)
    @scala.inline
    def setFillMemberPath(value: String): Self = this.set("fillMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillMemberPath: Self = this.set("fillMemberPath", js.undefined)
    @scala.inline
    def setFillScale(value: js.Any): Self = this.set("fillScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillScale: Self = this.set("fillScale", js.undefined)
    @scala.inline
    def setFinalValueSelectionMode(value: String): Self = this.set("finalValueSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalValueSelectionMode: Self = this.set("finalValueSelectionMode", js.undefined)
    @scala.inline
    def setHeatMaximum(value: Double): Self = this.set("heatMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatMaximum: Self = this.set("heatMaximum", js.undefined)
    @scala.inline
    def setHeatMaximumColor(value: js.Any): Self = this.set("heatMaximumColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatMaximumColor: Self = this.set("heatMaximumColor", js.undefined)
    @scala.inline
    def setHeatMinimum(value: Double): Self = this.set("heatMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatMinimum: Self = this.set("heatMinimum", js.undefined)
    @scala.inline
    def setHeatMinimumColor(value: js.Any): Self = this.set("heatMinimumColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatMinimumColor: Self = this.set("heatMinimumColor", js.undefined)
    @scala.inline
    def setHighMemberPath(value: String): Self = this.set("highMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighMemberPath: Self = this.set("highMemberPath", js.undefined)
    @scala.inline
    def setHighlightType(value: String): Self = this.set("highlightType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightType: Self = this.set("highlightType", js.undefined)
    @scala.inline
    def setHitTestMode(value: String): Self = this.set("hitTestMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitTestMode: Self = this.set("hitTestMode", js.undefined)
    @scala.inline
    def setHorizontalLineStroke(value: String): Self = this.set("horizontalLineStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalLineStroke: Self = this.set("horizontalLineStroke", js.undefined)
    @scala.inline
    def setHorizontalLineVisibility(value: String): Self = this.set("horizontalLineVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalLineVisibility: Self = this.set("horizontalLineVisibility", js.undefined)
    @scala.inline
    def setIgnoreFirst(value: Double): Self = this.set("ignoreFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFirst: Self = this.set("ignoreFirst", js.undefined)
    @scala.inline
    def setIsAxisAnnotationEnabled(value: Boolean): Self = this.set("isAxisAnnotationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAxisAnnotationEnabled: Self = this.set("isAxisAnnotationEnabled", js.undefined)
    @scala.inline
    def setIsCalloutOffsettingEnabled(value: Boolean): Self = this.set("isCalloutOffsettingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCalloutOffsettingEnabled: Self = this.set("isCalloutOffsettingEnabled", js.undefined)
    @scala.inline
    def setIsCustomCategoryMarkerStyleAllowed(value: Boolean): Self = this.set("isCustomCategoryMarkerStyleAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustomCategoryMarkerStyleAllowed: Self = this.set("isCustomCategoryMarkerStyleAllowed", js.undefined)
    @scala.inline
    def setIsCustomCategoryStyleAllowed(value: Boolean): Self = this.set("isCustomCategoryStyleAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustomCategoryStyleAllowed: Self = this.set("isCustomCategoryStyleAllowed", js.undefined)
    @scala.inline
    def setIsDefaultCrosshairDisabled(value: Boolean): Self = this.set("isDefaultCrosshairDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultCrosshairDisabled: Self = this.set("isDefaultCrosshairDisabled", js.undefined)
    @scala.inline
    def setIsDropShadowEnabled(value: Boolean): Self = this.set("isDropShadowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDropShadowEnabled: Self = this.set("isDropShadowEnabled", js.undefined)
    @scala.inline
    def setIsHighlightingEnabled(value: Boolean): Self = this.set("isHighlightingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHighlightingEnabled: Self = this.set("isHighlightingEnabled", js.undefined)
    @scala.inline
    def setIsTransitionInEnabled(value: Boolean): Self = this.set("isTransitionInEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTransitionInEnabled: Self = this.set("isTransitionInEnabled", js.undefined)
    @scala.inline
    def setKeyMemberPath(value: String): Self = this.set("keyMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMemberPath: Self = this.set("keyMemberPath", js.undefined)
    @scala.inline
    def setLabelMemberPath(value: String): Self = this.set("labelMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMemberPath: Self = this.set("labelMemberPath", js.undefined)
    @scala.inline
    def setLegend(value: IgDataChartSeriesLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = this.set("legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendItemBadgeTemplate: Self = this.set("legendItemBadgeTemplate", js.undefined)
    @scala.inline
    def setLegendItemTemplate(value: js.Any): Self = this.set("legendItemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendItemTemplate: Self = this.set("legendItemTemplate", js.undefined)
    @scala.inline
    def setLegendItemVisibility(value: String): Self = this.set("legendItemVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendItemVisibility: Self = this.set("legendItemVisibility", js.undefined)
    @scala.inline
    def setLongPeriod(value: Double): Self = this.set("longPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongPeriod: Self = this.set("longPeriod", js.undefined)
    @scala.inline
    def setLowMemberPath(value: String): Self = this.set("lowMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowMemberPath: Self = this.set("lowMemberPath", js.undefined)
    @scala.inline
    def setMarkerBrush(value: String): Self = this.set("markerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerBrush: Self = this.set("markerBrush", js.undefined)
    @scala.inline
    def setMarkerCollisionAvoidance(value: String): Self = this.set("markerCollisionAvoidance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerCollisionAvoidance: Self = this.set("markerCollisionAvoidance", js.undefined)
    @scala.inline
    def setMarkerOutline(value: String): Self = this.set("markerOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOutline: Self = this.set("markerOutline", js.undefined)
    @scala.inline
    def setMarkerTemplate(value: js.Any): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
    @scala.inline
    def setMarkerType(value: String): Self = this.set("markerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerType: Self = this.set("markerType", js.undefined)
    @scala.inline
    def setMaximumMarkers(value: Double): Self = this.set("maximumMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumMarkers: Self = this.set("maximumMarkers", js.undefined)
    @scala.inline
    def setMouseOverEnabled(value: Boolean): Self = this.set("mouseOverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseOverEnabled: Self = this.set("mouseOverEnabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNegativeBrush(value: String): Self = this.set("negativeBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeBrush: Self = this.set("negativeBrush", js.undefined)
    @scala.inline
    def setOpenMemberPath(value: String): Self = this.set("openMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMemberPath: Self = this.set("openMemberPath", js.undefined)
    @scala.inline
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setProgressiveLoad(value: Boolean): Self = this.set("progressiveLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressiveLoad: Self = this.set("progressiveLoad", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRadiusAxis(value: String): Self = this.set("radiusAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusAxis: Self = this.set("radiusAxis", js.undefined)
    @scala.inline
    def setRadiusMemberPath(value: String): Self = this.set("radiusMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusMemberPath: Self = this.set("radiusMemberPath", js.undefined)
    @scala.inline
    def setRadiusScale(value: js.Any): Self = this.set("radiusScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusScale: Self = this.set("radiusScale", js.undefined)
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusX: Self = this.set("radiusX", js.undefined)
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusY: Self = this.set("radiusY", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setReverseLegendOrder(value: Boolean): Self = this.set("reverseLegendOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseLegendOrder: Self = this.set("reverseLegendOrder", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: js.Any*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[_]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: js.Any): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    @scala.inline
    def setShortPeriod(value: Double): Self = this.set("shortPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortPeriod: Self = this.set("shortPeriod", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setSkipUnknownValues(value: Boolean): Self = this.set("skipUnknownValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUnknownValues: Self = this.set("skipUnknownValues", js.undefined)
    @scala.inline
    def setSplineType(value: String): Self = this.set("splineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplineType: Self = this.set("splineType", js.undefined)
    @scala.inline
    def setTargetAxis(value: String): Self = this.set("targetAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAxis: Self = this.set("targetAxis", js.undefined)
    @scala.inline
    def setTargetSeries(value: String): Self = this.set("targetSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSeries: Self = this.set("targetSeries", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltipPosition(value: String): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setTransitionEasingFunction(value: js.Any): Self = this.set("transitionEasingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionEasingFunction: Self = this.set("transitionEasingFunction", js.undefined)
    @scala.inline
    def setTransitionInDuration(value: Double): Self = this.set("transitionInDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInDuration: Self = this.set("transitionInDuration", js.undefined)
    @scala.inline
    def setTransitionInMode(value: String): Self = this.set("transitionInMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInMode: Self = this.set("transitionInMode", js.undefined)
    @scala.inline
    def setTransitionInSpeedType(value: String): Self = this.set("transitionInSpeedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionInSpeedType: Self = this.set("transitionInSpeedType", js.undefined)
    @scala.inline
    def setTrendLineBrush(value: String): Self = this.set("trendLineBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineBrush: Self = this.set("trendLineBrush", js.undefined)
    @scala.inline
    def setTrendLinePeriod(value: Double): Self = this.set("trendLinePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLinePeriod: Self = this.set("trendLinePeriod", js.undefined)
    @scala.inline
    def setTrendLineThickness(value: Double): Self = this.set("trendLineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineThickness: Self = this.set("trendLineThickness", js.undefined)
    @scala.inline
    def setTrendLineType(value: String): Self = this.set("trendLineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineType: Self = this.set("trendLineType", js.undefined)
    @scala.inline
    def setTrendLineZIndex(value: Double): Self = this.set("trendLineZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineZIndex: Self = this.set("trendLineZIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnknownValuePlotting(value: String): Self = this.set("unknownValuePlotting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownValuePlotting: Self = this.set("unknownValuePlotting", js.undefined)
    @scala.inline
    def setUseBruteForce(value: Boolean): Self = this.set("useBruteForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBruteForce: Self = this.set("useBruteForce", js.undefined)
    @scala.inline
    def setUseCartesianInterpolation(value: Boolean): Self = this.set("useCartesianInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCartesianInterpolation: Self = this.set("useCartesianInterpolation", js.undefined)
    @scala.inline
    def setUseHighMarkerFidelity(value: Boolean): Self = this.set("useHighMarkerFidelity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHighMarkerFidelity: Self = this.set("useHighMarkerFidelity", js.undefined)
    @scala.inline
    def setUseIndex(value: Boolean): Self = this.set("useIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIndex: Self = this.set("useIndex", js.undefined)
    @scala.inline
    def setUseInterpolation(value: Boolean): Self = this.set("useInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseInterpolation: Self = this.set("useInterpolation", js.undefined)
    @scala.inline
    def setUseLegend(value: Boolean): Self = this.set("useLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegend: Self = this.set("useLegend", js.undefined)
    @scala.inline
    def setUseSingleShadow(value: Boolean): Self = this.set("useSingleShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSingleShadow: Self = this.set("useSingleShadow", js.undefined)
    @scala.inline
    def setUseSquareCutoffStyle(value: Boolean): Self = this.set("useSquareCutoffStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSquareCutoffStyle: Self = this.set("useSquareCutoffStyle", js.undefined)
    @scala.inline
    def setValueAxis(value: String): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    @scala.inline
    def setVerticalLineStroke(value: String): Self = this.set("verticalLineStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLineStroke: Self = this.set("verticalLineStroke", js.undefined)
    @scala.inline
    def setVerticalLineVisibility(value: String): Self = this.set("verticalLineVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLineVisibility: Self = this.set("verticalLineVisibility", js.undefined)
    @scala.inline
    def setVolumeMemberPath(value: String): Self = this.set("volumeMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeMemberPath: Self = this.set("volumeMemberPath", js.undefined)
    @scala.inline
    def setXAxis(value: String): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setXAxisAnnoationFormatLabel(value: js.Any): Self = this.set("xAxisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnoationFormatLabel: Self = this.set("xAxisAnnoationFormatLabel", js.undefined)
    @scala.inline
    def setXAxisAnnotationBackground(value: String): Self = this.set("xAxisAnnotationBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationBackground: Self = this.set("xAxisAnnotationBackground", js.undefined)
    @scala.inline
    def setXAxisAnnotationInterpolatedValuePrecision(value: Double): Self = this.set("xAxisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationInterpolatedValuePrecision: Self = this.set("xAxisAnnotationInterpolatedValuePrecision", js.undefined)
    @scala.inline
    def setXAxisAnnotationOutline(value: String): Self = this.set("xAxisAnnotationOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationOutline: Self = this.set("xAxisAnnotationOutline", js.undefined)
    @scala.inline
    def setXAxisAnnotationPaddingBottom(value: Double): Self = this.set("xAxisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationPaddingBottom: Self = this.set("xAxisAnnotationPaddingBottom", js.undefined)
    @scala.inline
    def setXAxisAnnotationPaddingLeft(value: Double): Self = this.set("xAxisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationPaddingLeft: Self = this.set("xAxisAnnotationPaddingLeft", js.undefined)
    @scala.inline
    def setXAxisAnnotationPaddingRight(value: Double): Self = this.set("xAxisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationPaddingRight: Self = this.set("xAxisAnnotationPaddingRight", js.undefined)
    @scala.inline
    def setXAxisAnnotationPaddingTop(value: Double): Self = this.set("xAxisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationPaddingTop: Self = this.set("xAxisAnnotationPaddingTop", js.undefined)
    @scala.inline
    def setXAxisAnnotationStrokeThickness(value: Double): Self = this.set("xAxisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationStrokeThickness: Self = this.set("xAxisAnnotationStrokeThickness", js.undefined)
    @scala.inline
    def setXAxisAnnotationTextColor(value: String): Self = this.set("xAxisAnnotationTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisAnnotationTextColor: Self = this.set("xAxisAnnotationTextColor", js.undefined)
    @scala.inline
    def setXMemberPath(value: String): Self = this.set("xMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMemberPath: Self = this.set("xMemberPath", js.undefined)
    @scala.inline
    def setYAxis(value: String): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    @scala.inline
    def setYAxisAnnoationFormatLabel(value: js.Any): Self = this.set("yAxisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnoationFormatLabel: Self = this.set("yAxisAnnoationFormatLabel", js.undefined)
    @scala.inline
    def setYAxisAnnotationBackground(value: String): Self = this.set("yAxisAnnotationBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationBackground: Self = this.set("yAxisAnnotationBackground", js.undefined)
    @scala.inline
    def setYAxisAnnotationInterpolatedValuePrecision(value: Double): Self = this.set("yAxisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationInterpolatedValuePrecision: Self = this.set("yAxisAnnotationInterpolatedValuePrecision", js.undefined)
    @scala.inline
    def setYAxisAnnotationOutline(value: String): Self = this.set("yAxisAnnotationOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationOutline: Self = this.set("yAxisAnnotationOutline", js.undefined)
    @scala.inline
    def setYAxisAnnotationPaddingBottom(value: Double): Self = this.set("yAxisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationPaddingBottom: Self = this.set("yAxisAnnotationPaddingBottom", js.undefined)
    @scala.inline
    def setYAxisAnnotationPaddingLeft(value: Double): Self = this.set("yAxisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationPaddingLeft: Self = this.set("yAxisAnnotationPaddingLeft", js.undefined)
    @scala.inline
    def setYAxisAnnotationPaddingRight(value: Double): Self = this.set("yAxisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationPaddingRight: Self = this.set("yAxisAnnotationPaddingRight", js.undefined)
    @scala.inline
    def setYAxisAnnotationPaddingTop(value: Double): Self = this.set("yAxisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationPaddingTop: Self = this.set("yAxisAnnotationPaddingTop", js.undefined)
    @scala.inline
    def setYAxisAnnotationStrokeThickness(value: Double): Self = this.set("yAxisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationStrokeThickness: Self = this.set("yAxisAnnotationStrokeThickness", js.undefined)
    @scala.inline
    def setYAxisAnnotationTextColor(value: String): Self = this.set("yAxisAnnotationTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisAnnotationTextColor: Self = this.set("yAxisAnnotationTextColor", js.undefined)
    @scala.inline
    def setYMemberPath(value: String): Self = this.set("yMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMemberPath: Self = this.set("yMemberPath", js.undefined)
  }
  
}

