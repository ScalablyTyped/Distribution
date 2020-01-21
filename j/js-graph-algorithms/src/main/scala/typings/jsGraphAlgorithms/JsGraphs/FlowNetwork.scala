package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.FlowNetwork")
@js.native
class FlowNetwork protected () extends js.Object {
  def this(V: Double) = this()
  var V: Double = js.native
  var adjList: js.Any = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(e: FlowEdge): Unit = js.native
  def adj(v: Double): js.Array[FlowEdge] = js.native
  def edge(v: Double, w: Double): FlowEdge | Null = js.native
  def node(v: Double): Node = js.native
}

