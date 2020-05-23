package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinPQ[T] extends js.Object {
  var N: js.Any
  var compare: js.Any
  var s: js.Any
  def delMin(): js.UndefOr[T]
  def enqueue(item: T): Unit
  def isEmpty(): Boolean
  def sink(k: Double): Unit
  def size(): Double
  def swim(k: Double): Unit
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
}

