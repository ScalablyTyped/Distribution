package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRequest extends StObject {
  
  /** The sources to use for querying. If not specified, all data sources from the current search application are used. */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.native
  
  var facetOptions: js.UndefOr[js.Array[FacetOptions]] = js.native
  
  /**
    * Maximum number of search results to return in one page. Valid values are between 1 and 100, inclusive. Default value is 10. Minimum value is 50 when results beyond 2000 are
    * requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The raw query string. See supported search operators in the [Cloud search Cheat Sheet](https://support.google.com/a/users/answer/9299929) */
  var query: js.UndefOr[String] = js.native
  
  /** Options to interpret the user query. */
  var queryInterpretationOptions: js.UndefOr[QueryInterpretationOptions] = js.native
  
  /** Request options, such as the search application and user timezone. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
  
  /** The options for sorting the search results */
  var sortOptions: js.UndefOr[SortOptions] = js.native
  
  /** Starting index of the results. */
  var start: js.UndefOr[Double] = js.native
}
object SearchRequest {
  
  @scala.inline
  def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  @scala.inline
  implicit class SearchRequestMutableBuilder[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setFacetOptions(value: js.Array[FacetOptions]): Self = StObject.set(x, "facetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetOptionsUndefined: Self = StObject.set(x, "facetOptions", js.undefined)
    
    @scala.inline
    def setFacetOptionsVarargs(value: FacetOptions*): Self = StObject.set(x, "facetOptions", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInterpretationOptions(value: QueryInterpretationOptions): Self = StObject.set(x, "queryInterpretationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInterpretationOptionsUndefined: Self = StObject.set(x, "queryInterpretationOptions", js.undefined)
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setSortOptions(value: SortOptions): Self = StObject.set(x, "sortOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOptionsUndefined: Self = StObject.set(x, "sortOptions", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
