package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfig extends StObject {
  
  /** The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range must not overlap with any other ranges used in the customer network. */
  var ipAllocation: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the network in the customer project with which the Tenant Project will be peered for executing pipelines. In case of shared VPC where the network resides in another host
    * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
    */
  var network: js.UndefOr[String] = js.undefined
}
object NetworkConfig {
  
  inline def apply(): NetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkConfig] (val x: Self) extends AnyVal {
    
    inline def setIpAllocation(value: String): Self = StObject.set(x, "ipAllocation", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationUndefined: Self = StObject.set(x, "ipAllocation", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
