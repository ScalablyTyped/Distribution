package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMap
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Sets or gets the automatic height to add when automatically adding margins to the map.
    */
  var autoMarginHeight: js.UndefOr[Double] = js.native
  /**
    * Sets or gets the automatic width to add when automatically adding margins to the map.
    */
  var autoMarginWidth: js.UndefOr[Double] = js.native
  /**
    * Background content object
    */
  var backgroundContent: js.UndefOr[IgMapBackgroundContent] = js.native
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
    * Gets or sets the template to use for circle markers on the map.
    * Defines the marker template used for
    * series with a marker type of circle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the cross hair point (in world coordinates)
    * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
    * case the relevant crosshair line is hidden.
    */
  var crosshairPoint: js.UndefOr[IgMapCrosshairPoint] = js.native
  /**
    * Gets or sets the current Map's crosshair visibility override.
    *
    * Valid values:
    * "visible" Crosshair should be visible.
    * "collapsed" Crosshair should not be visible.
    */
  var crosshairVisibility: js.UndefOr[String] = js.native
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
    * Gets or sets the DefaultInteraction property. The default interaction state defines the map's response to mouse events.
    *
    * Valid values:
    * "none" User gesture will not change the state of the map.
    * "dragZoom" User gesture will start a drag rectangle to zoom the map.
    * "dragPan" User gesture will start a pan action to move the map's window.
    */
  var defaultInteraction: js.UndefOr[String] = js.native
  /**
    * Gets or sets the template to use for diamond markers on the map.
    * Defines the marker template used for
    * series with a marker type of diamond.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the current Map's DragModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var dragModifier: js.UndefOr[String] = js.native
  /**
    * Occurs just after the current Map's grid area rectangle is changed.
    * The grid area may change as the result of the Map being resized.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    * Use ui.newHeight to get new height value.
    * Use ui.newLeft to get new left value.
    * Use ui.newTop to get new top value.
    * Use ui.newWidth to get new top value.
    * Use ui.oldHeight to get old height value.
    * Use ui.oldLeft to get old left value.
    * Use ui.oldTop to get old top value.
    * Use ui.oldWidth to get old top value.
    */
  var gridAreaRectChanged: js.UndefOr[GridAreaRectChangedEvent] = js.native
  /**
    * The height of the map. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Gets or sets the template to use for hexagon markers on the map.
    * Defines the marker template used for
    * series with a marker type of hexagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the template to use for hexagram markers on the map.
    * Defines the marker template used for
    * series with a marker type of hexagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * The background image uri use in the overview detail pane.
    */
  var overviewPlusDetailPaneBackgroundImageUri: js.UndefOr[String] = js.native
  /**
    * Gets or sets the current Map's PanModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var panModifier: js.UndefOr[String] = js.native
  /**
    * Gets or sets the template to use for pentagon markers on the map.
    * Defines the marker template used for
    * series with a marker type of pentagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the template to use for pentragram markers on the map.
    * Defines the marker template used for
    * series with a marker type of pentagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the brush used as the background for the current Map object's plot area.
    */
  var plotAreaBackground: js.UndefOr[String] = js.native
  /**
    * Sets whether the series viewer should prefer selecting higher resolution tiles over lower resolution tiles when performing tile zooming. Setting this to true will lower performance but increase quality.
    */
  var preferHigherResolutionTiles: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the preview rectangle.
    * The preview rectangle may be set to Rect.Empty, in which case the visible preview
    * strokePath is hidden.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var previewRect: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the template to use for pyramid markers on the map.
    * Defines the marker template used for
    * series with a marker type of pyramid.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Raised when the map's processing for an update has completed.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    */
  var refreshCompleted: js.UndefOr[RefreshCompletedEvent] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * An array of series objects
    */
  var series: js.UndefOr[js.Array[IgMapSeries]] = js.native
  /**
    * Occurs when the cursors are moved over a series in this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.native
  /**
    * Occurs when the left mouse pointer enters an element of this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.native
  /**
    * Occurs when the left mouse pointer leaves an element of this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.native
  /**
    * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.native
  /**
    * Occurs when the left mouse button is released while the mouse pointer is over an element of this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.native
  /**
    * Occurs when the left mouse pointer moves while over an element of this map.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.native
  /**
    * Gets or sets the template to use for square markers on the map.
    * Defines the marker template used for
    * series with a marker type of square.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the template to use for tetragram markers on the map.
    * Defines the marker template used for
    * series with a marker type of tetragram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var tetragramMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * The swatch used to style this widget
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Event fired after a tooltip is hidden
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
    * Event fired when the mouse has left a series and the tooltip is about to hide
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
    * Event fired when the mouse has hovered on a series and the tooltip is about to show
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
    * Event fired after a tooltip is shown
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
    * Gets or sets the template to use for triangle markers on the map.
    * Defines the marker template used for
    * series with a marker type of triangle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.native
  /**
    * Event fired when the status of an ongoing Triangulation has changed.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.currentStatus to get current status.
    */
  var triangulationStatusChanged: js.UndefOr[TriangulationStatusChangedEvent] = js.native
  /**
    * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
    */
  var useTiledZooming: js.UndefOr[Boolean] = js.native
  /**
    * The width of the map. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
  /**
    * A number between 0 and 1 determining the position of the horizontal scroll.
    * This property is effectively a shortcut to the X position of the WindowRect property.
    */
  var windowPositionHorizontal: js.UndefOr[Double] = js.native
  /**
    * A number between 0 and 1 determining the position of the vertical scroll.
    * This property is effectively a shortcut to the Y position of the WindowRect property.
    */
  var windowPositionVertical: js.UndefOr[Double] = js.native
  /**
    * A rectangle representing the portion of the map currently in view.
    * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var windowRect: js.UndefOr[js.Any] = js.native
  /**
    * Occurs just after the current Map's window rectangle is changed.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    * Use ui.newHeight to get new height value.
    * Use ui.newLeft to get new left value.
    * Use ui.newTop to get new top value.
    * Use ui.newWidth to get new top value.
    * Use ui.oldHeight to get old height value.
    * Use ui.oldLeft to get old left value.
    * Use ui.oldTop to get old top value.
    * Use ui.oldWidth to get old top value.
    */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.native
  /**
    * Sets or gets the minimum width that the window rect is allowed to reach before being clamped.
    * Decrease this value if you want to allow for further zooming into the viewer.
    * If this value is lowered too much it can cause graphical corruption due to floating point arithmetic inaccuracy.
    */
  var windowRectMinWidth: js.UndefOr[Double] = js.native
  /**
    * The response to user panning and zooming: whether to update the view immediately while the user action is happening, or to defer the update to after the user action is complete.  The user action will be an action such as a mouse drag which causes panning and/or zooming to occur.
    *
    *
    * Valid values:
    * "deferred" Defer the view update until after the user action is complete.
    * "immediate" Update the view immediately while the user action is happening.
    */
  var windowResponse: js.UndefOr[String] = js.native
  /**
    * Gets or sets the current Map's zoom scale.
    */
  var windowScale: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
    */
  var zoomTileCacheSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the current Map's zoomability.
    */
  var zoomable: js.UndefOr[Boolean] = js.native
}

object IgMap {
  @scala.inline
  def apply(): IgMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgMap]
  }
  @scala.inline
  implicit class IgMapOps[Self <: IgMap] (val x: Self) extends AnyVal {
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
    def setAutoMarginHeight(value: Double): Self = this.set("autoMarginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMarginHeight: Self = this.set("autoMarginHeight", js.undefined)
    @scala.inline
    def setAutoMarginWidth(value: Double): Self = this.set("autoMarginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMarginWidth: Self = this.set("autoMarginWidth", js.undefined)
    @scala.inline
    def setBackgroundContent(value: IgMapBackgroundContent): Self = this.set("backgroundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundContent: Self = this.set("backgroundContent", js.undefined)
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = this.set("browserNotSupported", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBrowserNotSupported: Self = this.set("browserNotSupported", js.undefined)
    @scala.inline
    def setCircleMarkerTemplate(value: js.Any): Self = this.set("circleMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleMarkerTemplate: Self = this.set("circleMarkerTemplate", js.undefined)
    @scala.inline
    def setCrosshairPoint(value: IgMapCrosshairPoint): Self = this.set("crosshairPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosshairPoint: Self = this.set("crosshairPoint", js.undefined)
    @scala.inline
    def setCrosshairVisibility(value: String): Self = this.set("crosshairVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosshairVisibility: Self = this.set("crosshairVisibility", js.undefined)
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
    def setDefaultInteraction(value: String): Self = this.set("defaultInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInteraction: Self = this.set("defaultInteraction", js.undefined)
    @scala.inline
    def setDiamondMarkerTemplate(value: js.Any): Self = this.set("diamondMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiamondMarkerTemplate: Self = this.set("diamondMarkerTemplate", js.undefined)
    @scala.inline
    def setDragModifier(value: String): Self = this.set("dragModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragModifier: Self = this.set("dragModifier", js.undefined)
    @scala.inline
    def setGridAreaRectChanged(value: (/* event */ Event, /* ui */ GridAreaRectChangedEventUIParam) => Unit): Self = this.set("gridAreaRectChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGridAreaRectChanged: Self = this.set("gridAreaRectChanged", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHexagonMarkerTemplate(value: js.Any): Self = this.set("hexagonMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHexagonMarkerTemplate: Self = this.set("hexagonMarkerTemplate", js.undefined)
    @scala.inline
    def setHexagramMarkerTemplate(value: js.Any): Self = this.set("hexagramMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHexagramMarkerTemplate: Self = this.set("hexagramMarkerTemplate", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOverviewPlusDetailPaneBackgroundImageUri(value: String): Self = this.set("overviewPlusDetailPaneBackgroundImageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverviewPlusDetailPaneBackgroundImageUri: Self = this.set("overviewPlusDetailPaneBackgroundImageUri", js.undefined)
    @scala.inline
    def setPanModifier(value: String): Self = this.set("panModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanModifier: Self = this.set("panModifier", js.undefined)
    @scala.inline
    def setPentagonMarkerTemplate(value: js.Any): Self = this.set("pentagonMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePentagonMarkerTemplate: Self = this.set("pentagonMarkerTemplate", js.undefined)
    @scala.inline
    def setPentagramMarkerTemplate(value: js.Any): Self = this.set("pentagramMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePentagramMarkerTemplate: Self = this.set("pentagramMarkerTemplate", js.undefined)
    @scala.inline
    def setPlotAreaBackground(value: String): Self = this.set("plotAreaBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotAreaBackground: Self = this.set("plotAreaBackground", js.undefined)
    @scala.inline
    def setPreferHigherResolutionTiles(value: Boolean): Self = this.set("preferHigherResolutionTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferHigherResolutionTiles: Self = this.set("preferHigherResolutionTiles", js.undefined)
    @scala.inline
    def setPreviewRect(value: js.Any): Self = this.set("previewRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewRect: Self = this.set("previewRect", js.undefined)
    @scala.inline
    def setPyramidMarkerTemplate(value: js.Any): Self = this.set("pyramidMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePyramidMarkerTemplate: Self = this.set("pyramidMarkerTemplate", js.undefined)
    @scala.inline
    def setRefreshCompleted(value: (/* event */ Event, /* ui */ RefreshCompletedEventUIParam) => Unit): Self = this.set("refreshCompleted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRefreshCompleted: Self = this.set("refreshCompleted", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: IgMapSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[IgMapSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesCursorMouseMove(value: (/* event */ Event, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit): Self = this.set("seriesCursorMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesCursorMouseMove: Self = this.set("seriesCursorMouseMove", js.undefined)
    @scala.inline
    def setSeriesMouseEnter(value: (/* event */ Event, /* ui */ SeriesMouseEnterEventUIParam) => Unit): Self = this.set("seriesMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesMouseEnter: Self = this.set("seriesMouseEnter", js.undefined)
    @scala.inline
    def setSeriesMouseLeave(value: (/* event */ Event, /* ui */ SeriesMouseLeaveEventUIParam) => Unit): Self = this.set("seriesMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesMouseLeave: Self = this.set("seriesMouseLeave", js.undefined)
    @scala.inline
    def setSeriesMouseLeftButtonDown(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit): Self = this.set("seriesMouseLeftButtonDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesMouseLeftButtonDown: Self = this.set("seriesMouseLeftButtonDown", js.undefined)
    @scala.inline
    def setSeriesMouseLeftButtonUp(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit): Self = this.set("seriesMouseLeftButtonUp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesMouseLeftButtonUp: Self = this.set("seriesMouseLeftButtonUp", js.undefined)
    @scala.inline
    def setSeriesMouseMove(value: (/* event */ Event, /* ui */ SeriesMouseMoveEventUIParam) => Unit): Self = this.set("seriesMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSeriesMouseMove: Self = this.set("seriesMouseMove", js.undefined)
    @scala.inline
    def setSquareMarkerTemplate(value: js.Any): Self = this.set("squareMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquareMarkerTemplate: Self = this.set("squareMarkerTemplate", js.undefined)
    @scala.inline
    def setTetragramMarkerTemplate(value: js.Any): Self = this.set("tetragramMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTetragramMarkerTemplate: Self = this.set("tetragramMarkerTemplate", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = this.set("tooltipHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipHidden: Self = this.set("tooltipHidden", js.undefined)
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = this.set("tooltipHiding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipHiding: Self = this.set("tooltipHiding", js.undefined)
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = this.set("tooltipShowing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipShowing: Self = this.set("tooltipShowing", js.undefined)
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = this.set("tooltipShown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
    @scala.inline
    def setTriangleMarkerTemplate(value: js.Any): Self = this.set("triangleMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriangleMarkerTemplate: Self = this.set("triangleMarkerTemplate", js.undefined)
    @scala.inline
    def setTriangulationStatusChanged(value: (/* event */ Event, /* ui */ TriangulationStatusChangedEventUIParam) => Unit): Self = this.set("triangulationStatusChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTriangulationStatusChanged: Self = this.set("triangulationStatusChanged", js.undefined)
    @scala.inline
    def setUseTiledZooming(value: Boolean): Self = this.set("useTiledZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTiledZooming: Self = this.set("useTiledZooming", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowPositionHorizontal(value: Double): Self = this.set("windowPositionHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPositionHorizontal: Self = this.set("windowPositionHorizontal", js.undefined)
    @scala.inline
    def setWindowPositionVertical(value: Double): Self = this.set("windowPositionVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPositionVertical: Self = this.set("windowPositionVertical", js.undefined)
    @scala.inline
    def setWindowRect(value: js.Any): Self = this.set("windowRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowRect: Self = this.set("windowRect", js.undefined)
    @scala.inline
    def setWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = this.set("windowRectChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowRectChanged: Self = this.set("windowRectChanged", js.undefined)
    @scala.inline
    def setWindowRectMinWidth(value: Double): Self = this.set("windowRectMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowRectMinWidth: Self = this.set("windowRectMinWidth", js.undefined)
    @scala.inline
    def setWindowResponse(value: String): Self = this.set("windowResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowResponse: Self = this.set("windowResponse", js.undefined)
    @scala.inline
    def setWindowScale(value: Double): Self = this.set("windowScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowScale: Self = this.set("windowScale", js.undefined)
    @scala.inline
    def setZoomTileCacheSize(value: Double): Self = this.set("zoomTileCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomTileCacheSize: Self = this.set("zoomTileCacheSize", js.undefined)
    @scala.inline
    def setZoomable(value: Boolean): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
  }
  
}

