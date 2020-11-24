package typings.materialUiCore.modalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalManager extends js.Object {
  
  def add(modal: js.Any, container: js.Any): Double = js.native
  
  def isTopModal(modal: js.Any): Boolean = js.native
  
  def remove(modal: js.Any): Unit = js.native
}
object ModalManager {
  
  @scala.inline
  def apply(add: (js.Any, js.Any) => Double, isTopModal: js.Any => Boolean, remove: js.Any => Unit): ModalManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ModalManager]
  }
  
  @scala.inline
  implicit class ModalManagerOps[Self <: ModalManager] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (js.Any, js.Any) => Double): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsTopModal(value: js.Any => Boolean): Self = this.set("isTopModal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
