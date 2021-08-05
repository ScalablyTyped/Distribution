package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search API request.
  */
trait SchemaSearchRequest extends StObject {
  
  /**
    * The sources to use for querying. If not specified, all data sources from
    * the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.undefined
  
  var facetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.undefined
  
  /**
    * Maximum number of search results to return in one page. Valid values are
    * between 1 and 100, inclusive. Default value is 10.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The raw query string. See supported search operators in the [Cloud search
    * Cheat
    * Sheet](https://gsuite.google.com/learning-center/products/cloudsearch/cheat-sheet/)
    */
  var query: js.UndefOr[String] = js.undefined
  
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
  var start: js.UndefOr[Double] = js.undefined
}
object SchemaSearchRequest {
  
  inline def apply(): SchemaSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchRequest]
  }
  
  extension [Self <: SchemaSearchRequest](x: Self) {
    
    inline def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    inline def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    inline def setFacetOptions(value: js.Array[SchemaFacetOptions]): Self = StObject.set(x, "facetOptions", value.asInstanceOf[js.Any])
    
    inline def setFacetOptionsUndefined: Self = StObject.set(x, "facetOptions", js.undefined)
    
    inline def setFacetOptionsVarargs(value: SchemaFacetOptions*): Self = StObject.set(x, "facetOptions", js.Array(value :_*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationOptions(value: SchemaQueryInterpretationOptions): Self = StObject.set(x, "queryInterpretationOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationOptionsUndefined: Self = StObject.set(x, "queryInterpretationOptions", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSortOptions(value: SchemaSortOptions): Self = StObject.set(x, "sortOptions", value.asInstanceOf[js.Any])
    
    inline def setSortOptionsUndefined: Self = StObject.set(x, "sortOptions", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
