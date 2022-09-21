package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVirtualMachine extends StObject {
  
  /**
    * Output only. The unique identifier of the Managed Compute Engine instance.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user-friendly name of the Managed Compute Engine instance.
    */
  var instanceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Virtual Machine configuration settings.
    */
  var virtualMachineConfig: js.UndefOr[SchemaVirtualMachineConfig] = js.undefined
}
object SchemaVirtualMachine {
  
  inline def apply(): SchemaVirtualMachine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVirtualMachine]
  }
  
  extension [Self <: SchemaVirtualMachine](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameNull: Self = StObject.set(x, "instanceName", null)
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setVirtualMachineConfig(value: SchemaVirtualMachineConfig): Self = StObject.set(x, "virtualMachineConfig", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineConfigUndefined: Self = StObject.set(x, "virtualMachineConfig", js.undefined)
  }
}
