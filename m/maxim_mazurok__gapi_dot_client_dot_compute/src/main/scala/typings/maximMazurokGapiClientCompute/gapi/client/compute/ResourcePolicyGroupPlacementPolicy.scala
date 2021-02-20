package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePolicyGroupPlacementPolicy extends StObject {
  
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
  implicit class ResourcePolicyGroupPlacementPolicyMutableBuilder[Self <: ResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityDomainCount(value: Double): Self = StObject.set(x, "availabilityDomainCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityDomainCountUndefined: Self = StObject.set(x, "availabilityDomainCount", js.undefined)
    
    @scala.inline
    def setCollocation(value: String): Self = StObject.set(x, "collocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollocationUndefined: Self = StObject.set(x, "collocation", js.undefined)
    
    @scala.inline
    def setVmCount(value: Double): Self = StObject.set(x, "vmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmCountUndefined: Self = StObject.set(x, "vmCount", js.undefined)
  }
}
