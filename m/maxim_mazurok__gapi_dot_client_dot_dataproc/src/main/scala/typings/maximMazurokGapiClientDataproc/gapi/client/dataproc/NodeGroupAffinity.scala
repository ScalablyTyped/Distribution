package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupAffinity extends js.Object {
  
  /**
    * Required. The URI of a sole-tenant node group resource (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) that the cluster will be created on.A full URL, partial
    * URI, or node group name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1
    * projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 node-group-1
    */
  var nodeGroupUri: js.UndefOr[String] = js.native
}
object NodeGroupAffinity {
  
  @scala.inline
  def apply(): NodeGroupAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupAffinity]
  }
  
  @scala.inline
  implicit class NodeGroupAffinityOps[Self <: NodeGroupAffinity] (val x: Self) extends AnyVal {
    
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
    def setNodeGroupUri(value: String): Self = this.set("nodeGroupUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroupUri: Self = this.set("nodeGroupUri", js.undefined)
  }
}
