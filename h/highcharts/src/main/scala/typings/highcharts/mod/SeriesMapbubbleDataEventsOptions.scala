package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMapbubbleDataEventsOptions extends js.Object {
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

object SeriesMapbubbleDataEventsOptions {
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
  ): SeriesMapbubbleDataEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut.asInstanceOf[js.Any])
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(unselect.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesMapbubbleDataEventsOptions]
  }
}

