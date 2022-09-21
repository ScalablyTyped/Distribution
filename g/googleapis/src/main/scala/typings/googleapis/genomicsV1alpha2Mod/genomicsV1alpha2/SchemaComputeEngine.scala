package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeEngine extends StObject {
  
  /**
    * The names of the disks that were created for this pipeline.
    */
  var diskNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The instance on which the operation is running.
    */
  var instanceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine type of the instance.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The availability zone in which the instance resides.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputeEngine {
  
  inline def apply(): SchemaComputeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeEngine]
  }
  
  extension [Self <: SchemaComputeEngine](x: Self) {
    
    inline def setDiskNames(value: js.Array[String]): Self = StObject.set(x, "diskNames", value.asInstanceOf[js.Any])
    
    inline def setDiskNamesNull: Self = StObject.set(x, "diskNames", null)
    
    inline def setDiskNamesUndefined: Self = StObject.set(x, "diskNames", js.undefined)
    
    inline def setDiskNamesVarargs(value: String*): Self = StObject.set(x, "diskNames", js.Array(value*))
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameNull: Self = StObject.set(x, "instanceName", null)
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
