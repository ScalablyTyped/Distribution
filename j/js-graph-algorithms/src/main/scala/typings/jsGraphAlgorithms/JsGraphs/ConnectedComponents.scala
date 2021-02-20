package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedComponents extends StObject {
  
  def componentCount(): Double = js.native
  
  def componentId(v: Double): Double = js.native
  
  var count: js.Any = js.native
  
  def dfs(G: Graph, v: Double): Unit = js.native
  
  var id: js.Any = js.native
  
  var marked: js.Any = js.native
}
object ConnectedComponents {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ConnectedComponentsMutableBuilder[Self <: ConnectedComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentCount(value: () => Double): Self = StObject.set(x, "componentCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentId(value: Double => Double): Self = StObject.set(x, "componentId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfs(value: (Graph, Double) => Unit): Self = StObject.set(x, "dfs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
  }
}
