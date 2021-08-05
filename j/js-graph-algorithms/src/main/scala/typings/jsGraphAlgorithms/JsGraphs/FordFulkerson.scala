package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FordFulkerson extends StObject {
  
  /* private */ var edgeTo: js.Any
  
  def hasAugmentedPath(G: FlowNetwork): Boolean
  
  /* private */ var marked: js.Any
  
  def minCut(G: FlowNetwork): js.Array[FlowEdge]
  
  /* private */ var s: js.Any
  
  /* private */ var t: js.Any
  
  var value: Double
}
object FordFulkerson {
  
  inline def apply(
    edgeTo: js.Any,
    hasAugmentedPath: FlowNetwork => Boolean,
    marked: js.Any,
    minCut: FlowNetwork => js.Array[FlowEdge],
    s: js.Any,
    t: js.Any,
    value: Double
  ): FordFulkerson = {
    val __obj = js.Dynamic.literal(edgeTo = edgeTo.asInstanceOf[js.Any], hasAugmentedPath = js.Any.fromFunction1(hasAugmentedPath), marked = marked.asInstanceOf[js.Any], minCut = js.Any.fromFunction1(minCut), s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FordFulkerson]
  }
  
  extension [Self <: FordFulkerson](x: Self) {
    
    inline def setEdgeTo(value: js.Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    inline def setHasAugmentedPath(value: FlowNetwork => Boolean): Self = StObject.set(x, "hasAugmentedPath", js.Any.fromFunction1(value))
    
    inline def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setMinCut(value: FlowNetwork => js.Array[FlowEdge]): Self = StObject.set(x, "minCut", js.Any.fromFunction1(value))
    
    inline def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setT(value: js.Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
