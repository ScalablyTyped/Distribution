package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedGraph extends StObject {
  
  var V: Double
  
  def addEdge(e: Edge): Unit
  
  def adj(v: Double): js.Array[Edge]
  
  /* protected */ var adjList: js.Array[js.Array[Edge]]
  
  def edge(v: Double, w: Double): Edge | Null
  
  def node(v: Double): Node
  
  /* private */ var nodeInfo: Any
}
object WeightedGraph {
  
  inline def apply(
    V: Double,
    addEdge: Edge => Unit,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: Any
  ): WeightedGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedGraph]
  }
  
  extension [Self <: WeightedGraph](x: Self) {
    
    inline def setAddEdge(value: Edge => Unit): Self = StObject.set(x, "addEdge", js.Any.fromFunction1(value))
    
    inline def setAdj(value: Double => js.Array[Edge]): Self = StObject.set(x, "adj", js.Any.fromFunction1(value))
    
    inline def setAdjList(value: js.Array[js.Array[Edge]]): Self = StObject.set(x, "adjList", value.asInstanceOf[js.Any])
    
    inline def setAdjListVarargs(value: js.Array[Edge]*): Self = StObject.set(x, "adjList", js.Array(value*))
    
    inline def setEdge(value: (Double, Double) => Edge | Null): Self = StObject.set(x, "edge", js.Any.fromFunction2(value))
    
    inline def setNode(value: Double => Node): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
    
    inline def setNodeInfo(value: Any): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
