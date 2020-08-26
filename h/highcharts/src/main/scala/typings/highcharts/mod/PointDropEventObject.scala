package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDropEventObject extends js.Object {
  /**
    * New point after drag if only a single one.
    */
  var newPoint: js.UndefOr[PointDragDropObject] = js.native
  /**
    * New point id after drag if only a single one.
    */
  var newPointId: js.UndefOr[String] = js.native
  /**
    * New points after drop.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  /**
    * Number of new points.
    */
  var numNewPoints: Double = js.native
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  /**
    * Prevent default drop action.
    */
  var preventDefault: js.Function = js.native
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: drop = js.native
}

object PointDropEventObject {
  @scala.inline
  def apply(
    newPoints: Dictionary[PointDragDropObject],
    numNewPoints: Double,
    origin: DragDropPositionObject,
    preventDefault: js.Function,
    target: Point,
    `type`: drop
  ): PointDropEventObject = {
    val __obj = js.Dynamic.literal(newPoints = newPoints.asInstanceOf[js.Any], numNewPoints = numNewPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDropEventObject]
  }
  @scala.inline
  implicit class PointDropEventObjectOps[Self <: PointDropEventObject] (val x: Self) extends AnyVal {
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
    def setNewPoints(value: Dictionary[PointDragDropObject]): Self = this.set("newPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumNewPoints(value: Double): Self = this.set("numNewPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: DragDropPositionObject): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Point): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: drop): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPoint(value: PointDragDropObject): Self = this.set("newPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPoint: Self = this.set("newPoint", js.undefined)
    @scala.inline
    def setNewPointId(value: String): Self = this.set("newPointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPointId: Self = this.set("newPointId", js.undefined)
  }
  
}

