package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEkmConnectionsResponse extends StObject {
  
  /** The list of EkmConnections. */
  var ekmConnections: js.UndefOr[js.Array[EkmConnection]] = js.undefined
  
  /** A token to retrieve next page of results. Pass this value in ListEkmConnectionsRequest.page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of EkmConnections that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListEkmConnectionsResponse {
  
  inline def apply(): ListEkmConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEkmConnectionsResponse]
  }
  
  extension [Self <: ListEkmConnectionsResponse](x: Self) {
    
    inline def setEkmConnections(value: js.Array[EkmConnection]): Self = StObject.set(x, "ekmConnections", value.asInstanceOf[js.Any])
    
    inline def setEkmConnectionsUndefined: Self = StObject.set(x, "ekmConnections", js.undefined)
    
    inline def setEkmConnectionsVarargs(value: EkmConnection*): Self = StObject.set(x, "ekmConnections", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
