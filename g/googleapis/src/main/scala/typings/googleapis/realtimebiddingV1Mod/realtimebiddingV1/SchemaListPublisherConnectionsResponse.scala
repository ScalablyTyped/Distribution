package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPublisherConnectionsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListPublisherConnectionsRequest.pageToken field in the subsequent call to the `ListPublisherConnections` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of publisher connections.
    */
  var publisherConnections: js.UndefOr[js.Array[SchemaPublisherConnection]] = js.undefined
}
object SchemaListPublisherConnectionsResponse {
  
  inline def apply(): SchemaListPublisherConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherConnectionsResponse]
  }
  
  extension [Self <: SchemaListPublisherConnectionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPublisherConnections(value: js.Array[SchemaPublisherConnection]): Self = StObject.set(x, "publisherConnections", value.asInstanceOf[js.Any])
    
    inline def setPublisherConnectionsUndefined: Self = StObject.set(x, "publisherConnections", js.undefined)
    
    inline def setPublisherConnectionsVarargs(value: SchemaPublisherConnection*): Self = StObject.set(x, "publisherConnections", js.Array(value*))
  }
}
