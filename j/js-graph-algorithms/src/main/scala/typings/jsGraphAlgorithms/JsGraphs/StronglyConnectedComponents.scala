package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StronglyConnectedComponents extends js.Object {
  
  def componentCount(): Double = js.native
  
  def componentId(v: Double): Double = js.native
  
  var count: js.Any = js.native
  
  def dfs(G: DiGraph, v: Double): Unit = js.native
  
  var id: js.Any = js.native
  
  var marked: js.Any = js.native
}
object StronglyConnectedComponents {
  
  @scala.inline
  def apply(
    componentCount: () => Double,
    componentId: Double => Double,
    count: js.Any,
    dfs: (DiGraph, Double) => Unit,
    id: js.Any,
    marked: js.Any
  ): StronglyConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = js.Any.fromFunction0(componentCount), componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2(dfs), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StronglyConnectedComponents]
  }
  
  @scala.inline
  implicit class StronglyConnectedComponentsOps[Self <: StronglyConnectedComponents] (val x: Self) extends AnyVal {
    
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
    def setComponentCount(value: () => Double): Self = this.set("componentCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentId(value: Double => Double): Self = this.set("componentId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: js.Any): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDfs(value: (DiGraph, Double) => Unit): Self = this.set("dfs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
  }
}
