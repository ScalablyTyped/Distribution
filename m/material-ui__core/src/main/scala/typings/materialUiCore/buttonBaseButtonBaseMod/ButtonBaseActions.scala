package typings.materialUiCore.buttonBaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonBaseActions extends js.Object {
  
  def focusVisible(): Unit = js.native
}
object ButtonBaseActions {
  
  @scala.inline
  def apply(focusVisible: () => Unit): ButtonBaseActions = {
    val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
    __obj.asInstanceOf[ButtonBaseActions]
  }
  
  @scala.inline
  implicit class ButtonBaseActionsOps[Self <: ButtonBaseActions] (val x: Self) extends AnyVal {
    
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
    def setFocusVisible(value: () => Unit): Self = this.set("focusVisible", js.Any.fromFunction0(value))
  }
}
