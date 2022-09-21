package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerResource extends StObject {
  
  /** Optional. CPU request and limit for a single Airflow worker replica. */
  var cpu: js.UndefOr[Double] = js.undefined
  
  /** Optional. Maximum number of workers for autoscaling. */
  var maxCount: js.UndefOr[Double] = js.undefined
  
  /** Optional. Memory (GB) request and limit for a single Airflow worker replica. */
  var memoryGb: js.UndefOr[Double] = js.undefined
  
  /** Optional. Minimum number of workers for autoscaling. */
  var minCount: js.UndefOr[Double] = js.undefined
  
  /** Optional. Storage (GB) request and limit for a single Airflow worker replica. */
  var storageGb: js.UndefOr[Double] = js.undefined
}
object WorkerResource {
  
  inline def apply(): WorkerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerResource]
  }
  
  extension [Self <: WorkerResource](x: Self) {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setMinCount(value: Double): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
    
    inline def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
