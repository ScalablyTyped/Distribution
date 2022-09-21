package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue[T] extends StObject {
  
  /* private */ var N: Any
  
  def dequeue(): js.UndefOr[T]
  
  def enqueue(item: T): Unit
  
  /* private */ var first: Any
  
  def isEmpty(): Boolean
  
  /* private */ var last: Any
  
  def size(): Double
  
  def toArray(): js.Array[T]
}
object Queue {
  
  inline def apply[T](
    N: Any,
    dequeue: () => js.UndefOr[T],
    enqueue: T => Unit,
    first: Any,
    isEmpty: () => Boolean,
    last: Any,
    size: () => Double,
    toArray: () => js.Array[T]
  ): Queue[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), first = first.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), last = last.asInstanceOf[js.Any], size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[Queue[T]]
  }
  
  extension [Self <: Queue[?], T](x: Self & Queue[T]) {
    
    inline def setDequeue(value: () => js.UndefOr[T]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
    
    inline def setEnqueue(value: T => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
    
    inline def setFirst(value: Any): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setLast(value: Any): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
