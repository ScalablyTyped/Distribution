package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexMinPQ[T] extends js.Object {
  var N: js.Any = js.native
  var compare: js.Any = js.native
  var keys: js.Any = js.native
  var pq: js.Any = js.native
  var qp: js.Any = js.native
  def containsIndex(index: Double): Boolean = js.native
  def decreaseKey(index: Double, key: T): Unit = js.native
  def delMin(): Double = js.native
  def insert(index: Double, key: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def min(): Double = js.native
  def minKey(): T | Null = js.native
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
  implicit class IndexMinPQOps[Self <: IndexMinPQ[_], T] (val x: Self with IndexMinPQ[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setN(value: js.Any): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompare(value: js.Any): Self = this.set("compare", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainsIndex(value: Double => Boolean): Self = this.set("containsIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setDecreaseKey(value: (Double, T) => Unit): Self = this.set("decreaseKey", js.Any.fromFunction2(value))
    @scala.inline
    def setDelMin(value: () => Double): Self = this.set("delMin", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: (Double, T) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setKeys(value: js.Any): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: () => Double): Self = this.set("min", js.Any.fromFunction0(value))
    @scala.inline
    def setMinKey(value: () => T | Null): Self = this.set("minKey", js.Any.fromFunction0(value))
    @scala.inline
    def setPq(value: js.Any): Self = this.set("pq", value.asInstanceOf[js.Any])
    @scala.inline
    def setQp(value: js.Any): Self = this.set("qp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSink(value: Double => Unit): Self = this.set("sink", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setSwim(value: Double => Unit): Self = this.set("swim", js.Any.fromFunction1(value))
  }
  
}

