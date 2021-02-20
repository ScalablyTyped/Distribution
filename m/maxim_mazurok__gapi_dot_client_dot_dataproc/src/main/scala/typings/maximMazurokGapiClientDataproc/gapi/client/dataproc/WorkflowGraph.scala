package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowGraph extends StObject {
  
  /** Output only. The workflow nodes. */
  var nodes: js.UndefOr[js.Array[WorkflowNode]] = js.native
}
object WorkflowGraph {
  
  @scala.inline
  def apply(): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowGraph]
  }
  
  @scala.inline
  implicit class WorkflowGraphMutableBuilder[Self <: WorkflowGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[WorkflowNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: WorkflowNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
