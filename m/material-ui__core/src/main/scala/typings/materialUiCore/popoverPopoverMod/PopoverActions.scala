package typings.materialUiCore.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverActions extends js.Object {
  def updatePosition(): Unit = js.native
}

object PopoverActions {
  @scala.inline
  def apply(updatePosition: () => Unit): PopoverActions = {
    val __obj = js.Dynamic.literal(updatePosition = js.Any.fromFunction0(updatePosition))
    __obj.asInstanceOf[PopoverActions]
  }
  @scala.inline
  implicit class PopoverActionsOps[Self <: PopoverActions] (val x: Self) extends AnyVal {
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
    def setUpdatePosition(value: () => Unit): Self = this.set("updatePosition", js.Any.fromFunction0(value))
  }
  
}

