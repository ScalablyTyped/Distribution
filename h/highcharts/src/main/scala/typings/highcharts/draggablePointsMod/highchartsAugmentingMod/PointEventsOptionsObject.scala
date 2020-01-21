package typings.highcharts.draggablePointsMod.highchartsAugmentingMod

import typings.highcharts.mod.PointDragCallbackFunction
import typings.highcharts.mod.PointDragStartCallbackFunction
import typings.highcharts.mod.PointDropCallbackFunction
import typings.highcharts.mod.SeriesLineDataDragDropOptions
import typings.highcharts.mod.SeriesXrangeDataDragDropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointEventsOptionsObject extends js.Object {
  /**
    * Callback that fires while dragging a point. The mouse event is passed
    * in as parameter. The original data can be accessed from `e.origin`,
    * and the new point values can be accessed from `e.newPoints`. If there
    * is only a single point being updated, it can be accessed from
    * `e.newPoint` for simplicity, and its ID can be accessed from
    * `e.newPointId`. The this context is the point being dragged. To stop
    * the default drag action, return `false`.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.undefined
  /**
    * Point specific options for the draggable-points module.
    */
  var dragDrop: js.UndefOr[SeriesLineDataDragDropOptions | SeriesXrangeDataDragDropOptions] = js.undefined
  /**
    * Callback that fires when starting to drag a point. The mouse event
    * object is passed in as an argument. If a drag handle is used,
    * `e.updateProp` is set to the data property being dragged. The `this`
    * context is the point.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.undefined
  /**
    * Callback that fires when the point is dropped. The parameters passed
    * are the same as for drag. To stop the default drop action, return
    * `false`.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.undefined
}

object PointEventsOptionsObject {
  @scala.inline
  def apply(
    drag: PointDragCallbackFunction = null,
    dragDrop: SeriesLineDataDragDropOptions | SeriesXrangeDataDragDropOptions = null,
    dragStart: PointDragStartCallbackFunction = null,
    drop: PointDropCallbackFunction = null
  ): PointEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointEventsOptionsObject]
  }
}

