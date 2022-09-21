package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ListEntriesResponse extends StObject {
  
  /**
    * Entry details.
    */
  var entries: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1Entry]] = js.undefined
  
  /**
    * Pagination token of the next results page. Empty if there are no more items in results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ListEntriesResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ListEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ListEntriesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ListEntriesResponse](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaGoogleCloudDatacatalogV1Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaGoogleCloudDatacatalogV1Entry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
