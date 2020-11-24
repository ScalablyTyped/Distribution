package typings.inboxsdk.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetsInstance extends js.Object {
  
  def showDrawerView(options: DrawerOptions): DrawerView = js.native
  
  def showModalView(options: ModalOptions): ModalView = js.native
  
  def showMoleView(options: MoleOptions): MoleView = js.native
}
object WidgetsInstance {
  
  @scala.inline
  def apply(
    showDrawerView: DrawerOptions => DrawerView,
    showModalView: ModalOptions => ModalView,
    showMoleView: MoleOptions => MoleView
  ): WidgetsInstance = {
    val __obj = js.Dynamic.literal(showDrawerView = js.Any.fromFunction1(showDrawerView), showModalView = js.Any.fromFunction1(showModalView), showMoleView = js.Any.fromFunction1(showMoleView))
    __obj.asInstanceOf[WidgetsInstance]
  }
  
  @scala.inline
  implicit class WidgetsInstanceOps[Self <: WidgetsInstance] (val x: Self) extends AnyVal {
    
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
    def setShowDrawerView(value: DrawerOptions => DrawerView): Self = this.set("showDrawerView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowModalView(value: ModalOptions => ModalView): Self = this.set("showModalView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowMoleView(value: MoleOptions => MoleView): Self = this.set("showMoleView", js.Any.fromFunction1(value))
  }
}
