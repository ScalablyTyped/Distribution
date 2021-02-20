package typings.knockoutEditables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// bestowed by ko.editable(target)
@js.native
trait KnockoutEditable extends StObject {
  
  def addEditable(target: js.Any): js.Any = js.native
  
  def beginEdit(): Unit = js.native
  
  def commit(): Unit = js.native
  
  def hasChanges(): Boolean = js.native
  
  def rollback(): Unit = js.native
}
object KnockoutEditable {
  
  @scala.inline
  def apply(
    addEditable: js.Any => js.Any,
    beginEdit: () => Unit,
    commit: () => Unit,
    hasChanges: () => Boolean,
    rollback: () => Unit
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = js.Any.fromFunction0(beginEdit), commit = js.Any.fromFunction0(commit), hasChanges = js.Any.fromFunction0(hasChanges), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[KnockoutEditable]
  }
  
  @scala.inline
  implicit class KnockoutEditableMutableBuilder[Self <: KnockoutEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEditable(value: js.Any => js.Any): Self = StObject.set(x, "addEditable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChanges(value: () => Boolean): Self = StObject.set(x, "hasChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRollback(value: () => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
  }
}
