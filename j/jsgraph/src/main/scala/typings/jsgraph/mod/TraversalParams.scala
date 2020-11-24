package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraversalParams extends js.Object {
  
  var digraph: DirectedGraph = js.native
  
  var options: js.UndefOr[TraversalOptions] = js.native
  
  var visitor: Visitor = js.native
}
object TraversalParams {
  
  @scala.inline
  def apply(digraph: DirectedGraph, visitor: Visitor): TraversalParams = {
    val __obj = js.Dynamic.literal(digraph = digraph.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalParams]
  }
  
  @scala.inline
  implicit class TraversalParamsOps[Self <: TraversalParams] (val x: Self) extends AnyVal {
    
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
    def setDigraph(value: DirectedGraph): Self = this.set("digraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitor(value: Visitor): Self = this.set("visitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TraversalOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
