package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1AccessControlList extends js.Object {
  
  /**
    * The accesses that match one of the following conditions: - The access_selector, if it is specified in request; - Otherwise, access specifiers reachable from the policy binding's
    * role.
    */
  var accesses: js.UndefOr[js.Array[GoogleCloudAssetV1Access]] = js.native
  
  /**
    * Resource edges of the graph starting from the policy attached resource to any descendant resources. The Edge.source_node contains the full resource name of a parent resource and
    * Edge.target_node contains the full resource name of a child resource. This field is present only if the output_resource_edges option is enabled in request.
    */
  var resourceEdges: js.UndefOr[js.Array[GoogleCloudAssetV1Edge]] = js.native
  
  /** The resources that match one of the following conditions: - The resource_selector, if it is specified in request; - Otherwise, resources reachable from the policy attached resource. */
  var resources: js.UndefOr[js.Array[GoogleCloudAssetV1Resource]] = js.native
}
object GoogleCloudAssetV1AccessControlList {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1AccessControlList]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1AccessControlListOps[Self <: GoogleCloudAssetV1AccessControlList] (val x: Self) extends AnyVal {
    
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
    def setAccessesVarargs(value: GoogleCloudAssetV1Access*): Self = this.set("accesses", js.Array(value :_*))
    
    @scala.inline
    def setAccesses(value: js.Array[GoogleCloudAssetV1Access]): Self = this.set("accesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccesses: Self = this.set("accesses", js.undefined)
    
    @scala.inline
    def setResourceEdgesVarargs(value: GoogleCloudAssetV1Edge*): Self = this.set("resourceEdges", js.Array(value :_*))
    
    @scala.inline
    def setResourceEdges(value: js.Array[GoogleCloudAssetV1Edge]): Self = this.set("resourceEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceEdges: Self = this.set("resourceEdges", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: GoogleCloudAssetV1Resource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[GoogleCloudAssetV1Resource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
}
