package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCapacityCommitmentsResponse extends StObject {
  
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
  implicit class ListCapacityCommitmentsResponseMutableBuilder[Self <: ListCapacityCommitmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityCommitments(value: js.Array[CapacityCommitment]): Self = StObject.set(x, "capacityCommitments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityCommitmentsUndefined: Self = StObject.set(x, "capacityCommitments", js.undefined)
    
    @scala.inline
    def setCapacityCommitmentsVarargs(value: CapacityCommitment*): Self = StObject.set(x, "capacityCommitments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
