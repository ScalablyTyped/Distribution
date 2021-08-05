package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The workflow graph.
  */
trait SchemaWorkflowGraph extends StObject {
  
  /**
    * Output only. The workflow nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaWorkflowNode]] = js.undefined
}
object SchemaWorkflowGraph {
  
  inline def apply(): SchemaWorkflowGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowGraph]
  }
  
  extension [Self <: SchemaWorkflowGraph](x: Self) {
    
    inline def setNodes(value: js.Array[SchemaWorkflowNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SchemaWorkflowNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
