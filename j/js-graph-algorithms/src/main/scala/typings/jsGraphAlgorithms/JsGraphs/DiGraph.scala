package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiGraph extends js.Object {
  var V: Double = js.native
  var adjList: js.Any = js.native
  var edges: js.Any = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(v: Double, w: Double): Unit = js.native
  def adj(v: Double): js.Array[Double] = js.native
  def edge(v: Double, w: Double): Edge | Null = js.native
  def node(v: Double): Node = js.native
  def reverse(): DiGraph = js.native
}

object DiGraph {
  @scala.inline
  def apply(
    V: Double,
    addEdge: (Double, Double) => Unit,
    adj: Double => js.Array[Double],
    adjList: js.Any,
    edge: (Double, Double) => Edge | Null,
    edges: js.Any,
    node: Double => Node,
    nodeInfo: js.Any,
    reverse: () => DiGraph
  ): DiGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction2(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), edges = edges.asInstanceOf[js.Any], node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any], reverse = js.Any.fromFunction0(reverse))
    __obj.asInstanceOf[DiGraph]
  }
  @scala.inline
  implicit class DiGraphOps[Self <: DiGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setV(value: Double): Self = this.set("V", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddEdge(value: (Double, Double) => Unit): Self = this.set("addEdge", js.Any.fromFunction2(value))
    @scala.inline
    def setAdj(value: Double => js.Array[Double]): Self = this.set("adj", js.Any.fromFunction1(value))
    @scala.inline
    def setAdjList(value: js.Any): Self = this.set("adjList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge(value: (Double, Double) => Edge | Null): Self = this.set("edge", js.Any.fromFunction2(value))
    @scala.inline
    def setEdges(value: js.Any): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Double => Node): Self = this.set("node", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeInfo(value: js.Any): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReverse(value: () => DiGraph): Self = this.set("reverse", js.Any.fromFunction0(value))
  }
  
}

