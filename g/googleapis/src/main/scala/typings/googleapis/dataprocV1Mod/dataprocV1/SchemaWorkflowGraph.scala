package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The workflow graph.
  */
@js.native
trait SchemaWorkflowGraph extends js.Object {
  
  /**
    * Output only. The workflow nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaWorkflowNode]] = js.native
}
object SchemaWorkflowGraph {
  
  @scala.inline
  def apply(): SchemaWorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowGraph]
  }
  
  @scala.inline
  implicit class SchemaWorkflowGraphOps[Self <: SchemaWorkflowGraph] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: SchemaWorkflowNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[SchemaWorkflowNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
