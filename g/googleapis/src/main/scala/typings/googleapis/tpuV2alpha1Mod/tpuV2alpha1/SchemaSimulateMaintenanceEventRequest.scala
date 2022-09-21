package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSimulateMaintenanceEventRequest extends StObject {
  
  /**
    * The 0-based worker ID. If it is empty, worker ID 0 will be selected for maintenance event simulation. A maintenance event will only be fired on the first specified worker ID. Future implementations may support firing on multiple workers.
    */
  var workerIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSimulateMaintenanceEventRequest {
  
  inline def apply(): SchemaSimulateMaintenanceEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimulateMaintenanceEventRequest]
  }
  
  extension [Self <: SchemaSimulateMaintenanceEventRequest](x: Self) {
    
    inline def setWorkerIds(value: js.Array[String]): Self = StObject.set(x, "workerIds", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdsNull: Self = StObject.set(x, "workerIds", null)
    
    inline def setWorkerIdsUndefined: Self = StObject.set(x, "workerIds", js.undefined)
    
    inline def setWorkerIdsVarargs(value: String*): Self = StObject.set(x, "workerIds", js.Array(value*))
  }
}
