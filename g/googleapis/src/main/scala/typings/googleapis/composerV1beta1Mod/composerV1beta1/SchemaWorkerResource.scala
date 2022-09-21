package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerResource extends StObject {
  
  /**
    * Optional. CPU request and limit for a single Airflow worker replica.
    */
  var cpu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Maximum number of workers for autoscaling.
    */
  var maxCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Memory (GB) request and limit for a single Airflow worker replica.
    */
  var memoryGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Minimum number of workers for autoscaling.
    */
  var minCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Storage (GB) request and limit for a single Airflow worker replica.
    */
  var storageGb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWorkerResource {
  
  inline def apply(): SchemaWorkerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerResource]
  }
  
  extension [Self <: SchemaWorkerResource](x: Self) {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuNull: Self = StObject.set(x, "cpu", null)
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountNull: Self = StObject.set(x, "maxCount", null)
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbNull: Self = StObject.set(x, "memoryGb", null)
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setMinCount(value: Double): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
    
    inline def setMinCountNull: Self = StObject.set(x, "minCount", null)
    
    inline def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbNull: Self = StObject.set(x, "storageGb", null)
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
