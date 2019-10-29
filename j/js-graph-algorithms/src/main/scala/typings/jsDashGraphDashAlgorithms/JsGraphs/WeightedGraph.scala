package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.WeightedGraph")
@js.native
class WeightedGraph protected () extends js.Object {
  def this(V: Double) = this()
  var V: Double = js.native
  var adjList: js.Array[js.Array[Edge]] = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(e: Edge): Unit = js.native
  def adj(v: Double): js.Array[Edge] = js.native
  def edge(v: Double, w: Double): Edge | Null = js.native
  def node(v: Double): Node = js.native
}

