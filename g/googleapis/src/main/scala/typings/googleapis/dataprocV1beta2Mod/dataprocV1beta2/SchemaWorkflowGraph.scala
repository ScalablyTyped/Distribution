package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The workflow graph.
  */
@js.native
trait SchemaWorkflowGraph extends StObject {
  
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
  implicit class SchemaWorkflowGraphMutableBuilder[Self <: SchemaWorkflowGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[SchemaWorkflowNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: SchemaWorkflowNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
