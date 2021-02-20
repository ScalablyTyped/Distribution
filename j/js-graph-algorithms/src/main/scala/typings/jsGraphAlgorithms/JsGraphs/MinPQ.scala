package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinPQ[T] extends StObject {
  
  var N: js.Any = js.native
  
  var compare: js.Any = js.native
  
  def delMin(): js.UndefOr[T] = js.native
  
  def enqueue(item: T): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  var s: js.Any = js.native
  
  def sink(k: Double): Unit = js.native
  
  def size(): Double = js.native
  
  def swim(k: Double): Unit = js.native
}
object MinPQ {
  
  @scala.inline
  def apply[T](
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
  
  @scala.inline
  implicit class MinPQMutableBuilder[Self <: MinPQ[_], T] (val x: Self with MinPQ[T]) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelMin(value: () => js.UndefOr[T]): Self = StObject.set(x, "delMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnqueue(value: T => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setN(value: js.Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSink(value: Double => Unit): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSwim(value: Double => Unit): Self = StObject.set(x, "swim", js.Any.fromFunction1(value))
  }
}
