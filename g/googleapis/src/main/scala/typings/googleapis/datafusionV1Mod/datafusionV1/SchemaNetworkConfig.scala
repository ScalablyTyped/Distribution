package typings.googleapis.datafusionV1Mod.datafusionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network.
    */
  var ipAllocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host project the network should specified in the form of projects/{host-project-id\}/global/networks/{network\}
    */
  var network: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setIpAllocation(value: String): Self = StObject.set(x, "ipAllocation", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationNull: Self = StObject.set(x, "ipAllocation", null)
    
    inline def setIpAllocationUndefined: Self = StObject.set(x, "ipAllocation", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
