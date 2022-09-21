package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerAssignedEvent extends StObject {
  
  /**
    * The worker's instance name.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The machine type that was assigned for the worker.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The zone the worker is running in.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerAssignedEvent {
  
  inline def apply(): SchemaWorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerAssignedEvent]
  }
  
  extension [Self <: SchemaWorkerAssignedEvent](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
