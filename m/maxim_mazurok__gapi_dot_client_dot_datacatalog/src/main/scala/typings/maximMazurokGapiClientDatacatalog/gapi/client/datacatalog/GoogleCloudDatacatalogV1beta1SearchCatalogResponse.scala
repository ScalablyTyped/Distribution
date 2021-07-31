package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1SearchCatalogResponse extends StObject {
  
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Search results. */
  var results: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SearchCatalogResult]] = js.undefined
  
  /**
    * Unreachable locations. Search result does not include data from those locations. Users can get additional information on the error by repeating the search request with a more
    * restrictive parameter -- setting the value for `SearchDataCatalogRequest.scope.restricted_locations`.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1SearchCatalogResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogResponseMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudDatacatalogV1beta1SearchCatalogResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudDatacatalogV1beta1SearchCatalogResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
