package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedGraph extends js.Object {
  var V: Double
  var adjList: js.Array[js.Array[Edge]]
  var nodeInfo: js.Any
  def addEdge(e: Edge): Unit
  def adj(v: Double): js.Array[Edge]
  def edge(v: Double, w: Double): Edge | Null
  def node(v: Double): Node
}

object WeightedGraph {
  @scala.inline
  def apply(
    V: Double,
    addEdge: Edge => Unit,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: js.Any
  ): WeightedGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedGraph]
  }
}

