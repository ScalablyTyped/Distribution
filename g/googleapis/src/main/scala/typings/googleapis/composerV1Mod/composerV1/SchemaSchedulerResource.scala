package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulerResource extends StObject {
  
  /**
    * Optional. The number of schedulers.
    */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. CPU request and limit for a single Airflow scheduler replica.
    */
  var cpu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
    */
  var memoryGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
    */
  var storageGb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSchedulerResource {
  
  inline def apply(): SchemaSchedulerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulerResource]
  }
  
  extension [Self <: SchemaSchedulerResource](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuNull: Self = StObject.set(x, "cpu", null)
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbNull: Self = StObject.set(x, "memoryGb", null)
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbNull: Self = StObject.set(x, "storageGb", null)
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
