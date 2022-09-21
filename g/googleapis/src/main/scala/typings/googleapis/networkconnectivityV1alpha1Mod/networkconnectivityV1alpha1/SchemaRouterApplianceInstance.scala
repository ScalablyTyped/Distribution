package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterApplianceInstance extends StObject {
  
  /**
    * The IP address of the network interface to use for peering.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  var networkInterface: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the virtual machine resource
    */
  var virtualMachine: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterApplianceInstance {
  
  inline def apply(): SchemaRouterApplianceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterApplianceInstance]
  }
  
  extension [Self <: SchemaRouterApplianceInstance](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setNetworkInterface(value: String): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceNull: Self = StObject.set(x, "networkInterface", null)
    
    inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
    
    inline def setVirtualMachine(value: String): Self = StObject.set(x, "virtualMachine", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineNull: Self = StObject.set(x, "virtualMachine", null)
    
    inline def setVirtualMachineUndefined: Self = StObject.set(x, "virtualMachine", js.undefined)
  }
}
