package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlotPool extends StObject {
  
  /**
    * Output only. The end of the commitment period. Slot pool cannot be removed before commitment_end_time. It is applicable only for ACTIVE slot pools and is computed as a combination of the plan and the time when the slot pool became ACTIVE.
    */
  var commitmentEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. For FAILED slot pool, provides the reason of failure.
    */
  var failureStatus: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The resource name of the slot pool, e.g., projects/myproject/locations/us-central1/reservations/myreservation/slotPools/123
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Slot pool commitment plan.
    */
  var plan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of slots in this pool.
    */
  var slotCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlotPool {
  
  inline def apply(): SchemaSlotPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlotPool]
  }
  
  extension [Self <: SchemaSlotPool](x: Self) {
    
    inline def setCommitmentEndTime(value: String): Self = StObject.set(x, "commitmentEndTime", value.asInstanceOf[js.Any])
    
    inline def setCommitmentEndTimeNull: Self = StObject.set(x, "commitmentEndTime", null)
    
    inline def setCommitmentEndTimeUndefined: Self = StObject.set(x, "commitmentEndTime", js.undefined)
    
    inline def setFailureStatus(value: SchemaStatus): Self = StObject.set(x, "failureStatus", value.asInstanceOf[js.Any])
    
    inline def setFailureStatusUndefined: Self = StObject.set(x, "failureStatus", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanNull: Self = StObject.set(x, "plan", null)
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    inline def setSlotCountNull: Self = StObject.set(x, "slotCount", null)
    
    inline def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
