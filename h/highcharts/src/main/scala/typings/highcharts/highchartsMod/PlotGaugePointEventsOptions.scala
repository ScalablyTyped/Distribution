package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGaugePointEventsOptions extends js.Object {
  /**
    * (Highcharts) Fires when a point is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[SeriesPointClickCallbackFunction] = js.undefined
  /**
    * (Highcharts) Callback that fires while dragging a point. The mouse event
    * is passed in as parameter. The original data can be accessed from
    * `e.origin`, and the new point values can be accessed from `e.newPoints`.
    * If there is only a single point being updated, it can be accessed from
    * `e.newPoint` for simplicity, and its ID can be accessed from
    * `e.newPointId`. The `this` context is the point being dragged. To stop
    * the default drag action, return false. See drag and drop options.
    *
    * Requires the `draggable-points` module.
    */
  var drag: js.UndefOr[SeriesPointDragCallbackFunction] = js.undefined
  /**
    * (Highcharts) Callback that fires when starting to drag a point. The mouse
    * event object is passed in as an argument. If a drag handle is used,
    * `e.updateProp` is set to the data property being dragged. The `this`
    * context is the point. See drag and drop options.
    *
    * Requires the `draggable-points` module.
    */
  var dragStart: js.UndefOr[SeriesPointDragStartCallbackFunction] = js.undefined
  /**
    * (Highcharts) Callback that fires when the point is dropped. The
    * parameters passed are the same as for drag. To stop the default drop
    * action, return false. See drag and drop options.
    *
    * Requires the `draggable-points` module.
    */
  var drop: js.UndefOr[SeriesPointDropCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the mouse leaves the area close to the point. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    */
  var mouseOut: js.UndefOr[SeriesPointMouseOutCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the mouse enters the area close to the point. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    */
  var mouseOver: js.UndefOr[SeriesPointMouseOverCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the point is removed using the `.remove()`
    * method. One parameter, `event`, is passed to the function. Returning
    * `false` cancels the operation.
    */
  var remove: js.UndefOr[SeriesPointRemoveCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the point is selected either programmatically or
    * following a click on the point. One parameter, `event`, is passed to the
    * function. Returning `false` cancels the operation.
    */
  var select: js.UndefOr[SeriesPointSelectCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the point is unselected either programmatically
    * or following a click on the point. One parameter, `event`, is passed to
    * the function. Returning `false` cancels the operation.
    */
  var unselect: js.UndefOr[SeriesPointUnselectCallbackFunction] = js.undefined
  /**
    * (Highcharts) Fires when the point is updated programmatically through the
    * `.update()` method. One parameter, `event`, is passed to the function.
    * The new point options can be accessed through `event.options`. Returning
    * `false` cancels the operation.
    */
  var update: js.UndefOr[SeriesPointUpdateCallbackFunction] = js.undefined
}

object PlotGaugePointEventsOptions {
  @scala.inline
  def apply(
    click: SeriesPointClickCallbackFunction = null,
    drag: SeriesPointDragCallbackFunction = null,
    dragStart: SeriesPointDragStartCallbackFunction = null,
    drop: SeriesPointDropCallbackFunction = null,
    mouseOut: SeriesPointMouseOutCallbackFunction = null,
    mouseOver: SeriesPointMouseOverCallbackFunction = null,
    remove: SeriesPointRemoveCallbackFunction = null,
    select: SeriesPointSelectCallbackFunction = null,
    unselect: SeriesPointUnselectCallbackFunction = null,
    update: SeriesPointUpdateCallbackFunction = null
  ): PlotGaugePointEventsOptions = {
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
    __obj.asInstanceOf[PlotGaugePointEventsOptions]
  }
}

