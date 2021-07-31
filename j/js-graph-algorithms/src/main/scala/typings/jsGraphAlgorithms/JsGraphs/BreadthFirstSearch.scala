package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadthFirstSearch extends StObject {
  
  var V: js.Any
  
  var edgeTo: js.Any
  
  def hasPathTo(v: Double): Boolean
  
  var marked: js.Any
  
  def pathTo(v: Double): js.Array[Double]
  
  var s: js.Any
}
object BreadthFirstSearch {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BreadthFirstSearchMutableBuilder[Self <: BreadthFirstSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeTo(value: js.Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPathTo(value: Double => Boolean): Self = StObject.set(x, "hasPathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathTo(value: Double => js.Array[Double]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: js.Any): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
