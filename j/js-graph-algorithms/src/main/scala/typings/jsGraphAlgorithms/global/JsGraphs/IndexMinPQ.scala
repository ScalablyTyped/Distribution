package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.IndexMinPQ")
@js.native
class IndexMinPQ[T] protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.IndexMinPQ[T] {
  def this(N: Double) = this()
  def this(N: Double, compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
  /* CompleteClass */
  override var N: js.Any = js.native
  /* CompleteClass */
  override var compare: js.Any = js.native
  /* CompleteClass */
  override var keys: js.Any = js.native
  /* CompleteClass */
  override var pq: js.Any = js.native
  /* CompleteClass */
  override var qp: js.Any = js.native
  /* CompleteClass */
  override def containsIndex(index: Double): Boolean = js.native
  /* CompleteClass */
  override def decreaseKey(index: Double, key: T): Unit = js.native
  /* CompleteClass */
  override def delMin(): Double = js.native
  /* CompleteClass */
  override def insert(index: Double, key: T): Unit = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def min(): Double = js.native
  /* CompleteClass */
  override def minKey(): T | Null = js.native
  /* CompleteClass */
  override def sink(k: Double): Unit = js.native
  /* CompleteClass */
  override def size(): Double = js.native
  /* CompleteClass */
  override def swim(k: Double): Unit = js.native
}

