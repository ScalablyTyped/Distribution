package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChartSeries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets the effective angle axis for the current series object.
    */
  var angleAxis: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
    */
  var angleMemberPath: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the opacity modifier to apply to the area fill shape of the series, if applicable.
    */
  var areaFillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the axis annotation.
    */
  var axisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the color to use for the axis annotation backing. Leave unset for an automatic value.
    */
  var axisAnnotationBackground: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var axisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the axis annotation outline. Leave unset for an automatic value.
    */
  var axisAnnotationOutline: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the bottom padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the left padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the right padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the top padding to use withing the axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var axisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the stroke thickness for the axis annotation backing. Leave unset for an automatic value.
    */
  var axisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the axis annotation text. Leave unset for an automatic value.
    */
  var axisAnnotationTextColor: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the width to use for the highlight region if highlighting items in a grid aligned series (line, spline, etc), with a banded shape.
    */
  var bandHighlightWidth: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the brush to use for the series.
    */
  var brush: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush that specifies how the backgrounds for the callouts of the layer are painted.
    */
  var calloutBackground: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the strategy to use for avoiding collisions between the callouts in this layer. Leave unset for an automatic value.
    *
    * Valid values:
    * "auto" automatically decide the collision strategy.
    * "simulatedAnnealing" use a simulated annealing based collision strategy. This is higher quality, but takes longer, and is performed time-sliced in the background until an acceptable quality is reached.
    * "greedy" use a greedy algorithm to avoid collisions. This is cheap and predictable, but of comparatively low quality.
    * "greedyCenterOfMass" use a greedy algorithm with localized center of mass hints to avoid collisions. This is relatively cheap to perform, compared to the simulated annealing approach, but is of comparatively lower quality.
    */
  var calloutCollisionMode: js.UndefOr[String] = js.undefined
  /**
    * Sets or gets a function which lets you modify or provide the content for an automatically created callout.
    */
  var calloutContentUpdating: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets or gets a function which lets you modify or provide the label for an automatically created callout.
    */
  var calloutLabelUpdating: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the brush that specifies how the leader lines for the callouts of the layer are painted.
    */
  var calloutLeaderBrush: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush that specifies how the outlines for the callouts of the layer are painted.
    */
  var calloutOutline: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the bottom padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingBottom: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the left padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingLeft: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the right padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingRight: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the top padding to use withing the callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPaddingTop: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the padding to add to the callout positioning. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var calloutPositionPadding: js.UndefOr[Double] = js.undefined
  /**
    * Sets or gets a function which lets you modify or provide the associated series for a data source provided callout.
    */
  var calloutSeriesSelecting: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the stroke thickness for the callout backing. Leave unset for an automatic value.
    */
  var calloutStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the callout text. Leave unset for an automatic value.
    */
  var calloutTextColor: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether to clip the series to the bounds.
    * Setting this to true can effect performance.
    */
  var clipSeriesToBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the close mapping property for the current series object.
    */
  var closeMemberPath: js.UndefOr[String] = js.undefined
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
  var consolidatedColumnVerticalPosition: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the content mapping property for the callouts.
    */
  var contentMemberPath: js.UndefOr[String] = js.undefined
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
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
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
  var displayType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether the series should expect that its data source members need to be called as functions to get their values.
    */
  var expectFunctions: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the fill mapping property for the current series object.
    */
  var fillMemberPath: js.UndefOr[String] = js.undefined
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
  var finalValueSelectionMode: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the value that maps to the maximum heat color.
    */
  var heatMaximum: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the maximum heat color for the density scale.
    */
  var heatMaximumColor: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the density value that maps to the minimum heat color.
    */
  var heatMinimum: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the minimum heat color for the density scale.
    */
  var heatMinimumColor: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var highMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets which type of highlight shape to use when highlighting items.
    *
    * Valid values:
    * "auto" use an automatic highlight type for this series.
    * "marker" use a marker highlight type for this series.
    * "shape" use a shape highlight type for this series.
    */
  var highlightType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets which type of hit testing the series should use.
    *
    * Valid values:
    * "auto" automatically decide the appropriate hit test mode for the series.
    * "computational" use a computational based approach to determine whether the series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
    * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
    */
  var hitTestMode: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the color to use for the horizontal line. Leave null for an automatic value.
    */
  var horizontalLineStroke: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether the horizontal crosshair portion of the layer should be visible.
    *
    * Valid values:
    * "visible" the horizontal crosshair portion of the layer should be visible.
    * "collapsed" the horizontal crosshair portion of the layer should not be visible.
    */
  var horizontalLineVisibility: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the number of values to hide at the beginning of the indicator.
    */
  var ignoreFirst: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets whether to draw annotations over the axes where the crosshair meets with them.
    */
  var isAxisAnnotationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether to allow the callouts to be variable distances from the target points, for suppporting collision modes.
    */
  var isCalloutOffsettingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether a custom category marker style is allowed. Setting this to true will case the assigningCategoryMarkerStyle event to get fired, if provided.
    */
  var isCustomCategoryMarkerStyleAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether a custom category style is allowed. Setting this to true will case the assigningCategoryStyle event to get fired, if provided.
    */
  var isCustomCategoryStyleAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets if the presence of this layer should disable the default crosshair behavior of the chart, if present.
    */
  var isDefaultCrosshairDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether drop shadow should be enabled for this series.
    */
  var isDropShadowEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether highlighting should be enabled for the series, if supported.
    */
  var isHighlightingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets if the series should play a transition in animation when the data source is assigned. Note: Transitions are not currently supported for stacked series.
    */
  var isTransitionInEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the key mapping property for the callouts.
    */
  var keyMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the Label mapping property for the current series object.
    */
  var labelMemberPath: js.UndefOr[String] = js.undefined
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
  var legendItemVisibility: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for long AVO periods is 30.
    */
  var longPeriod: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var lowMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush that specifies how the current series object's marker interiors are painted.
    */
  var markerBrush: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the MarkerCollisionAvoidance
    *
    * Valid values:
    * "none" No collision avoidance is attempted.
    * "omit" Markers that collide will be omitted.
    * "fade" Markers that collide will be faded in opacity.
    * "omitAndShift" Markers that collide may be shifted or omitted.
    */
  var markerCollisionAvoidance: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush that specifies how the current series object's marker outlines are painted.
    */
  var markerOutline: js.UndefOr[String] = js.undefined
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
  var markerType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the maximum number of markerItems displayed by the current series.
    * If more than the specified number of markerItems are visible, the series will automatically
    * choose a representative set.
    */
  var maximumMarkers: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets whether the chart reacts to mouse move events.
    */
  var mouseOverEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique identifier of the series.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush to use for negative portions of the series.
    */
  var negativeBrush: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the open mapping property for the current series object.
    */
  var openMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush to use for the outline of the series.
    * Some series types, such as LineSeries, do not display outlines.  Therefore, this property does not affect some charts.
    */
  var outline: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
    * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets whether to progressively load the data into the chart.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the corner radius to use for the series, if applicable.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Gets the effective radius axis for the current series object.
    */
  var radiusAxis: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the radius mapping property for the current series object.
    */
  var radiusMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the radius size scale for the bubbles.
    */
  var radiusScale: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
    */
  var radiusX: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the y-radius of the ellipse that is used to round the corners of the column.
    */
  var radiusY: js.UndefOr[Double] = js.undefined
  /**
    * Set to true in order to have an existing series removed from the chart, by name
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the current series object's rendering resolution.
    */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the order of the fragment series should be reversed in the legend. Note: Reversing the legend order is only supported on stacked series.
    */
  var reverseLegendOrder: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the series for stacked charts. It should contain array of series objects. Each item in array should represent a series with  and it may have most options supported by top-level series object, such as xAxis, yAxis, valueMemberPath, etc.
    */
  var series: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets or sets the blur amount to use for the drop shadow.
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the drop shadow.
    */
  var shadowColor: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the x offset amount to use for the drop shadow.
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the y offset amount to use for the drop shadow.
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for short AVO periods is 10.
    */
  var shortPeriod: js.UndefOr[Double] = js.undefined
  /**
    * Whether the chart should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether the hover layer should skip unknown values when trying to find the closest values.
    */
  var skipUnknownValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the type of spline to be rendered.
    *
    * Valid values:
    * "natural" Calculates the spline using a natural spline calculation formula.
    * "clamped" Calculated the spline using a clamped spline calculation formula.
    */
  var splineType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the name of the target axis for the layer, if desired. Setting the target axis will scope the layer to target just that axis.
    */
  var targetAxis: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the name of the target series for the layer, if desired. Setting the target series will scope the layer to target just that series.
    */
  var targetSeries: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the width of the current series object's line thickness.
    */
  var thickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the Title property.
    * The legend item control is created according to the Title on-demand by
    * the series object itself.
    */
  var title: js.UndefOr[String] = js.undefined
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
  var tooltipPosition: js.UndefOr[String] = js.undefined
  /**
    * The name of template or the template itself that chart tooltip will use to render.
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the duration of the current series's morph.
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
    * Provides an easing function to use for the transitions. This should either be a well known name of an easing function (The only currently supported name is cubic), or it should be a function that takes a number and returns the output with the function applied.
    */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the duration of the current series's transition in morph in milliseconds.
    */
  var transitionInDuration: js.UndefOr[Double] = js.undefined
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
  var transitionInMode: js.UndefOr[String] = js.undefined
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
  var transitionInSpeedType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the brush to use to draw the trend line.
    */
  var trendLineBrush: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the moving average period for the current scatter series object.
    * The typical, and initial, value for trend line period is 7.
    */
  var trendLinePeriod: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the thickness of the current scatter series object's trend line.
    */
  var trendLineThickness: js.UndefOr[Double] = js.undefined
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
  var trendLineType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the Z-Index of the trend line.  Values greater than 1000 will result in the trend line being rendered in front of the series data.
    */
  var trendLineZIndex: js.UndefOr[Double] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Determines how unknown values will be plotted on the chart. Null and Double.NaN are two examples of unknown values.
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the chart.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether to use use brute force mode.
    */
  var useBruteForce: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
    * spiral based interpolation.
    */
  var useCartesianInterpolation: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets or Gets whether to increase marker fidelity for extreme data shapes that have lots of Y variation over short X intervals.
    */
  var useHighMarkerFidelity: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets if the current layer should take up a brush/ordering index in the series collection to derive its color automatically.
    */
  var useIndex: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether the hover layer should use interpolation to position itself relative the closest values.
    */
  var useInterpolation: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets if the current layer should have an entry in the legend of the chart. By default annotation layers are not present in the legend.
    */
  var useLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether drop shadow is applied to the whole series visual or to each of the individual shapes forming the series.
    */
  var useSingleShadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether to use squares when halting a render traversal rather than the shape of the coalesced area.
    */
  var useSquareCutoffStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the effective value axis for the current series object.
    */
  var valueAxis: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the item path that provides the values for the current series.
    */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the color to use for the vertical line. Leave null for an automatic value.
    */
  var verticalLineStroke: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether the vertical crosshair portion of the layer should be visible.
    *
    * Valid values:
    * "visible" the vertical crosshair portion of the layer should be visible.
    * "collapsed" the vertical crosshair portion of the layer should not be visible.
    */
  var verticalLineVisibility: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the volume mapping property for the current series object.
    */
  var volumeMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the effective x-axis for the current object.
    */
  var xAxis: js.UndefOr[String] = js.undefined
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the x axis annotation.
    */
  var xAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the color to use for the x axis annotation backing. Leave unset for an automatic value.
    */
  var xAxisAnnotationBackground: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var xAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the x axis annotation outline. Leave unset for an automatic value.
    */
  var xAxisAnnotationOutline: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the bottom padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the left padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the right padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the top padding to use withing the x axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var xAxisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the stroke thickness for the x axis annotation backing. Leave unset for an automatic value.
    */
  var xAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the x axis annotation text. Leave unset for an automatic value.
    */
  var xAxisAnnotationTextColor: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var xMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the effective y-axis for the current object.
    */
  var yAxis: js.UndefOr[String] = js.undefined
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the y axis annotation.
    */
  var yAxisAnnoationFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the color to use for the y axis annotation backing. Leave unset for an automatic value.
    */
  var yAxisAnnotationBackground: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the precision to use displaying values for interpolated crosshair positions.
    */
  var yAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the y axis annotation outline. Leave unset for an automatic value.
    */
  var yAxisAnnotationOutline: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the bottom padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the left padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the right padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the top padding to use withing the y axis annotation callout. Leaving this NaN will use an automatic value related to the axis label margins.
    */
  var yAxisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the stroke thickness for the y axis annotation backing. Leave unset for an automatic value.
    */
  var yAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the color to use for the y axis annotation text. Leave unset for an automatic value.
    */
  var yAxisAnnotationTextColor: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var yMemberPath: js.UndefOr[String] = js.undefined
}

object IgDataChartSeries {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    angleAxis: String = null,
    angleMemberPath: js.UndefOr[Double] = js.undefined,
    areaFillOpacity: js.UndefOr[Double] = js.undefined,
    axisAnnoationFormatLabel: js.Any = null,
    axisAnnotationBackground: String = null,
    axisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined,
    axisAnnotationOutline: String = null,
    axisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined,
    axisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined,
    axisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined,
    axisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined,
    axisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined,
    axisAnnotationTextColor: String = null,
    bandHighlightWidth: js.UndefOr[Double] = js.undefined,
    brush: String = null,
    calloutBackground: String = null,
    calloutCollisionMode: String = null,
    calloutContentUpdating: js.Any = null,
    calloutLabelUpdating: js.Any = null,
    calloutLeaderBrush: String = null,
    calloutOutline: String = null,
    calloutPaddingBottom: js.UndefOr[Double] = js.undefined,
    calloutPaddingLeft: js.UndefOr[Double] = js.undefined,
    calloutPaddingRight: js.UndefOr[Double] = js.undefined,
    calloutPaddingTop: js.UndefOr[Double] = js.undefined,
    calloutPositionPadding: js.UndefOr[Double] = js.undefined,
    calloutSeriesSelecting: js.Any = null,
    calloutStrokeThickness: js.UndefOr[Double] = js.undefined,
    calloutTextColor: String = null,
    clipSeriesToBounds: js.UndefOr[Boolean] = js.undefined,
    closeMemberPath: String = null,
    coercionMethods: js.Any = null,
    consolidatedColumnVerticalPosition: String = null,
    contentMemberPath: String = null,
    cursorPosition: js.Any = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    discreteLegendItemTemplate: js.Any = null,
    displayType: String = null,
    expectFunctions: js.UndefOr[Boolean] = js.undefined,
    fillMemberPath: String = null,
    fillScale: js.Any = null,
    finalValueSelectionMode: String = null,
    heatMaximum: js.UndefOr[Double] = js.undefined,
    heatMaximumColor: js.Any = null,
    heatMinimum: js.UndefOr[Double] = js.undefined,
    heatMinimumColor: js.Any = null,
    highMemberPath: String = null,
    highlightType: String = null,
    hitTestMode: String = null,
    horizontalLineStroke: String = null,
    horizontalLineVisibility: String = null,
    ignoreFirst: js.UndefOr[Double] = js.undefined,
    isAxisAnnotationEnabled: js.UndefOr[Boolean] = js.undefined,
    isCalloutOffsettingEnabled: js.UndefOr[Boolean] = js.undefined,
    isCustomCategoryMarkerStyleAllowed: js.UndefOr[Boolean] = js.undefined,
    isCustomCategoryStyleAllowed: js.UndefOr[Boolean] = js.undefined,
    isDefaultCrosshairDisabled: js.UndefOr[Boolean] = js.undefined,
    isDropShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    isHighlightingEnabled: js.UndefOr[Boolean] = js.undefined,
    isTransitionInEnabled: js.UndefOr[Boolean] = js.undefined,
    keyMemberPath: String = null,
    labelMemberPath: String = null,
    legend: IgDataChartSeriesLegend = null,
    legendItemBadgeTemplate: js.Any = null,
    legendItemTemplate: js.Any = null,
    legendItemVisibility: String = null,
    longPeriod: js.UndefOr[Double] = js.undefined,
    lowMemberPath: String = null,
    markerBrush: String = null,
    markerCollisionAvoidance: String = null,
    markerOutline: String = null,
    markerTemplate: js.Any = null,
    markerType: String = null,
    maximumMarkers: js.UndefOr[Double] = js.undefined,
    mouseOverEnabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    negativeBrush: String = null,
    openMemberPath: String = null,
    outline: String = null,
    period: js.UndefOr[Double] = js.undefined,
    progressiveLoad: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    radiusAxis: String = null,
    radiusMemberPath: String = null,
    radiusScale: js.Any = null,
    radiusX: js.UndefOr[Double] = js.undefined,
    radiusY: js.UndefOr[Double] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    responseDataKey: String = null,
    reverseLegendOrder: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[_] = null,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: js.Any = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    shortPeriod: js.UndefOr[Double] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    skipUnknownValues: js.UndefOr[Boolean] = js.undefined,
    splineType: String = null,
    targetAxis: String = null,
    targetSeries: String = null,
    thickness: js.UndefOr[Double] = js.undefined,
    title: String = null,
    tooltipPosition: String = null,
    tooltipTemplate: String = null,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    transitionEasingFunction: js.Any = null,
    transitionInDuration: js.UndefOr[Double] = js.undefined,
    transitionInMode: String = null,
    transitionInSpeedType: String = null,
    trendLineBrush: String = null,
    trendLinePeriod: js.UndefOr[Double] = js.undefined,
    trendLineThickness: js.UndefOr[Double] = js.undefined,
    trendLineType: String = null,
    trendLineZIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    unknownValuePlotting: String = null,
    useBruteForce: js.UndefOr[Boolean] = js.undefined,
    useCartesianInterpolation: js.UndefOr[Boolean] = js.undefined,
    useHighMarkerFidelity: js.UndefOr[Boolean] = js.undefined,
    useIndex: js.UndefOr[Boolean] = js.undefined,
    useInterpolation: js.UndefOr[Boolean] = js.undefined,
    useLegend: js.UndefOr[Boolean] = js.undefined,
    useSingleShadow: js.UndefOr[Boolean] = js.undefined,
    useSquareCutoffStyle: js.UndefOr[Boolean] = js.undefined,
    valueAxis: String = null,
    valueMemberPath: String = null,
    verticalLineStroke: String = null,
    verticalLineVisibility: String = null,
    volumeMemberPath: String = null,
    xAxis: String = null,
    xAxisAnnoationFormatLabel: js.Any = null,
    xAxisAnnotationBackground: String = null,
    xAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationOutline: String = null,
    xAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined,
    xAxisAnnotationTextColor: String = null,
    xMemberPath: String = null,
    yAxis: String = null,
    yAxisAnnoationFormatLabel: js.Any = null,
    yAxisAnnotationBackground: String = null,
    yAxisAnnotationInterpolatedValuePrecision: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationOutline: String = null,
    yAxisAnnotationPaddingBottom: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationPaddingLeft: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationPaddingRight: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationPaddingTop: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationStrokeThickness: js.UndefOr[Double] = js.undefined,
    yAxisAnnotationTextColor: String = null,
    yMemberPath: String = null
  ): IgDataChartSeries = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (angleAxis != null) __obj.updateDynamic("angleAxis")(angleAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(angleMemberPath)) __obj.updateDynamic("angleMemberPath")(angleMemberPath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(areaFillOpacity)) __obj.updateDynamic("areaFillOpacity")(areaFillOpacity.get.asInstanceOf[js.Any])
    if (axisAnnoationFormatLabel != null) __obj.updateDynamic("axisAnnoationFormatLabel")(axisAnnoationFormatLabel.asInstanceOf[js.Any])
    if (axisAnnotationBackground != null) __obj.updateDynamic("axisAnnotationBackground")(axisAnnotationBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationInterpolatedValuePrecision)) __obj.updateDynamic("axisAnnotationInterpolatedValuePrecision")(axisAnnotationInterpolatedValuePrecision.get.asInstanceOf[js.Any])
    if (axisAnnotationOutline != null) __obj.updateDynamic("axisAnnotationOutline")(axisAnnotationOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationPaddingBottom)) __obj.updateDynamic("axisAnnotationPaddingBottom")(axisAnnotationPaddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationPaddingLeft)) __obj.updateDynamic("axisAnnotationPaddingLeft")(axisAnnotationPaddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationPaddingRight)) __obj.updateDynamic("axisAnnotationPaddingRight")(axisAnnotationPaddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationPaddingTop)) __obj.updateDynamic("axisAnnotationPaddingTop")(axisAnnotationPaddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisAnnotationStrokeThickness)) __obj.updateDynamic("axisAnnotationStrokeThickness")(axisAnnotationStrokeThickness.get.asInstanceOf[js.Any])
    if (axisAnnotationTextColor != null) __obj.updateDynamic("axisAnnotationTextColor")(axisAnnotationTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bandHighlightWidth)) __obj.updateDynamic("bandHighlightWidth")(bandHighlightWidth.get.asInstanceOf[js.Any])
    if (brush != null) __obj.updateDynamic("brush")(brush.asInstanceOf[js.Any])
    if (calloutBackground != null) __obj.updateDynamic("calloutBackground")(calloutBackground.asInstanceOf[js.Any])
    if (calloutCollisionMode != null) __obj.updateDynamic("calloutCollisionMode")(calloutCollisionMode.asInstanceOf[js.Any])
    if (calloutContentUpdating != null) __obj.updateDynamic("calloutContentUpdating")(calloutContentUpdating.asInstanceOf[js.Any])
    if (calloutLabelUpdating != null) __obj.updateDynamic("calloutLabelUpdating")(calloutLabelUpdating.asInstanceOf[js.Any])
    if (calloutLeaderBrush != null) __obj.updateDynamic("calloutLeaderBrush")(calloutLeaderBrush.asInstanceOf[js.Any])
    if (calloutOutline != null) __obj.updateDynamic("calloutOutline")(calloutOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutPaddingBottom)) __obj.updateDynamic("calloutPaddingBottom")(calloutPaddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutPaddingLeft)) __obj.updateDynamic("calloutPaddingLeft")(calloutPaddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutPaddingRight)) __obj.updateDynamic("calloutPaddingRight")(calloutPaddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutPaddingTop)) __obj.updateDynamic("calloutPaddingTop")(calloutPaddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutPositionPadding)) __obj.updateDynamic("calloutPositionPadding")(calloutPositionPadding.get.asInstanceOf[js.Any])
    if (calloutSeriesSelecting != null) __obj.updateDynamic("calloutSeriesSelecting")(calloutSeriesSelecting.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutStrokeThickness)) __obj.updateDynamic("calloutStrokeThickness")(calloutStrokeThickness.get.asInstanceOf[js.Any])
    if (calloutTextColor != null) __obj.updateDynamic("calloutTextColor")(calloutTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(clipSeriesToBounds)) __obj.updateDynamic("clipSeriesToBounds")(clipSeriesToBounds.get.asInstanceOf[js.Any])
    if (closeMemberPath != null) __obj.updateDynamic("closeMemberPath")(closeMemberPath.asInstanceOf[js.Any])
    if (coercionMethods != null) __obj.updateDynamic("coercionMethods")(coercionMethods.asInstanceOf[js.Any])
    if (consolidatedColumnVerticalPosition != null) __obj.updateDynamic("consolidatedColumnVerticalPosition")(consolidatedColumnVerticalPosition.asInstanceOf[js.Any])
    if (contentMemberPath != null) __obj.updateDynamic("contentMemberPath")(contentMemberPath.asInstanceOf[js.Any])
    if (cursorPosition != null) __obj.updateDynamic("cursorPosition")(cursorPosition.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (discreteLegendItemTemplate != null) __obj.updateDynamic("discreteLegendItemTemplate")(discreteLegendItemTemplate.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (!js.isUndefined(expectFunctions)) __obj.updateDynamic("expectFunctions")(expectFunctions.get.asInstanceOf[js.Any])
    if (fillMemberPath != null) __obj.updateDynamic("fillMemberPath")(fillMemberPath.asInstanceOf[js.Any])
    if (fillScale != null) __obj.updateDynamic("fillScale")(fillScale.asInstanceOf[js.Any])
    if (finalValueSelectionMode != null) __obj.updateDynamic("finalValueSelectionMode")(finalValueSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(heatMaximum)) __obj.updateDynamic("heatMaximum")(heatMaximum.get.asInstanceOf[js.Any])
    if (heatMaximumColor != null) __obj.updateDynamic("heatMaximumColor")(heatMaximumColor.asInstanceOf[js.Any])
    if (!js.isUndefined(heatMinimum)) __obj.updateDynamic("heatMinimum")(heatMinimum.get.asInstanceOf[js.Any])
    if (heatMinimumColor != null) __obj.updateDynamic("heatMinimumColor")(heatMinimumColor.asInstanceOf[js.Any])
    if (highMemberPath != null) __obj.updateDynamic("highMemberPath")(highMemberPath.asInstanceOf[js.Any])
    if (highlightType != null) __obj.updateDynamic("highlightType")(highlightType.asInstanceOf[js.Any])
    if (hitTestMode != null) __obj.updateDynamic("hitTestMode")(hitTestMode.asInstanceOf[js.Any])
    if (horizontalLineStroke != null) __obj.updateDynamic("horizontalLineStroke")(horizontalLineStroke.asInstanceOf[js.Any])
    if (horizontalLineVisibility != null) __obj.updateDynamic("horizontalLineVisibility")(horizontalLineVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFirst)) __obj.updateDynamic("ignoreFirst")(ignoreFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAxisAnnotationEnabled)) __obj.updateDynamic("isAxisAnnotationEnabled")(isAxisAnnotationEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCalloutOffsettingEnabled)) __obj.updateDynamic("isCalloutOffsettingEnabled")(isCalloutOffsettingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomCategoryMarkerStyleAllowed)) __obj.updateDynamic("isCustomCategoryMarkerStyleAllowed")(isCustomCategoryMarkerStyleAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomCategoryStyleAllowed)) __obj.updateDynamic("isCustomCategoryStyleAllowed")(isCustomCategoryStyleAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultCrosshairDisabled)) __obj.updateDynamic("isDefaultCrosshairDisabled")(isDefaultCrosshairDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropShadowEnabled)) __obj.updateDynamic("isDropShadowEnabled")(isDropShadowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlightingEnabled)) __obj.updateDynamic("isHighlightingEnabled")(isHighlightingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTransitionInEnabled)) __obj.updateDynamic("isTransitionInEnabled")(isTransitionInEnabled.get.asInstanceOf[js.Any])
    if (keyMemberPath != null) __obj.updateDynamic("keyMemberPath")(keyMemberPath.asInstanceOf[js.Any])
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendItemBadgeTemplate != null) __obj.updateDynamic("legendItemBadgeTemplate")(legendItemBadgeTemplate.asInstanceOf[js.Any])
    if (legendItemTemplate != null) __obj.updateDynamic("legendItemTemplate")(legendItemTemplate.asInstanceOf[js.Any])
    if (legendItemVisibility != null) __obj.updateDynamic("legendItemVisibility")(legendItemVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(longPeriod)) __obj.updateDynamic("longPeriod")(longPeriod.get.asInstanceOf[js.Any])
    if (lowMemberPath != null) __obj.updateDynamic("lowMemberPath")(lowMemberPath.asInstanceOf[js.Any])
    if (markerBrush != null) __obj.updateDynamic("markerBrush")(markerBrush.asInstanceOf[js.Any])
    if (markerCollisionAvoidance != null) __obj.updateDynamic("markerCollisionAvoidance")(markerCollisionAvoidance.asInstanceOf[js.Any])
    if (markerOutline != null) __obj.updateDynamic("markerOutline")(markerOutline.asInstanceOf[js.Any])
    if (markerTemplate != null) __obj.updateDynamic("markerTemplate")(markerTemplate.asInstanceOf[js.Any])
    if (markerType != null) __obj.updateDynamic("markerType")(markerType.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumMarkers)) __obj.updateDynamic("maximumMarkers")(maximumMarkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseOverEnabled)) __obj.updateDynamic("mouseOverEnabled")(mouseOverEnabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negativeBrush != null) __obj.updateDynamic("negativeBrush")(negativeBrush.asInstanceOf[js.Any])
    if (openMemberPath != null) __obj.updateDynamic("openMemberPath")(openMemberPath.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressiveLoad)) __obj.updateDynamic("progressiveLoad")(progressiveLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (radiusAxis != null) __obj.updateDynamic("radiusAxis")(radiusAxis.asInstanceOf[js.Any])
    if (radiusMemberPath != null) __obj.updateDynamic("radiusMemberPath")(radiusMemberPath.asInstanceOf[js.Any])
    if (radiusScale != null) __obj.updateDynamic("radiusScale")(radiusScale.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusX)) __obj.updateDynamic("radiusX")(radiusX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusY)) __obj.updateDynamic("radiusY")(radiusY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseLegendOrder)) __obj.updateDynamic("reverseLegendOrder")(reverseLegendOrder.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortPeriod)) __obj.updateDynamic("shortPeriod")(shortPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnknownValues)) __obj.updateDynamic("skipUnknownValues")(skipUnknownValues.get.asInstanceOf[js.Any])
    if (splineType != null) __obj.updateDynamic("splineType")(splineType.asInstanceOf[js.Any])
    if (targetAxis != null) __obj.updateDynamic("targetAxis")(targetAxis.asInstanceOf[js.Any])
    if (targetSeries != null) __obj.updateDynamic("targetSeries")(targetSeries.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionInDuration)) __obj.updateDynamic("transitionInDuration")(transitionInDuration.get.asInstanceOf[js.Any])
    if (transitionInMode != null) __obj.updateDynamic("transitionInMode")(transitionInMode.asInstanceOf[js.Any])
    if (transitionInSpeedType != null) __obj.updateDynamic("transitionInSpeedType")(transitionInSpeedType.asInstanceOf[js.Any])
    if (trendLineBrush != null) __obj.updateDynamic("trendLineBrush")(trendLineBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(trendLinePeriod)) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trendLineThickness)) __obj.updateDynamic("trendLineThickness")(trendLineThickness.get.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType.asInstanceOf[js.Any])
    if (!js.isUndefined(trendLineZIndex)) __obj.updateDynamic("trendLineZIndex")(trendLineZIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting.asInstanceOf[js.Any])
    if (!js.isUndefined(useBruteForce)) __obj.updateDynamic("useBruteForce")(useBruteForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCartesianInterpolation)) __obj.updateDynamic("useCartesianInterpolation")(useCartesianInterpolation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useHighMarkerFidelity)) __obj.updateDynamic("useHighMarkerFidelity")(useHighMarkerFidelity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useIndex)) __obj.updateDynamic("useIndex")(useIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useInterpolation)) __obj.updateDynamic("useInterpolation")(useInterpolation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegend)) __obj.updateDynamic("useLegend")(useLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleShadow)) __obj.updateDynamic("useSingleShadow")(useSingleShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSquareCutoffStyle)) __obj.updateDynamic("useSquareCutoffStyle")(useSquareCutoffStyle.get.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath.asInstanceOf[js.Any])
    if (verticalLineStroke != null) __obj.updateDynamic("verticalLineStroke")(verticalLineStroke.asInstanceOf[js.Any])
    if (verticalLineVisibility != null) __obj.updateDynamic("verticalLineVisibility")(verticalLineVisibility.asInstanceOf[js.Any])
    if (volumeMemberPath != null) __obj.updateDynamic("volumeMemberPath")(volumeMemberPath.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (xAxisAnnoationFormatLabel != null) __obj.updateDynamic("xAxisAnnoationFormatLabel")(xAxisAnnoationFormatLabel.asInstanceOf[js.Any])
    if (xAxisAnnotationBackground != null) __obj.updateDynamic("xAxisAnnotationBackground")(xAxisAnnotationBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationInterpolatedValuePrecision)) __obj.updateDynamic("xAxisAnnotationInterpolatedValuePrecision")(xAxisAnnotationInterpolatedValuePrecision.get.asInstanceOf[js.Any])
    if (xAxisAnnotationOutline != null) __obj.updateDynamic("xAxisAnnotationOutline")(xAxisAnnotationOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationPaddingBottom)) __obj.updateDynamic("xAxisAnnotationPaddingBottom")(xAxisAnnotationPaddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationPaddingLeft)) __obj.updateDynamic("xAxisAnnotationPaddingLeft")(xAxisAnnotationPaddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationPaddingRight)) __obj.updateDynamic("xAxisAnnotationPaddingRight")(xAxisAnnotationPaddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationPaddingTop)) __obj.updateDynamic("xAxisAnnotationPaddingTop")(xAxisAnnotationPaddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAnnotationStrokeThickness)) __obj.updateDynamic("xAxisAnnotationStrokeThickness")(xAxisAnnotationStrokeThickness.get.asInstanceOf[js.Any])
    if (xAxisAnnotationTextColor != null) __obj.updateDynamic("xAxisAnnotationTextColor")(xAxisAnnotationTextColor.asInstanceOf[js.Any])
    if (xMemberPath != null) __obj.updateDynamic("xMemberPath")(xMemberPath.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (yAxisAnnoationFormatLabel != null) __obj.updateDynamic("yAxisAnnoationFormatLabel")(yAxisAnnoationFormatLabel.asInstanceOf[js.Any])
    if (yAxisAnnotationBackground != null) __obj.updateDynamic("yAxisAnnotationBackground")(yAxisAnnotationBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationInterpolatedValuePrecision)) __obj.updateDynamic("yAxisAnnotationInterpolatedValuePrecision")(yAxisAnnotationInterpolatedValuePrecision.get.asInstanceOf[js.Any])
    if (yAxisAnnotationOutline != null) __obj.updateDynamic("yAxisAnnotationOutline")(yAxisAnnotationOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationPaddingBottom)) __obj.updateDynamic("yAxisAnnotationPaddingBottom")(yAxisAnnotationPaddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationPaddingLeft)) __obj.updateDynamic("yAxisAnnotationPaddingLeft")(yAxisAnnotationPaddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationPaddingRight)) __obj.updateDynamic("yAxisAnnotationPaddingRight")(yAxisAnnotationPaddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationPaddingTop)) __obj.updateDynamic("yAxisAnnotationPaddingTop")(yAxisAnnotationPaddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAnnotationStrokeThickness)) __obj.updateDynamic("yAxisAnnotationStrokeThickness")(yAxisAnnotationStrokeThickness.get.asInstanceOf[js.Any])
    if (yAxisAnnotationTextColor != null) __obj.updateDynamic("yAxisAnnotationTextColor")(yAxisAnnotationTextColor.asInstanceOf[js.Any])
    if (yMemberPath != null) __obj.updateDynamic("yMemberPath")(yMemberPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChartSeries]
  }
}

