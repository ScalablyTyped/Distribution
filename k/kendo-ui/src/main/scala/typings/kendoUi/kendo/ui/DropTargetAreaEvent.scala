package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetAreaEvent extends js.Object {
  var sender: DropTargetArea = js.native
}

object DropTargetAreaEvent {
  @scala.inline
  def apply(sender: DropTargetArea): DropTargetAreaEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaEvent]
  }
  @scala.inline
  implicit class DropTargetAreaEventOps[Self <: DropTargetAreaEvent] (val x: Self) extends AnyVal {
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
    def setSender(value: DropTargetArea): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

