package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityCommitment extends StObject {
  
  /** Output only. The end of the current commitment period. It is applicable only for ACTIVE capacity commitments. */
  var commitmentEndTime: js.UndefOr[String] = js.native
  
  /** Output only. The start of the current commitment period. It is applicable only for ACTIVE capacity commitments. */
  var commitmentStartTime: js.UndefOr[String] = js.native
  
  /** Output only. For FAILED commitment plan, provides the reason of failure. */
  var failureStatus: js.UndefOr[Status] = js.native
  
  /** Output only. The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123` */
  var name: js.UndefOr[String] = js.native
  
  /** Capacity commitment commitment plan. */
  var plan: js.UndefOr[String] = js.native
  
  /**
    * The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only
    * applicable for ANNUAL and TRIAL commitments.
    */
  var renewalPlan: js.UndefOr[String] = js.native
  
  /** Number of slots in this commitment. */
  var slotCount: js.UndefOr[String] = js.native
  
  /** Output only. State of the commitment. */
  var state: js.UndefOr[String] = js.native
}
object CapacityCommitment {
  
  @scala.inline
  def apply(): CapacityCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityCommitment]
  }
  
  @scala.inline
  implicit class CapacityCommitmentMutableBuilder[Self <: CapacityCommitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitmentEndTime(value: String): Self = StObject.set(x, "commitmentEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentEndTimeUndefined: Self = StObject.set(x, "commitmentEndTime", js.undefined)
    
    @scala.inline
    def setCommitmentStartTime(value: String): Self = StObject.set(x, "commitmentStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentStartTimeUndefined: Self = StObject.set(x, "commitmentStartTime", js.undefined)
    
    @scala.inline
    def setFailureStatus(value: Status): Self = StObject.set(x, "failureStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureStatusUndefined: Self = StObject.set(x, "failureStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setRenewalPlan(value: String): Self = StObject.set(x, "renewalPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalPlanUndefined: Self = StObject.set(x, "renewalPlan", js.undefined)
    
    @scala.inline
    def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
