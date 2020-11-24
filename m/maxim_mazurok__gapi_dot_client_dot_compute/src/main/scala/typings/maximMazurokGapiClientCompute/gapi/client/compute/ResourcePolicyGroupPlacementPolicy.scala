package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicyGroupPlacementPolicy extends js.Object {
  
  /** The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network */
  var availabilityDomainCount: js.UndefOr[Double] = js.native
  
  /** Specifies network collocation */
  var collocation: js.UndefOr[String] = js.native
  
  /** Number of vms in this placement group */
  var vmCount: js.UndefOr[Double] = js.native
}
object ResourcePolicyGroupPlacementPolicy {
  
  @scala.inline
  def apply(): ResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyGroupPlacementPolicy]
  }
  
  @scala.inline
  implicit class ResourcePolicyGroupPlacementPolicyOps[Self <: ResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityDomainCount(value: Double): Self = this.set("availabilityDomainCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityDomainCount: Self = this.set("availabilityDomainCount", js.undefined)
    
    @scala.inline
    def setCollocation(value: String): Self = this.set("collocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollocation: Self = this.set("collocation", js.undefined)
    
    @scala.inline
    def setVmCount(value: Double): Self = this.set("vmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmCount: Self = this.set("vmCount", js.undefined)
  }
}
