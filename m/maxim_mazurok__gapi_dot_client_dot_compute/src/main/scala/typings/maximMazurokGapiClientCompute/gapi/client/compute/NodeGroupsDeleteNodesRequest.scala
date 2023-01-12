package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupsDeleteNodesRequest extends StObject {
  
  /** Names of the nodes to delete. */
  var nodes: js.UndefOr[js.Array[String]] = js.undefined
}
object NodeGroupsDeleteNodesRequest {
  
  inline def apply(): NodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsDeleteNodesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroupsDeleteNodesRequest] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
