package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.Queue")
@js.native
class Queue[T] () extends js.Object {
  var N: js.Any = js.native
  var first: js.Any = js.native
  var last: js.Any = js.native
  def dequeue(): js.UndefOr[T] = js.native
  def enqueue(item: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def size(): Double = js.native
  def toArray(): js.Array[T] = js.native
}

