package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDataChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Set to true in order to override the default behavior in which series do not animate if an axis range changes
    */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired to allow you to override the style of markers for the items in a category or financial series. Only fires if you set allowCustomCategoryMarkerStyle to true for a series.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.startIndex to get the start index for the current items.
    * Use ui.endIndex to get the end index for the current items.
    * Use ui.hasDateRange to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
    * Use ui.startDate if ui.hasDateRange is true.
    * Use ui.endDate if ui.hasDateRange is true.
    * Use ui.getItems to get all the items associated with the event (only if necessary).
    * Use ui.fill to get or set the fill to use for the current item.
    * Use ui.stroke to get or set the stroke to use for the current item.
    * Use ui.opacity to get or set the opacity to use for the current item.
    * Use ui.highlightingHandled to set if the default highlighting behavior should not run, given that you are handling it in this event.
    * Use ui.maxAllSeriesHighlightingProgress to get the maximum highlighted progress across all series.
    * Use ui.sumAllSeriesHighlightingProgress to get the sum of highlighting progtess across all series.
    * Use ui.highlightingInfo.progress to tell what the highlighting progress is for the current item, if highlightingInfo is not null.
    * Use ui.highlightingInfo.state to tell whether the current item is currently highlighting in or out, is static, if highlightingInfo is not null.
    */
  var assigningCategoryMarkerStyle: js.UndefOr[AssigningCategoryMarkerStyleEvent] = js.native
  
  /**
    * Event fired to allow you to override the style of items in a category or financial series. Only fires if you set allowCustomCategoryStyle to true for a series.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.startIndex to get the start index for the current items.
    * Use ui.endIndex to get the end index for the current items.
    * Use ui.hasDateRange to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
    * Use ui.startDate if ui.hasDateRange is true.
    * Use ui.endDate if ui.hasDateRange is true.
    * Use ui.getItems to get all the items associated with the event (only if necessary).
    * Use ui.fill to get or set the fill to use for the current item.
    * Use ui.stroke to get or set the stroke to use for the current item.
    * Use ui.opacity to get or set the opacity to use for the current item.
    * Use ui.highlightingHandled to set if the default highlighting behavior should not run, given that you are handling it in this event.
    * Use ui.maxAllSeriesHighlightingProgress to get the maximum highlighted progress across all series.
    * Use ui.sumAllSeriesHighlightingProgress to get the sum of highlighting progtess across all series.
    * Use ui.highlightingInfo.progress to tell what the highlighting progress is for the current item, if highlightingInfo is not null.
    * Use ui.highlightingInfo.state to tell whether the current item is currently highlighting in or out, is static, if highlightingInfo is not null.
    */
  var assigningCategoryStyle: js.UndefOr[AssigningCategoryStyleEvent] = js.native
  
  /**
    * Sets or gets the automatic height to add when automatically adding margins to the chart.
    */
  var autoMarginHeight: js.UndefOr[Double] = js.native
  
  /**
    * Sets or gets the automatic width to add when automatically adding margins to the chart.
    */
  var autoMarginWidth: js.UndefOr[Double] = js.native
  
  /**
    * An array of axis objects
    */
  var axes: js.UndefOr[js.Array[IgDataChartAxes]] = js.native
  
  /**
    * Event fired when the range of and axis on the chart changes.
    * Function takes arguments evt and ui.
    * Use ui.axis to get reference to current chart axis object.
    * Use ui.chart to get reference to chart object.
    * Use ui.newMaximumValue to get new maximum value.
    * Use ui.newMinimumValue to get new minimum value.
    * Use ui.oldMaximumValue to get old maximum value.
    * Use ui.oldMinimumValue to get old minimum value.
    */
  var axisRangeChanged: js.UndefOr[AxisRangeChangedEvent] = js.native
  
  /**
    * Sets or gets the bottom margin to use around the chart content in the canvas.
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  
  /**
    * Gets or sets the Brushes property.
    * The brushes property defines the palette from which automatically assigned series brushes are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the template to use for circle markers on the chart.
    * Defines the marker template used for
    * series with a marker type of circle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets which type of hit testing the series should use.
    *
    * Valid values:
    * "auto" automatically decide the appropriate hit test mode for the series.
    * "computational" use a computational based approach to determine which series has been hit. This uses loose bounding boxes, in some cases, and can range in time complexity between O(1) and O(log n) to find a hit. This decreases frame render time compared to color encoded.
    * "colorEncoded" use a color encoded off screen buffer for hit testing. This can have extremely rare false positives where the wrong series is hit (this is due to our inability to disable anti-aliasing in our color buffer), but should always be O(1) time for determining a hit series. This increases frame render time, however. Consider using this if hit testing time is degrading performance.
    * "mixed" let each series decide which hit testing mode to use individually based on their own hit test mode.
    * "mixedFavoringComputational" let each series decide which hit testing mode to use individually based on their own hit test mode, but evaluate all computational hits before evaluating any color encoding hits.
    */
  var contentHitTestMode: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the cross hair point (in world coordinates)
    * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
    * case the relevant crosshair line is hidden.
    */
  var crosshairPoint: js.UndefOr[IgDataChartCrosshairPoint] = js.native
  
  /**
    * Gets or sets the current Chart's crosshair visibility override.  Note: setting this property does not affect the mobile browser version of the chart.
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
    * Gets or sets the DefaultInteraction property. The default interaction state defines the chart's response to mouse events.
    *
    * Valid values:
    * "none" User gesture will not change the state of the chart.
    * "dragZoom" User gesture will start a drag rectangle to zoom the chart.
    * "dragPan" User gesture will start a pan action to move the chart's window.
    */
  var defaultInteraction: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the template to use for diamond markers on the chart.
    * Defines the marker template used for
    * series with a marker type of diamond.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the current Chart's DragModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var dragModifier: js.UndefOr[String] = js.native
  
  /**
    * Occurs just after the current Chart's grid area rectangle is changed.
    * The grid area may change as the result of the Chart being resized, or
    * of an axis being added or changing size, possibly in another Chart.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
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
    * Gets or sets the GridMode property.
    *
    * Valid values:
    * "none" No chart grid.
    * "beforeSeries" Chart grid should be rendered before or in front of the data series.
    * "behindSeries" Chart grid should be rendered behind or in back of the data series.
    */
  var gridMode: js.UndefOr[String] = js.native
  
  /**
    * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets or sets the template to use for hexagon markers on the chart.
    * Defines the marker template used for
    * series with a marker type of hexagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the template to use for hexagram markers on the chart.
    * Defines the marker template used for
    * series with a marker type of hexagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The length, in milliseconds of the highlighting transition.
    */
  var highlightingTransitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the current Chart's horizontal zoomability.  This option is deprecated - please use `isHorizontalZoomEnabled` instead.
    */
  var horizontalZoomable: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the current Chart's horizontal zoomability.
    */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the series viewer can allow the page to pan if a control pan is not possible in the requested direction.
    */
  var isPagePanningAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether to use a square aspect ratio for the chart. This is locked to true for polar and radial charts.
    */
  var isSquare: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true in order to disable any interactions with the plot surface.
    */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the current Chart's vertical zoomability.
    */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sets or gets the left margin to use around the chart content in the canvas.
    */
  var leftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
    */
  var legend: js.UndefOr[IgDataChartLegend] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the MarkerBrushes property.
    * The marker brushes property defines the palette from which automatically assigned marker brushes are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the MarkerOutlines property.
    * The marker outlines property defines the palette from which automatically assigned marker outlines are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the Outlines property.
    * The outlines property defines the palette from which automatically assigned series outlines are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  
  /**
    * The visibility of the OverviewPlusDetailPane.
    *
    * Valid values:
    * "visible" The overview pane should be visible.
    * "collapsed" The overview pane should not be visible.
    */
  var overviewPlusDetailPaneVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the current Chart's PanModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var panModifier: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the template to use for pentagon markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pentagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the template to use for pentragram markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pentagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the scaling value used by the main canvas rendering context to apply a scale transform to it.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush used as the background for the current Chart object's plot area.
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
    * Event fired when the progressive loading state of the series has changed.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.currentStatus to get current status.
    */
  var progressiveLoadStatusChanged: js.UndefOr[ProgressiveLoadStatusChangedEvent] = js.native
  
  /**
    * Gets or sets the template to use for pyramid markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pyramid.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Raised when the chart's processing for an update has completed.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
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
    * Sets or gets the right margin to use around the chart content in the canvas.
    */
  var rightMargin: js.UndefOr[Double] = js.native
  
  /**
    * An array of series objects
    */
  var series: js.UndefOr[js.Array[IgDataChartSeries]] = js.native
  
  /**
    * Occurs when the cursors are moved over a series in this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.native
  
  /**
    * Occurs when the left mouse pointer enters an element of this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.native
  
  /**
    * Occurs when the left mouse pointer leaves an element of this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.native
  
  /**
    * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.native
  
  /**
    * Occurs when the left mouse button is released while the mouse pointer is over an element of this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.native
  
  /**
    * Occurs when the left mouse pointer moves while over an element of this chart.
    * Function takes arguments evt and ui.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    * Use ui.positionX to get mouse X position.
    * Use ui.positionY to get mouse Y position.
    */
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.native
  
  /**
    * To set both dimensions of the chart simultaneously an object with a width and height property can be provided
    */
  var size: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the template to use for square markers on the chart.
    * Defines the marker template used for
    * series with a marker type of square.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The subtitle to display for the component.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * The bottom margin to use for the subtitle.
    */
  var subtitleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * the horizontal alignment to use for the subtitle.
    *
    * Valid values:
    * "left" left aligns the subtitle.
    * "center" center aligns the subtitle.
    * "right" right aligns the subtitle.
    */
  var subtitleHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * The left margin to use for the subtitle.
    */
  var subtitleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * The right margin to use for the subtitle.
    */
  var subtitleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * The color to use for the subtitle.
    */
  var subtitleTextColor: js.UndefOr[js.Any] = js.native
  
  /**
    * The css font property to use for the title.
    */
  var subtitleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * The top margin to use for the subtitle.
    */
  var subtitleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * The channel name to use to sync this chart with other charts.
    */
  var syncChannel: js.UndefOr[String] = js.native
  
  /**
    * Whether the chart should be synchronized horizontally
    */
  var synchronizeHorizontally: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the chart should be synchronized vertically
    */
  var synchronizeVertically: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the template to use for tetragram markers on the chart.
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
    * The title to display for the component.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The bottom margin to use for the title.
    */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * the horizontal alignment to use for the title.
    *
    * Valid values:
    * "left" left aligns the title.
    * "center" center aligns the title.
    * "right" right aligns the title.
    */
  var titleHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * The left margin to use for the title.
    */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * The right margin to use for the title.
    */
  var titleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * The color to use for the title.
    */
  var titleTextColor: js.UndefOr[js.Any] = js.native
  
  /**
    * The css font property to use for the title.
    */
  var titleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * The top margin to use for the title.
    */
  var titleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Event fired after a tooltip is hidden
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
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
    * Use ui.chart to get reference to chart object.
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
    * Use ui.chart to get reference to chart object.
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
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  
  /**
    * Sets or gets the top margin to use around the chart content in the canvas.
    */
  var topMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the template to use for triangle markers on the chart.
    * Defines the marker template used for
    * series with a marker type of triangle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Handle this event in order to specify which columns the Typical price calculation is based on.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.count to get the number of positions that should be calculated from the start.
    * Use ui.position to get the beginning position that should be calculated from.
    * Use ui.supportingCalculations to get the supporting calculations to use in the calculation.
    * Use ui.dataSource to get the data to use for the calculation.
    * Use ui.basedOn to specify which columns changing will invalidate the series and cause it to be recalculated.
    */
  var typicalBasedOn: js.UndefOr[TypicalBasedOnEvent] = js.native
  
  /**
    * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
    */
  var useTiledZooming: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the current Chart's vertical zoomability.  This option is deprecated - please use `isVerticalZoomEnabled` instead.
    */
  var verticalZoomable: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
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
    * A rectangle representing the portion of the chart currently in view.
    * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var windowRect: js.UndefOr[js.Any] = js.native
  
  /**
    * Occurs just after the current Chart's window rectangle is changed.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
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
    * A number between 0 and 1 determining the scale of the horizontal zoom.
    * This property is effectively a shortcut to the Width of the WindowRect property.
    */
  var windowScaleHorizontal: js.UndefOr[Double] = js.native
  
  /**
    * A number between 0 and 1 determining the scale of the vertical zoom.
    * This property is effectively a shortcut to the Height of the WindowRect property.
    */
  var windowScaleVertical: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
    */
  var zoomTileCacheSize: js.UndefOr[Double] = js.native
}
object IgDataChart {
  
  @scala.inline
  def apply(): IgDataChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChart]
  }
  
  @scala.inline
  implicit class IgDataChartMutableBuilder[Self <: IgDataChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateSeriesWhenAxisRangeChanges(value: Boolean): Self = StObject.set(x, "animateSeriesWhenAxisRangeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateSeriesWhenAxisRangeChangesUndefined: Self = StObject.set(x, "animateSeriesWhenAxisRangeChanges", js.undefined)
    
    @scala.inline
    def setAssigningCategoryMarkerStyle(value: (/* event */ Event, /* ui */ AssigningCategoryMarkerStyleEventUIParam) => Unit): Self = StObject.set(x, "assigningCategoryMarkerStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAssigningCategoryMarkerStyleUndefined: Self = StObject.set(x, "assigningCategoryMarkerStyle", js.undefined)
    
    @scala.inline
    def setAssigningCategoryStyle(value: (/* event */ Event, /* ui */ AssigningCategoryStyleEventUIParam) => Unit): Self = StObject.set(x, "assigningCategoryStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAssigningCategoryStyleUndefined: Self = StObject.set(x, "assigningCategoryStyle", js.undefined)
    
    @scala.inline
    def setAutoMarginHeight(value: Double): Self = StObject.set(x, "autoMarginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMarginHeightUndefined: Self = StObject.set(x, "autoMarginHeight", js.undefined)
    
    @scala.inline
    def setAutoMarginWidth(value: Double): Self = StObject.set(x, "autoMarginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMarginWidthUndefined: Self = StObject.set(x, "autoMarginWidth", js.undefined)
    
    @scala.inline
    def setAxes(value: js.Array[IgDataChartAxes]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setAxesVarargs(value: IgDataChartAxes*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setAxisRangeChanged(value: (/* event */ Event, /* ui */ AxisRangeChangedEventUIParam) => Unit): Self = StObject.set(x, "axisRangeChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAxisRangeChangedUndefined: Self = StObject.set(x, "axisRangeChanged", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = StObject.set(x, "browserNotSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBrowserNotSupportedUndefined: Self = StObject.set(x, "browserNotSupported", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    @scala.inline
    def setCircleMarkerTemplate(value: js.Any): Self = StObject.set(x, "circleMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleMarkerTemplateUndefined: Self = StObject.set(x, "circleMarkerTemplate", js.undefined)
    
    @scala.inline
    def setContentHitTestMode(value: String): Self = StObject.set(x, "contentHitTestMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHitTestModeUndefined: Self = StObject.set(x, "contentHitTestMode", js.undefined)
    
    @scala.inline
    def setCrosshairPoint(value: IgDataChartCrosshairPoint): Self = StObject.set(x, "crosshairPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairPointUndefined: Self = StObject.set(x, "crosshairPoint", js.undefined)
    
    @scala.inline
    def setCrosshairVisibility(value: String): Self = StObject.set(x, "crosshairVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairVisibilityUndefined: Self = StObject.set(x, "crosshairVisibility", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDefaultInteraction(value: String): Self = StObject.set(x, "defaultInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultInteractionUndefined: Self = StObject.set(x, "defaultInteraction", js.undefined)
    
    @scala.inline
    def setDiamondMarkerTemplate(value: js.Any): Self = StObject.set(x, "diamondMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiamondMarkerTemplateUndefined: Self = StObject.set(x, "diamondMarkerTemplate", js.undefined)
    
    @scala.inline
    def setDragModifier(value: String): Self = StObject.set(x, "dragModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragModifierUndefined: Self = StObject.set(x, "dragModifier", js.undefined)
    
    @scala.inline
    def setGridAreaRectChanged(value: (/* event */ Event, /* ui */ GridAreaRectChangedEventUIParam) => Unit): Self = StObject.set(x, "gridAreaRectChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGridAreaRectChangedUndefined: Self = StObject.set(x, "gridAreaRectChanged", js.undefined)
    
    @scala.inline
    def setGridMode(value: String): Self = StObject.set(x, "gridMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridModeUndefined: Self = StObject.set(x, "gridMode", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHexagonMarkerTemplate(value: js.Any): Self = StObject.set(x, "hexagonMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexagonMarkerTemplateUndefined: Self = StObject.set(x, "hexagonMarkerTemplate", js.undefined)
    
    @scala.inline
    def setHexagramMarkerTemplate(value: js.Any): Self = StObject.set(x, "hexagramMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexagramMarkerTemplateUndefined: Self = StObject.set(x, "hexagramMarkerTemplate", js.undefined)
    
    @scala.inline
    def setHighlightingTransitionDuration(value: Double): Self = StObject.set(x, "highlightingTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightingTransitionDurationUndefined: Self = StObject.set(x, "highlightingTransitionDuration", js.undefined)
    
    @scala.inline
    def setHorizontalZoomable(value: Boolean): Self = StObject.set(x, "horizontalZoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalZoomableUndefined: Self = StObject.set(x, "horizontalZoomable", js.undefined)
    
    @scala.inline
    def setIsHorizontalZoomEnabled(value: Boolean): Self = StObject.set(x, "isHorizontalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalZoomEnabledUndefined: Self = StObject.set(x, "isHorizontalZoomEnabled", js.undefined)
    
    @scala.inline
    def setIsPagePanningAllowed(value: Boolean): Self = StObject.set(x, "isPagePanningAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPagePanningAllowedUndefined: Self = StObject.set(x, "isPagePanningAllowed", js.undefined)
    
    @scala.inline
    def setIsSquare(value: Boolean): Self = StObject.set(x, "isSquare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSquareUndefined: Self = StObject.set(x, "isSquare", js.undefined)
    
    @scala.inline
    def setIsSurfaceInteractionDisabled(value: Boolean): Self = StObject.set(x, "isSurfaceInteractionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSurfaceInteractionDisabledUndefined: Self = StObject.set(x, "isSurfaceInteractionDisabled", js.undefined)
    
    @scala.inline
    def setIsVerticalZoomEnabled(value: Boolean): Self = StObject.set(x, "isVerticalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalZoomEnabledUndefined: Self = StObject.set(x, "isVerticalZoomEnabled", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setLegend(value: IgDataChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMarkerBrushes(value: js.Any): Self = StObject.set(x, "markerBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBrushesUndefined: Self = StObject.set(x, "markerBrushes", js.undefined)
    
    @scala.inline
    def setMarkerOutlines(value: js.Any): Self = StObject.set(x, "markerOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerOutlinesUndefined: Self = StObject.set(x, "markerOutlines", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinesUndefined: Self = StObject.set(x, "outlines", js.undefined)
    
    @scala.inline
    def setOverviewPlusDetailPaneVisibility(value: String): Self = StObject.set(x, "overviewPlusDetailPaneVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewPlusDetailPaneVisibilityUndefined: Self = StObject.set(x, "overviewPlusDetailPaneVisibility", js.undefined)
    
    @scala.inline
    def setPanModifier(value: String): Self = StObject.set(x, "panModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanModifierUndefined: Self = StObject.set(x, "panModifier", js.undefined)
    
    @scala.inline
    def setPentagonMarkerTemplate(value: js.Any): Self = StObject.set(x, "pentagonMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPentagonMarkerTemplateUndefined: Self = StObject.set(x, "pentagonMarkerTemplate", js.undefined)
    
    @scala.inline
    def setPentagramMarkerTemplate(value: js.Any): Self = StObject.set(x, "pentagramMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPentagramMarkerTemplateUndefined: Self = StObject.set(x, "pentagramMarkerTemplate", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setPlotAreaBackground(value: String): Self = StObject.set(x, "plotAreaBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaBackgroundUndefined: Self = StObject.set(x, "plotAreaBackground", js.undefined)
    
    @scala.inline
    def setPreferHigherResolutionTiles(value: Boolean): Self = StObject.set(x, "preferHigherResolutionTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferHigherResolutionTilesUndefined: Self = StObject.set(x, "preferHigherResolutionTiles", js.undefined)
    
    @scala.inline
    def setPreviewRect(value: js.Any): Self = StObject.set(x, "previewRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewRectUndefined: Self = StObject.set(x, "previewRect", js.undefined)
    
    @scala.inline
    def setProgressiveLoadStatusChanged(value: (/* event */ Event, /* ui */ ProgressiveLoadStatusChangedEventUIParam) => Unit): Self = StObject.set(x, "progressiveLoadStatusChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressiveLoadStatusChangedUndefined: Self = StObject.set(x, "progressiveLoadStatusChanged", js.undefined)
    
    @scala.inline
    def setPyramidMarkerTemplate(value: js.Any): Self = StObject.set(x, "pyramidMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyramidMarkerTemplateUndefined: Self = StObject.set(x, "pyramidMarkerTemplate", js.undefined)
    
    @scala.inline
    def setRefreshCompleted(value: (/* event */ Event, /* ui */ RefreshCompletedEventUIParam) => Unit): Self = StObject.set(x, "refreshCompleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRefreshCompletedUndefined: Self = StObject.set(x, "refreshCompleted", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[IgDataChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesCursorMouseMove(value: (/* event */ Event, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit): Self = StObject.set(x, "seriesCursorMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesCursorMouseMoveUndefined: Self = StObject.set(x, "seriesCursorMouseMove", js.undefined)
    
    @scala.inline
    def setSeriesMouseEnter(value: (/* event */ Event, /* ui */ SeriesMouseEnterEventUIParam) => Unit): Self = StObject.set(x, "seriesMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesMouseEnterUndefined: Self = StObject.set(x, "seriesMouseEnter", js.undefined)
    
    @scala.inline
    def setSeriesMouseLeave(value: (/* event */ Event, /* ui */ SeriesMouseLeaveEventUIParam) => Unit): Self = StObject.set(x, "seriesMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesMouseLeaveUndefined: Self = StObject.set(x, "seriesMouseLeave", js.undefined)
    
    @scala.inline
    def setSeriesMouseLeftButtonDown(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit): Self = StObject.set(x, "seriesMouseLeftButtonDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesMouseLeftButtonDownUndefined: Self = StObject.set(x, "seriesMouseLeftButtonDown", js.undefined)
    
    @scala.inline
    def setSeriesMouseLeftButtonUp(value: (/* event */ Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit): Self = StObject.set(x, "seriesMouseLeftButtonUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesMouseLeftButtonUpUndefined: Self = StObject.set(x, "seriesMouseLeftButtonUp", js.undefined)
    
    @scala.inline
    def setSeriesMouseMove(value: (/* event */ Event, /* ui */ SeriesMouseMoveEventUIParam) => Unit): Self = StObject.set(x, "seriesMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesMouseMoveUndefined: Self = StObject.set(x, "seriesMouseMove", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: IgDataChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSquareMarkerTemplate(value: js.Any): Self = StObject.set(x, "squareMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquareMarkerTemplateUndefined: Self = StObject.set(x, "squareMarkerTemplate", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleBottomMargin(value: Double): Self = StObject.set(x, "subtitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleBottomMarginUndefined: Self = StObject.set(x, "subtitleBottomMargin", js.undefined)
    
    @scala.inline
    def setSubtitleHorizontalAlignment(value: String): Self = StObject.set(x, "subtitleHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleHorizontalAlignmentUndefined: Self = StObject.set(x, "subtitleHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setSubtitleLeftMargin(value: Double): Self = StObject.set(x, "subtitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLeftMarginUndefined: Self = StObject.set(x, "subtitleLeftMargin", js.undefined)
    
    @scala.inline
    def setSubtitleRightMargin(value: Double): Self = StObject.set(x, "subtitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleRightMarginUndefined: Self = StObject.set(x, "subtitleRightMargin", js.undefined)
    
    @scala.inline
    def setSubtitleTextColor(value: js.Any): Self = StObject.set(x, "subtitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextColorUndefined: Self = StObject.set(x, "subtitleTextColor", js.undefined)
    
    @scala.inline
    def setSubtitleTextStyle(value: String): Self = StObject.set(x, "subtitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextStyleUndefined: Self = StObject.set(x, "subtitleTextStyle", js.undefined)
    
    @scala.inline
    def setSubtitleTopMargin(value: Double): Self = StObject.set(x, "subtitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTopMarginUndefined: Self = StObject.set(x, "subtitleTopMargin", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSyncChannel(value: String): Self = StObject.set(x, "syncChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncChannelUndefined: Self = StObject.set(x, "syncChannel", js.undefined)
    
    @scala.inline
    def setSynchronizeHorizontally(value: Boolean): Self = StObject.set(x, "synchronizeHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronizeHorizontallyUndefined: Self = StObject.set(x, "synchronizeHorizontally", js.undefined)
    
    @scala.inline
    def setSynchronizeVertically(value: Boolean): Self = StObject.set(x, "synchronizeVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronizeVerticallyUndefined: Self = StObject.set(x, "synchronizeVertically", js.undefined)
    
    @scala.inline
    def setTetragramMarkerTemplate(value: js.Any): Self = StObject.set(x, "tetragramMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetragramMarkerTemplateUndefined: Self = StObject.set(x, "tetragramMarkerTemplate", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = StObject.set(x, "titleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBottomMarginUndefined: Self = StObject.set(x, "titleBottomMargin", js.undefined)
    
    @scala.inline
    def setTitleHorizontalAlignment(value: String): Self = StObject.set(x, "titleHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHorizontalAlignmentUndefined: Self = StObject.set(x, "titleHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = StObject.set(x, "titleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLeftMarginUndefined: Self = StObject.set(x, "titleLeftMargin", js.undefined)
    
    @scala.inline
    def setTitleRightMargin(value: Double): Self = StObject.set(x, "titleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRightMarginUndefined: Self = StObject.set(x, "titleRightMargin", js.undefined)
    
    @scala.inline
    def setTitleTextColor(value: js.Any): Self = StObject.set(x, "titleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextColorUndefined: Self = StObject.set(x, "titleTextColor", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: String): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = StObject.set(x, "titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTopMarginUndefined: Self = StObject.set(x, "titleTopMargin", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = StObject.set(x, "tooltipHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHiddenUndefined: Self = StObject.set(x, "tooltipHidden", js.undefined)
    
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = StObject.set(x, "tooltipHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHidingUndefined: Self = StObject.set(x, "tooltipHiding", js.undefined)
    
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = StObject.set(x, "tooltipShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShowingUndefined: Self = StObject.set(x, "tooltipShowing", js.undefined)
    
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = StObject.set(x, "tooltipShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setTriangleMarkerTemplate(value: js.Any): Self = StObject.set(x, "triangleMarkerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleMarkerTemplateUndefined: Self = StObject.set(x, "triangleMarkerTemplate", js.undefined)
    
    @scala.inline
    def setTypicalBasedOn(value: (/* event */ Event, /* ui */ TypicalBasedOnEventUIParam) => Unit): Self = StObject.set(x, "typicalBasedOn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypicalBasedOnUndefined: Self = StObject.set(x, "typicalBasedOn", js.undefined)
    
    @scala.inline
    def setUseTiledZooming(value: Boolean): Self = StObject.set(x, "useTiledZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTiledZoomingUndefined: Self = StObject.set(x, "useTiledZooming", js.undefined)
    
    @scala.inline
    def setVerticalZoomable(value: Boolean): Self = StObject.set(x, "verticalZoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalZoomableUndefined: Self = StObject.set(x, "verticalZoomable", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowPositionHorizontal(value: Double): Self = StObject.set(x, "windowPositionHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowPositionHorizontalUndefined: Self = StObject.set(x, "windowPositionHorizontal", js.undefined)
    
    @scala.inline
    def setWindowPositionVertical(value: Double): Self = StObject.set(x, "windowPositionVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowPositionVerticalUndefined: Self = StObject.set(x, "windowPositionVertical", js.undefined)
    
    @scala.inline
    def setWindowRect(value: js.Any): Self = StObject.set(x, "windowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = StObject.set(x, "windowRectChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWindowRectChangedUndefined: Self = StObject.set(x, "windowRectChanged", js.undefined)
    
    @scala.inline
    def setWindowRectMinWidth(value: Double): Self = StObject.set(x, "windowRectMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRectMinWidthUndefined: Self = StObject.set(x, "windowRectMinWidth", js.undefined)
    
    @scala.inline
    def setWindowRectUndefined: Self = StObject.set(x, "windowRect", js.undefined)
    
    @scala.inline
    def setWindowResponse(value: String): Self = StObject.set(x, "windowResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowResponseUndefined: Self = StObject.set(x, "windowResponse", js.undefined)
    
    @scala.inline
    def setWindowScaleHorizontal(value: Double): Self = StObject.set(x, "windowScaleHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowScaleHorizontalUndefined: Self = StObject.set(x, "windowScaleHorizontal", js.undefined)
    
    @scala.inline
    def setWindowScaleVertical(value: Double): Self = StObject.set(x, "windowScaleVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowScaleVerticalUndefined: Self = StObject.set(x, "windowScaleVertical", js.undefined)
    
    @scala.inline
    def setZoomTileCacheSize(value: Double): Self = StObject.set(x, "zoomTileCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomTileCacheSizeUndefined: Self = StObject.set(x, "zoomTileCacheSize", js.undefined)
  }
}
