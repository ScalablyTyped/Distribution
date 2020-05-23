package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "MinPQ")
@js.native
class MinPQ[T] ()
  extends typings.jsGraphAlgorithms.JsGraphs.MinPQ[T] {
  def this(compare: js.Function2[/* a1 */ js.Any, /* a2 */ js.Any, Double]) = this()
  /* CompleteClass */
  override var N: js.Any = js.native
  /* CompleteClass */
  override var compare: js.Any = js.native
  /* CompleteClass */
  override var s: js.Any = js.native
  /* CompleteClass */
  override def delMin(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def enqueue(item: T): Unit = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def sink(k: Double): Unit = js.native
  /* CompleteClass */
  override def size(): Double = js.native
  /* CompleteClass */
  override def swim(k: Double): Unit = js.native
}

