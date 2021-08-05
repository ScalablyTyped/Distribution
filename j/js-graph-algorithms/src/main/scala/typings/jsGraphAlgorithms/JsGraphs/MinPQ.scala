package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinPQ[T] extends StObject {
  
  /* private */ var N: js.Any
  
  /* private */ var compare: js.Any
  
  def delMin(): js.UndefOr[T]
  
  def enqueue(item: T): Unit
  
  def isEmpty(): Boolean
  
  /* private */ var s: js.Any
  
  def sink(k: Double): Unit
  
  def size(): Double
  
  def swim(k: Double): Unit
}
object MinPQ {
  
  inline def apply[T](
    N: js.Any,
    compare: js.Any,
    delMin: () => js.UndefOr[T],
    enqueue: T => Unit,
    isEmpty: () => Boolean,
    s: js.Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): MinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], delMin = js.Any.fromFunction0(delMin), enqueue = js.Any.fromFunction1(enqueue), isEmpty = js.Any.fromFunction0(isEmpty), s = s.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[MinPQ[T]]
  }
  
  extension [Self <: MinPQ[?], T](x: Self & MinPQ[T]) {
    
    inline def setCompare(value: js.Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setDelMin(value: () => js.UndefOr[T]): Self = StObject.set(x, "delMin", js.Any.fromFunction0(value))
    
    inline def setEnqueue(value: T => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setN(value: js.Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSink(value: Double => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setSwim(value: Double => Unit): Self = StObject.set(x, "swim", js.Any.fromFunction1(value))
  }
}
