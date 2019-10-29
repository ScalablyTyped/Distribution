package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.StackNode")
@js.native
class StackNode[T] protected () extends js.Object {
  def this(value: T) = this()
  var next: StackNode[T] | Null = js.native
  var value: T = js.native
}

