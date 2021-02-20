package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack extends StObject {
  
  def isEmpty(): Boolean = js.native
  
  var items: js.Array[_] = js.native
  
  def peek(): js.Any = js.native
  
  def pop(): js.Any = js.native
  
  def push(items: js.Any): Unit = js.native
  
  def size(): Double = js.native
}
object Stack {
  
  @scala.inline
  def apply(
    isEmpty: () => Boolean,
    items: js.Array[_],
    peek: () => js.Any,
    pop: () => js.Any,
    push: js.Any => Unit,
    size: () => Double
  ): Stack = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), items = items.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Stack]
  }
  
  @scala.inline
  implicit class StackMutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPeek(value: () => js.Any): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPop(value: () => js.Any): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
