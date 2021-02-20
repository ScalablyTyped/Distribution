package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search API request.
  */
@js.native
trait SchemaSearchRequest extends StObject {
  
  /**
    * The sources to use for querying. If not specified, all data sources from
    * the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  
  var facetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.native
  
  /**
    * Maximum number of search results to return in one page. Valid values are
    * between 1 and 100, inclusive. Default value is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The raw query string. See supported search operators in the [Cloud search
    * Cheat
    * Sheet](https://gsuite.google.com/learning-center/products/cloudsearch/cheat-sheet/)
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Options to interpret the user query.
    */
  var queryInterpretationOptions: js.UndefOr[SchemaQueryInterpretationOptions] = js.native
  
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
  
  /**
    * The options for sorting the search results
    */
  var sortOptions: js.UndefOr[SchemaSortOptions] = js.native
  
  /**
    * Starting index of the results.
    */
  var start: js.UndefOr[Double] = js.native
}
object SchemaSearchRequest {
  
  @scala.inline
  def apply(): SchemaSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchRequestMutableBuilder[Self <: SchemaSearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setFacetOptions(value: js.Array[SchemaFacetOptions]): Self = StObject.set(x, "facetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetOptionsUndefined: Self = StObject.set(x, "facetOptions", js.undefined)
    
    @scala.inline
    def setFacetOptionsVarargs(value: SchemaFacetOptions*): Self = StObject.set(x, "facetOptions", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInterpretationOptions(value: SchemaQueryInterpretationOptions): Self = StObject.set(x, "queryInterpretationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInterpretationOptionsUndefined: Self = StObject.set(x, "queryInterpretationOptions", js.undefined)
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    @scala.inline
    def setSortOptions(value: SchemaSortOptions): Self = StObject.set(x, "sortOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOptionsUndefined: Self = StObject.set(x, "sortOptions", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
