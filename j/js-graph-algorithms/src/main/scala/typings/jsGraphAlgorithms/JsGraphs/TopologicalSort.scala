package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.TopologicalSort")
@js.native
class TopologicalSort protected () extends js.Object {
  def this(G: DiGraph) = this()
  var marked: js.Any = js.native
  var postOrder: js.Any = js.native
  def dfs(G: DiGraph, v: Double): Unit = js.native
  def order(): js.Array[Double] = js.native
}

