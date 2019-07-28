package typings.atMaterialDashUiCore.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverActions extends js.Object {
  def updatePosition(): Unit
}

object PopoverActions {
  @scala.inline
  def apply(updatePosition: () => Unit): PopoverActions = {
    val __obj = js.Dynamic.literal(updatePosition = js.Any.fromFunction0(updatePosition))
  
    __obj.asInstanceOf[PopoverActions]
  }
}

