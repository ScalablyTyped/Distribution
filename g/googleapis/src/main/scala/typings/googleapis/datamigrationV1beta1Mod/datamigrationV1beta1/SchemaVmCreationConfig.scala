package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmCreationConfig extends StObject {
  
  /**
    * The subnet name the vm needs to be created in.
    */
  var subnet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. VM instance machine type to create.
    */
  var vmMachineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google Cloud Platform zone to create the VM in.
    */
  var vmZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmCreationConfig {
  
  inline def apply(): SchemaVmCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmCreationConfig]
  }
  
  extension [Self <: SchemaVmCreationConfig](x: Self) {
    
    inline def setSubnet(value: String): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetNull: Self = StObject.set(x, "subnet", null)
    
    inline def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    inline def setVmMachineType(value: String): Self = StObject.set(x, "vmMachineType", value.asInstanceOf[js.Any])
    
    inline def setVmMachineTypeNull: Self = StObject.set(x, "vmMachineType", null)
    
    inline def setVmMachineTypeUndefined: Self = StObject.set(x, "vmMachineType", js.undefined)
    
    inline def setVmZone(value: String): Self = StObject.set(x, "vmZone", value.asInstanceOf[js.Any])
    
    inline def setVmZoneNull: Self = StObject.set(x, "vmZone", null)
    
    inline def setVmZoneUndefined: Self = StObject.set(x, "vmZone", js.undefined)
  }
}
