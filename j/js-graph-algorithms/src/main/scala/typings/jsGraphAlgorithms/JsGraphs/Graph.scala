package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph extends StObject {
  
  var V: Double
  
  def addEdge(v: Double, w: Double): Unit
  
  def adj(v: Double): js.Array[Double]
  
  /* private */ var adjList: js.Any
  
  def edge(v: Double, w: Double): Edge | Null
  
  /* private */ var edges: js.Any
  
  def node(v: Double): Node
  
  /* private */ var nodeInfo: js.Any
}
object Graph {
  
  inline def apply(
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
  
  extension [Self <: Graph](x: Self) {
    
    inline def setAddEdge(value: (Double, Double) => Unit): Self = StObject.set(x, "addEdge", js.Any.fromFunction2(value))
    
    inline def setAdj(value: Double => js.Array[Double]): Self = StObject.set(x, "adj", js.Any.fromFunction1(value))
    
    inline def setAdjList(value: js.Any): Self = StObject.set(x, "adjList", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: (Double, Double) => Edge | Null): Self = StObject.set(x, "edge", js.Any.fromFunction2(value))
    
    inline def setEdges(value: js.Any): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Double => Node): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
    
    inline def setNodeInfo(value: js.Any): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
