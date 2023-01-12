package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowNetwork extends StObject {
  
  var V: Double
  
  def addEdge(e: FlowEdge): Unit
  
  def adj(v: Double): js.Array[FlowEdge]
  
  /* private */ var adjList: Any
  
  def edge(v: Double, w: Double): FlowEdge | Null
  
  def node(v: Double): Node
  
  /* private */ var nodeInfo: Any
}
object FlowNetwork {
  
  inline def apply(
    V: Double,
    addEdge: FlowEdge => Unit,
    adj: Double => js.Array[FlowEdge],
    adjList: Any,
    edge: (Double, Double) => FlowEdge | Null,
    node: Double => Node,
    nodeInfo: Any
  ): FlowNetwork = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowNetwork] (val x: Self) extends AnyVal {
    
    inline def setAddEdge(value: FlowEdge => Unit): Self = StObject.set(x, "addEdge", js.Any.fromFunction1(value))
    
    inline def setAdj(value: Double => js.Array[FlowEdge]): Self = StObject.set(x, "adj", js.Any.fromFunction1(value))
    
    inline def setAdjList(value: Any): Self = StObject.set(x, "adjList", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: (Double, Double) => FlowEdge | Null): Self = StObject.set(x, "edge", js.Any.fromFunction2(value))
    
    inline def setNode(value: Double => Node): Self = StObject.set(x, "node", js.Any.fromFunction1(value))
    
    inline def setNodeInfo(value: Any): Self = StObject.set(x, "nodeInfo", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
