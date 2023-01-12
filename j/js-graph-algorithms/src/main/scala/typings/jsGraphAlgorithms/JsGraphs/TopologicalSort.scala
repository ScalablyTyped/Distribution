package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologicalSort extends StObject {
  
  def dfs(G: DiGraph, v: Double): Unit
  
  /* private */ var marked: Any
  
  def order(): js.Array[Double]
  
  /* private */ var postOrder: Any
}
object TopologicalSort {
  
  inline def apply(dfs: (DiGraph, Double) => Unit, marked: Any, order: () => js.Array[Double], postOrder: Any): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), marked = marked.asInstanceOf[js.Any], order = js.Any.fromFunction0(order), postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopologicalSort] (val x: Self) extends AnyVal {
    
    inline def setDfs(value: (DiGraph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: () => js.Array[Double]): Self = StObject.set(x, "order", js.Any.fromFunction0(value))
    
    inline def setPostOrder(value: Any): Self = StObject.set(x, "postOrder", value.asInstanceOf[js.Any])
  }
}
