package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterAutoscaling extends js.Object {
  
  /** The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP. */
  var autoprovisioningLocations: js.UndefOr[js.Array[String]] = js.native
  
  /** AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP. */
  var autoprovisioningNodePoolDefaults: js.UndefOr[AutoprovisioningNodePoolDefaults] = js.native
  
  /** Enables automatic node pool creation and deletion. */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  
  /** Contains global constraints regarding minimum and maximum amount of resources in the cluster. */
  var resourceLimits: js.UndefOr[js.Array[ResourceLimit]] = js.native
}
object ClusterAutoscaling {
  
  @scala.inline
  def apply(): ClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAutoscaling]
  }
  
  @scala.inline
  implicit class ClusterAutoscalingOps[Self <: ClusterAutoscaling] (val x: Self) extends AnyVal {
    
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
    def setAutoprovisioningLocationsVarargs(value: String*): Self = this.set("autoprovisioningLocations", js.Array(value :_*))
    
    @scala.inline
    def setAutoprovisioningLocations(value: js.Array[String]): Self = this.set("autoprovisioningLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprovisioningLocations: Self = this.set("autoprovisioningLocations", js.undefined)
    
    @scala.inline
    def setAutoprovisioningNodePoolDefaults(value: AutoprovisioningNodePoolDefaults): Self = this.set("autoprovisioningNodePoolDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprovisioningNodePoolDefaults: Self = this.set("autoprovisioningNodePoolDefaults", js.undefined)
    
    @scala.inline
    def setEnableNodeAutoprovisioning(value: Boolean): Self = this.set("enableNodeAutoprovisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNodeAutoprovisioning: Self = this.set("enableNodeAutoprovisioning", js.undefined)
    
    @scala.inline
    def setResourceLimitsVarargs(value: ResourceLimit*): Self = this.set("resourceLimits", js.Array(value :_*))
    
    @scala.inline
    def setResourceLimits(value: js.Array[ResourceLimit]): Self = this.set("resourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLimits: Self = this.set("resourceLimits", js.undefined)
  }
}
