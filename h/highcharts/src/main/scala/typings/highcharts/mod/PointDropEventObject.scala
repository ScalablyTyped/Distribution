package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDropEventObject extends js.Object {
  /**
    * New point after drag if only a single one.
    */
  var newPoint: js.UndefOr[PointDragDropObject] = js.undefined
  /**
    * New point id after drag if only a single one.
    */
  var newPointId: js.UndefOr[String] = js.undefined
  /**
    * New points after drop.
    */
  var newPoints: Dictionary[PointDragDropObject]
  /**
    * Number of new points.
    */
  var numNewPoints: Double
  /**
    * Original data.
    */
  var origin: DragDropPositionObject
  /**
    * Prevent default drop action.
    */
  var preventDefault: js.Function
  /**
    * Target point that caused the event.
    */
  var target: Point
  /**
    * Event type.
    */
  var `type`: drop
}

object PointDropEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    numNewPoints: Double,
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drop,
    newPoint: PointDragDropObject = null,
    newPointId: String = null
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], numNewPoints = numNewPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newPoint != null) __obj.updateDynamic("newPoint")(newPoint.asInstanceOf[js.Any])
    if (newPointId != null) __obj.updateDynamic("newPointId")(newPointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDropEventObject]
  }
}

