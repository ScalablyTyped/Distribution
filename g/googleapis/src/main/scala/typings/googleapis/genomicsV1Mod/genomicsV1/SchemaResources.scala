package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The system resources for the pipeline run. At least one zone or region must be specified or the pipeline run will fail.
  */
trait SchemaResources extends StObject {
  
  /**
    * The project ID to allocate resources in.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of regions allowed for VM allocation. If set, the `zones` field must not be set.
    */
  var regions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The virtual machine specification.
    */
  var virtualMachine: js.UndefOr[SchemaVirtualMachine] = js.undefined
  
  /**
    * The list of zones allowed for VM allocation. If set, the `regions` field must not be set.
    */
  var zones: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaResources {
  
  inline def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  
  extension [Self <: SchemaResources](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsNull: Self = StObject.set(x, "regions", null)
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setVirtualMachine(value: SchemaVirtualMachine): Self = StObject.set(x, "virtualMachine", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineUndefined: Self = StObject.set(x, "virtualMachine", js.undefined)
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesNull: Self = StObject.set(x, "zones", null)
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
