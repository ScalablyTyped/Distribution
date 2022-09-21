package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReverseSshConnectivity extends StObject {
  
  /**
    * The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
    */
  var vm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
    */
  var vmIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
    */
  var vmPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the VPC to peer with the Cloud SQL private network.
    */
  var vpc: js.UndefOr[String | Null] = js.undefined
}
object SchemaReverseSshConnectivity {
  
  inline def apply(): SchemaReverseSshConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReverseSshConnectivity]
  }
  
  extension [Self <: SchemaReverseSshConnectivity](x: Self) {
    
    inline def setVm(value: String): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
    
    inline def setVmIp(value: String): Self = StObject.set(x, "vmIp", value.asInstanceOf[js.Any])
    
    inline def setVmIpNull: Self = StObject.set(x, "vmIp", null)
    
    inline def setVmIpUndefined: Self = StObject.set(x, "vmIp", js.undefined)
    
    inline def setVmNull: Self = StObject.set(x, "vm", null)
    
    inline def setVmPort(value: Double): Self = StObject.set(x, "vmPort", value.asInstanceOf[js.Any])
    
    inline def setVmPortNull: Self = StObject.set(x, "vmPort", null)
    
    inline def setVmPortUndefined: Self = StObject.set(x, "vmPort", js.undefined)
    
    inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
    
    inline def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcNull: Self = StObject.set(x, "vpc", null)
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
