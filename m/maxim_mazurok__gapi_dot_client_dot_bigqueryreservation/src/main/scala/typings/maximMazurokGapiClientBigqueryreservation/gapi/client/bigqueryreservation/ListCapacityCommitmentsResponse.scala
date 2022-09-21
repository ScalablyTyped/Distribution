package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCapacityCommitmentsResponse extends StObject {
  
  /** List of capacity commitments visible to the user. */
  var capacityCommitments: js.UndefOr[js.Array[CapacityCommitment]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCapacityCommitmentsResponse {
  
  inline def apply(): ListCapacityCommitmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCapacityCommitmentsResponse]
  }
  
  extension [Self <: ListCapacityCommitmentsResponse](x: Self) {
    
    inline def setCapacityCommitments(value: js.Array[CapacityCommitment]): Self = StObject.set(x, "capacityCommitments", value.asInstanceOf[js.Any])
    
    inline def setCapacityCommitmentsUndefined: Self = StObject.set(x, "capacityCommitments", js.undefined)
    
    inline def setCapacityCommitmentsVarargs(value: CapacityCommitment*): Self = StObject.set(x, "capacityCommitments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
