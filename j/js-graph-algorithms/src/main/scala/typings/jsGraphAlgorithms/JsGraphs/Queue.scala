package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue[T] extends StObject {
  
  var N: js.Any = js.native
  
  def dequeue(): js.UndefOr[T] = js.native
  
  def enqueue(item: T): Unit = js.native
  
  var first: js.Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  var last: js.Any = js.native
  
  def size(): Double = js.native
  
  def toArray(): js.Array[T] = js.native
}
object Queue {
  
  @scala.inline
  def apply[T](
    N: js.Any,
    dequeue: () => js.UndefOr[T],
    enqueue: T => Unit,
    first: js.Any,
    isEmpty: () => Boolean,
    last: js.Any,
    size: () => Double,
    toArray: () => js.Array[T]
  ): Queue[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), first = first.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), last = last.asInstanceOf[js.Any], size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Queue[T]]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue[_], T] (val x: Self with Queue[T]) extends AnyVal {
    
    @scala.inline
    def setDequeue(value: () => js.UndefOr[T]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnqueue(value: T => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: js.Any): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: js.Any): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: js.Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
