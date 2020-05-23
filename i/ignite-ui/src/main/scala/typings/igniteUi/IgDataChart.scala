package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Set to true in order to override the default behavior in which series do not animate if an axis range changes
    */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined
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
  var assigningCategoryMarkerStyle: js.UndefOr[AssigningCategoryMarkerStyleEvent] = js.undefined
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
  var assigningCategoryStyle: js.UndefOr[AssigningCategoryStyleEvent] = js.undefined
  /**
    * Sets or gets the automatic height to add when automatically adding margins to the chart.
    */
  var autoMarginHeight: js.UndefOr[Double] = js.undefined
  /**
    * Sets or gets the automatic width to add when automatically adding margins to the chart.
    */
  var autoMarginWidth: js.UndefOr[Double] = js.undefined
  /**
    * An array of axis objects
    */
  var axes: js.UndefOr[js.Array[IgDataChartAxes]] = js.undefined
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
  var axisRangeChanged: js.UndefOr[AxisRangeChangedEvent] = js.undefined
  /**
    * Sets or gets the bottom margin to use around the chart content in the canvas.
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
  /**
    * Gets or sets the Brushes property.
    * The brushes property defines the palette from which automatically assigned series brushes are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for circle markers on the chart.
    * Defines the marker template used for
    * series with a marker type of circle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var circleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
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
  var contentHitTestMode: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the cross hair point (in world coordinates)
    * Either or both of the crosshair point's X and Y may be set to double.NaN, in which
    * case the relevant crosshair line is hidden.
    */
  var crosshairPoint: js.UndefOr[IgDataChartCrosshairPoint] = js.undefined
  /**
    * Gets or sets the current Chart's crosshair visibility override.  Note: setting this property does not affect the mobile browser version of the chart.
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
    * Gets or sets the DefaultInteraction property. The default interaction state defines the chart's response to mouse events.
    *
    * Valid values:
    * "none" User gesture will not change the state of the chart.
    * "dragZoom" User gesture will start a drag rectangle to zoom the chart.
    * "dragPan" User gesture will start a pan action to move the chart's window.
    */
  var defaultInteraction: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the template to use for diamond markers on the chart.
    * Defines the marker template used for
    * series with a marker type of diamond.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var diamondMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the current Chart's DragModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var dragModifier: js.UndefOr[String] = js.undefined
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
  var gridAreaRectChanged: js.UndefOr[GridAreaRectChangedEvent] = js.undefined
  /**
    * Gets or sets the GridMode property.
    *
    * Valid values:
    * "none" No chart grid.
    * "beforeSeries" Chart grid should be rendered before or in front of the data series.
    * "behindSeries" Chart grid should be rendered behind or in back of the data series.
    */
  var gridMode: js.UndefOr[String] = js.undefined
  /**
    * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * Gets or sets the template to use for hexagon markers on the chart.
    * Defines the marker template used for
    * series with a marker type of hexagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for hexagram markers on the chart.
    * Defines the marker template used for
    * series with a marker type of hexagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var hexagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * The length, in milliseconds of the highlighting transition.
    */
  var highlightingTransitionDuration: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the current Chart's horizontal zoomability.  This option is deprecated - please use `isHorizontalZoomEnabled` instead.
    */
  var horizontalZoomable: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the current Chart's horizontal zoomability.
    */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether the series viewer can allow the page to pan if a control pan is not possible in the requested direction.
    */
  var isPagePanningAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether to use a square aspect ratio for the chart. This is locked to true for polar and radial charts.
    */
  var isSquare: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true in order to disable any interactions with the plot surface.
    */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the current Chart's vertical zoomability.
    */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Sets or gets the left margin to use around the chart content in the canvas.
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
    * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
    */
  var legend: js.UndefOr[IgDataChartLegend] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the MarkerBrushes property.
    * The marker brushes property defines the palette from which automatically assigned marker brushes are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerBrushes: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the MarkerOutlines property.
    * The marker outlines property defines the palette from which automatically assigned marker outlines are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerOutlines: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the Outlines property.
    * The outlines property defines the palette from which automatically assigned series outlines are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.undefined
  /**
    * The visibility of the OverviewPlusDetailPane.
    *
    * Valid values:
    * "visible" The overview pane should be visible.
    * "collapsed" The overview pane should not be visible.
    */
  var overviewPlusDetailPaneVisibility: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the current Chart's PanModifier property.
    *
    * Valid values:
    * "none" No modifier key is set.
    * "alt" The modifier is set to alt key.
    * "control" The modifier is set to control key.
    * "shift" The modifier is set to shift key.
    */
  var panModifier: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the template to use for pentagon markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pentagon.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagonMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for pentragram markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pentagram.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pentagramMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the scaling value used by the main canvas rendering context to apply a scale transform to it.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the brush used as the background for the current Chart object's plot area.
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
    * Event fired when the progressive loading state of the series has changed.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.currentStatus to get current status.
    */
  var progressiveLoadStatusChanged: js.UndefOr[ProgressiveLoadStatusChangedEvent] = js.undefined
  /**
    * Gets or sets the template to use for pyramid markers on the chart.
    * Defines the marker template used for
    * series with a marker type of pyramid.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var pyramidMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * Raised when the chart's processing for an update has completed.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
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
    * Sets or gets the right margin to use around the chart content in the canvas.
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
    * An array of series objects
    */
  var series: js.UndefOr[js.Array[IgDataChartSeries]] = js.undefined
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
  var seriesCursorMouseMove: js.UndefOr[SeriesCursorMouseMoveEvent] = js.undefined
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
  var seriesMouseEnter: js.UndefOr[SeriesMouseEnterEvent] = js.undefined
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
  var seriesMouseLeave: js.UndefOr[SeriesMouseLeaveEvent] = js.undefined
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
  var seriesMouseLeftButtonDown: js.UndefOr[SeriesMouseLeftButtonDownEvent] = js.undefined
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
  var seriesMouseLeftButtonUp: js.UndefOr[SeriesMouseLeftButtonUpEvent] = js.undefined
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
  var seriesMouseMove: js.UndefOr[SeriesMouseMoveEvent] = js.undefined
  /**
    * To set both dimensions of the chart simultaneously an object with a width and height property can be provided
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the template to use for square markers on the chart.
    * Defines the marker template used for
    * series with a marker type of square.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var squareMarkerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
    * The subtitle to display for the component.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * The bottom margin to use for the subtitle.
    */
  var subtitleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
    * the horizontal alignment to use for the subtitle.
    *
    * Valid values:
    * "left" left aligns the subtitle.
    * "center" center aligns the subtitle.
    * "right" right aligns the subtitle.
    */
  var subtitleHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
    * The left margin to use for the subtitle.
    */
  var subtitleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
    * The right margin to use for the subtitle.
    */
  var subtitleRightMargin: js.UndefOr[Double] = js.undefined
  /**
    * The color to use for the subtitle.
    */
  var subtitleTextColor: js.UndefOr[js.Any] = js.undefined
  /**
    * The css font property to use for the title.
    */
  var subtitleTextStyle: js.UndefOr[String] = js.undefined
  /**
    * The top margin to use for the subtitle.
    */
  var subtitleTopMargin: js.UndefOr[Double] = js.undefined
  /**
    * The channel name to use to sync this chart with other charts.
    */
  var syncChannel: js.UndefOr[String] = js.undefined
  /**
    * Whether the chart should be synchronized horizontally
    */
  var synchronizeHorizontally: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the chart should be synchronized vertically
    */
  var synchronizeVertically: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the template to use for tetragram markers on the chart.
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
    * The title to display for the component.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The bottom margin to use for the title.
    */
  var titleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
    * the horizontal alignment to use for the title.
    *
    * Valid values:
    * "left" left aligns the title.
    * "center" center aligns the title.
    * "right" right aligns the title.
    */
  var titleHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
    * The left margin to use for the title.
    */
  var titleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
    * The right margin to use for the title.
    */
  var titleRightMargin: js.UndefOr[Double] = js.undefined
  /**
    * The color to use for the title.
    */
  var titleTextColor: js.UndefOr[js.Any] = js.undefined
  /**
    * The css font property to use for the title.
    */
  var titleTextStyle: js.UndefOr[String] = js.undefined
  /**
    * The top margin to use for the title.
    */
  var titleTopMargin: js.UndefOr[Double] = js.undefined
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
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
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
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
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
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
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
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
    * Sets or gets the top margin to use around the chart content in the canvas.
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the template to use for triangle markers on the chart.
    * Defines the marker template used for
    * series with a marker type of triangle.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var triangleMarkerTemplate: js.UndefOr[js.Any] = js.undefined
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
  var typicalBasedOn: js.UndefOr[TypicalBasedOnEvent] = js.undefined
  /**
    * Sets whether the series viewer should use cached tiles during zooms rather than the default live content.
    */
  var useTiledZooming: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the current Chart's vertical zoomability.  This option is deprecated - please use `isVerticalZoomEnabled` instead.
    */
  var verticalZoomable: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
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
    * A rectangle representing the portion of the chart currently in view.
    * A rectangle at X=0, Y=0 with a Height and Width of 1 implies the entire plotting area is in view.  A Height and Width of .5 would imply that the view is halfway zoomed in.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var windowRect: js.UndefOr[js.Any] = js.undefined
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
    * A number between 0 and 1 determining the scale of the horizontal zoom.
    * This property is effectively a shortcut to the Width of the WindowRect property.
    */
  var windowScaleHorizontal: js.UndefOr[Double] = js.undefined
  /**
    * A number between 0 and 1 determining the scale of the vertical zoom.
    * This property is effectively a shortcut to the Height of the WindowRect property.
    */
  var windowScaleVertical: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
    */
  var zoomTileCacheSize: js.UndefOr[Double] = js.undefined
}

object IgDataChart {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined,
    assigningCategoryMarkerStyle: (/* event */ Event, /* ui */ AssigningCategoryMarkerStyleEventUIParam) => Unit = null,
    assigningCategoryStyle: (/* event */ Event, /* ui */ AssigningCategoryStyleEventUIParam) => Unit = null,
    autoMarginHeight: js.UndefOr[Double] = js.undefined,
    autoMarginWidth: js.UndefOr[Double] = js.undefined,
    axes: js.Array[IgDataChartAxes] = null,
    axisRangeChanged: (/* event */ Event, /* ui */ AxisRangeChangedEventUIParam) => Unit = null,
    bottomMargin: js.UndefOr[Double] = js.undefined,
    browserNotSupported: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit = null,
    brushes: js.Any = null,
    circleMarkerTemplate: js.Any = null,
    contentHitTestMode: String = null,
    crosshairPoint: IgDataChartCrosshairPoint = null,
    crosshairVisibility: String = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    defaultInteraction: String = null,
    diamondMarkerTemplate: js.Any = null,
    dragModifier: String = null,
    gridAreaRectChanged: (/* event */ Event, /* ui */ GridAreaRectChangedEventUIParam) => Unit = null,
    gridMode: String = null,
    height: String | Double = null,
    hexagonMarkerTemplate: js.Any = null,
    hexagramMarkerTemplate: js.Any = null,
    highlightingTransitionDuration: js.UndefOr[Double] = js.undefined,
    horizontalZoomable: js.UndefOr[Boolean] = js.undefined,
    isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    isPagePanningAllowed: js.UndefOr[Boolean] = js.undefined,
    isSquare: js.UndefOr[Boolean] = js.undefined,
    isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined,
    isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    leftMargin: js.UndefOr[Double] = js.undefined,
    legend: IgDataChartLegend = null,
    locale: js.Any = null,
    markerBrushes: js.Any = null,
    markerOutlines: js.Any = null,
    outlines: js.Any = null,
    overviewPlusDetailPaneVisibility: String = null,
    panModifier: String = null,
    pentagonMarkerTemplate: js.Any = null,
    pentagramMarkerTemplate: js.Any = null,
    pixelScalingRatio: js.UndefOr[Double] = js.undefined,
    plotAreaBackground: String = null,
    preferHigherResolutionTiles: js.UndefOr[Boolean] = js.undefined,
    previewRect: js.Any = null,
    progressiveLoadStatusChanged: (/* event */ Event, /* ui */ ProgressiveLoadStatusChangedEventUIParam) => Unit = null,
    pyramidMarkerTemplate: js.Any = null,
    refreshCompleted: (/* event */ Event, /* ui */ RefreshCompletedEventUIParam) => Unit = null,
    regional: String | js.Object = null,
    responseDataKey: String = null,
    rightMargin: js.UndefOr[Double] = js.undefined,
    series: js.Array[IgDataChartSeries] = null,
    seriesCursorMouseMove: (/* event */ Event, /* ui */ SeriesCursorMouseMoveEventUIParam) => Unit = null,
    seriesMouseEnter: (/* event */ Event, /* ui */ SeriesMouseEnterEventUIParam) => Unit = null,
    seriesMouseLeave: (/* event */ Event, /* ui */ SeriesMouseLeaveEventUIParam) => Unit = null,
    seriesMouseLeftButtonDown: (/* event */ Event, /* ui */ SeriesMouseLeftButtonDownEventUIParam) => Unit = null,
    seriesMouseLeftButtonUp: (/* event */ Event, /* ui */ SeriesMouseLeftButtonUpEventUIParam) => Unit = null,
    seriesMouseMove: (/* event */ Event, /* ui */ SeriesMouseMoveEventUIParam) => Unit = null,
    size: js.Any = null,
    squareMarkerTemplate: js.Any = null,
    subtitle: String = null,
    subtitleBottomMargin: js.UndefOr[Double] = js.undefined,
    subtitleHorizontalAlignment: String = null,
    subtitleLeftMargin: js.UndefOr[Double] = js.undefined,
    subtitleRightMargin: js.UndefOr[Double] = js.undefined,
    subtitleTextColor: js.Any = null,
    subtitleTextStyle: String = null,
    subtitleTopMargin: js.UndefOr[Double] = js.undefined,
    syncChannel: String = null,
    synchronizeHorizontally: js.UndefOr[Boolean] = js.undefined,
    synchronizeVertically: js.UndefOr[Boolean] = js.undefined,
    tetragramMarkerTemplate: js.Any = null,
    theme: String = null,
    title: String = null,
    titleBottomMargin: js.UndefOr[Double] = js.undefined,
    titleHorizontalAlignment: String = null,
    titleLeftMargin: js.UndefOr[Double] = js.undefined,
    titleRightMargin: js.UndefOr[Double] = js.undefined,
    titleTextColor: js.Any = null,
    titleTextStyle: String = null,
    titleTopMargin: js.UndefOr[Double] = js.undefined,
    tooltipHidden: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit = null,
    tooltipHiding: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit = null,
    tooltipShowing: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit = null,
    tooltipShown: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit = null,
    topMargin: js.UndefOr[Double] = js.undefined,
    triangleMarkerTemplate: js.Any = null,
    typicalBasedOn: (/* event */ Event, /* ui */ TypicalBasedOnEventUIParam) => Unit = null,
    useTiledZooming: js.UndefOr[Boolean] = js.undefined,
    verticalZoomable: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    windowPositionHorizontal: js.UndefOr[Double] = js.undefined,
    windowPositionVertical: js.UndefOr[Double] = js.undefined,
    windowRect: js.Any = null,
    windowRectChanged: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit = null,
    windowRectMinWidth: js.UndefOr[Double] = js.undefined,
    windowResponse: String = null,
    windowScaleHorizontal: js.UndefOr[Double] = js.undefined,
    windowScaleVertical: js.UndefOr[Double] = js.undefined,
    zoomTileCacheSize: js.UndefOr[Double] = js.undefined
  ): IgDataChart = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animateSeriesWhenAxisRangeChanges)) __obj.updateDynamic("animateSeriesWhenAxisRangeChanges")(animateSeriesWhenAxisRangeChanges.get.asInstanceOf[js.Any])
    if (assigningCategoryMarkerStyle != null) __obj.updateDynamic("assigningCategoryMarkerStyle")(js.Any.fromFunction2(assigningCategoryMarkerStyle))
    if (assigningCategoryStyle != null) __obj.updateDynamic("assigningCategoryStyle")(js.Any.fromFunction2(assigningCategoryStyle))
    if (!js.isUndefined(autoMarginHeight)) __obj.updateDynamic("autoMarginHeight")(autoMarginHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMarginWidth)) __obj.updateDynamic("autoMarginWidth")(autoMarginWidth.get.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisRangeChanged != null) __obj.updateDynamic("axisRangeChanged")(js.Any.fromFunction2(axisRangeChanged))
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin.get.asInstanceOf[js.Any])
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(js.Any.fromFunction2(browserNotSupported))
    if (brushes != null) __obj.updateDynamic("brushes")(brushes.asInstanceOf[js.Any])
    if (circleMarkerTemplate != null) __obj.updateDynamic("circleMarkerTemplate")(circleMarkerTemplate.asInstanceOf[js.Any])
    if (contentHitTestMode != null) __obj.updateDynamic("contentHitTestMode")(contentHitTestMode.asInstanceOf[js.Any])
    if (crosshairPoint != null) __obj.updateDynamic("crosshairPoint")(crosshairPoint.asInstanceOf[js.Any])
    if (crosshairVisibility != null) __obj.updateDynamic("crosshairVisibility")(crosshairVisibility.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (defaultInteraction != null) __obj.updateDynamic("defaultInteraction")(defaultInteraction.asInstanceOf[js.Any])
    if (diamondMarkerTemplate != null) __obj.updateDynamic("diamondMarkerTemplate")(diamondMarkerTemplate.asInstanceOf[js.Any])
    if (dragModifier != null) __obj.updateDynamic("dragModifier")(dragModifier.asInstanceOf[js.Any])
    if (gridAreaRectChanged != null) __obj.updateDynamic("gridAreaRectChanged")(js.Any.fromFunction2(gridAreaRectChanged))
    if (gridMode != null) __obj.updateDynamic("gridMode")(gridMode.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hexagonMarkerTemplate != null) __obj.updateDynamic("hexagonMarkerTemplate")(hexagonMarkerTemplate.asInstanceOf[js.Any])
    if (hexagramMarkerTemplate != null) __obj.updateDynamic("hexagramMarkerTemplate")(hexagramMarkerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightingTransitionDuration)) __obj.updateDynamic("highlightingTransitionDuration")(highlightingTransitionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalZoomable)) __obj.updateDynamic("horizontalZoomable")(horizontalZoomable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontalZoomEnabled)) __obj.updateDynamic("isHorizontalZoomEnabled")(isHorizontalZoomEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPagePanningAllowed)) __obj.updateDynamic("isPagePanningAllowed")(isPagePanningAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSquare)) __obj.updateDynamic("isSquare")(isSquare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSurfaceInteractionDisabled)) __obj.updateDynamic("isSurfaceInteractionDisabled")(isSurfaceInteractionDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerticalZoomEnabled)) __obj.updateDynamic("isVerticalZoomEnabled")(isVerticalZoomEnabled.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin.get.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (markerBrushes != null) __obj.updateDynamic("markerBrushes")(markerBrushes.asInstanceOf[js.Any])
    if (markerOutlines != null) __obj.updateDynamic("markerOutlines")(markerOutlines.asInstanceOf[js.Any])
    if (outlines != null) __obj.updateDynamic("outlines")(outlines.asInstanceOf[js.Any])
    if (overviewPlusDetailPaneVisibility != null) __obj.updateDynamic("overviewPlusDetailPaneVisibility")(overviewPlusDetailPaneVisibility.asInstanceOf[js.Any])
    if (panModifier != null) __obj.updateDynamic("panModifier")(panModifier.asInstanceOf[js.Any])
    if (pentagonMarkerTemplate != null) __obj.updateDynamic("pentagonMarkerTemplate")(pentagonMarkerTemplate.asInstanceOf[js.Any])
    if (pentagramMarkerTemplate != null) __obj.updateDynamic("pentagramMarkerTemplate")(pentagramMarkerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelScalingRatio)) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.get.asInstanceOf[js.Any])
    if (plotAreaBackground != null) __obj.updateDynamic("plotAreaBackground")(plotAreaBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(preferHigherResolutionTiles)) __obj.updateDynamic("preferHigherResolutionTiles")(preferHigherResolutionTiles.get.asInstanceOf[js.Any])
    if (previewRect != null) __obj.updateDynamic("previewRect")(previewRect.asInstanceOf[js.Any])
    if (progressiveLoadStatusChanged != null) __obj.updateDynamic("progressiveLoadStatusChanged")(js.Any.fromFunction2(progressiveLoadStatusChanged))
    if (pyramidMarkerTemplate != null) __obj.updateDynamic("pyramidMarkerTemplate")(pyramidMarkerTemplate.asInstanceOf[js.Any])
    if (refreshCompleted != null) __obj.updateDynamic("refreshCompleted")(js.Any.fromFunction2(refreshCompleted))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesCursorMouseMove != null) __obj.updateDynamic("seriesCursorMouseMove")(js.Any.fromFunction2(seriesCursorMouseMove))
    if (seriesMouseEnter != null) __obj.updateDynamic("seriesMouseEnter")(js.Any.fromFunction2(seriesMouseEnter))
    if (seriesMouseLeave != null) __obj.updateDynamic("seriesMouseLeave")(js.Any.fromFunction2(seriesMouseLeave))
    if (seriesMouseLeftButtonDown != null) __obj.updateDynamic("seriesMouseLeftButtonDown")(js.Any.fromFunction2(seriesMouseLeftButtonDown))
    if (seriesMouseLeftButtonUp != null) __obj.updateDynamic("seriesMouseLeftButtonUp")(js.Any.fromFunction2(seriesMouseLeftButtonUp))
    if (seriesMouseMove != null) __obj.updateDynamic("seriesMouseMove")(js.Any.fromFunction2(seriesMouseMove))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (squareMarkerTemplate != null) __obj.updateDynamic("squareMarkerTemplate")(squareMarkerTemplate.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleBottomMargin)) __obj.updateDynamic("subtitleBottomMargin")(subtitleBottomMargin.get.asInstanceOf[js.Any])
    if (subtitleHorizontalAlignment != null) __obj.updateDynamic("subtitleHorizontalAlignment")(subtitleHorizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleLeftMargin)) __obj.updateDynamic("subtitleLeftMargin")(subtitleLeftMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleRightMargin)) __obj.updateDynamic("subtitleRightMargin")(subtitleRightMargin.get.asInstanceOf[js.Any])
    if (subtitleTextColor != null) __obj.updateDynamic("subtitleTextColor")(subtitleTextColor.asInstanceOf[js.Any])
    if (subtitleTextStyle != null) __obj.updateDynamic("subtitleTextStyle")(subtitleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitleTopMargin)) __obj.updateDynamic("subtitleTopMargin")(subtitleTopMargin.get.asInstanceOf[js.Any])
    if (syncChannel != null) __obj.updateDynamic("syncChannel")(syncChannel.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeHorizontally)) __obj.updateDynamic("synchronizeHorizontally")(synchronizeHorizontally.get.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeVertically)) __obj.updateDynamic("synchronizeVertically")(synchronizeVertically.get.asInstanceOf[js.Any])
    if (tetragramMarkerTemplate != null) __obj.updateDynamic("tetragramMarkerTemplate")(tetragramMarkerTemplate.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleBottomMargin)) __obj.updateDynamic("titleBottomMargin")(titleBottomMargin.get.asInstanceOf[js.Any])
    if (titleHorizontalAlignment != null) __obj.updateDynamic("titleHorizontalAlignment")(titleHorizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(titleLeftMargin)) __obj.updateDynamic("titleLeftMargin")(titleLeftMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleRightMargin)) __obj.updateDynamic("titleRightMargin")(titleRightMargin.get.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(titleTopMargin)) __obj.updateDynamic("titleTopMargin")(titleTopMargin.get.asInstanceOf[js.Any])
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(js.Any.fromFunction2(tooltipHidden))
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(js.Any.fromFunction2(tooltipHiding))
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(js.Any.fromFunction2(tooltipShowing))
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(js.Any.fromFunction2(tooltipShown))
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin.get.asInstanceOf[js.Any])
    if (triangleMarkerTemplate != null) __obj.updateDynamic("triangleMarkerTemplate")(triangleMarkerTemplate.asInstanceOf[js.Any])
    if (typicalBasedOn != null) __obj.updateDynamic("typicalBasedOn")(js.Any.fromFunction2(typicalBasedOn))
    if (!js.isUndefined(useTiledZooming)) __obj.updateDynamic("useTiledZooming")(useTiledZooming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalZoomable)) __obj.updateDynamic("verticalZoomable")(verticalZoomable.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(windowPositionHorizontal)) __obj.updateDynamic("windowPositionHorizontal")(windowPositionHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowPositionVertical)) __obj.updateDynamic("windowPositionVertical")(windowPositionVertical.get.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect.asInstanceOf[js.Any])
    if (windowRectChanged != null) __obj.updateDynamic("windowRectChanged")(js.Any.fromFunction2(windowRectChanged))
    if (!js.isUndefined(windowRectMinWidth)) __obj.updateDynamic("windowRectMinWidth")(windowRectMinWidth.get.asInstanceOf[js.Any])
    if (windowResponse != null) __obj.updateDynamic("windowResponse")(windowResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(windowScaleHorizontal)) __obj.updateDynamic("windowScaleHorizontal")(windowScaleHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowScaleVertical)) __obj.updateDynamic("windowScaleVertical")(windowScaleVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTileCacheSize)) __obj.updateDynamic("zoomTileCacheSize")(zoomTileCacheSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChart]
  }
}

