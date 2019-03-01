package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMapSeries
  extends /**
	 * Option for IgMapSeries
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
  	 */
  var angleMemberPath: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the series.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether to clip the series to the bounds.
  	 * Setting this to true can affect performance.
  	 */
  var clipSeriesToBounds: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the close mapping property for the current series object.
  	 */
  var closeMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property on each data item containing a numeric value which can be converted to a color by the ColorScale.
  	 */
  var colorMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The ColorScale used to resolve the color values of points in the series.
  	 */
  var colorScale: js.UndefOr[js.Any] = js.undefined
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
  	 * String The database source URI.
  	 */
  var databaseSource: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the DiscreteLegendItemTemplate property.
  	 * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
  	 * the series object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The name of the property on data source items which contains a numeric value to convert to a Brush using the FillScale.
  	 */
  var fillMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The ValueBrushScale to use when determining Brushes for each Shape, based on the values found in FillMemberPath.
  	 */
  var fillScale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the value that maps to the maximum heat color.
  	 */
  var heatMaximum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the density value that maps to the minimum heat color.
  	 */
  var heatMinimum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var highMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the number of values to hide at the beginning of the indicator.
  	 */
  var ignoreFirst: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the Label mapping property for the current series object.
  	 */
  var labelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property of data source items which contains the latitude coordinate of the symbol.
  	 */
  var latitudeMemberPath: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for long AVO periods is 30.
  	 */
  var longPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The name of the property of data source items which contains the longitude coordinate of the symbol.
  	 */
  var longitudeMemberPath: js.UndefOr[java.lang.String] = js.undefined
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
  var markerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the marker type for the current series object.If the MarkerTemplate property is set, the setting of the MarkerType property will be ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "unset"
  	 * "none"
  	 * "automatic"
  	 * "circle"
  	 * "triangle"
  	 * "pyramid"
  	 * "square"
  	 * "diamond"
  	 * "pentagon"
  	 * "hexagon"
  	 * "tetragram"
  	 * "pentagram"
  	 * "hexagram"
  	 */
  var markerType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the maximum number of markerItems displayed by the current series.
  	 * If more than the specified number of markerItems are visible, the series will automatically
  	 * choose a representative set.
  	 */
  var maximumMarkers: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the whether the map reacts to mouse move events.
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
  	 * Gets or sets the value mapping property for the current series object.
  	 */
  var openMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the series.
  	 * Some series types, such as LineSeries, do not display outlines.
  	 */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
  	 * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
  	 */
  var period: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the whether to progressively load the data into the map.
  	 */
  var progressiveLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the radius mapping property for the current series object.
  	 */
  var radiusMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the radius size scale for the bubbles.
  	 */
  var radiusScale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set to true in order to have an existing series removed from the map, by name
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
  	 * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
  	 */
  var shapeDataSource: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the resolution at which to filter out shapes in the series.
  	 * For example, if the shapeFilterResolution is set to 3, then elements with a bounding rectangle smaller than 3 X 3 pixels will be filtered out.
  	 */
  var shapeFilterResolution: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The name of the property on data source items which, for each shape, contains a list of points to be converted to a polygon.
  	 * To be consistent with the Shapefile technical description, it is expected that each list of points is defined as an IEnumerable of IEnumerable of Point, or in other words, a list of lists of points.
  	 */
  var shapeMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The default style to apply to all Shapes in the series.
  	 */
  var shapeStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The StyleSelector which is used to select a style for each Shape.
  	 */
  var shapeStyleSelector: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
  	 * The typical, and initial, value for short AVO periods is 10.
  	 */
  var shortPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether the map should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the type of spline to be rendered.
  	 *
  	 * Valid values:
  	 * "natural" Calculates the spline using a natural spline calculation formula.
  	 * "clamped" Calculated the spline using a clamped spline calculation formula.
  	 */
  var splineType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the Stiffness property.
  	 */
  var stiffness: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets the duration of the current series's morph.
  	 */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
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
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the first vertex point in the data source.
  	 */
  var triangleVertexMemberPath1: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the second vertex point in the data source.
  	 */
  var triangleVertexMemberPath2: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the third vertex point in the data source.
  	 */
  var triangleVertexMemberPath3: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The source of triangulation data.
  	 * This property is optional.  If it is left as null, the triangulation will be created based on the items in the data source.  Triangulation is a demanding operation, so the runtime performance will be better when specifying a TriangulationSource, especially when a large number of data items are present.
  	 */
  var trianglesSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
  	 */
  var triangulationDataSource: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Type of the series.
  	 *
  	 * Valid values:
  	 * "geographicSymbolSeries" Specify the series as geographic Symbol Series series.
  	 * "geographicPolyLine" Specify the series as geographic Polyline series.
  	 * "geographicScatterArea" Specify the series as geographic Scatter Area series.
  	 * "geographicShape" Specify the series as geographic Shape series.
  	 * "geographicContourLine" Specify the series as geographic Contour Line series.
  	 * "geographicHighDensityScatter" Specify the series as geographic High Density Scatter series.
  	 * "geographicProportionalSymbol" Specify the series as geographic Proportional Symbol series.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines how unknown values will be plotted on the map. Null and Double.NaN are two examples of unknown values.
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the map.
  	 */
  var unknownValuePlotting: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the whether to use use brute force mode.
  	 */
  var useBruteForce: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
  	 * spiral based interpolation.
  	 */
  var useCartesianInterpolation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the whether to use squares when halting a render traversal rather than the shape of the coalesced area.
  	 */
  var useSquareCutoffStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the item path that provides the values for the current series.
  	 */
  var valueMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the ContourValueResolver used to determine the numeric values of contours.
  	 */
  var valueResolver: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The minimum scale at which this series becomes visible.
  	 * The default value for this property is 1.0, which means the series will always be visible.  At a VisibleFromScale setting of 0.0, the series will never be visible.  At a VisibleFromScale setting of 0.5, the series will be visible as long as the map is zoomed in to at least 200%.
  	 */
  var visibleFromScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the volume mapping property for the current series object.
  	 */
  var volumeMemberPath: js.UndefOr[java.lang.String] = js.undefined
}

object IgMapSeries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgMapSeries
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    angleMemberPath: scala.Int | scala.Double = null,
    brush: java.lang.String = null,
    clipSeriesToBounds: js.UndefOr[scala.Boolean] = js.undefined,
    closeMemberPath: java.lang.String = null,
    colorMemberPath: java.lang.String = null,
    colorScale: js.Any = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    databaseSource: java.lang.String = null,
    discreteLegendItemTemplate: js.Any = null,
    fillMemberPath: java.lang.String = null,
    fillScale: js.Any = null,
    heatMaximum: scala.Int | scala.Double = null,
    heatMinimum: scala.Int | scala.Double = null,
    highMemberPath: java.lang.String = null,
    ignoreFirst: scala.Int | scala.Double = null,
    labelMemberPath: java.lang.String = null,
    latitudeMemberPath: java.lang.String = null,
    legendItemBadgeTemplate: js.Any = null,
    legendItemTemplate: js.Any = null,
    longPeriod: scala.Int | scala.Double = null,
    longitudeMemberPath: java.lang.String = null,
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
    radiusMemberPath: java.lang.String = null,
    radiusScale: js.Any = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    resolution: scala.Int | scala.Double = null,
    responseDataKey: java.lang.String = null,
    shapeDataSource: java.lang.String = null,
    shapeFilterResolution: scala.Int | scala.Double = null,
    shapeMemberPath: java.lang.String = null,
    shapeStyle: js.Any = null,
    shapeStyleSelector: js.Any = null,
    shortPeriod: scala.Int | scala.Double = null,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    splineType: java.lang.String = null,
    stiffness: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    transitionDuration: scala.Int | scala.Double = null,
    trendLineBrush: java.lang.String = null,
    trendLinePeriod: scala.Int | scala.Double = null,
    trendLineThickness: scala.Int | scala.Double = null,
    trendLineType: java.lang.String = null,
    trendLineZIndex: scala.Int | scala.Double = null,
    triangleVertexMemberPath1: java.lang.String = null,
    triangleVertexMemberPath2: java.lang.String = null,
    triangleVertexMemberPath3: java.lang.String = null,
    trianglesSource: js.Any = null,
    triangulationDataSource: java.lang.String = null,
    `type`: java.lang.String = null,
    unknownValuePlotting: java.lang.String = null,
    useBruteForce: js.UndefOr[scala.Boolean] = js.undefined,
    useCartesianInterpolation: js.UndefOr[scala.Boolean] = js.undefined,
    useSquareCutoffStyle: js.UndefOr[scala.Boolean] = js.undefined,
    valueMemberPath: java.lang.String = null,
    valueResolver: js.Any = null,
    visibleFromScale: scala.Int | scala.Double = null,
    volumeMemberPath: java.lang.String = null
  ): IgMapSeries = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (angleMemberPath != null) __obj.updateDynamic("angleMemberPath")(angleMemberPath.asInstanceOf[js.Any])
    if (brush != null) __obj.updateDynamic("brush")(brush)
    if (!js.isUndefined(clipSeriesToBounds)) __obj.updateDynamic("clipSeriesToBounds")(clipSeriesToBounds)
    if (closeMemberPath != null) __obj.updateDynamic("closeMemberPath")(closeMemberPath)
    if (colorMemberPath != null) __obj.updateDynamic("colorMemberPath")(colorMemberPath)
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (databaseSource != null) __obj.updateDynamic("databaseSource")(databaseSource)
    if (discreteLegendItemTemplate != null) __obj.updateDynamic("discreteLegendItemTemplate")(discreteLegendItemTemplate)
    if (fillMemberPath != null) __obj.updateDynamic("fillMemberPath")(fillMemberPath)
    if (fillScale != null) __obj.updateDynamic("fillScale")(fillScale)
    if (heatMaximum != null) __obj.updateDynamic("heatMaximum")(heatMaximum.asInstanceOf[js.Any])
    if (heatMinimum != null) __obj.updateDynamic("heatMinimum")(heatMinimum.asInstanceOf[js.Any])
    if (highMemberPath != null) __obj.updateDynamic("highMemberPath")(highMemberPath)
    if (ignoreFirst != null) __obj.updateDynamic("ignoreFirst")(ignoreFirst.asInstanceOf[js.Any])
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath)
    if (latitudeMemberPath != null) __obj.updateDynamic("latitudeMemberPath")(latitudeMemberPath)
    if (legendItemBadgeTemplate != null) __obj.updateDynamic("legendItemBadgeTemplate")(legendItemBadgeTemplate)
    if (legendItemTemplate != null) __obj.updateDynamic("legendItemTemplate")(legendItemTemplate)
    if (longPeriod != null) __obj.updateDynamic("longPeriod")(longPeriod.asInstanceOf[js.Any])
    if (longitudeMemberPath != null) __obj.updateDynamic("longitudeMemberPath")(longitudeMemberPath)
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
    if (radiusMemberPath != null) __obj.updateDynamic("radiusMemberPath")(radiusMemberPath)
    if (radiusScale != null) __obj.updateDynamic("radiusScale")(radiusScale)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (shapeDataSource != null) __obj.updateDynamic("shapeDataSource")(shapeDataSource)
    if (shapeFilterResolution != null) __obj.updateDynamic("shapeFilterResolution")(shapeFilterResolution.asInstanceOf[js.Any])
    if (shapeMemberPath != null) __obj.updateDynamic("shapeMemberPath")(shapeMemberPath)
    if (shapeStyle != null) __obj.updateDynamic("shapeStyle")(shapeStyle)
    if (shapeStyleSelector != null) __obj.updateDynamic("shapeStyleSelector")(shapeStyleSelector)
    if (shortPeriod != null) __obj.updateDynamic("shortPeriod")(shortPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (splineType != null) __obj.updateDynamic("splineType")(splineType)
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (trendLineBrush != null) __obj.updateDynamic("trendLineBrush")(trendLineBrush)
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType)
    if (trendLineZIndex != null) __obj.updateDynamic("trendLineZIndex")(trendLineZIndex.asInstanceOf[js.Any])
    if (triangleVertexMemberPath1 != null) __obj.updateDynamic("triangleVertexMemberPath1")(triangleVertexMemberPath1)
    if (triangleVertexMemberPath2 != null) __obj.updateDynamic("triangleVertexMemberPath2")(triangleVertexMemberPath2)
    if (triangleVertexMemberPath3 != null) __obj.updateDynamic("triangleVertexMemberPath3")(triangleVertexMemberPath3)
    if (trianglesSource != null) __obj.updateDynamic("trianglesSource")(trianglesSource)
    if (triangulationDataSource != null) __obj.updateDynamic("triangulationDataSource")(triangulationDataSource)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting)
    if (!js.isUndefined(useBruteForce)) __obj.updateDynamic("useBruteForce")(useBruteForce)
    if (!js.isUndefined(useCartesianInterpolation)) __obj.updateDynamic("useCartesianInterpolation")(useCartesianInterpolation)
    if (!js.isUndefined(useSquareCutoffStyle)) __obj.updateDynamic("useSquareCutoffStyle")(useSquareCutoffStyle)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    if (valueResolver != null) __obj.updateDynamic("valueResolver")(valueResolver)
    if (visibleFromScale != null) __obj.updateDynamic("visibleFromScale")(visibleFromScale.asInstanceOf[js.Any])
    if (volumeMemberPath != null) __obj.updateDynamic("volumeMemberPath")(volumeMemberPath)
    __obj.asInstanceOf[IgMapSeries]
  }
}

