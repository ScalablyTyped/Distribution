package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgEditorFilterMethods extends js.Object {
  
  def destroy(): Unit = js.native
  
  def exitEditMode(): Unit = js.native
  
  def hasInvalidMessage(): Unit = js.native
  
  def remove(): Unit = js.native
  
  def setFocus(delay: js.Object, toggle: js.Object): Unit = js.native
  
  def validator(): Unit = js.native
}
object IgEditorFilterMethods {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    exitEditMode: () => Unit,
    hasInvalidMessage: () => Unit,
    remove: () => Unit,
    setFocus: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitEditMode = js.Any.fromFunction0(exitEditMode), hasInvalidMessage = js.Any.fromFunction0(hasInvalidMessage), remove = js.Any.fromFunction0(remove), setFocus = js.Any.fromFunction2(setFocus), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
  
  @scala.inline
  implicit class IgEditorFilterMethodsOps[Self <: IgEditorFilterMethods] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExitEditMode(value: () => Unit): Self = this.set("exitEditMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasInvalidMessage(value: () => Unit): Self = this.set("hasInvalidMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocus(value: (js.Object, js.Object) => Unit): Self = this.set("setFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidator(value: () => Unit): Self = this.set("validator", js.Any.fromFunction0(value))
  }
}
