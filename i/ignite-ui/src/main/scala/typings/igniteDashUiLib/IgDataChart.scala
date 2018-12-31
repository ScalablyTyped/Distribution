package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChart
  extends /**
	 * Option for igDataChart
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Set to true in order to override the default behavior in which series do not animate if an axis range changes
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[scala.Boolean] = js.undefined
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
  var autoMarginHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets the automatic width to add when automatically adding margins to the chart.
  	 */
  var autoMarginWidth: js.UndefOr[scala.Double] = js.undefined
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
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
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
  var contentHitTestMode: js.UndefOr[java.lang.String] = js.undefined
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
  var crosshairVisibility: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the DefaultInteraction property. The default interaction state defines the chart's response to mouse events.
  	 *
  	 * Valid values:
  	 * "none" User gesture will not change the state of the chart.
  	 * "dragZoom" User gesture will start a drag rectangle to zoom the chart.
  	 * "dragPan" User gesture will start a pan action to move the chart's window.
  	 */
  var defaultInteraction: js.UndefOr[java.lang.String] = js.undefined
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
  var dragModifier: js.UndefOr[java.lang.String] = js.undefined
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
  var gridMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  var highlightingTransitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the current Chart's horizontal zoomability.  This option is deprecated - please use `isHorizontalZoomEnabled` instead.
  	 */
  var horizontalZoomable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the current Chart's horizontal zoomability.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the series viewer can allow the page to pan if a control pan is not possible in the requested direction.
  	 */
  var isPagePanningAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether to use a square aspect ratio for the chart. This is locked to true for polar and radial charts.
  	 */
  var isSquare: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set to true in order to disable any interactions with the plot surface.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the current Chart's vertical zoomability.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets the left margin to use around the chart content in the canvas.
  	 */
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
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
  var overviewPlusDetailPaneVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the current Chart's PanModifier property.
  	 *
  	 * Valid values:
  	 * "none" No modifier key is set.
  	 * "alt" The modifier is set to alt key.
  	 * "control" The modifier is set to control key.
  	 * "shift" The modifier is set to shift key.
  	 */
  var panModifier: js.UndefOr[java.lang.String] = js.undefined
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
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush used as the background for the current Chart object's plot area.
  	 */
  var plotAreaBackground: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets whether the series viewer should prefer selecting higher resolution tiles over lower resolution tiles when performing tile zooming. Setting this to true will lower performance but increase quality.
  	 */
  var preferHigherResolutionTiles: js.UndefOr[scala.Boolean] = js.undefined
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
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets the right margin to use around the chart content in the canvas.
  	 */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
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
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The bottom margin to use for the subtitle.
  	 */
  var subtitleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the horizontal alignment to use for the subtitle.
  	 *
  	 * Valid values:
  	 * "left" left aligns the subtitle.
  	 * "center" center aligns the subtitle.
  	 * "right" right aligns the subtitle.
  	 */
  var subtitleHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The left margin to use for the subtitle.
  	 */
  var subtitleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The right margin to use for the subtitle.
  	 */
  var subtitleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The color to use for the subtitle.
  	 */
  var subtitleTextColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The css font property to use for the title.
  	 */
  var subtitleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The top margin to use for the subtitle.
  	 */
  var subtitleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The channel name to use to sync this chart with other charts.
  	 */
  var syncChannel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Whether the chart should be synchronized horizontally
  	 */
  var synchronizeHorizontally: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Whether the chart should be synchronized vertically
  	 */
  var synchronizeVertically: js.UndefOr[scala.Boolean] = js.undefined
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
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The title to display for the component.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The bottom margin to use for the title.
  	 */
  var titleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the horizontal alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "left" left aligns the title.
  	 * "center" center aligns the title.
  	 * "right" right aligns the title.
  	 */
  var titleHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The left margin to use for the title.
  	 */
  var titleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The right margin to use for the title.
  	 */
  var titleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The color to use for the title.
  	 */
  var titleTextColor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The css font property to use for the title.
  	 */
  var titleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The top margin to use for the title.
  	 */
  var titleTopMargin: js.UndefOr[scala.Double] = js.undefined
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
  var topMargin: js.UndefOr[scala.Double] = js.undefined
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
  var useTiledZooming: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the current Chart's vertical zoomability.  This option is deprecated - please use `isVerticalZoomEnabled` instead.
  	 */
  var verticalZoomable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * A number between 0 and 1 determining the position of the horizontal scroll.
  	 * This property is effectively a shortcut to the X position of the WindowRect property.
  	 */
  var windowPositionHorizontal: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A number between 0 and 1 determining the position of the vertical scroll.
  	 * This property is effectively a shortcut to the Y position of the WindowRect property.
  	 */
  var windowPositionVertical: js.UndefOr[scala.Double] = js.undefined
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
  var windowRectMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The response to user panning and zooming: whether to update the view immediately while the user action is happening, or to defer the update to after the user action is complete.  The user action will be an action such as a mouse drag which causes panning and/or zooming to occur.
  	 *
  	 *
  	 * Valid values:
  	 * "deferred" Defer the view update until after the user action is complete.
  	 * "immediate" Update the view immediately while the user action is happening.
  	 */
  var windowResponse: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A number between 0 and 1 determining the scale of the horizontal zoom.
  	 * This property is effectively a shortcut to the Width of the WindowRect property.
  	 */
  var windowScaleHorizontal: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A number between 0 and 1 determining the scale of the vertical zoom.
  	 * This property is effectively a shortcut to the Height of the WindowRect property.
  	 */
  var windowScaleVertical: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets the maximum number of zoom tiles that the series viewer should cache while in tiled zooming mode.
  	 */
  var zoomTileCacheSize: js.UndefOr[scala.Double] = js.undefined
}

