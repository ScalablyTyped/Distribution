package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupsDeleteNodesRequest extends StObject {
  
  /** Names of the nodes to delete. */
  var nodes: js.UndefOr[js.Array[String]] = js.native
}
object NodeGroupsDeleteNodesRequest {
  
  @scala.inline
  def apply(): NodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsDeleteNodesRequest]
  }
  
  @scala.inline
  implicit class NodeGroupsDeleteNodesRequestMutableBuilder[Self <: NodeGroupsDeleteNodesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
