package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue[T] extends js.Object {
  var N: js.Any = js.native
  var first: js.Any = js.native
  var last: js.Any = js.native
  def dequeue(): js.UndefOr[T] = js.native
  def enqueue(item: T): Unit = js.native
  def isEmpty(): Boolean = js.native
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
  implicit class QueueOps[Self <: Queue[_], T] (val x: Self with Queue[T]) extends AnyVal {
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
    def setDequeue(value: () => js.UndefOr[T]): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setEnqueue(value: T => Unit): Self = this.set("enqueue", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: js.Any): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setLast(value: js.Any): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

