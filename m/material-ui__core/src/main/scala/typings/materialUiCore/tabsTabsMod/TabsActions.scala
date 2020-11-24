package typings.materialUiCore.tabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsActions extends js.Object {
  
  def updateIndicator(): Unit = js.native
}
object TabsActions {
  
  @scala.inline
  def apply(updateIndicator: () => Unit): TabsActions = {
    val __obj = js.Dynamic.literal(updateIndicator = js.Any.fromFunction0(updateIndicator))
    __obj.asInstanceOf[TabsActions]
  }
  
  @scala.inline
  implicit class TabsActionsOps[Self <: TabsActions] (val x: Self) extends AnyVal {
    
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
    def setUpdateIndicator(value: () => Unit): Self = this.set("updateIndicator", js.Any.fromFunction0(value))
  }
}
