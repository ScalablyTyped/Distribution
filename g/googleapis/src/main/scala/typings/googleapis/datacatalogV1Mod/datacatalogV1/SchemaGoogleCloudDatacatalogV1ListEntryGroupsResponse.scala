package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ListEntryGroupsResponse extends StObject {
  
  /**
    * Entry group details.
    */
  var entryGroups: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1EntryGroup]] = js.undefined
  
  /**
    * Pagination token to specify in the next call to retrieve the next page of results. Empty if there are no more items.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ListEntryGroupsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ListEntryGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ListEntryGroupsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ListEntryGroupsResponse](x: Self) {
    
    inline def setEntryGroups(value: js.Array[SchemaGoogleCloudDatacatalogV1EntryGroup]): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    inline def setEntryGroupsUndefined: Self = StObject.set(x, "entryGroups", js.undefined)
    
    inline def setEntryGroupsVarargs(value: SchemaGoogleCloudDatacatalogV1EntryGroup*): Self = StObject.set(x, "entryGroups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
