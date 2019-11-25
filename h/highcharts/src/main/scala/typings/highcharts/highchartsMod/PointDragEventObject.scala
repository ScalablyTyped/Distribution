package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDragEventObject extends js.Object {
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[PointDragDropObject]
  /**
    * Original data.
    */
  var origin: DragDropPositionObject
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function
  /**
    * Target point that caused the event.
    */
  var target: Point
  /**
    * Event type.
    */
  var `type`: drag
}

object PointDragEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drag
  ): PointDragEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDragEventObject]
  }
}

