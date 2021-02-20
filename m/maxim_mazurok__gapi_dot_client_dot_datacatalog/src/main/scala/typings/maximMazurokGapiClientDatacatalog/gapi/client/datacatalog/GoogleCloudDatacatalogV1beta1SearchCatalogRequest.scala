package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SearchCatalogRequest extends StObject {
  
  /**
    * Specifies the ordering of results, currently supported case-sensitive choices are: * `relevance`, only supports descending * `last_modified_timestamp [asc|desc]`, defaults to
    * descending if not specified If not specified, defaults to `relevance` descending.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /** Number of results in the search page. If <=0 then defaults to 10. Max limit for page_size is 1000. Throws an invalid argument for page_size > 1000. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Pagination token returned in an earlier SearchCatalogResponse.next_page_token, which indicates that this is a continuation of a prior SearchCatalogRequest call, and that
    * the system should return the next page of data. If empty, the first page is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Optional. The query string in search query syntax. An empty query string will result in all data assets (in the specified scope) that the user has access to. Query strings can be
    * simple as "x" or more qualified as: * name:x * column:x * description:y Note: Query tokens need to have a minimum of 3 characters for substring matching to work correctly. See [Data
    * Catalog Search Syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference) for more information.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Required. The scope of this search request. A `scope` that has empty `include_org_ids`, `include_project_ids` AND false `include_gcp_public_datasets` is considered invalid. Data
    * Catalog will return an error in such a case.
    */
  var scope: js.UndefOr[GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope] = js.native
}
object GoogleCloudDatacatalogV1beta1SearchCatalogRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SearchCatalogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SearchCatalogRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SearchCatalogRequestMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1SearchCatalogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setScope(value: GoogleCloudDatacatalogV1beta1SearchCatalogRequestScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
