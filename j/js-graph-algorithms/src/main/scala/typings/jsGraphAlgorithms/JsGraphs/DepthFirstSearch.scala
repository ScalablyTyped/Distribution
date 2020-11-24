package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthFirstSearch[T] extends js.Object {
  
  def dfs(G: Graph, v: Double): Unit = js.native
  
  var edgeTo: js.Any = js.native
  
  def hasPathTo(v: Double): Boolean = js.native
  
  var marked: js.Any = js.native
  
  def pathTo(v: Double): js.Array[Double] = js.native
  
  var s: js.Any = js.native
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
  implicit class DepthFirstSearchOps[Self <: DepthFirstSearch[_], T] (val x: Self with DepthFirstSearch[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDfs(value: (Graph, Double) => Unit): Self = this.set("dfs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEdgeTo(value: js.Any): Self = this.set("edgeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPathTo(value: Double => Boolean): Self = this.set("hasPathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathTo(value: Double => js.Array[Double]): Self = this.set("pathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
