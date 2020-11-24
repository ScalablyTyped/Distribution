package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableFunctions extends js.Object {
  
  def beginEdit(): Unit = js.native
  
  def cancelEdit(): Unit = js.native
  
  def endEdit(): Unit = js.native
  
  var isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  def rollback(): Unit = js.native
}
object EditableFunctions {
  
  @scala.inline
  def apply(
    beginEdit: () => Unit,
    cancelEdit: () => Unit,
    endEdit: () => Unit,
    isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    rollback: () => Unit
  ): EditableFunctions = {
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[EditableFunctions]
  }
  
  @scala.inline
  implicit class EditableFunctionsOps[Self <: EditableFunctions] (val x: Self) extends AnyVal {
    
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
    def setBeginEdit(value: () => Unit): Self = this.set("beginEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelEdit(value: () => Unit): Self = this.set("cancelEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndEdit(value: () => Unit): Self = this.set("endEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEditing(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollback(value: () => Unit): Self = this.set("rollback", js.Any.fromFunction0(value))
  }
}
