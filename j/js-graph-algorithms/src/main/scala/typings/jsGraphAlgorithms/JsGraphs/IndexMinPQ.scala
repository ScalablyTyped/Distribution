package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMinPQ[T] extends StObject {
  
  /* private */ var N: Any
  
  /* private */ var compare: Any
  
  def containsIndex(index: Double): Boolean
  
  def decreaseKey(index: Double, key: T): Unit
  
  def delMin(): Double
  
  def insert(index: Double, key: T): Unit
  
  def isEmpty(): Boolean
  
  /* private */ var keys: Any
  
  def min(): Double
  
  def minKey(): T | Null
  
  /* private */ var pq: Any
  
  /* private */ var qp: Any
  
  def sink(k: Double): Unit
  
  def size(): Double
  
  def swim(k: Double): Unit
}
object IndexMinPQ {
  
  inline def apply[T](
    N: Any,
    compare: Any,
    containsIndex: Double => Boolean,
    decreaseKey: (Double, T) => Unit,
    delMin: () => Double,
    insert: (Double, T) => Unit,
    isEmpty: () => Boolean,
    keys: Any,
    min: () => Double,
    minKey: () => T | Null,
    pq: Any,
    qp: Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): IndexMinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], containsIndex = js.Any.fromFunction1(containsIndex), decreaseKey = js.Any.fromFunction2(decreaseKey), delMin = js.Any.fromFunction0(delMin), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), keys = keys.asInstanceOf[js.Any], min = js.Any.fromFunction0(min), minKey = js.Any.fromFunction0(minKey), pq = pq.asInstanceOf[js.Any], qp = qp.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[IndexMinPQ[T]]
  }
  
  extension [Self <: IndexMinPQ[?], T](x: Self & IndexMinPQ[T]) {
    
    inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setContainsIndex(value: Double => Boolean): Self = StObject.set(x, "containsIndex", js.Any.fromFunction1(value))
    
    inline def setDecreaseKey(value: (Double, T) => Unit): Self = StObject.set(x, "decreaseKey", js.Any.fromFunction2(value))
    
    inline def setDelMin(value: () => Double): Self = StObject.set(x, "delMin", js.Any.fromFunction0(value))
    
    inline def setInsert(value: (Double, T) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setMin(value: () => Double): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
    
    inline def setMinKey(value: () => T | Null): Self = StObject.set(x, "minKey", js.Any.fromFunction0(value))
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setPq(value: Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    inline def setQp(value: Any): Self = StObject.set(x, "qp", value.asInstanceOf[js.Any])
    
    inline def setSink(value: Double => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    inline def setSwim(value: Double => Unit): Self = StObject.set(x, "swim", js.Any.fromFunction1(value))
  }
}
