package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.IndexMinPQ")
@js.native
class IndexMinPQ[T] protected () extends js.Object {
  def this(N: Double) = this()
  def this(N: Double, compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
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

