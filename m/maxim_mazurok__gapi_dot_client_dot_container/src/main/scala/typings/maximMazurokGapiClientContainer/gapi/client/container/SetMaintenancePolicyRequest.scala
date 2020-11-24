package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMaintenancePolicyRequest extends js.Object {
  
  /** Required. The name of the cluster to update. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** Required. The maintenance policy to be set for the cluster. An empty field clears the existing maintenance policy. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
  
  /** The name (project, location, cluster id) of the cluster to set maintenance policy. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. */
  var zone: js.UndefOr[String] = js.native
}
object SetMaintenancePolicyRequest {
  
  @scala.inline
  def apply(): SetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMaintenancePolicyRequest]
  }
  
  @scala.inline
  implicit class SetMaintenancePolicyRequestOps[Self <: SetMaintenancePolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setMaintenancePolicy(value: MaintenancePolicy): Self = this.set("maintenancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenancePolicy: Self = this.set("maintenancePolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
