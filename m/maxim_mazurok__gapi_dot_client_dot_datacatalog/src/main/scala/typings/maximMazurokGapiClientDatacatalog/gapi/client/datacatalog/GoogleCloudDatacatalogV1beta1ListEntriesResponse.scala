package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1ListEntriesResponse extends StObject {
  
  /** Entry details. */
  var entries: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Entry]] = js.undefined
  
  /** Token to retrieve the next page of results. It is set to empty if no items remain in results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1ListEntriesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListEntriesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListEntriesResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1ListEntriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[GoogleCloudDatacatalogV1beta1Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: GoogleCloudDatacatalogV1beta1Entry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
