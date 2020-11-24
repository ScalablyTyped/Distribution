package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityCommitment extends js.Object {
  
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
  implicit class CapacityCommitmentOps[Self <: CapacityCommitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitmentEndTime(value: String): Self = this.set("commitmentEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitmentEndTime: Self = this.set("commitmentEndTime", js.undefined)
    
    @scala.inline
    def setCommitmentStartTime(value: String): Self = this.set("commitmentStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitmentStartTime: Self = this.set("commitmentStartTime", js.undefined)
    
    @scala.inline
    def setFailureStatus(value: Status): Self = this.set("failureStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureStatus: Self = this.set("failureStatus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setRenewalPlan(value: String): Self = this.set("renewalPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalPlan: Self = this.set("renewalPlan", js.undefined)
    
    @scala.inline
    def setSlotCount(value: String): Self = this.set("slotCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotCount: Self = this.set("slotCount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
