package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.QueueNode")
@js.native
class QueueNode[T] protected () extends js.Object {
  def this(a: T) = this()
  var next: QueueNode[T] | Null = js.native
  var value: T = js.native
}

