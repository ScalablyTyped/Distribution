package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StronglyConnectedComponents extends StObject {
  
  def componentCount(): Double
  
  def componentId(v: Double): Double
  
  /* private */ var count: Any
  
  def dfs(G: DiGraph, v: Double): Unit
  
  /* private */ var id: Any
  
  /* private */ var marked: Any
}
object StronglyConnectedComponents {
  
  inline def apply(
    componentCount: () => Double,
    componentId: Double => Double,
    count: Any,
    dfs: (DiGraph, Double) => Unit,
    id: Any,
    marked: Any
  ): StronglyConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = js.Any.fromFunction0(componentCount), componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2(dfs), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StronglyConnectedComponents]
  }
  
  extension [Self <: StronglyConnectedComponents](x: Self) {
    
    inline def setComponentCount(value: () => Double): Self = StObject.set(x, "componentCount", js.Any.fromFunction0(value))
    
    inline def setComponentId(value: Double => Double): Self = StObject.set(x, "componentId", js.Any.fromFunction1(value))
    
    inline def setCount(value: Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDfs(value: (DiGraph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMarked(value: Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
  }
}
