package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCapacityCommitmentsResponse extends js.Object {
  
  /** List of capacity commitments visible to the user. */
  var capacityCommitments: js.UndefOr[js.Array[CapacityCommitment]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCapacityCommitmentsResponse {
  
  @scala.inline
  def apply(): ListCapacityCommitmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCapacityCommitmentsResponse]
  }
  
  @scala.inline
  implicit class ListCapacityCommitmentsResponseOps[Self <: ListCapacityCommitmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setCapacityCommitmentsVarargs(value: CapacityCommitment*): Self = this.set("capacityCommitments", js.Array(value :_*))
    
    @scala.inline
    def setCapacityCommitments(value: js.Array[CapacityCommitment]): Self = this.set("capacityCommitments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityCommitments: Self = this.set("capacityCommitments", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
