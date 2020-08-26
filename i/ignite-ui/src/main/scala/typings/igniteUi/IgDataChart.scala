package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IgDataChartOps[Self <: IgDataChart] (val x: Self) extends AnyVal {
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
    def setAnimateSeriesWhenAxisRangeChanges(value: Boolean): Self = this.set("animateSeriesWhenAxisRangeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateSeriesWhenAxisRangeChanges: Self = this.set("animateSeriesWhenAxisRangeChanges", js.undefined)
    @scala.inline
    def setAssigningCategoryMarkerStyle(value: (/* event */ Event, /* ui */ AssigningCategoryMarkerStyleEventUIParam) => Unit): Self = this.set("assigningCategoryMarkerStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAssigningCategoryMarkerStyle: Self = this.set("assigningCategoryMarkerStyle", js.undefined)
    @scala.inline
    def setAssigningCategoryStyle(value: (/* event */ Event, /* ui */ AssigningCategoryStyleEventUIParam) => Unit): Self = this.set("assigningCategoryStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAssigningCategoryStyle: Self = this.set("assigningCategoryStyle", js.undefined)
    @scala.inline
    def setAutoMarginHeight(value: Double): Self = this.set("autoMarginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMarginHeight: Self = this.set("autoMarginHeight", js.undefined)
    @scala.inline
    def setAutoMarginWidth(value: Double): Self = this.set("autoMarginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMarginWidth: Self = this.set("autoMarginWidth", js.undefined)
    @scala.inline
    def setAxesVarargs(value: IgDataChartAxes*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[IgDataChartAxes]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setAxisRangeChanged(value: (/* event */ Event, /* ui */ AxisRangeChangedEventUIParam) => Unit): Self = this.set("axisRangeChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAxisRangeChanged: Self = this.set("axisRangeChanged", js.undefined)
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMargin: Self = this.set("bottomMargin", js.undefined)
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = this.set("browserNotSupported", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBrowserNotSupported: Self = this.set("browserNotSupported", js.undefined)
    @scala.inline
    def setBrushes(value: js.Any): Self = this.set("brushes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    @scala.inline
    def setCircleMarkerTemplate(value: js.Any): Self = this.set("circleMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleMarkerTemplate: Self = this.set("circleMarkerTemplate", js.undefined)
    @scala.inline
    def setContentHitTestMode(value: String): Self = this.set("contentHitTestMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHitTestMode: Self = this.set("contentHitTestMode", js.undefined)
    @scala.inline
    def setCrosshairPoint(value: IgDataChartCrosshairPoint): Self = this.set("crosshairPoint", value.asInstanceOf[js.Any])
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
    def setGridMode(value: String): Self = this.set("gridMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridMode: Self = this.set("gridMode", js.undefined)
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
    def setHighlightingTransitionDuration(value: Double): Self = this.set("highlightingTransitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightingTransitionDuration: Self = this.set("highlightingTransitionDuration", js.undefined)
    @scala.inline
    def setHorizontalZoomable(value: Boolean): Self = this.set("horizontalZoomable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalZoomable: Self = this.set("horizontalZoomable", js.undefined)
    @scala.inline
    def setIsHorizontalZoomEnabled(value: Boolean): Self = this.set("isHorizontalZoomEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHorizontalZoomEnabled: Self = this.set("isHorizontalZoomEnabled", js.undefined)
    @scala.inline
    def setIsPagePanningAllowed(value: Boolean): Self = this.set("isPagePanningAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPagePanningAllowed: Self = this.set("isPagePanningAllowed", js.undefined)
    @scala.inline
    def setIsSquare(value: Boolean): Self = this.set("isSquare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSquare: Self = this.set("isSquare", js.undefined)
    @scala.inline
    def setIsSurfaceInteractionDisabled(value: Boolean): Self = this.set("isSurfaceInteractionDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSurfaceInteractionDisabled: Self = this.set("isSurfaceInteractionDisabled", js.undefined)
    @scala.inline
    def setIsVerticalZoomEnabled(value: Boolean): Self = this.set("isVerticalZoomEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVerticalZoomEnabled: Self = this.set("isVerticalZoomEnabled", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    @scala.inline
    def setLegend(value: IgDataChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMarkerBrushes(value: js.Any): Self = this.set("markerBrushes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerBrushes: Self = this.set("markerBrushes", js.undefined)
    @scala.inline
    def setMarkerOutlines(value: js.Any): Self = this.set("markerOutlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOutlines: Self = this.set("markerOutlines", js.undefined)
    @scala.inline
    def setOutlines(value: js.Any): Self = this.set("outlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlines: Self = this.set("outlines", js.undefined)
    @scala.inline
    def setOverviewPlusDetailPaneVisibility(value: String): Self = this.set("overviewPlusDetailPaneVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverviewPlusDetailPaneVisibility: Self = this.set("overviewPlusDetailPaneVisibility", js.undefined)
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
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
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
    def setProgressiveLoadStatusChanged(value: (/* event */ Event, /* ui */ ProgressiveLoadStatusChangedEventUIParam) => Unit): Self = this.set("progressiveLoadStatusChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProgressiveLoadStatusChanged: Self = this.set("progressiveLoadStatusChanged", js.undefined)
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
    def setRightMargin(value: Double): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: IgDataChartSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[IgDataChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
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
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSquareMarkerTemplate(value: js.Any): Self = this.set("squareMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquareMarkerTemplate: Self = this.set("squareMarkerTemplate", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setSubtitleBottomMargin(value: Double): Self = this.set("subtitleBottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleBottomMargin: Self = this.set("subtitleBottomMargin", js.undefined)
    @scala.inline
    def setSubtitleHorizontalAlignment(value: String): Self = this.set("subtitleHorizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleHorizontalAlignment: Self = this.set("subtitleHorizontalAlignment", js.undefined)
    @scala.inline
    def setSubtitleLeftMargin(value: Double): Self = this.set("subtitleLeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleLeftMargin: Self = this.set("subtitleLeftMargin", js.undefined)
    @scala.inline
    def setSubtitleRightMargin(value: Double): Self = this.set("subtitleRightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleRightMargin: Self = this.set("subtitleRightMargin", js.undefined)
    @scala.inline
    def setSubtitleTextColor(value: js.Any): Self = this.set("subtitleTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleTextColor: Self = this.set("subtitleTextColor", js.undefined)
    @scala.inline
    def setSubtitleTextStyle(value: String): Self = this.set("subtitleTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleTextStyle: Self = this.set("subtitleTextStyle", js.undefined)
    @scala.inline
    def setSubtitleTopMargin(value: Double): Self = this.set("subtitleTopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleTopMargin: Self = this.set("subtitleTopMargin", js.undefined)
    @scala.inline
    def setSyncChannel(value: String): Self = this.set("syncChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncChannel: Self = this.set("syncChannel", js.undefined)
    @scala.inline
    def setSynchronizeHorizontally(value: Boolean): Self = this.set("synchronizeHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronizeHorizontally: Self = this.set("synchronizeHorizontally", js.undefined)
    @scala.inline
    def setSynchronizeVertically(value: Boolean): Self = this.set("synchronizeVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronizeVertically: Self = this.set("synchronizeVertically", js.undefined)
    @scala.inline
    def setTetragramMarkerTemplate(value: js.Any): Self = this.set("tetragramMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTetragramMarkerTemplate: Self = this.set("tetragramMarkerTemplate", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = this.set("titleBottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleBottomMargin: Self = this.set("titleBottomMargin", js.undefined)
    @scala.inline
    def setTitleHorizontalAlignment(value: String): Self = this.set("titleHorizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleHorizontalAlignment: Self = this.set("titleHorizontalAlignment", js.undefined)
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = this.set("titleLeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLeftMargin: Self = this.set("titleLeftMargin", js.undefined)
    @scala.inline
    def setTitleRightMargin(value: Double): Self = this.set("titleRightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleRightMargin: Self = this.set("titleRightMargin", js.undefined)
    @scala.inline
    def setTitleTextColor(value: js.Any): Self = this.set("titleTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTextColor: Self = this.set("titleTextColor", js.undefined)
    @scala.inline
    def setTitleTextStyle(value: String): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    @scala.inline
    def setTitleTopMargin(value: Double): Self = this.set("titleTopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTopMargin: Self = this.set("titleTopMargin", js.undefined)
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
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    @scala.inline
    def setTriangleMarkerTemplate(value: js.Any): Self = this.set("triangleMarkerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriangleMarkerTemplate: Self = this.set("triangleMarkerTemplate", js.undefined)
    @scala.inline
    def setTypicalBasedOn(value: (/* event */ Event, /* ui */ TypicalBasedOnEventUIParam) => Unit): Self = this.set("typicalBasedOn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTypicalBasedOn: Self = this.set("typicalBasedOn", js.undefined)
    @scala.inline
    def setUseTiledZooming(value: Boolean): Self = this.set("useTiledZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTiledZooming: Self = this.set("useTiledZooming", js.undefined)
    @scala.inline
    def setVerticalZoomable(value: Boolean): Self = this.set("verticalZoomable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalZoomable: Self = this.set("verticalZoomable", js.undefined)
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
    def setWindowScaleHorizontal(value: Double): Self = this.set("windowScaleHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowScaleHorizontal: Self = this.set("windowScaleHorizontal", js.undefined)
    @scala.inline
    def setWindowScaleVertical(value: Double): Self = this.set("windowScaleVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowScaleVertical: Self = this.set("windowScaleVertical", js.undefined)
    @scala.inline
    def setZoomTileCacheSize(value: Double): Self = this.set("zoomTileCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomTileCacheSize: Self = this.set("zoomTileCacheSize", js.undefined)
  }
  
}

