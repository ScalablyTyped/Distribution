package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapPointEventsOptions extends js.Object {
  /**
    * (Highmaps) Fires when a point is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[PointClickCallbackFunction] = js.undefined
  /**
    * (Highmaps) Callback that fires while dragging a point. The mouse event is
    * passed in as parameter. The original data can be accessed from
    * `e.origin`, and the new point values can be accessed from `e.newPoints`.
    * If there is only a single point being updated, it can be accessed from
    * `e.newPoint` for simplicity, and its ID can be accessed from
    * `e.newPointId`. The `this` context is the point being dragged. To stop
    * the default drag action, return false. See drag and drop options.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.undefined
  /**
    * (Highmaps) Callback that fires when starting to drag a point. The mouse
    * event object is passed in as an argument. If a drag handle is used,
    * `e.updateProp` is set to the data property being dragged. The `this`
    * context is the point. See drag and drop options.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.undefined
  /**
    * (Highmaps) Callback that fires when the point is dropped. The parameters
    * passed are the same as for drag. To stop the default drop action, return
    * false. See drag and drop options.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the mouse leaves the area close to the point. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    */
  var mouseOut: js.UndefOr[PointMouseOutCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the mouse enters the area close to the point. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    */
  var mouseOver: js.UndefOr[PointMouseOverCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the point is removed using the `.remove()` method.
    * One parameter, `event`, is passed to the function. Returning `false`
    * cancels the operation.
    */
  var remove: js.UndefOr[PointRemoveCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the point is selected either programmatically or
    * following a click on the point. One parameter, `event`, is passed to the
    * function. Returning `false` cancels the operation.
    */
  var select: js.UndefOr[PointSelectCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the point is unselected either programmatically or
    * following a click on the point. One parameter, `event`, is passed to the
    * function. Returning `false` cancels the operation.
    */
  var unselect: js.UndefOr[PointUnselectCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the point is updated programmatically through the
    * `.update()` method. One parameter, `event`, is passed to the function.
    * The new point options can be accessed through `event.options`. Returning
    * `false` cancels the operation.
    */
  var update: js.UndefOr[PointUpdateCallbackFunction] = js.undefined
}

trait PlotMappointEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Fires after the series has finished its
    * initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    */
  var afterAnimate: js.UndefOr[SeriesAfterAnimateCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the checkbox next to the series' name in the legend
    * is clicked. One parameter, `event`, is passed to the function. The state
    * of the checkbox is found by `event.checked`. The checked item is found by
    * `event.item`. Return `false` to prevent the default action which is to
    * toggle the select state of the series.
    */
  var checkboxClick: js.UndefOr[SeriesCheckboxClickCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the series is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    * Additionally, `event.point` holds a pointer to the nearest point on the
    * graph.
    */
  var click: js.UndefOr[SeriesClickCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the series is hidden after chart generation time,
    * either by clicking the legend item or by calling `.hide()`.
    */
  var hide: js.UndefOr[SeriesHideCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the legend item belonging to the series is clicked.
    * One parameter, `event`, is passed to the function. The default action is
    * to toggle the visibility of the series. This can be prevented by
    * returning `false` or calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[SeriesLegendItemClickCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the mouse leaves the graph. One parameter, `event`,
    * is passed to the function, containing common event information. If the
    * stickyTracking option is true, `mouseOut` doesn't happen before the mouse
    * enters another graph or leaves the plot area.
    */
  var mouseOut: js.UndefOr[SeriesMouseOutCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the mouse enters the graph. One parameter, `event`,
    * is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[SeriesMouseOverCallbackFunction] = js.undefined
  /**
    * (Highmaps) Fires when the series is shown after chart generation time,
    * either by clicking the legend item or by calling `.show()`.
    */
  var show: js.UndefOr[SeriesShowCallbackFunction] = js.undefined
}

object PlotMapPointEventsOptions {
  @scala.inline
  def apply(
    click: PointClickCallbackFunction = null,
    drag: PointDragCallbackFunction = null,
    dragStart: PointDragStartCallbackFunction = null,
    drop: PointDropCallbackFunction = null,
    mouseOut: PointMouseOutCallbackFunction = null,
    mouseOver: PointMouseOverCallbackFunction = null,
    remove: PointRemoveCallbackFunction = null,
    select: PointSelectCallbackFunction = null,
    unselect: PointUnselectCallbackFunction = null,
    update: PointUpdateCallbackFunction = null
  ): PlotMapPointEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut)
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (select != null) __obj.updateDynamic("select")(select)
    if (unselect != null) __obj.updateDynamic("unselect")(unselect)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PlotMapPointEventsOptions]
  }
}

object PlotMappointEventsOptions {
  @scala.inline
  def apply(
    afterAnimate: SeriesAfterAnimateCallbackFunction = null,
    checkboxClick: SeriesCheckboxClickCallbackFunction = null,
    click: SeriesClickCallbackFunction = null,
    hide: SeriesHideCallbackFunction = null,
    legendItemClick: SeriesLegendItemClickCallbackFunction = null,
    mouseOut: SeriesMouseOutCallbackFunction = null,
    mouseOver: SeriesMouseOverCallbackFunction = null,
    show: SeriesShowCallbackFunction = null
  ): PlotMappointEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterAnimate != null) __obj.updateDynamic("afterAnimate")(afterAnimate)
    if (checkboxClick != null) __obj.updateDynamic("checkboxClick")(checkboxClick)
    if (click != null) __obj.updateDynamic("click")(click)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick)
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut)
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[PlotMappointEventsOptions]
  }
}

