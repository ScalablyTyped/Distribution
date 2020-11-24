package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedGraph extends js.Object {
  
  var V: Double = js.native
  
  def addEdge(e: Edge): Unit = js.native
  
  def adj(v: Double): js.Array[Edge] = js.native
  
  var adjList: js.Array[js.Array[Edge]] = js.native
  
  def edge(v: Double, w: Double): Edge | Null = js.native
  
  def node(v: Double): Node = js.native
  
  var nodeInfo: js.Any = js.native
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
  
  @scala.inline
  implicit class WeightedGraphOps[Self <: WeightedGraph] (val x: Self) extends AnyVal {
    
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
    def setAddEdge(value: Edge => Unit): Self = this.set("addEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdj(value: Double => js.Array[Edge]): Self = this.set("adj", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjListVarargs(value: js.Array[Edge]*): Self = this.set("adjList", js.Array(value :_*))
    
    @scala.inline
    def setAdjList(value: js.Array[js.Array[Edge]]): Self = this.set("adjList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdge(value: (Double, Double) => Edge | Null): Self = this.set("edge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNode(value: Double => Node): Self = this.set("node", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNodeInfo(value: js.Any): Self = this.set("nodeInfo", value.asInstanceOf[js.Any])
  }
}
