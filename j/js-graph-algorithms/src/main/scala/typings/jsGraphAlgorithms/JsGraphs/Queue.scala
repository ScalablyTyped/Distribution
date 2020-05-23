package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue[T] extends js.Object {
  var N: js.Any
  var first: js.Any
  var last: js.Any
  def dequeue(): js.UndefOr[T]
  def enqueue(item: T): Unit
  def isEmpty(): Boolean
  def size(): Double
  def toArray(): js.Array[T]
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
}

