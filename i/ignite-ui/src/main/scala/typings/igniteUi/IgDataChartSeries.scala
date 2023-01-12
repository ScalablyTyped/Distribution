package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDataChartSeries
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  var axisAnnoationFormatLabel: js.UndefOr[Any] = js.undefined
  
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
  var calloutContentUpdating: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets or gets a function which lets you modify or provide the label for an automatically created callout.
    */
  var calloutLabelUpdating: js.UndefOr[Any] = js.undefined
  
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
  var calloutSeriesSelecting: js.UndefOr[Any] = js.undefined
  
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
  var coercionMethods: js.UndefOr[Any] = js.undefined
  
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
  var cursorPosition: js.UndefOr[Any] = js.undefined
  
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
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
  var discreteLegendItemTemplate: js.UndefOr[Any] = js.undefined
  
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
  var fillScale: js.UndefOr[Any] = js.undefined
  
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
  var heatMaximumColor: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the density value that maps to the minimum heat color.
    */
  var heatMinimum: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the minimum heat color for the density scale.
    */
  var heatMinimumColor: js.UndefOr[Any] = js.undefined
  
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
  var legendItemBadgeTemplate: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the LegendItemTemplate property.
    * The legend item control content is created according to the LegendItemTemplate on-demand by
    * the series object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var legendItemTemplate: js.UndefOr[Any] = js.undefined
  
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
  var markerTemplate: js.UndefOr[Any] = js.undefined
  
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
  var radiusScale: js.UndefOr[Any] = js.undefined
  
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
  var series: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets or sets the blur amount to use for the drop shadow.
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the color to use for the drop shadow.
    */
  var shadowColor: js.UndefOr[Any] = js.undefined
  
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
  var transitionEasingFunction: js.UndefOr[Any] = js.undefined
  
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
  var xAxisAnnoationFormatLabel: js.UndefOr[Any] = js.undefined
  
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
  var yAxisAnnoationFormatLabel: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): IgDataChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartSeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgDataChartSeries] (val x: Self) extends AnyVal {
    
    inline def setAngleAxis(value: String): Self = StObject.set(x, "angleAxis", value.asInstanceOf[js.Any])
    
    inline def setAngleAxisUndefined: Self = StObject.set(x, "angleAxis", js.undefined)
    
    inline def setAngleMemberPath(value: Double): Self = StObject.set(x, "angleMemberPath", value.asInstanceOf[js.Any])
    
    inline def setAngleMemberPathUndefined: Self = StObject.set(x, "angleMemberPath", js.undefined)
    
    inline def setAreaFillOpacity(value: Double): Self = StObject.set(x, "areaFillOpacity", value.asInstanceOf[js.Any])
    
    inline def setAreaFillOpacityUndefined: Self = StObject.set(x, "areaFillOpacity", js.undefined)
    
    inline def setAxisAnnoationFormatLabel(value: Any): Self = StObject.set(x, "axisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnoationFormatLabelUndefined: Self = StObject.set(x, "axisAnnoationFormatLabel", js.undefined)
    
    inline def setAxisAnnotationBackground(value: String): Self = StObject.set(x, "axisAnnotationBackground", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationBackgroundUndefined: Self = StObject.set(x, "axisAnnotationBackground", js.undefined)
    
    inline def setAxisAnnotationInterpolatedValuePrecision(value: Double): Self = StObject.set(x, "axisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationInterpolatedValuePrecisionUndefined: Self = StObject.set(x, "axisAnnotationInterpolatedValuePrecision", js.undefined)
    
    inline def setAxisAnnotationOutline(value: String): Self = StObject.set(x, "axisAnnotationOutline", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationOutlineUndefined: Self = StObject.set(x, "axisAnnotationOutline", js.undefined)
    
    inline def setAxisAnnotationPaddingBottom(value: Double): Self = StObject.set(x, "axisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationPaddingBottomUndefined: Self = StObject.set(x, "axisAnnotationPaddingBottom", js.undefined)
    
    inline def setAxisAnnotationPaddingLeft(value: Double): Self = StObject.set(x, "axisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationPaddingLeftUndefined: Self = StObject.set(x, "axisAnnotationPaddingLeft", js.undefined)
    
    inline def setAxisAnnotationPaddingRight(value: Double): Self = StObject.set(x, "axisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationPaddingRightUndefined: Self = StObject.set(x, "axisAnnotationPaddingRight", js.undefined)
    
    inline def setAxisAnnotationPaddingTop(value: Double): Self = StObject.set(x, "axisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationPaddingTopUndefined: Self = StObject.set(x, "axisAnnotationPaddingTop", js.undefined)
    
    inline def setAxisAnnotationStrokeThickness(value: Double): Self = StObject.set(x, "axisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationStrokeThicknessUndefined: Self = StObject.set(x, "axisAnnotationStrokeThickness", js.undefined)
    
    inline def setAxisAnnotationTextColor(value: String): Self = StObject.set(x, "axisAnnotationTextColor", value.asInstanceOf[js.Any])
    
    inline def setAxisAnnotationTextColorUndefined: Self = StObject.set(x, "axisAnnotationTextColor", js.undefined)
    
    inline def setBandHighlightWidth(value: Double): Self = StObject.set(x, "bandHighlightWidth", value.asInstanceOf[js.Any])
    
    inline def setBandHighlightWidthUndefined: Self = StObject.set(x, "bandHighlightWidth", js.undefined)
    
    inline def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
    
    inline def setCalloutBackground(value: String): Self = StObject.set(x, "calloutBackground", value.asInstanceOf[js.Any])
    
    inline def setCalloutBackgroundUndefined: Self = StObject.set(x, "calloutBackground", js.undefined)
    
    inline def setCalloutCollisionMode(value: String): Self = StObject.set(x, "calloutCollisionMode", value.asInstanceOf[js.Any])
    
    inline def setCalloutCollisionModeUndefined: Self = StObject.set(x, "calloutCollisionMode", js.undefined)
    
    inline def setCalloutContentUpdating(value: Any): Self = StObject.set(x, "calloutContentUpdating", value.asInstanceOf[js.Any])
    
    inline def setCalloutContentUpdatingUndefined: Self = StObject.set(x, "calloutContentUpdating", js.undefined)
    
    inline def setCalloutLabelUpdating(value: Any): Self = StObject.set(x, "calloutLabelUpdating", value.asInstanceOf[js.Any])
    
    inline def setCalloutLabelUpdatingUndefined: Self = StObject.set(x, "calloutLabelUpdating", js.undefined)
    
    inline def setCalloutLeaderBrush(value: String): Self = StObject.set(x, "calloutLeaderBrush", value.asInstanceOf[js.Any])
    
    inline def setCalloutLeaderBrushUndefined: Self = StObject.set(x, "calloutLeaderBrush", js.undefined)
    
    inline def setCalloutOutline(value: String): Self = StObject.set(x, "calloutOutline", value.asInstanceOf[js.Any])
    
    inline def setCalloutOutlineUndefined: Self = StObject.set(x, "calloutOutline", js.undefined)
    
    inline def setCalloutPaddingBottom(value: Double): Self = StObject.set(x, "calloutPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setCalloutPaddingBottomUndefined: Self = StObject.set(x, "calloutPaddingBottom", js.undefined)
    
    inline def setCalloutPaddingLeft(value: Double): Self = StObject.set(x, "calloutPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setCalloutPaddingLeftUndefined: Self = StObject.set(x, "calloutPaddingLeft", js.undefined)
    
    inline def setCalloutPaddingRight(value: Double): Self = StObject.set(x, "calloutPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setCalloutPaddingRightUndefined: Self = StObject.set(x, "calloutPaddingRight", js.undefined)
    
    inline def setCalloutPaddingTop(value: Double): Self = StObject.set(x, "calloutPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setCalloutPaddingTopUndefined: Self = StObject.set(x, "calloutPaddingTop", js.undefined)
    
    inline def setCalloutPositionPadding(value: Double): Self = StObject.set(x, "calloutPositionPadding", value.asInstanceOf[js.Any])
    
    inline def setCalloutPositionPaddingUndefined: Self = StObject.set(x, "calloutPositionPadding", js.undefined)
    
    inline def setCalloutSeriesSelecting(value: Any): Self = StObject.set(x, "calloutSeriesSelecting", value.asInstanceOf[js.Any])
    
    inline def setCalloutSeriesSelectingUndefined: Self = StObject.set(x, "calloutSeriesSelecting", js.undefined)
    
    inline def setCalloutStrokeThickness(value: Double): Self = StObject.set(x, "calloutStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setCalloutStrokeThicknessUndefined: Self = StObject.set(x, "calloutStrokeThickness", js.undefined)
    
    inline def setCalloutTextColor(value: String): Self = StObject.set(x, "calloutTextColor", value.asInstanceOf[js.Any])
    
    inline def setCalloutTextColorUndefined: Self = StObject.set(x, "calloutTextColor", js.undefined)
    
    inline def setClipSeriesToBounds(value: Boolean): Self = StObject.set(x, "clipSeriesToBounds", value.asInstanceOf[js.Any])
    
    inline def setClipSeriesToBoundsUndefined: Self = StObject.set(x, "clipSeriesToBounds", js.undefined)
    
    inline def setCloseMemberPath(value: String): Self = StObject.set(x, "closeMemberPath", value.asInstanceOf[js.Any])
    
    inline def setCloseMemberPathUndefined: Self = StObject.set(x, "closeMemberPath", js.undefined)
    
    inline def setCoercionMethods(value: Any): Self = StObject.set(x, "coercionMethods", value.asInstanceOf[js.Any])
    
    inline def setCoercionMethodsUndefined: Self = StObject.set(x, "coercionMethods", js.undefined)
    
    inline def setConsolidatedColumnVerticalPosition(value: String): Self = StObject.set(x, "consolidatedColumnVerticalPosition", value.asInstanceOf[js.Any])
    
    inline def setConsolidatedColumnVerticalPositionUndefined: Self = StObject.set(x, "consolidatedColumnVerticalPosition", js.undefined)
    
    inline def setContentMemberPath(value: String): Self = StObject.set(x, "contentMemberPath", value.asInstanceOf[js.Any])
    
    inline def setContentMemberPathUndefined: Self = StObject.set(x, "contentMemberPath", js.undefined)
    
    inline def setCursorPosition(value: Any): Self = StObject.set(x, "cursorPosition", value.asInstanceOf[js.Any])
    
    inline def setCursorPositionUndefined: Self = StObject.set(x, "cursorPosition", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    inline def setDiscreteLegendItemTemplate(value: Any): Self = StObject.set(x, "discreteLegendItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setDiscreteLegendItemTemplateUndefined: Self = StObject.set(x, "discreteLegendItemTemplate", js.undefined)
    
    inline def setDisplayType(value: String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setExpectFunctions(value: Boolean): Self = StObject.set(x, "expectFunctions", value.asInstanceOf[js.Any])
    
    inline def setExpectFunctionsUndefined: Self = StObject.set(x, "expectFunctions", js.undefined)
    
    inline def setFillMemberPath(value: String): Self = StObject.set(x, "fillMemberPath", value.asInstanceOf[js.Any])
    
    inline def setFillMemberPathUndefined: Self = StObject.set(x, "fillMemberPath", js.undefined)
    
    inline def setFillScale(value: Any): Self = StObject.set(x, "fillScale", value.asInstanceOf[js.Any])
    
    inline def setFillScaleUndefined: Self = StObject.set(x, "fillScale", js.undefined)
    
    inline def setFinalValueSelectionMode(value: String): Self = StObject.set(x, "finalValueSelectionMode", value.asInstanceOf[js.Any])
    
    inline def setFinalValueSelectionModeUndefined: Self = StObject.set(x, "finalValueSelectionMode", js.undefined)
    
    inline def setHeatMaximum(value: Double): Self = StObject.set(x, "heatMaximum", value.asInstanceOf[js.Any])
    
    inline def setHeatMaximumColor(value: Any): Self = StObject.set(x, "heatMaximumColor", value.asInstanceOf[js.Any])
    
    inline def setHeatMaximumColorUndefined: Self = StObject.set(x, "heatMaximumColor", js.undefined)
    
    inline def setHeatMaximumUndefined: Self = StObject.set(x, "heatMaximum", js.undefined)
    
    inline def setHeatMinimum(value: Double): Self = StObject.set(x, "heatMinimum", value.asInstanceOf[js.Any])
    
    inline def setHeatMinimumColor(value: Any): Self = StObject.set(x, "heatMinimumColor", value.asInstanceOf[js.Any])
    
    inline def setHeatMinimumColorUndefined: Self = StObject.set(x, "heatMinimumColor", js.undefined)
    
    inline def setHeatMinimumUndefined: Self = StObject.set(x, "heatMinimum", js.undefined)
    
    inline def setHighMemberPath(value: String): Self = StObject.set(x, "highMemberPath", value.asInstanceOf[js.Any])
    
    inline def setHighMemberPathUndefined: Self = StObject.set(x, "highMemberPath", js.undefined)
    
    inline def setHighlightType(value: String): Self = StObject.set(x, "highlightType", value.asInstanceOf[js.Any])
    
    inline def setHighlightTypeUndefined: Self = StObject.set(x, "highlightType", js.undefined)
    
    inline def setHitTestMode(value: String): Self = StObject.set(x, "hitTestMode", value.asInstanceOf[js.Any])
    
    inline def setHitTestModeUndefined: Self = StObject.set(x, "hitTestMode", js.undefined)
    
    inline def setHorizontalLineStroke(value: String): Self = StObject.set(x, "horizontalLineStroke", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineStrokeUndefined: Self = StObject.set(x, "horizontalLineStroke", js.undefined)
    
    inline def setHorizontalLineVisibility(value: String): Self = StObject.set(x, "horizontalLineVisibility", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineVisibilityUndefined: Self = StObject.set(x, "horizontalLineVisibility", js.undefined)
    
    inline def setIgnoreFirst(value: Double): Self = StObject.set(x, "ignoreFirst", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFirstUndefined: Self = StObject.set(x, "ignoreFirst", js.undefined)
    
    inline def setIsAxisAnnotationEnabled(value: Boolean): Self = StObject.set(x, "isAxisAnnotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAxisAnnotationEnabledUndefined: Self = StObject.set(x, "isAxisAnnotationEnabled", js.undefined)
    
    inline def setIsCalloutOffsettingEnabled(value: Boolean): Self = StObject.set(x, "isCalloutOffsettingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsCalloutOffsettingEnabledUndefined: Self = StObject.set(x, "isCalloutOffsettingEnabled", js.undefined)
    
    inline def setIsCustomCategoryMarkerStyleAllowed(value: Boolean): Self = StObject.set(x, "isCustomCategoryMarkerStyleAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsCustomCategoryMarkerStyleAllowedUndefined: Self = StObject.set(x, "isCustomCategoryMarkerStyleAllowed", js.undefined)
    
    inline def setIsCustomCategoryStyleAllowed(value: Boolean): Self = StObject.set(x, "isCustomCategoryStyleAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsCustomCategoryStyleAllowedUndefined: Self = StObject.set(x, "isCustomCategoryStyleAllowed", js.undefined)
    
    inline def setIsDefaultCrosshairDisabled(value: Boolean): Self = StObject.set(x, "isDefaultCrosshairDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultCrosshairDisabledUndefined: Self = StObject.set(x, "isDefaultCrosshairDisabled", js.undefined)
    
    inline def setIsDropShadowEnabled(value: Boolean): Self = StObject.set(x, "isDropShadowEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsDropShadowEnabledUndefined: Self = StObject.set(x, "isDropShadowEnabled", js.undefined)
    
    inline def setIsHighlightingEnabled(value: Boolean): Self = StObject.set(x, "isHighlightingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsHighlightingEnabledUndefined: Self = StObject.set(x, "isHighlightingEnabled", js.undefined)
    
    inline def setIsTransitionInEnabled(value: Boolean): Self = StObject.set(x, "isTransitionInEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsTransitionInEnabledUndefined: Self = StObject.set(x, "isTransitionInEnabled", js.undefined)
    
    inline def setKeyMemberPath(value: String): Self = StObject.set(x, "keyMemberPath", value.asInstanceOf[js.Any])
    
    inline def setKeyMemberPathUndefined: Self = StObject.set(x, "keyMemberPath", js.undefined)
    
    inline def setLabelMemberPath(value: String): Self = StObject.set(x, "labelMemberPath", value.asInstanceOf[js.Any])
    
    inline def setLabelMemberPathUndefined: Self = StObject.set(x, "labelMemberPath", js.undefined)
    
    inline def setLegend(value: IgDataChartSeriesLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendItemBadgeTemplate(value: Any): Self = StObject.set(x, "legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegendItemBadgeTemplateUndefined: Self = StObject.set(x, "legendItemBadgeTemplate", js.undefined)
    
    inline def setLegendItemTemplate(value: Any): Self = StObject.set(x, "legendItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegendItemTemplateUndefined: Self = StObject.set(x, "legendItemTemplate", js.undefined)
    
    inline def setLegendItemVisibility(value: String): Self = StObject.set(x, "legendItemVisibility", value.asInstanceOf[js.Any])
    
    inline def setLegendItemVisibilityUndefined: Self = StObject.set(x, "legendItemVisibility", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
    
    inline def setLongPeriodUndefined: Self = StObject.set(x, "longPeriod", js.undefined)
    
    inline def setLowMemberPath(value: String): Self = StObject.set(x, "lowMemberPath", value.asInstanceOf[js.Any])
    
    inline def setLowMemberPathUndefined: Self = StObject.set(x, "lowMemberPath", js.undefined)
    
    inline def setMarkerBrush(value: String): Self = StObject.set(x, "markerBrush", value.asInstanceOf[js.Any])
    
    inline def setMarkerBrushUndefined: Self = StObject.set(x, "markerBrush", js.undefined)
    
    inline def setMarkerCollisionAvoidance(value: String): Self = StObject.set(x, "markerCollisionAvoidance", value.asInstanceOf[js.Any])
    
    inline def setMarkerCollisionAvoidanceUndefined: Self = StObject.set(x, "markerCollisionAvoidance", js.undefined)
    
    inline def setMarkerOutline(value: String): Self = StObject.set(x, "markerOutline", value.asInstanceOf[js.Any])
    
    inline def setMarkerOutlineUndefined: Self = StObject.set(x, "markerOutline", js.undefined)
    
    inline def setMarkerTemplate(value: Any): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
    
    inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
    
    inline def setMarkerType(value: String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
    
    inline def setMarkerTypeUndefined: Self = StObject.set(x, "markerType", js.undefined)
    
    inline def setMaximumMarkers(value: Double): Self = StObject.set(x, "maximumMarkers", value.asInstanceOf[js.Any])
    
    inline def setMaximumMarkersUndefined: Self = StObject.set(x, "maximumMarkers", js.undefined)
    
    inline def setMouseOverEnabled(value: Boolean): Self = StObject.set(x, "mouseOverEnabled", value.asInstanceOf[js.Any])
    
    inline def setMouseOverEnabledUndefined: Self = StObject.set(x, "mouseOverEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNegativeBrush(value: String): Self = StObject.set(x, "negativeBrush", value.asInstanceOf[js.Any])
    
    inline def setNegativeBrushUndefined: Self = StObject.set(x, "negativeBrush", js.undefined)
    
    inline def setOpenMemberPath(value: String): Self = StObject.set(x, "openMemberPath", value.asInstanceOf[js.Any])
    
    inline def setOpenMemberPathUndefined: Self = StObject.set(x, "openMemberPath", js.undefined)
    
    inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusAxis(value: String): Self = StObject.set(x, "radiusAxis", value.asInstanceOf[js.Any])
    
    inline def setRadiusAxisUndefined: Self = StObject.set(x, "radiusAxis", js.undefined)
    
    inline def setRadiusMemberPath(value: String): Self = StObject.set(x, "radiusMemberPath", value.asInstanceOf[js.Any])
    
    inline def setRadiusMemberPathUndefined: Self = StObject.set(x, "radiusMemberPath", js.undefined)
    
    inline def setRadiusScale(value: Any): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
    
    inline def setRadiusScaleUndefined: Self = StObject.set(x, "radiusScale", js.undefined)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    inline def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    inline def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setReverseLegendOrder(value: Boolean): Self = StObject.set(x, "reverseLegendOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseLegendOrderUndefined: Self = StObject.set(x, "reverseLegendOrder", js.undefined)
    
    inline def setSeries(value: js.Array[Any]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: Any*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: Any): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
    
    inline def setShortPeriodUndefined: Self = StObject.set(x, "shortPeriod", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setSkipUnknownValues(value: Boolean): Self = StObject.set(x, "skipUnknownValues", value.asInstanceOf[js.Any])
    
    inline def setSkipUnknownValuesUndefined: Self = StObject.set(x, "skipUnknownValues", js.undefined)
    
    inline def setSplineType(value: String): Self = StObject.set(x, "splineType", value.asInstanceOf[js.Any])
    
    inline def setSplineTypeUndefined: Self = StObject.set(x, "splineType", js.undefined)
    
    inline def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
    
    inline def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
    
    inline def setTargetSeries(value: String): Self = StObject.set(x, "targetSeries", value.asInstanceOf[js.Any])
    
    inline def setTargetSeriesUndefined: Self = StObject.set(x, "targetSeries", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltipPosition(value: String): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
    
    inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
    
    inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTransitionEasingFunction(value: Any): Self = StObject.set(x, "transitionEasingFunction", value.asInstanceOf[js.Any])
    
    inline def setTransitionEasingFunctionUndefined: Self = StObject.set(x, "transitionEasingFunction", js.undefined)
    
    inline def setTransitionInDuration(value: Double): Self = StObject.set(x, "transitionInDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionInDurationUndefined: Self = StObject.set(x, "transitionInDuration", js.undefined)
    
    inline def setTransitionInMode(value: String): Self = StObject.set(x, "transitionInMode", value.asInstanceOf[js.Any])
    
    inline def setTransitionInModeUndefined: Self = StObject.set(x, "transitionInMode", js.undefined)
    
    inline def setTransitionInSpeedType(value: String): Self = StObject.set(x, "transitionInSpeedType", value.asInstanceOf[js.Any])
    
    inline def setTransitionInSpeedTypeUndefined: Self = StObject.set(x, "transitionInSpeedType", js.undefined)
    
    inline def setTrendLineBrush(value: String): Self = StObject.set(x, "trendLineBrush", value.asInstanceOf[js.Any])
    
    inline def setTrendLineBrushUndefined: Self = StObject.set(x, "trendLineBrush", js.undefined)
    
    inline def setTrendLinePeriod(value: Double): Self = StObject.set(x, "trendLinePeriod", value.asInstanceOf[js.Any])
    
    inline def setTrendLinePeriodUndefined: Self = StObject.set(x, "trendLinePeriod", js.undefined)
    
    inline def setTrendLineThickness(value: Double): Self = StObject.set(x, "trendLineThickness", value.asInstanceOf[js.Any])
    
    inline def setTrendLineThicknessUndefined: Self = StObject.set(x, "trendLineThickness", js.undefined)
    
    inline def setTrendLineType(value: String): Self = StObject.set(x, "trendLineType", value.asInstanceOf[js.Any])
    
    inline def setTrendLineTypeUndefined: Self = StObject.set(x, "trendLineType", js.undefined)
    
    inline def setTrendLineZIndex(value: Double): Self = StObject.set(x, "trendLineZIndex", value.asInstanceOf[js.Any])
    
    inline def setTrendLineZIndexUndefined: Self = StObject.set(x, "trendLineZIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnknownValuePlotting(value: String): Self = StObject.set(x, "unknownValuePlotting", value.asInstanceOf[js.Any])
    
    inline def setUnknownValuePlottingUndefined: Self = StObject.set(x, "unknownValuePlotting", js.undefined)
    
    inline def setUseBruteForce(value: Boolean): Self = StObject.set(x, "useBruteForce", value.asInstanceOf[js.Any])
    
    inline def setUseBruteForceUndefined: Self = StObject.set(x, "useBruteForce", js.undefined)
    
    inline def setUseCartesianInterpolation(value: Boolean): Self = StObject.set(x, "useCartesianInterpolation", value.asInstanceOf[js.Any])
    
    inline def setUseCartesianInterpolationUndefined: Self = StObject.set(x, "useCartesianInterpolation", js.undefined)
    
    inline def setUseHighMarkerFidelity(value: Boolean): Self = StObject.set(x, "useHighMarkerFidelity", value.asInstanceOf[js.Any])
    
    inline def setUseHighMarkerFidelityUndefined: Self = StObject.set(x, "useHighMarkerFidelity", js.undefined)
    
    inline def setUseIndex(value: Boolean): Self = StObject.set(x, "useIndex", value.asInstanceOf[js.Any])
    
    inline def setUseIndexUndefined: Self = StObject.set(x, "useIndex", js.undefined)
    
    inline def setUseInterpolation(value: Boolean): Self = StObject.set(x, "useInterpolation", value.asInstanceOf[js.Any])
    
    inline def setUseInterpolationUndefined: Self = StObject.set(x, "useInterpolation", js.undefined)
    
    inline def setUseLegend(value: Boolean): Self = StObject.set(x, "useLegend", value.asInstanceOf[js.Any])
    
    inline def setUseLegendUndefined: Self = StObject.set(x, "useLegend", js.undefined)
    
    inline def setUseSingleShadow(value: Boolean): Self = StObject.set(x, "useSingleShadow", value.asInstanceOf[js.Any])
    
    inline def setUseSingleShadowUndefined: Self = StObject.set(x, "useSingleShadow", js.undefined)
    
    inline def setUseSquareCutoffStyle(value: Boolean): Self = StObject.set(x, "useSquareCutoffStyle", value.asInstanceOf[js.Any])
    
    inline def setUseSquareCutoffStyleUndefined: Self = StObject.set(x, "useSquareCutoffStyle", js.undefined)
    
    inline def setValueAxis(value: String): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    inline def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
    
    inline def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
    
    inline def setVerticalLineStroke(value: String): Self = StObject.set(x, "verticalLineStroke", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineStrokeUndefined: Self = StObject.set(x, "verticalLineStroke", js.undefined)
    
    inline def setVerticalLineVisibility(value: String): Self = StObject.set(x, "verticalLineVisibility", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineVisibilityUndefined: Self = StObject.set(x, "verticalLineVisibility", js.undefined)
    
    inline def setVolumeMemberPath(value: String): Self = StObject.set(x, "volumeMemberPath", value.asInstanceOf[js.Any])
    
    inline def setVolumeMemberPathUndefined: Self = StObject.set(x, "volumeMemberPath", js.undefined)
    
    inline def setXAxis(value: String): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnoationFormatLabel(value: Any): Self = StObject.set(x, "xAxisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnoationFormatLabelUndefined: Self = StObject.set(x, "xAxisAnnoationFormatLabel", js.undefined)
    
    inline def setXAxisAnnotationBackground(value: String): Self = StObject.set(x, "xAxisAnnotationBackground", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationBackgroundUndefined: Self = StObject.set(x, "xAxisAnnotationBackground", js.undefined)
    
    inline def setXAxisAnnotationInterpolatedValuePrecision(value: Double): Self = StObject.set(x, "xAxisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationInterpolatedValuePrecisionUndefined: Self = StObject.set(x, "xAxisAnnotationInterpolatedValuePrecision", js.undefined)
    
    inline def setXAxisAnnotationOutline(value: String): Self = StObject.set(x, "xAxisAnnotationOutline", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationOutlineUndefined: Self = StObject.set(x, "xAxisAnnotationOutline", js.undefined)
    
    inline def setXAxisAnnotationPaddingBottom(value: Double): Self = StObject.set(x, "xAxisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationPaddingBottomUndefined: Self = StObject.set(x, "xAxisAnnotationPaddingBottom", js.undefined)
    
    inline def setXAxisAnnotationPaddingLeft(value: Double): Self = StObject.set(x, "xAxisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationPaddingLeftUndefined: Self = StObject.set(x, "xAxisAnnotationPaddingLeft", js.undefined)
    
    inline def setXAxisAnnotationPaddingRight(value: Double): Self = StObject.set(x, "xAxisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationPaddingRightUndefined: Self = StObject.set(x, "xAxisAnnotationPaddingRight", js.undefined)
    
    inline def setXAxisAnnotationPaddingTop(value: Double): Self = StObject.set(x, "xAxisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationPaddingTopUndefined: Self = StObject.set(x, "xAxisAnnotationPaddingTop", js.undefined)
    
    inline def setXAxisAnnotationStrokeThickness(value: Double): Self = StObject.set(x, "xAxisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationStrokeThicknessUndefined: Self = StObject.set(x, "xAxisAnnotationStrokeThickness", js.undefined)
    
    inline def setXAxisAnnotationTextColor(value: String): Self = StObject.set(x, "xAxisAnnotationTextColor", value.asInstanceOf[js.Any])
    
    inline def setXAxisAnnotationTextColorUndefined: Self = StObject.set(x, "xAxisAnnotationTextColor", js.undefined)
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setXMemberPath(value: String): Self = StObject.set(x, "xMemberPath", value.asInstanceOf[js.Any])
    
    inline def setXMemberPathUndefined: Self = StObject.set(x, "xMemberPath", js.undefined)
    
    inline def setYAxis(value: String): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnoationFormatLabel(value: Any): Self = StObject.set(x, "yAxisAnnoationFormatLabel", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnoationFormatLabelUndefined: Self = StObject.set(x, "yAxisAnnoationFormatLabel", js.undefined)
    
    inline def setYAxisAnnotationBackground(value: String): Self = StObject.set(x, "yAxisAnnotationBackground", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationBackgroundUndefined: Self = StObject.set(x, "yAxisAnnotationBackground", js.undefined)
    
    inline def setYAxisAnnotationInterpolatedValuePrecision(value: Double): Self = StObject.set(x, "yAxisAnnotationInterpolatedValuePrecision", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationInterpolatedValuePrecisionUndefined: Self = StObject.set(x, "yAxisAnnotationInterpolatedValuePrecision", js.undefined)
    
    inline def setYAxisAnnotationOutline(value: String): Self = StObject.set(x, "yAxisAnnotationOutline", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationOutlineUndefined: Self = StObject.set(x, "yAxisAnnotationOutline", js.undefined)
    
    inline def setYAxisAnnotationPaddingBottom(value: Double): Self = StObject.set(x, "yAxisAnnotationPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationPaddingBottomUndefined: Self = StObject.set(x, "yAxisAnnotationPaddingBottom", js.undefined)
    
    inline def setYAxisAnnotationPaddingLeft(value: Double): Self = StObject.set(x, "yAxisAnnotationPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationPaddingLeftUndefined: Self = StObject.set(x, "yAxisAnnotationPaddingLeft", js.undefined)
    
    inline def setYAxisAnnotationPaddingRight(value: Double): Self = StObject.set(x, "yAxisAnnotationPaddingRight", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationPaddingRightUndefined: Self = StObject.set(x, "yAxisAnnotationPaddingRight", js.undefined)
    
    inline def setYAxisAnnotationPaddingTop(value: Double): Self = StObject.set(x, "yAxisAnnotationPaddingTop", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationPaddingTopUndefined: Self = StObject.set(x, "yAxisAnnotationPaddingTop", js.undefined)
    
    inline def setYAxisAnnotationStrokeThickness(value: Double): Self = StObject.set(x, "yAxisAnnotationStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationStrokeThicknessUndefined: Self = StObject.set(x, "yAxisAnnotationStrokeThickness", js.undefined)
    
    inline def setYAxisAnnotationTextColor(value: String): Self = StObject.set(x, "yAxisAnnotationTextColor", value.asInstanceOf[js.Any])
    
    inline def setYAxisAnnotationTextColorUndefined: Self = StObject.set(x, "yAxisAnnotationTextColor", js.undefined)
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    
    inline def setYMemberPath(value: String): Self = StObject.set(x, "yMemberPath", value.asInstanceOf[js.Any])
    
    inline def setYMemberPathUndefined: Self = StObject.set(x, "yMemberPath", js.undefined)
  }
}
