package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConnectionsResponse extends StObject {
  
  /**
    * The list of people that the requestor is connected to.
    */
  var connections: js.UndefOr[js.Array[SchemaPerson]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. When the response is paginated, only the last page will contain `nextSyncToken`.
    */
  var nextSyncToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of items in the list without pagination.
    */
  var totalItems: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * **DEPRECATED** (Please use totalItems) The total number of people in the list without pagination.
    */
  var totalPeople: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListConnectionsResponse {
  
  inline def apply(): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
  
  extension [Self <: SchemaListConnectionsResponse](x: Self) {
    
    inline def setConnections(value: js.Array[SchemaPerson]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: SchemaPerson*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenNull: Self = StObject.set(x, "nextSyncToken", null)
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsNull: Self = StObject.set(x, "totalItems", null)
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    inline def setTotalPeople(value: Double): Self = StObject.set(x, "totalPeople", value.asInstanceOf[js.Any])
    
    inline def setTotalPeopleNull: Self = StObject.set(x, "totalPeople", null)
    
    inline def setTotalPeopleUndefined: Self = StObject.set(x, "totalPeople", js.undefined)
  }
}
