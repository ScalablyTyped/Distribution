package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1SearchCatalogRequest extends StObject {
  
  /**
    * Specifies the order of results. Currently supported case-sensitive values are: * `relevance` that can only be descending * `last_modified_timestamp [asc|desc]` with descending
    * (`desc`) as default * `default` that can only be descending If this parameter is omitted, it defaults to the descending `relevance`.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Number of results to return in a single search page. Can't be negative or 0, defaults to 10 in this case. The maximum number is 1000. If exceeded, throws an "invalid argument"
    * exception.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Pagination token that, if specified, returns the next page of search results. If empty, returns the first page. This token is returned in the
    * SearchCatalogResponse.next_page_token field of the response to a previous SearchCatalogRequest call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The query string with a minimum of 3 characters and specific syntax. For more information, see [Data Catalog search
    * syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference). An empty query string returns all data assets (in the specified scope) that you have access to. A query
    * string can be a simple `xyz` or qualified by predicates: * `name:x` * `column:y` * `description:z`
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The scope of this search request. The `scope` is invalid if `include_org_ids`, `include_project_ids` are empty AND `include_gcp_public_datasets` is set to `false`. In this
    * case, the request returns an error.
    */
  var scope: js.UndefOr[GoogleCloudDatacatalogV1SearchCatalogRequestScope] = js.undefined
}
object GoogleCloudDatacatalogV1SearchCatalogRequest {
  
  inline def apply(): GoogleCloudDatacatalogV1SearchCatalogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1SearchCatalogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1SearchCatalogRequest] (val x: Self) extends AnyVal {
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScope(value: GoogleCloudDatacatalogV1SearchCatalogRequestScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
