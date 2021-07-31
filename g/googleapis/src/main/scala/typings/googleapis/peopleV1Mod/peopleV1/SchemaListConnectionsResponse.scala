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
    * The token that can be used to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The token that can be used to retrieve changes since the last request.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the list without pagination.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
  
  /**
    * **DEPRECATED** (Please use totalItems) The total number of people in the
    * list without pagination.
    */
  var totalPeople: js.UndefOr[Double] = js.undefined
}
object SchemaListConnectionsResponse {
  
  @scala.inline
  def apply(): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListConnectionsResponseMutableBuilder[Self <: SchemaListConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[SchemaPerson]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: SchemaPerson*): Self = StObject.set(x, "connections", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    @scala.inline
    def setTotalPeople(value: Double): Self = StObject.set(x, "totalPeople", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPeopleUndefined: Self = StObject.set(x, "totalPeople", js.undefined)
  }
}
