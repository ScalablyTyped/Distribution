package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmEndpointNatMappings extends StObject {
  
  /** Name of the VM instance which the endpoint belongs to */
  var instanceName: js.UndefOr[String] = js.undefined
  
  var interfaceNatMappings: js.UndefOr[js.Array[VmEndpointNatMappingsInterfaceNatMappings]] = js.undefined
}
object VmEndpointNatMappings {
  
  inline def apply(): VmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmEndpointNatMappings]
  }
  
  extension [Self <: VmEndpointNatMappings](x: Self) {
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setInterfaceNatMappings(value: js.Array[VmEndpointNatMappingsInterfaceNatMappings]): Self = StObject.set(x, "interfaceNatMappings", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNatMappingsUndefined: Self = StObject.set(x, "interfaceNatMappings", js.undefined)
    
    inline def setInterfaceNatMappingsVarargs(value: VmEndpointNatMappingsInterfaceNatMappings*): Self = StObject.set(x, "interfaceNatMappings", js.Array(value*))
  }
}
