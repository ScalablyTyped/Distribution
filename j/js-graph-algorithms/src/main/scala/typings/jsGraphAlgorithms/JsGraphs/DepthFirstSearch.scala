package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.DepthFirstSearch")
@js.native
class DepthFirstSearch[T] protected () extends js.Object {
  def this(G: Graph, s: Double) = this()
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def dfs(G: Graph, v: Double): Unit = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Double] = js.native
}

