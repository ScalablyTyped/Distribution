package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexMinPQ[T] extends StObject {
  
  var N: js.Any = js.native
  
  var compare: js.Any = js.native
  
  def containsIndex(index: Double): Boolean = js.native
  
  def decreaseKey(index: Double, key: T): Unit = js.native
  
  def delMin(): Double = js.native
  
  def insert(index: Double, key: T): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  var keys: js.Any = js.native
  
  def min(): Double = js.native
  
  def minKey(): T | Null = js.native
  
  var pq: js.Any = js.native
  
  var qp: js.Any = js.native
  
  def sink(k: Double): Unit = js.native
  
  def size(): Double = js.native
  
  def swim(k: Double): Unit = js.native
}
object IndexMinPQ {
  
  @scala.inline
  def apply[T](
    N: js.Any,
    compare: js.Any,
    containsIndex: Double => Boolean,
    decreaseKey: (Double, T) => Unit,
    delMin: () => Double,
    insert: (Double, T) => Unit,
    isEmpty: () => Boolean,
    keys: js.Any,
    min: () => Double,
    minKey: () => T | Null,
    pq: js.Any,
    qp: js.Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): IndexMinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], containsIndex = js.Any.fromFunction1(containsIndex), decreaseKey = js.Any.fromFunction2(decreaseKey), delMin = js.Any.fromFunction0(delMin), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), keys = keys.asInstanceOf[js.Any], min = js.Any.fromFunction0(min), minKey = js.Any.fromFunction0(minKey), pq = pq.asInstanceOf[js.Any], qp = qp.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[IndexMinPQ[T]]
  }
  
  @scala.inline
  implicit class IndexMinPQMutableBuilder[Self <: IndexMinPQ[_], T] (val x: Self with IndexMinPQ[T]) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsIndex(value: Double => Boolean): Self = StObject.set(x, "containsIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecreaseKey(value: (Double, T) => Unit): Self = StObject.set(x, "decreaseKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelMin(value: () => Double): Self = StObject.set(x, "delMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: (Double, T) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: js.Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: () => Double): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinKey(value: () => T | Null): Self = StObject.set(x, "minKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setN(value: js.Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPq(value: js.Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQp(value: js.Any): Self = StObject.set(x, "qp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSink(value: Double => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSwim(value: Double => Unit): Self = StObject.set(x, "swim", js.Any.fromFunction1(value))
  }
}
