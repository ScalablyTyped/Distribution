package typings.knockoutEditables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// bestowed by ko.editable(target)
trait KnockoutEditable extends StObject {
  
  def addEditable(target: Any): Any
  
  def beginEdit(): Unit
  
  def commit(): Unit
  
  def hasChanges(): Boolean
  
  def rollback(): Unit
}
object KnockoutEditable {
  
  inline def apply(
    addEditable: Any => Any,
    beginEdit: () => Unit,
    commit: () => Unit,
    hasChanges: () => Boolean,
    rollback: () => Unit
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = js.Any.fromFunction0(beginEdit), commit = js.Any.fromFunction0(commit), hasChanges = js.Any.fromFunction0(hasChanges), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[KnockoutEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutEditable] (val x: Self) extends AnyVal {
    
    inline def setAddEditable(value: Any => Any): Self = StObject.set(x, "addEditable", js.Any.fromFunction1(value))
    
    inline def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    inline def setCommit(value: () => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setHasChanges(value: () => Boolean): Self = StObject.set(x, "hasChanges", js.Any.fromFunction0(value))
    
    inline def setRollback(value: () => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
  }
}
