package typings.ink.focusContextMod

import typings.ink.anon.AutoFocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  def activate(id: String): Unit = js.native
  
  val activeId: js.UndefOr[String] = js.native
  
  def add(id: String, options: AutoFocus): Unit = js.native
  
  def deactivate(id: String): Unit = js.native
  
  def disableFocus(): Unit = js.native
  
  def enableFocus(): Unit = js.native
  
  def focusNext(): Unit = js.native
  
  def focusPrevious(): Unit = js.native
  
  def remove(id: String): Unit = js.native
}
object Props {
  
  @scala.inline
  def apply(
    activate: String => Unit,
    add: (String, AutoFocus) => Unit,
    deactivate: String => Unit,
    disableFocus: () => Unit,
    enableFocus: () => Unit,
    focusNext: () => Unit,
    focusPrevious: () => Unit,
    remove: String => Unit
  ): Props = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), add = js.Any.fromFunction2(add), deactivate = js.Any.fromFunction1(deactivate), disableFocus = js.Any.fromFunction0(disableFocus), enableFocus = js.Any.fromFunction0(enableFocus), focusNext = js.Any.fromFunction0(focusNext), focusPrevious = js.Any.fromFunction0(focusPrevious), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: String => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd(value: (String, AutoFocus) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivate(value: String => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableFocus(value: () => Unit): Self = this.set("disableFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableFocus(value: () => Unit): Self = this.set("enableFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusNext(value: () => Unit): Self = this.set("focusNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusPrevious(value: () => Unit): Self = this.set("focusPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActiveId(value: String): Self = this.set("activeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveId: Self = this.set("activeId", js.undefined)
  }
}
