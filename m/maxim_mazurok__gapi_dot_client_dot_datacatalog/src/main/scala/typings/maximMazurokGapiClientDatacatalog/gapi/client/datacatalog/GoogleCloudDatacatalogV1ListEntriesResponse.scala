package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ListEntriesResponse extends StObject {
  
  /** Entry details. */
  var entries: js.UndefOr[js.Array[GoogleCloudDatacatalogV1Entry]] = js.undefined
  
  /** Pagination token of the next results page. Empty if there are no more items in results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1ListEntriesResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ListEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ListEntriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1ListEntriesResponse] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[GoogleCloudDatacatalogV1Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: GoogleCloudDatacatalogV1Entry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
