package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ListEntryGroupsResponse extends StObject {
  
  /**
    * EntryGroup details.
    */
  var entryGroups: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1EntryGroup]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. It is set to empty if no items remain in results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ListEntryGroupsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ListEntryGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ListEntryGroupsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ListEntryGroupsResponse](x: Self) {
    
    inline def setEntryGroups(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1EntryGroup]): Self = StObject.set(x, "entryGroups", value.asInstanceOf[js.Any])
    
    inline def setEntryGroupsUndefined: Self = StObject.set(x, "entryGroups", js.undefined)
    
    inline def setEntryGroupsVarargs(value: SchemaGoogleCloudDatacatalogV1beta1EntryGroup*): Self = StObject.set(x, "entryGroups", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
