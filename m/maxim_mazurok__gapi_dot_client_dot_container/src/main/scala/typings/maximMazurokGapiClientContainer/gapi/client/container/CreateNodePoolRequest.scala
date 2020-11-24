package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNodePoolRequest extends js.Object {
  
  /** Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** Required. The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.native
  
  /** The parent (project, location, cluster id) where the node pool will be created. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced
    * by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}
object CreateNodePoolRequest {
  
  @scala.inline
  def apply(): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
  
  @scala.inline
  implicit class CreateNodePoolRequestOps[Self <: CreateNodePoolRequest] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    
    @scala.inline
    def setNodePool(value: NodePool): Self = this.set("nodePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodePool: Self = this.set("nodePool", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
