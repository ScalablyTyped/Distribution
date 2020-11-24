package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SearchCatalogResponse extends js.Object {
  
  /** The token that can be used to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Search results. */
  var results: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SearchCatalogResult]] = js.native
  
  /**
    * Unreachable locations. Search result does not include data from those locations. Users can get additional information on the error by repeating the search request with a more
    * restrictive parameter -- setting the value for `SearchDataCatalogRequest.scope.restricted_locations`.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDatacatalogV1beta1SearchCatalogResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogResponseOps[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudDatacatalogV1beta1SearchCatalogResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudDatacatalogV1beta1SearchCatalogResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
