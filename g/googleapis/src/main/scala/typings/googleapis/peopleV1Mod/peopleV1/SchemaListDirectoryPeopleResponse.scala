package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDirectoryPeopleResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token.
    */
  var nextSyncToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of people in the domain directory.
    */
  var people: js.UndefOr[js.Array[SchemaPerson]] = js.undefined
}
object SchemaListDirectoryPeopleResponse {
  
  inline def apply(): SchemaListDirectoryPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDirectoryPeopleResponse]
  }
  
  extension [Self <: SchemaListDirectoryPeopleResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenNull: Self = StObject.set(x, "nextSyncToken", null)
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setPeople(value: js.Array[SchemaPerson]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    inline def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    inline def setPeopleVarargs(value: SchemaPerson*): Self = StObject.set(x, "people", js.Array(value*))
  }
}
