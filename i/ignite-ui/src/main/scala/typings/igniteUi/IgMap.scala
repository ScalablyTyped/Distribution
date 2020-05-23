package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgMap
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Sets or gets the automatic height to add when automatically adding margins to the map.
    */
  var autoMarginHeight: js.UndefOr[Double] = js.undefined
  /**
    * Sets or gets the automatic width to add when automatically adding margins to the map.
    */
  var autoMarginWidth: js.UndefOr[Double] = js.undefined
  /**
    * Background content object
    */
  var backgroundContent: js.UndefOr[IgMapBackgroundContent] = js.undefined
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
  /**
    * Gets or sets the template to use for circle markers on the map.
    * Defines the marker template used for
    * series with a marker type of circle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the cross hair point (in world coordinates)
    * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
    * case the relevant crosshair line is hidden.
    */
  var crosshairPoint: js.UndefOr[IgMapCrosshairPoint] = js.undefined
  /**
    * Gets or sets the current Map's crosshair visibility override.
    *
    * Valid values:
    * "visible" Crosshair should be visible.
    * "collapsed" Crosshair should not be visible.
    */
  var crosshairVisibility: js.UndefOr[String] = js.undefined
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
    * Gets or sets the DefaultInteraction property. The default interaction state defines the map's response to mouse events.
    *
    * Valid values:
    * "none" User gesture will not change the state of the map.
    * "dragZoom" User gesture will start a drag rectangle to zoom the map.
    * "dragPan" User gesture will start a pan action to move the map's window.
    */
  var defaultInteraction: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the template to use for diamond markers on the map.
    * Defines the marker template used for
    * series with a marker type of diamond.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the current Map's DragModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var dragModifier: js.UndefOr[String] = js.undefined
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
  var gridAreaRectChanged: js.UndefOr[GridAreaRectChangedEvent] = js.undefined
  /**
    * The height of the map. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * Gets or sets the template to use for hexagon markers on the map.
    * Defines the marker template used for
    * series with a marker type of hexagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for hexagram markers on the map.
    * Defines the marker template used for
    * series with a marker type of hexagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * The background image uri use in the overview detail pane.
    */
  var overviewPlusDetailPaneBackgroundImageUri: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the current Map's PanModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var panModifier: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the template to use for pentagon markers on the map.
    * Defines the marker template used for
    * series with a marker type of pentagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for pentragram markers on the map.
    * Defines the marker template used for
    * series with a marker type of pentagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the brush used as the background for the current Map object's plot area.
    */
  var plotAreaBackground: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the series viewer should prefer selecting higher resolution tiles over lower resolution tiles when performing tile zooming. Setting this to true will lower performance but increase quality.
    */
  var preferHigherResolutionTiles: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the preview rectangle.
    * The preview rectangle may be set to Rect.Empty, in which case the visible preview
    * strokePath is hidden.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var previewRect: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for pyramid markers on the map.
    * Defines the marker template used for
    * series with a marker type of pyramid.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Raised when the map's processing for an update has completed.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    */
  var refreshCompleted: js.UndefOr[RefreshCompletedEvent] = js.undefined
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
    * An array of series objects
    */
  var series: js.UndefOr[js.Array[IgMapSeries]] = js.undefined
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
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.undefined
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
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.undefined
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
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.undefined
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
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.undefined
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
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.undefined
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
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.undefined
  /**
    * Gets or sets the template to use for square markers on the map.
    * Defines the marker template used for
    * series with a marker type of square.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for tetragram markers on the map.
    * Defines the marker template used for
    * series with a marker type of tetragram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var tetragramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * The swatch used to style this widget
    */
  var theme: js.UndefOr[String] = js.undefined
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
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
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
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
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
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
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
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
    * Gets or sets the template to use for triangle markers on the map.
    * Defines the marker template used for
    * series with a marker type of triangle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Event fired when the status of an ongoing Triangulation has changed.
    * Function takes arguments evt and ui.
    * Use ui.map to get reference to map object.
    * Use ui.series to get reference to current series object.
    * Use ui.currentStatus to get current status.
    */
  var triangulationStatusChanged: js.UndefOr[TriangulationStatusChangedEvent] = js.undefined
  /**
    * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
    */
  var useTiledZooming: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the map. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.undefined
  /**
    * A number between 0 and 1 determining the position of the horizontal scroll.
    * This property is effectively a shortcut to the X position of the WindowRect property.
    */
  var windowPositionHorizontal: js.UndefOr[Double] = js.undefined
  /**
    * A number between 0 and 1 determining the position of the vertical scroll.
    * This property is effectively a shortcut to the Y position of the WindowRect property.
    */
  var windowPositionVertical: js.UndefOr[Double] = js.undefined
  /**
    * A rectangle representing the portion of the map currently in view.
    * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var windowRect: js.UndefOr[js.Any] = js.undefined
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
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.undefined
  /**
    * Sets or gets the minimum width that the window rect is allowed to reach before being clamped.
    * Decrease this value if you want to allow for further zooming into the viewer.
    * If this value is lowered too much it can cause graphical corruption due to floating point arithmetic inaccuracy.
    */
  var windowRectMinWidth: js.UndefOr[Double] = js.undefined
  /**
    * The response to user panning and zooming: whether to update the view immediately while the user action is happening, or to defer the update to after the user action is complete.  The user action will be an action such as a mouse drag which causes panning and/or zooming to occur.
    *
    *
    * Valid values:
    * "deferred" Defer the view update until after the user action is complete.
    * "immediate" Update the view immediately while the user action is happening.
    */
  var windowResponse: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the current Map's zoom scale.
    */
  var windowScale: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
    */
  var zoomTileCacheSize: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the current Map's zoomability.
    */
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object IgMap {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    autoMarginHeight: js.UndefOr[Double] = js.undefined,
    autoMarginWidth: js.UndefOr[Double] = js.undefined,
    backgroundContent: IgMapBackgroundContent = null,
    browserNotSupported: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit = null,
    circleMarkerTemplate: js.Any = null,
    crosshairPoint: IgMapCrosshairPoint = null,
    crosshairVisibility: String = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    defaultInteraction: String = null,
    diamondMarkerTemplate: js.Any = null,
    dragModifier: String = null,
    gridAreaRectChanged: (/* event */ Event, /* ui */ GridAreaRectChangedEventUIParam) => Unit = null,
    height: String | Double = null,
    hexagonMarkerTemplate: js.Any = null,
    hexagramMarkerTemplate: js.Any = null,
    language: String = null,
    locale: js.Any = null,
    overviewPlusDetailPaneBackgroundImageUri: String = null,
    panModifier: String = null,
    pentagonMarkerTemplate: js.Any = null,
    pentagramMarkerTemplate: js.Any = null,
    plotAreaBackground: String = null,
    preferHigherResolutionTiles: js.UndefOr[Boolean] = js.undefined,
    previewRect: js.Any = null,
    pyramidMarkerTemplate: js.Any = null,
    refreshCompleted: (/* event */ Event, /* ui */ RefreshCompletedEventUIParam) => Unit = null,
    regional: String | js.Object = null,
    responseDataKey: String = null,
    series: js.Array[IgMapSeries] = null,
    seriesCursorMouseMove: (/* event */ Event, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit = null,
    seriesMouseEnter: (/* event */ Event, /* ui */ SeriesMouseEnterEventUIParam) => Unit = null,
    seriesMouseLeave: (/* event */ Event, /* ui */ SeriesMouseLeaveEventUIParam) => Unit = null,
    seriesMouseLeftButtonDown: (/* event */ Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit = null,
    seriesMouseLeftButtonUp: (/* event */ Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit = null,
    seriesMouseMove: (/* event */ Event, /* ui */ SeriesMouseMoveEventUIParam) => Unit = null,
    squareMarkerTemplate: js.Any = null,
    tetragramMarkerTemplate: js.Any = null,
    theme: String = null,
    tooltipHidden: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit = null,
    tooltipHiding: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit = null,
    tooltipShowing: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit = null,
    tooltipShown: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit = null,
    triangleMarkerTemplate: js.Any = null,
    triangulationStatusChanged: (/* event */ Event, /* ui */ TriangulationStatusChangedEventUIParam) => Unit = null,
    useTiledZooming: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    windowPositionHorizontal: js.UndefOr[Double] = js.undefined,
    windowPositionVertical: js.UndefOr[Double] = js.undefined,
    windowRect: js.Any = null,
    windowRectChanged: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit = null,
    windowRectMinWidth: js.UndefOr[Double] = js.undefined,
    windowResponse: String = null,
    windowScale: js.UndefOr[Double] = js.undefined,
    zoomTileCacheSize: js.UndefOr[Double] = js.undefined,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): IgMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoMarginHeight)) __obj.updateDynamic("autoMarginHeight")(autoMarginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMarginWidth)) __obj.updateDynamic("autoMarginWidth")(autoMarginWidth.get.asInstanceOf[js.Any])
    if (backgroundContent != null) __obj.updateDynamic("backgroundContent")(backgroundContent.asInstanceOf[js.Any])
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(js.Any.fromFunction2(browserNotSupported))
    if (circleMarkerTemplate != null) __obj.updateDynamic("circleMarkerTemplate")(circleMarkerTemplate.asInstanceOf[js.Any])
    if (crosshairPoint != null) __obj.updateDynamic("crosshairPoint")(crosshairPoint.asInstanceOf[js.Any])
    if (crosshairVisibility != null) __obj.updateDynamic("crosshairVisibility")(crosshairVisibility.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (defaultInteraction != null) __obj.updateDynamic("defaultInteraction")(defaultInteraction.asInstanceOf[js.Any])
    if (diamondMarkerTemplate != null) __obj.updateDynamic("diamondMarkerTemplate")(diamondMarkerTemplate.asInstanceOf[js.Any])
    if (dragModifier != null) __obj.updateDynamic("dragModifier")(dragModifier.asInstanceOf[js.Any])
    if (gridAreaRectChanged != null) __obj.updateDynamic("gridAreaRectChanged")(js.Any.fromFunction2(gridAreaRectChanged))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hexagonMarkerTemplate != null) __obj.updateDynamic("hexagonMarkerTemplate")(hexagonMarkerTemplate.asInstanceOf[js.Any])
    if (hexagramMarkerTemplate != null) __obj.updateDynamic("hexagramMarkerTemplate")(hexagramMarkerTemplate.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (overviewPlusDetailPaneBackgroundImageUri != null) __obj.updateDynamic("overviewPlusDetailPaneBackgroundImageUri")(overviewPlusDetailPaneBackgroundImageUri.asInstanceOf[js.Any])
    if (panModifier != null) __obj.updateDynamic("panModifier")(panModifier.asInstanceOf[js.Any])
    if (pentagonMarkerTemplate != null) __obj.updateDynamic("pentagonMarkerTemplate")(pentagonMarkerTemplate.asInstanceOf[js.Any])
    if (pentagramMarkerTemplate != null) __obj.updateDynamic("pentagramMarkerTemplate")(pentagramMarkerTemplate.asInstanceOf[js.Any])
    if (plotAreaBackground != null) __obj.updateDynamic("plotAreaBackground")(plotAreaBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(preferHigherResolutionTiles)) __obj.updateDynamic("preferHigherResolutionTiles")(preferHigherResolutionTiles.get.asInstanceOf[js.Any])
    if (previewRect != null) __obj.updateDynamic("previewRect")(previewRect.asInstanceOf[js.Any])
    if (pyramidMarkerTemplate != null) __obj.updateDynamic("pyramidMarkerTemplate")(pyramidMarkerTemplate.asInstanceOf[js.Any])
    if (refreshCompleted != null) __obj.updateDynamic("refreshCompleted")(js.Any.fromFunction2(refreshCompleted))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesCursorMouseMove != null) __obj.updateDynamic("seriesCursorMouseMove")(js.Any.fromFunction2(seriesCursorMouseMove))
    if (seriesMouseEnter != null) __obj.updateDynamic("seriesMouseEnter")(js.Any.fromFunction2(seriesMouseEnter))
    if (seriesMouseLeave != null) __obj.updateDynamic("seriesMouseLeave")(js.Any.fromFunction2(seriesMouseLeave))
    if (seriesMouseLeftButtonDown != null) __obj.updateDynamic("seriesMouseLeftButtonDown")(js.Any.fromFunction2(seriesMouseLeftButtonDown))
    if (seriesMouseLeftButtonUp != null) __obj.updateDynamic("seriesMouseLeftButtonUp")(js.Any.fromFunction2(seriesMouseLeftButtonUp))
    if (seriesMouseMove != null) __obj.updateDynamic("seriesMouseMove")(js.Any.fromFunction2(seriesMouseMove))
    if (squareMarkerTemplate != null) __obj.updateDynamic("squareMarkerTemplate")(squareMarkerTemplate.asInstanceOf[js.Any])
    if (tetragramMarkerTemplate != null) __obj.updateDynamic("tetragramMarkerTemplate")(tetragramMarkerTemplate.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(js.Any.fromFunction2(tooltipHidden))
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(js.Any.fromFunction2(tooltipHiding))
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(js.Any.fromFunction2(tooltipShowing))
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(js.Any.fromFunction2(tooltipShown))
    if (triangleMarkerTemplate != null) __obj.updateDynamic("triangleMarkerTemplate")(triangleMarkerTemplate.asInstanceOf[js.Any])
    if (triangulationStatusChanged != null) __obj.updateDynamic("triangulationStatusChanged")(js.Any.fromFunction2(triangulationStatusChanged))
    if (!js.isUndefined(useTiledZooming)) __obj.updateDynamic("useTiledZooming")(useTiledZooming.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(windowPositionHorizontal)) __obj.updateDynamic("windowPositionHorizontal")(windowPositionHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowPositionVertical)) __obj.updateDynamic("windowPositionVertical")(windowPositionVertical.get.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect.asInstanceOf[js.Any])
    if (windowRectChanged != null) __obj.updateDynamic("windowRectChanged")(js.Any.fromFunction2(windowRectChanged))
    if (!js.isUndefined(windowRectMinWidth)) __obj.updateDynamic("windowRectMinWidth")(windowRectMinWidth.get.asInstanceOf[js.Any])
    if (windowResponse != null) __obj.updateDynamic("windowResponse")(windowResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(windowScale)) __obj.updateDynamic("windowScale")(windowScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTileCacheSize)) __obj.updateDynamic("zoomTileCacheSize")(zoomTileCacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgMap]
  }
}

