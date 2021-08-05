package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadthFirstSearch extends StObject {
  
  /* private */ var V: js.Any
  
  /* private */ var edgeTo: js.Any
  
  def hasPathTo(v: Double): Boolean
  
  /* private */ var marked: js.Any
  
  def pathTo(v: Double): js.Array[Double]
  
  /* private */ var s: js.Any
}
object BreadthFirstSearch {
  
  inline def apply(
    V: js.Any,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): BreadthFirstSearch = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstSearch]
  }
  
  extension [Self <: BreadthFirstSearch](x: Self) {
    
    inline def setEdgeTo(value: js.Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    inline def setHasPathTo(value: Double => Boolean): Self = StObject.set(x, "hasPathTo", js.Any.fromFunction1(value))
    
    inline def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setPathTo(value: Double => js.Array[Double]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
    
    inline def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: js.Any): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
