package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupsAddNodesRequest extends StObject {
  
  /** Count of additional nodes to be added to the node group. */
  var additionalNodeCount: js.UndefOr[Double] = js.native
}
object NodeGroupsAddNodesRequest {
  
  @scala.inline
  def apply(): NodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsAddNodesRequest]
  }
  
  @scala.inline
  implicit class NodeGroupsAddNodesRequestMutableBuilder[Self <: NodeGroupsAddNodesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalNodeCount(value: Double): Self = StObject.set(x, "additionalNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalNodeCountUndefined: Self = StObject.set(x, "additionalNodeCount", js.undefined)
  }
}
