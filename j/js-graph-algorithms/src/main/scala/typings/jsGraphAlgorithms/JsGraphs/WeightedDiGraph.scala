package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedDiGraph extends WeightedGraph {
  def toDiGraph(): DiGraph
}

object WeightedDiGraph {
  @scala.inline
  def apply(
    V: Double,
    addEdge: Edge => Unit,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: js.Any,
    toDiGraph: () => DiGraph
  ): WeightedDiGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any], toDiGraph = js.Any.fromFunction0(toDiGraph))
    __obj.asInstanceOf[WeightedDiGraph]
  }
}

