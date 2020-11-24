package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FordFulkerson extends js.Object {
  
  var edgeTo: js.Any = js.native
  
  def hasAugmentedPath(G: FlowNetwork): Boolean = js.native
  
  var marked: js.Any = js.native
  
  def minCut(G: FlowNetwork): js.Array[FlowEdge] = js.native
  
  var s: js.Any = js.native
  
  var t: js.Any = js.native
  
  var value: Double = js.native
}
object FordFulkerson {
  
  @scala.inline
  def apply(
    edgeTo: js.Any,
    hasAugmentedPath: FlowNetwork => Boolean,
    marked: js.Any,
    minCut: FlowNetwork => js.Array[FlowEdge],
    s: js.Any,
    t: js.Any,
    value: Double
  ): FordFulkerson = {
    val __obj = js.Dynamic.literal(edgeTo = edgeTo.asInstanceOf[js.Any], hasAugmentedPath = js.Any.fromFunction1(hasAugmentedPath), marked = marked.asInstanceOf[js.Any], minCut = js.Any.fromFunction1(minCut), s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FordFulkerson]
  }
  
  @scala.inline
  implicit class FordFulkersonOps[Self <: FordFulkerson] (val x: Self) extends AnyVal {
    
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
    def setEdgeTo(value: js.Any): Self = this.set("edgeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAugmentedPath(value: FlowNetwork => Boolean): Self = this.set("hasAugmentedPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCut(value: FlowNetwork => js.Array[FlowEdge]): Self = this.set("minCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: js.Any): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
