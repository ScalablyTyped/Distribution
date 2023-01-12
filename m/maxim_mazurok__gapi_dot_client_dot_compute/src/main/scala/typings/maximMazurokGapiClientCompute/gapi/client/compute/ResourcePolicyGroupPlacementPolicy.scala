package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyGroupPlacementPolicy extends StObject {
  
  /** The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network */
  var availabilityDomainCount: js.UndefOr[Double] = js.undefined
  
  /** Specifies network collocation */
  var collocation: js.UndefOr[String] = js.undefined
  
  /** Number of vms in this placement group */
  var vmCount: js.UndefOr[Double] = js.undefined
}
object ResourcePolicyGroupPlacementPolicy {
  
  inline def apply(): ResourcePolicyGroupPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyGroupPlacementPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicyGroupPlacementPolicy] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityDomainCount(value: Double): Self = StObject.set(x, "availabilityDomainCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDomainCountUndefined: Self = StObject.set(x, "availabilityDomainCount", js.undefined)
    
    inline def setCollocation(value: String): Self = StObject.set(x, "collocation", value.asInstanceOf[js.Any])
    
    inline def setCollocationUndefined: Self = StObject.set(x, "collocation", js.undefined)
    
    inline def setVmCount(value: Double): Self = StObject.set(x, "vmCount", value.asInstanceOf[js.Any])
    
    inline def setVmCountUndefined: Self = StObject.set(x, "vmCount", js.undefined)
  }
}
