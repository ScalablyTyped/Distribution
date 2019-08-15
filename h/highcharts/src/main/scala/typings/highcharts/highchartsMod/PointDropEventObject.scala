package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDropEventObject extends js.Object {
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
  var origin: js.Object
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
    origin: js.Object,
    preventDefault: js.Function,
    target: Point,
    `type`: drop
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints, numNewPoints = numNewPoints, origin = origin, preventDefault = preventDefault, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointDropEventObject]
  }
}

