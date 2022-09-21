package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadthFirstSearch extends StObject {
  
  /* private */ var V: Any
  
  /* private */ var edgeTo: Any
  
  def hasPathTo(v: Double): Boolean
  
  /* private */ var marked: Any
  
  def pathTo(v: Double): js.Array[Double]
  
  /* private */ var s: Any
}
object BreadthFirstSearch {
  
  inline def apply(
    V: Any,
    edgeTo: Any,
    hasPathTo: Double => Boolean,
    marked: Any,
    pathTo: Double => js.Array[Double],
    s: Any
  ): BreadthFirstSearch = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstSearch]
  }
  
  extension [Self <: BreadthFirstSearch](x: Self) {
    
    inline def setEdgeTo(value: Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    inline def setHasPathTo(value: Double => Boolean): Self = StObject.set(x, "hasPathTo", js.Any.fromFunction1(value))
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setPathTo(value: Double => js.Array[Double]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: Any): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
