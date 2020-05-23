package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var V: Double
  var adjList: js.Any
  var edges: js.Any
  var nodeInfo: js.Any
  def addEdge(v: Double, w: Double): Unit
  def adj(v: Double): js.Array[Double]
  def edge(v: Double, w: Double): Edge | Null
  def node(v: Double): Node
}

object Graph {
  @scala.inline
  def apply(
    V: Double,
    addEdge: (Double, Double) => Unit,
    adj: Double => js.Array[Double],
    adjList: js.Any,
    edge: (Double, Double) => Edge | Null,
    edges: js.Any,
    node: Double => Node,
    nodeInfo: js.Any
  ): Graph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction2(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), edges = edges.asInstanceOf[js.Any], node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

