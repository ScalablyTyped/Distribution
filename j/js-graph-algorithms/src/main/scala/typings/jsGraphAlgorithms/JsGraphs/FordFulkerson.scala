package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FordFulkerson extends StObject {
  
  /* private */ var edgeTo: Any
  
  def hasAugmentedPath(G: FlowNetwork): Boolean
  
  /* private */ var marked: Any
  
  def minCut(G: FlowNetwork): js.Array[FlowEdge]
  
  /* private */ var s: Any
  
  /* private */ var t: Any
  
  var value: Double
}
object FordFulkerson {
  
  inline def apply(
    edgeTo: Any,
    hasAugmentedPath: FlowNetwork => Boolean,
    marked: Any,
    minCut: FlowNetwork => js.Array[FlowEdge],
    s: Any,
    t: Any,
    value: Double
  ): FordFulkerson = {
    val __obj = js.Dynamic.literal(edgeTo = edgeTo.asInstanceOf[js.Any], hasAugmentedPath = js.Any.fromFunction1(hasAugmentedPath), marked = marked.asInstanceOf[js.Any], minCut = js.Any.fromFunction1(minCut), s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FordFulkerson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FordFulkerson] (val x: Self) extends AnyVal {
    
    inline def setEdgeTo(value: Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    inline def setHasAugmentedPath(value: FlowNetwork => Boolean): Self = StObject.set(x, "hasAugmentedPath", js.Any.fromFunction1(value))
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setMinCut(value: FlowNetwork => js.Array[FlowEdge]): Self = StObject.set(x, "minCut", js.Any.fromFunction1(value))
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setT(value: Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
