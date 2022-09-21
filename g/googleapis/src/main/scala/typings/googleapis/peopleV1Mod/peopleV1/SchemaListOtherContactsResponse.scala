package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListOtherContactsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token.
    */
  var nextSyncToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of "Other contacts" returned as Person resources. "Other contacts" support a limited subset of fields. See ListOtherContactsRequest.request_mask for more detailed information.
    */
  var otherContacts: js.UndefOr[js.Array[SchemaPerson]] = js.undefined
  
  /**
    * The total number of other contacts in the list without pagination.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListOtherContactsResponse {
  
  inline def apply(): SchemaListOtherContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOtherContactsResponse]
  }
  
  extension [Self <: SchemaListOtherContactsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenNull: Self = StObject.set(x, "nextSyncToken", null)
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setOtherContacts(value: js.Array[SchemaPerson]): Self = StObject.set(x, "otherContacts", value.asInstanceOf[js.Any])
    
    inline def setOtherContactsUndefined: Self = StObject.set(x, "otherContacts", js.undefined)
    
    inline def setOtherContactsVarargs(value: SchemaPerson*): Self = StObject.set(x, "otherContacts", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
