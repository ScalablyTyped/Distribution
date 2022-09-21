package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkInterface extends StObject {
  
  /**
    * The external IP to define in the NIC.
    */
  var externalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a named address resource full path.
    */
  var internalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network to connect the NIC to.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subnetwork to connect the NIC to.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkInterface {
  
  inline def apply(): SchemaNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInterface]
  }
  
  extension [Self <: SchemaNetworkInterface](x: Self) {
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpNull: Self = StObject.set(x, "externalIp", null)
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpNull: Self = StObject.set(x, "internalIp", null)
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
