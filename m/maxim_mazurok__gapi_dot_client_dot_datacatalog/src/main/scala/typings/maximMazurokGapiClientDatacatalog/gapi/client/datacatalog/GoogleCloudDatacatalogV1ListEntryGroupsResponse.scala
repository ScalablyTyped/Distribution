package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ListEntryGroupsResponse extends StObject {
  
  /** Entry group details. */
  var entryGroups: js.UndefOr[js.Array[GoogleCloudDatacatalogV1EntryGroup]] = js.undefined
  
  /** Pagination token to specify in the next call to retrieve the next page of results. Empty if there are no more items. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ListEntryGroupsResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ListEntryGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ListEntryGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ListEntryGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setEntryGroups(value: js.Array[GoogleCloudDatacatalogV1EntryGroup]): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    inline def setEntryGroupsUndefined: Self = StObject.set(x, "entryGroups", js.undefined)
    
    inline def setEntryGroupsVarargs(value: GoogleCloudDatacatalogV1EntryGroup*): Self = StObject.set(x, "entryGroups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
