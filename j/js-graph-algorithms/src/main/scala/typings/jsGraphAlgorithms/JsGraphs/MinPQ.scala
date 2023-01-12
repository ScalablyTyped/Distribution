package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinPQ[T] extends StObject {
  
  /* private */ var N: Any
  
  /* private */ var compare: Any
  
  def delMin(): js.UndefOr[T]
  
  def enqueue(item: T): Unit
  
  def isEmpty(): Boolean
  
  /* private */ var s: Any
  
  def sink(k: Double): Unit
  
  def size(): Double
  
  def swim(k: Double): Unit
}
object MinPQ {
  
  inline def apply[T](
    N: Any,
    compare: Any,
    delMin: () => js.UndefOr[T],
    enqueue: T => Unit,
    isEmpty: () => Boolean,
    s: Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): MinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], delMin = js.Any.fromFunction0(delMin), enqueue = js.Any.fromFunction1(enqueue), isEmpty = js.Any.fromFunction0(isEmpty), s = s.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[MinPQ[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinPQ[?], T] (val x: Self & MinPQ[T]) extends AnyVal {
    
    inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setDelMin(value: () => js.UndefOr[T]): Self = StObject.set(x, "delMin", js.Any.fromFunction0(value))
    
    inline def setEnqueue(value: T => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSink(value: Double => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setSwim(value: Double => Unit): Self = StObject.set(x, "swim", js.Any.fromFunction1(value))
  }
}
