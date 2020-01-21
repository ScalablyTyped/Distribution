package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.FordFulkerson")
@js.native
class FordFulkerson protected () extends js.Object {
  def this(G: FlowNetwork, s: Double, t: Double) = this()
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  var t: js.Any = js.native
  var value: Double = js.native
  def hasAugmentedPath(G: FlowNetwork): Boolean = js.native
  def minCut(G: FlowNetwork): js.Array[FlowEdge] = js.native
}

