package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeCapacityCommitmentsRequest extends StObject {
  
  /**
    * Ids of capacity commitments to merge. These capacity commitments must exist under admin project and location specified in the parent. ID is the last portion of capacity commitment
    * name e.g., 'abc' for projects/myproject/locations/US/capacityCommitments/abc
    */
  var capacityCommitmentIds: js.UndefOr[js.Array[String]] = js.undefined
}
object MergeCapacityCommitmentsRequest {
  
  @scala.inline
  def apply(): MergeCapacityCommitmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCapacityCommitmentsRequest]
  }
  
  @scala.inline
  implicit class MergeCapacityCommitmentsRequestMutableBuilder[Self <: MergeCapacityCommitmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityCommitmentIds(value: js.Array[String]): Self = StObject.set(x, "capacityCommitmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityCommitmentIdsUndefined: Self = StObject.set(x, "capacityCommitmentIds", js.undefined)
    
    @scala.inline
    def setCapacityCommitmentIdsVarargs(value: String*): Self = StObject.set(x, "capacityCommitmentIds", js.Array(value :_*))
  }
}
