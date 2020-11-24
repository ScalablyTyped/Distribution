package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRequest extends js.Object {
  
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
  implicit class SearchRequestOps[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
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
    def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = this.set("dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = this.set("dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceRestrictions: Self = this.set("dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setFacetOptionsVarargs(value: FacetOptions*): Self = this.set("facetOptions", js.Array(value :_*))
    
    @scala.inline
    def setFacetOptions(value: js.Array[FacetOptions]): Self = this.set("facetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetOptions: Self = this.set("facetOptions", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryInterpretationOptions(value: QueryInterpretationOptions): Self = this.set("queryInterpretationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInterpretationOptions: Self = this.set("queryInterpretationOptions", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    
    @scala.inline
    def setSortOptions(value: SortOptions): Self = this.set("sortOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOptions: Self = this.set("sortOptions", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
