package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiGraph extends StObject {
  
  var V: Double
  
  def addEdge(v: Double, w: Double): Unit
  
  def adj(v: Double): js.Array[Double]
  
  /* private */ var adjList: Any
  
  def edge(v: Double, w: Double): Edge | Null
  
  /* private */ var edges: Any
  
  def node(v: Double): Node
  
  /* private */ var nodeInfo: Any
  
  def reverse(): DiGraph
}
object DiGraph {
  
  inline def apply(
    V: Double,
    addEdge: (Double, Double) => Unit,
    adj: Double => js.Array[Double],
    adjList: Any,
    edge: (Double, Double) => Edge | Null,
    edges: Any,
    node: Double => Node,
    nodeInfo: Any,
    reverse: () => DiGraph
  ): DiGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction2(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), edges = edges.asInstanceOf[js.Any], node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any], reverse = js.Any.fromFunction0(reverse))
    __obj.asInstanceOf[DiGraph]
  }
  
  extension [Self <: DiGraph](x: Self) {
    
    inline def setAddEdge(value: (Double, Double) => Unit): Self = StObject.set(x, "addEdge", js.Any.fromFunction2(value))
    
    inline def setAdj(value: Double => js.Array[Double]): Self = StObject.set(x, "adj", js.Any.fromFunction1(value))
    
    inline def setAdjList(value: Any): Self = StObject.set(x, "adjList", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: (Double, Double) => Edge | Null): Self = StObject.set(x, "edge", js.Any.fromFunction2(value))
    
    inline def setEdges(value: Any): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Double => Node): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
    
    inline def setNodeInfo(value: Any): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: () => DiGraph): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setV(value: Double): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
