package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerResource extends StObject {
  
  /** Optional. The number of schedulers. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Optional. CPU request and limit for a single Airflow scheduler replica. */
  var cpu: js.UndefOr[Double] = js.undefined
  
  /** Optional. Memory (GB) request and limit for a single Airflow scheduler replica. */
  var memoryGb: js.UndefOr[Double] = js.undefined
  
  /** Optional. Storage (GB) request and limit for a single Airflow scheduler replica. */
  var storageGb: js.UndefOr[Double] = js.undefined
}
object SchedulerResource {
  
  inline def apply(): SchedulerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerResource] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
