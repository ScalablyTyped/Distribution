package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.MinPQ")
@js.native
class MinPQ[T] () extends js.Object {
  def this(compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
  var N: js.Any = js.native
  var compare: js.Any = js.native
  var s: js.Any = js.native
  def delMin(): js.UndefOr[T] = js.native
  def enqueue(item: T): Unit = js.native
  def isEmpty(): Boolean = js.native
  def sink(k: Double): Unit = js.native
  def size(): Double = js.native
  def swim(k: Double): Unit = js.native
}

