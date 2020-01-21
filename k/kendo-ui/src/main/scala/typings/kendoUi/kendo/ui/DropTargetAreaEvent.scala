package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaEvent extends js.Object {
  var sender: DropTargetArea
}

object DropTargetAreaEvent {
  @scala.inline
  def apply(sender: DropTargetArea): DropTargetAreaEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropTargetAreaEvent]
  }
}

