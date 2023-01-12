package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowGraph extends StObject {
  
  /** Output only. The workflow nodes. */
  var nodes: js.UndefOr[js.Array[WorkflowNode]] = js.undefined
}
object WorkflowGraph {
  
  inline def apply(): WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowGraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowGraph] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[WorkflowNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: WorkflowNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
