package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * Allows the TPU node to send and receive packets with non-matching destination or source IPs. This is required if you plan to use the TPU workers to forward routes.
    */
  var canIpForward: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates that external IP addresses would be associated with the TPU workers. If set to false, the specified subnetwork or network should have Private Google Access enabled.
    */
  var enableExternalIps: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the network for the TPU node. It must be a preexisting Google Compute Engine network. If none is provided, "default" will be used.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the subnetwork for the TPU node. It must be a preexisting Google Compute Engine subnetwork. If none is provided, "default" will be used.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setCanIpForward(value: Boolean): Self = StObject.set(x, "canIpForward", value.asInstanceOf[js.Any])
    
    inline def setCanIpForwardNull: Self = StObject.set(x, "canIpForward", null)
    
    inline def setCanIpForwardUndefined: Self = StObject.set(x, "canIpForward", js.undefined)
    
    inline def setEnableExternalIps(value: Boolean): Self = StObject.set(x, "enableExternalIps", value.asInstanceOf[js.Any])
    
    inline def setEnableExternalIpsNull: Self = StObject.set(x, "enableExternalIps", null)
    
    inline def setEnableExternalIpsUndefined: Self = StObject.set(x, "enableExternalIps", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
