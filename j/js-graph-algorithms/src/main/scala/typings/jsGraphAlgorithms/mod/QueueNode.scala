package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "QueueNode")
@js.native
class QueueNode[T] protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] {
  def this(a: T) = this()
  /* CompleteClass */
  override var next: typings.jsGraphAlgorithms.JsGraphs.QueueNode[T] | Null = js.native
  /* CompleteClass */
  override var value: T = js.native
}

