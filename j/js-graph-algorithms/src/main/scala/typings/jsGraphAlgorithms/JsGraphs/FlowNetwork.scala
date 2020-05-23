package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowNetwork extends js.Object {
  var V: Double
  var adjList: js.Any
  var nodeInfo: js.Any
  def addEdge(e: FlowEdge): Unit
  def adj(v: Double): js.Array[FlowEdge]
  def edge(v: Double, w: Double): FlowEdge | Null
  def node(v: Double): Node
}

object FlowNetwork {
  @scala.inline
  def apply(
    V: Double,
    addEdge: FlowEdge => Unit,
    adj: Double => js.Array[FlowEdge],
    adjList: js.Any,
    edge: (Double, Double) => FlowEdge | Null,
    node: Double => Node,
    nodeInfo: js.Any
  ): FlowNetwork = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNetwork]
  }
}

