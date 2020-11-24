package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeCapacityCommitmentsRequest extends js.Object {
  
  /**
    * Ids of capacity commitments to merge. These capacity commitments must exist under admin project and location specified in the parent. ID is the last portion of capacity commitment
    * name e.g., 'abc' for projects/myproject/locations/US/capacityCommitments/abc
    */
  var capacityCommitmentIds: js.UndefOr[js.Array[String]] = js.native
}
object MergeCapacityCommitmentsRequest {
  
  @scala.inline
  def apply(): MergeCapacityCommitmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCapacityCommitmentsRequest]
  }
  
  @scala.inline
  implicit class MergeCapacityCommitmentsRequestOps[Self <: MergeCapacityCommitmentsRequest] (val x: Self) extends AnyVal {
    
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
    def setCapacityCommitmentIdsVarargs(value: String*): Self = this.set("capacityCommitmentIds", js.Array(value :_*))
    
    @scala.inline
    def setCapacityCommitmentIds(value: js.Array[String]): Self = this.set("capacityCommitmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityCommitmentIds: Self = this.set("capacityCommitmentIds", js.undefined)
  }
}
