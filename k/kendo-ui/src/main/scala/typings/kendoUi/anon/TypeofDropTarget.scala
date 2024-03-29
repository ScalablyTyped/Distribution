package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropTarget extends StObject {
  
  /* static member */
  def destroyGroup(groupName: String): Unit
}
object TypeofDropTarget {
  
  inline def apply(destroyGroup: String => Unit): TypeofDropTarget = {
    val __obj = js.Dynamic.literal(destroyGroup = js.Any.fromFunction1(destroyGroup))
    __obj.asInstanceOf[TypeofDropTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDropTarget] (val x: Self) extends AnyVal {
    
    inline def setDestroyGroup(value: String => Unit): Self = StObject.set(x, "destroyGroup", js.Any.fromFunction1(value))
  }
}
