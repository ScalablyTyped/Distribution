package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FordFulkerson extends js.Object {
  var edgeTo: js.Any
  var marked: js.Any
  var s: js.Any
  var t: js.Any
  var value: Double
  def hasAugmentedPath(G: FlowNetwork): Boolean
  def minCut(G: FlowNetwork): js.Array[FlowEdge]
}

object FordFulkerson {
  @scala.inline
  def apply(
    edgeTo: js.Any,
    hasAugmentedPath: FlowNetwork => Boolean,
    marked: js.Any,
    minCut: FlowNetwork => js.Array[FlowEdge],
    s: js.Any,
    t: js.Any,
    value: Double
  ): FordFulkerson = {
    val __obj = js.Dynamic.literal(edgeTo = edgeTo.asInstanceOf[js.Any], hasAugmentedPath = js.Any.fromFunction1(hasAugmentedPath), marked = marked.asInstanceOf[js.Any], minCut = js.Any.fromFunction1(minCut), s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FordFulkerson]
  }
}

