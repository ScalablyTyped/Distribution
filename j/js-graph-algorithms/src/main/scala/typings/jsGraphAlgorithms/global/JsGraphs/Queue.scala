package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.Queue")
@js.native
class Queue[T] ()
  extends typings.jsGraphAlgorithms.JsGraphs.Queue[T] {
  /* CompleteClass */
  override var N: js.Any = js.native
  /* CompleteClass */
  override var first: js.Any = js.native
  /* CompleteClass */
  override var last: js.Any = js.native
  /* CompleteClass */
  override def dequeue(): js.UndefOr[T] = js.native
  /* CompleteClass */
  override def enqueue(item: T): Unit = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def size(): Double = js.native
  /* CompleteClass */
  override def toArray(): js.Array[T] = js.native
}

