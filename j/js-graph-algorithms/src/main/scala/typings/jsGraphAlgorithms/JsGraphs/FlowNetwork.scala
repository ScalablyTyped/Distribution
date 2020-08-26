package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowNetwork extends js.Object {
  var V: Double = js.native
  var adjList: js.Any = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(e: FlowEdge): Unit = js.native
  def adj(v: Double): js.Array[FlowEdge] = js.native
  def edge(v: Double, w: Double): FlowEdge | Null = js.native
  def node(v: Double): Node = js.native
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
  @scala.inline
  implicit class FlowNetworkOps[Self <: FlowNetwork] (val x: Self) extends AnyVal {
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
    def setAddEdge(value: FlowEdge => Unit): Self = this.set("addEdge", js.Any.fromFunction1(value))
    @scala.inline
    def setAdj(value: Double => js.Array[FlowEdge]): Self = this.set("adj", js.Any.fromFunction1(value))
    @scala.inline
    def setAdjList(value: js.Any): Self = this.set("adjList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge(value: (Double, Double) => FlowEdge | Null): Self = this.set("edge", js.Any.fromFunction2(value))
    @scala.inline
    def setNode(value: Double => Node): Self = this.set("node", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeInfo(value: js.Any): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
  }
  
}

