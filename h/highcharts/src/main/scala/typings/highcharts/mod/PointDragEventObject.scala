package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDragEventObject extends js.Object {
  /**
    * New points during drag.
    */
  var newPoints: Dictionary[PointDragDropObject] = js.native
  /**
    * Original data.
    */
  var origin: DragDropPositionObject = js.native
  /**
    * Prevent default drag action.
    */
  var preventDefault: js.Function = js.native
  /**
    * Target point that caused the event.
    */
  var target: Point = js.native
  /**
    * Event type.
    */
  var `type`: drag = js.native
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
  @scala.inline
  implicit class PointDragEventObjectOps[Self <: PointDragEventObject] (val x: Self) extends AnyVal {
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
    def setOrigin(value: DragDropPositionObject): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Point): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: drag): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

