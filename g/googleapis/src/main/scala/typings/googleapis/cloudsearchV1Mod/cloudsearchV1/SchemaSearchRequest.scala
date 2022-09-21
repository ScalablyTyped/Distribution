package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchRequest extends StObject {
  
  /**
    * Context attributes for the request which will be used to adjust ranking of search results. The maximum number of elements is 10.
    */
  var contextAttributes: js.UndefOr[js.Array[SchemaContextAttribute]] = js.undefined
  
  /**
    * The sources to use for querying. If not specified, all data sources from the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.undefined
  
  var facetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.undefined
  
  /**
    * Maximum number of search results to return in one page. Valid values are between 1 and 100, inclusive. Default value is 10. Minimum value is 50 when results beyond 2000 are requested.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The raw query string. See supported search operators in the [Narrow your search with operators](https://support.google.com/cloudsearch/answer/6172299)
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options to interpret the user query.
    */
  var queryInterpretationOptions: js.UndefOr[SchemaQueryInterpretationOptions] = js.undefined
  
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.undefined
  
  /**
    * The options for sorting the search results
    */
  var sortOptions: js.UndefOr[SchemaSortOptions] = js.undefined
  
  /**
    * Starting index of the results.
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSearchRequest {
  
  inline def apply(): SchemaSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchRequest]
  }
  
  extension [Self <: SchemaSearchRequest](x: Self) {
    
    inline def setContextAttributes(value: js.Array[SchemaContextAttribute]): Self = StObject.set(x, "contextAttributes", value.asInstanceOf[js.Any])
    
    inline def setContextAttributesUndefined: Self = StObject.set(x, "contextAttributes", js.undefined)
    
    inline def setContextAttributesVarargs(value: SchemaContextAttribute*): Self = StObject.set(x, "contextAttributes", js.Array(value*))
    
    inline def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    inline def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value*))
    
    inline def setFacetOptions(value: js.Array[SchemaFacetOptions]): Self = StObject.set(x, "facetOptions", value.asInstanceOf[js.Any])
    
    inline def setFacetOptionsUndefined: Self = StObject.set(x, "facetOptions", js.undefined)
    
    inline def setFacetOptionsVarargs(value: SchemaFacetOptions*): Self = StObject.set(x, "facetOptions", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationOptions(value: SchemaQueryInterpretationOptions): Self = StObject.set(x, "queryInterpretationOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationOptionsUndefined: Self = StObject.set(x, "queryInterpretationOptions", js.undefined)
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSortOptions(value: SchemaSortOptions): Self = StObject.set(x, "sortOptions", value.asInstanceOf[js.Any])
    
    inline def setSortOptionsUndefined: Self = StObject.set(x, "sortOptions", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
