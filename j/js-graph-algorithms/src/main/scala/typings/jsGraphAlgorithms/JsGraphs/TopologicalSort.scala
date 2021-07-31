package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologicalSort extends StObject {
  
  def dfs(G: DiGraph, v: Double): Unit
  
  var marked: js.Any
  
  def order(): js.Array[Double]
  
  var postOrder: js.Any
}
object TopologicalSort {
  
  @scala.inline
  def apply(dfs: (DiGraph, Double) => Unit, marked: js.Any, order: () => js.Array[Double], postOrder: js.Any): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), marked = marked.asInstanceOf[js.Any], order = js.Any.fromFunction0(order), postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
  
  @scala.inline
  implicit class TopologicalSortMutableBuilder[Self <: TopologicalSort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDfs(value: (DiGraph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: () => js.Array[Double]): Self = StObject.set(x, "order", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostOrder(value: js.Any): Self = StObject.set(x, "postOrder", value.asInstanceOf[js.Any])
  }
}
