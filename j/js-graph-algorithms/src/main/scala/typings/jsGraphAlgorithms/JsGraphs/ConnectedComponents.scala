package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedComponents extends StObject {
  
  def componentCount(): Double
  
  def componentId(v: Double): Double
  
  /* private */ var count: js.Any
  
  def dfs(G: Graph, v: Double): Unit
  
  /* private */ var id: js.Any
  
  /* private */ var marked: js.Any
}
object ConnectedComponents {
  
  inline def apply(
    componentCount: () => Double,
    componentId: Double => Double,
    count: js.Any,
    dfs: (Graph, Double) => Unit,
    id: js.Any,
    marked: js.Any
  ): ConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = js.Any.fromFunction0(componentCount), componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2(dfs), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedComponents]
  }
  
  extension [Self <: ConnectedComponents](x: Self) {
    
    inline def setComponentCount(value: () => Double): Self = StObject.set(x, "componentCount", js.Any.fromFunction0(value))
    
    inline def setComponentId(value: Double => Double): Self = StObject.set(x, "componentId", js.Any.fromFunction1(value))
    
    inline def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDfs(value: (Graph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
  }
}
