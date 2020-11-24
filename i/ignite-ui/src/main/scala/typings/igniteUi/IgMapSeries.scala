package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgMapSeries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets the x-radius of the ellipse that is used to round the corners of the column.
    */
  var angleMemberPath: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use for the series.
    */
  var brush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether to clip the series to the bounds.
    * Setting this to true can affect performance.
    */
  var clipSeriesToBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the close mapping property for the current series object.
    */
  var closeMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The name of the property on each data item containing a numeric value which can be converted to a color by the ColorScale.
    */
  var colorMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The ColorScale used to resolve the color values of points in the series.
    */
  var colorScale: js.UndefOr[js.Any] = js.native
  
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
    * String The database source URI.
    */
  var databaseSource: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the DiscreteLegendItemTemplate property.
    * The legend item control content is created according to the DiscreteLegendItemTemplate on-demand by
    * the series object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var discreteLegendItemTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the property on data source items which contains a numeric value to convert to a Brush using the FillScale.
    */
  var fillMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The ValueBrushScale to use when determining Brushes for each Shape, based on the values found in FillMemberPath.
    */
  var fillScale: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the value that maps to the maximum heat color.
    */
  var heatMaximum: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the density value that maps to the minimum heat color.
    */
  var heatMinimum: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the value mapping property for the current series object.
    */
  var highMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the number of values to hide at the beginning of the indicator.
    */
  var ignoreFirst: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the Label mapping property for the current series object.
    */
  var labelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The name of the property of data source items which contains the latitude coordinate of the symbol.
    */
  var latitudeMemberPath: js.UndefOr[String] = js.native
  
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
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for long AVO periods is 30.
    */
  var longPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The name of the property of data source items which contains the longitude coordinate of the symbol.
    */
  var longitudeMemberPath: js.UndefOr[String] = js.native
  
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
  var markerTemplate: js.UndefOr[js.Any] = js.native
  
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
  var markerType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the maximum number of markerItems displayed by the current series.
    * If more than the specified number of markerItems are visible, the series will automatically
    * choose a representative set.
    */
  var maximumMarkers: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the whether the map reacts to mouse move events.
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
    * Gets or sets the value mapping property for the current series object.
    */
  var openMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush to use for the outline of the series.
    * Some series types, such as LineSeries, do not display outlines.
    */
  var outline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the moving average period for the current AverageDirectionalIndexIndicator object.
    * The typical, and initial, value for AverageDirectionalIndexIndicator periods is 14.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the whether to progressively load the data into the map.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the radius mapping property for the current series object.
    */
  var radiusMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the radius size scale for the bubbles.
    */
  var radiusScale: js.UndefOr[js.Any] = js.native
  
  /**
    * Set to true in order to have an existing series removed from the map, by name
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
    * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
    */
  var shapeDataSource: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the resolution at which to filter out shapes in the series.
    * For example, if the shapeFilterResolution is set to 3, then elements with a bounding rectangle smaller than 3 X 3 pixels will be filtered out.
    */
  var shapeFilterResolution: js.UndefOr[Double] = js.native
  
  /**
    * The name of the property on data source items which, for each shape, contains a list of points to be converted to a polygon.
    * To be consistent with the Shapefile technical description, it is expected that each list of points is defined as an IEnumerable of IEnumerable of Point, or in other words, a list of lists of points.
    */
  var shapeMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The default style to apply to all Shapes in the series.
    */
  var shapeStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * The StyleSelector which is used to select a style for each Shape.
    */
  var shapeStyleSelector: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the short moving average period for the current AbsoluteVolumeOscillatorIndicator object.
    * The typical, and initial, value for short AVO periods is 10.
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  
  /**
    * Whether the map should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the type of spline to be rendered.
    *
    * Valid values:
    * "natural" Calculates the spline using a natural spline calculation formula.
    * "clamped" Calculated the spline using a clamped spline calculation formula.
    */
  var splineType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the Stiffness property.
    */
  var stiffness: js.UndefOr[Double] = js.native
  
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
    * Gets or sets the duration of the current series's morph.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
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
    * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the first vertex point in the data source.
    */
  var triangleVertexMemberPath1: js.UndefOr[String] = js.native
  
  /**
    * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the second vertex point in the data source.
    */
  var triangleVertexMemberPath2: js.UndefOr[String] = js.native
  
  /**
    * The name of the property of the TrianglesSource items which, for each triangle, contains the index of the third vertex point in the data source.
    */
  var triangleVertexMemberPath3: js.UndefOr[String] = js.native
  
  /**
    * The source of triangulation data.
    * This property is optional.  If it is left as null, the triangulation will be created based on the items in the data source.  Triangulation is a demanding operation, so the runtime performance will be better when specifying a TriangulationSource, especially when a large number of data items are present.
    */
  var trianglesSource: js.UndefOr[js.Any] = js.native
  
  /**
    * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
    */
  var triangulationDataSource: js.UndefOr[String] = js.native
  
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
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Determines how unknown values will be plotted on the map. Null and Double.NaN are two examples of unknown values.
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the map.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the whether to use use brute force mode.
    */
  var useBruteForce: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether Cartesian Interpolation should be used rather than Archimedian
    * spiral based interpolation.
    */
  var useCartesianInterpolation: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the whether to use squares when halting a render traversal rather than the shape of the coalesced area.
    */
  var useSquareCutoffStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the item path that provides the values for the current series.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the ContourValueResolver used to determine the numeric values of contours.
    */
  var valueResolver: js.UndefOr[js.Any] = js.native
  
  /**
    * The minimum scale at which this series becomes visible.
    * The default value for this property is 1.0, which means the series will always be visible.  At a VisibleFromScale setting of 0.0, the series will never be visible.  At a VisibleFromScale setting of 0.5, the series will be visible as long as the map is zoomed in to at least 200%.
    */
  var visibleFromScale: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the volume mapping property for the current series object.
    */
  var volumeMemberPath: js.UndefOr[String] = js.native
}
object IgMapSeries {
  
  @scala.inline
  def apply(): IgMapSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMapSeries]
  }
  
  @scala.inline
  implicit class IgMapSeriesOps[Self <: IgMapSeries] (val x: Self) extends AnyVal {
    
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
    def setAngleMemberPath(value: Double): Self = this.set("angleMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleMemberPath: Self = this.set("angleMemberPath", js.undefined)
    
    @scala.inline
    def setBrush(value: String): Self = this.set("brush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrush: Self = this.set("brush", js.undefined)
    
    @scala.inline
    def setClipSeriesToBounds(value: Boolean): Self = this.set("clipSeriesToBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipSeriesToBounds: Self = this.set("clipSeriesToBounds", js.undefined)
    
    @scala.inline
    def setCloseMemberPath(value: String): Self = this.set("closeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMemberPath: Self = this.set("closeMemberPath", js.undefined)
    
    @scala.inline
    def setColorMemberPath(value: String): Self = this.set("colorMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMemberPath: Self = this.set("colorMemberPath", js.undefined)
    
    @scala.inline
    def setColorScale(value: js.Any): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
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
    def setDatabaseSource(value: String): Self = this.set("databaseSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseSource: Self = this.set("databaseSource", js.undefined)
    
    @scala.inline
    def setDiscreteLegendItemTemplate(value: js.Any): Self = this.set("discreteLegendItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscreteLegendItemTemplate: Self = this.set("discreteLegendItemTemplate", js.undefined)
    
    @scala.inline
    def setFillMemberPath(value: String): Self = this.set("fillMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillMemberPath: Self = this.set("fillMemberPath", js.undefined)
    
    @scala.inline
    def setFillScale(value: js.Any): Self = this.set("fillScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillScale: Self = this.set("fillScale", js.undefined)
    
    @scala.inline
    def setHeatMaximum(value: Double): Self = this.set("heatMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatMaximum: Self = this.set("heatMaximum", js.undefined)
    
    @scala.inline
    def setHeatMinimum(value: Double): Self = this.set("heatMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeatMinimum: Self = this.set("heatMinimum", js.undefined)
    
    @scala.inline
    def setHighMemberPath(value: String): Self = this.set("highMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighMemberPath: Self = this.set("highMemberPath", js.undefined)
    
    @scala.inline
    def setIgnoreFirst(value: Double): Self = this.set("ignoreFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFirst: Self = this.set("ignoreFirst", js.undefined)
    
    @scala.inline
    def setLabelMemberPath(value: String): Self = this.set("labelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMemberPath: Self = this.set("labelMemberPath", js.undefined)
    
    @scala.inline
    def setLatitudeMemberPath(value: String): Self = this.set("latitudeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitudeMemberPath: Self = this.set("latitudeMemberPath", js.undefined)
    
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = this.set("legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemBadgeTemplate: Self = this.set("legendItemBadgeTemplate", js.undefined)
    
    @scala.inline
    def setLegendItemTemplate(value: js.Any): Self = this.set("legendItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemTemplate: Self = this.set("legendItemTemplate", js.undefined)
    
    @scala.inline
    def setLongPeriod(value: Double): Self = this.set("longPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongPeriod: Self = this.set("longPeriod", js.undefined)
    
    @scala.inline
    def setLongitudeMemberPath(value: String): Self = this.set("longitudeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitudeMemberPath: Self = this.set("longitudeMemberPath", js.undefined)
    
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
    def setRadiusMemberPath(value: String): Self = this.set("radiusMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusMemberPath: Self = this.set("radiusMemberPath", js.undefined)
    
    @scala.inline
    def setRadiusScale(value: js.Any): Self = this.set("radiusScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusScale: Self = this.set("radiusScale", js.undefined)
    
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
    def setShapeDataSource(value: String): Self = this.set("shapeDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeDataSource: Self = this.set("shapeDataSource", js.undefined)
    
    @scala.inline
    def setShapeFilterResolution(value: Double): Self = this.set("shapeFilterResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeFilterResolution: Self = this.set("shapeFilterResolution", js.undefined)
    
    @scala.inline
    def setShapeMemberPath(value: String): Self = this.set("shapeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMemberPath: Self = this.set("shapeMemberPath", js.undefined)
    
    @scala.inline
    def setShapeStyle(value: js.Any): Self = this.set("shapeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeStyle: Self = this.set("shapeStyle", js.undefined)
    
    @scala.inline
    def setShapeStyleSelector(value: js.Any): Self = this.set("shapeStyleSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeStyleSelector: Self = this.set("shapeStyleSelector", js.undefined)
    
    @scala.inline
    def setShortPeriod(value: Double): Self = this.set("shortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortPeriod: Self = this.set("shortPeriod", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setSplineType(value: String): Self = this.set("splineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplineType: Self = this.set("splineType", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
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
    def setTriangleVertexMemberPath1(value: String): Self = this.set("triangleVertexMemberPath1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleVertexMemberPath1: Self = this.set("triangleVertexMemberPath1", js.undefined)
    
    @scala.inline
    def setTriangleVertexMemberPath2(value: String): Self = this.set("triangleVertexMemberPath2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleVertexMemberPath2: Self = this.set("triangleVertexMemberPath2", js.undefined)
    
    @scala.inline
    def setTriangleVertexMemberPath3(value: String): Self = this.set("triangleVertexMemberPath3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleVertexMemberPath3: Self = this.set("triangleVertexMemberPath3", js.undefined)
    
    @scala.inline
    def setTrianglesSource(value: js.Any): Self = this.set("trianglesSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrianglesSource: Self = this.set("trianglesSource", js.undefined)
    
    @scala.inline
    def setTriangulationDataSource(value: String): Self = this.set("triangulationDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangulationDataSource: Self = this.set("triangulationDataSource", js.undefined)
    
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
    def setUseSquareCutoffStyle(value: Boolean): Self = this.set("useSquareCutoffStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSquareCutoffStyle: Self = this.set("useSquareCutoffStyle", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    
    @scala.inline
    def setValueResolver(value: js.Any): Self = this.set("valueResolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueResolver: Self = this.set("valueResolver", js.undefined)
    
    @scala.inline
    def setVisibleFromScale(value: Double): Self = this.set("visibleFromScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleFromScale: Self = this.set("visibleFromScale", js.undefined)
    
    @scala.inline
    def setVolumeMemberPath(value: String): Self = this.set("volumeMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeMemberPath: Self = this.set("volumeMemberPath", js.undefined)
  }
}
