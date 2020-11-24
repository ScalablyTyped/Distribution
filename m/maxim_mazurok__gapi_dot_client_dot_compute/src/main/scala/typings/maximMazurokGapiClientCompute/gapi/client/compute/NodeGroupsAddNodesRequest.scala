package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupsAddNodesRequest extends js.Object {
  
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
  implicit class NodeGroupsAddNodesRequestOps[Self <: NodeGroupsAddNodesRequest] (val x: Self) extends AnyVal {
    
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
    def setAdditionalNodeCount(value: Double): Self = this.set("additionalNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalNodeCount: Self = this.set("additionalNodeCount", js.undefined)
  }
}
