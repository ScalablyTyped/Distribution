package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedGraph extends StObject {
  
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
  implicit class WeightedGraphMutableBuilder[Self <: WeightedGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEdge(value: Edge => Unit): Self = StObject.set(x, "addEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdj(value: Double => js.Array[Edge]): Self = StObject.set(x, "adj", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjList(value: js.Array[js.Array[Edge]]): Self = StObject.set(x, "adjList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjListVarargs(value: js.Array[Edge]*): Self = StObject.set(x, "adjList", js.Array(value :_*))
    
    @scala.inline
    def setEdge(value: (Double, Double) => Edge | Null): Self = StObject.set(x, "edge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNode(value: Double => Node): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNodeInfo(value: js.Any): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
