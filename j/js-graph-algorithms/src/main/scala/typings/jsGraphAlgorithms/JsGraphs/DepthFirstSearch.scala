package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthFirstSearch[T] extends StObject {
  
  def dfs(G: Graph, v: Double): Unit
  
  var edgeTo: js.Any
  
  def hasPathTo(v: Double): Boolean
  
  var marked: js.Any
  
  def pathTo(v: Double): js.Array[Double]
  
  var s: js.Any
}
object DepthFirstSearch {
  
  @scala.inline
  def apply[T](
    dfs: (Graph, Double) => Unit,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): DepthFirstSearch[T] = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthFirstSearch[T]]
  }
  
  @scala.inline
  implicit class DepthFirstSearchMutableBuilder[Self <: DepthFirstSearch[?], T] (val x: Self & DepthFirstSearch[T]) extends AnyVal {
    
    @scala.inline
    def setDfs(value: (Graph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
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
  }
}
