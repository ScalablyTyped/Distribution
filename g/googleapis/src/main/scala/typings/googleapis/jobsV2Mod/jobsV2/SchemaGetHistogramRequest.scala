package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetHistogramRequest extends StObject {
  
  /**
    * Optional. Controls whether to broaden the search to avoid too few results for a given query in instances where a search has sparse results. Results from a broadened query is a superset of the results from the original query. Defaults to false.
    */
  var allowBroadening: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Deprecated. Use query instead. Optional. Restrictions on the scope of the histogram.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.undefined
  
  /**
    * Optional. Query used to search against jobs, such as keyword, location filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.undefined
  
  /**
    * Meta information, such as `user_id`, collected from the job searcher or other entity conducting a job search, is used to improve the service's search quality. Users determine identifier values, which must be unique and consist.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.undefined
  
  /**
    * Required. A list of facets that specify the histogram data to be calculated against and returned. Histogram response times can be slow, and counts can be approximations. This call may be temporarily or permanently removed prior to the production release of Cloud Talent Solution.
    */
  var searchTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGetHistogramRequest {
  
  inline def apply(): SchemaGetHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramRequest]
  }
  
  extension [Self <: SchemaGetHistogramRequest](x: Self) {
    
    inline def setAllowBroadening(value: Boolean): Self = StObject.set(x, "allowBroadening", value.asInstanceOf[js.Any])
    
    inline def setAllowBroadeningNull: Self = StObject.set(x, "allowBroadening", null)
    
    inline def setAllowBroadeningUndefined: Self = StObject.set(x, "allowBroadening", js.undefined)
    
    inline def setFilters(value: SchemaJobFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setQuery(value: SchemaJobQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestMetadata(value: SchemaRequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    inline def setSearchTypes(value: js.Array[String]): Self = StObject.set(x, "searchTypes", value.asInstanceOf[js.Any])
    
    inline def setSearchTypesNull: Self = StObject.set(x, "searchTypes", null)
    
    inline def setSearchTypesUndefined: Self = StObject.set(x, "searchTypes", js.undefined)
    
    inline def setSearchTypesVarargs(value: String*): Self = StObject.set(x, "searchTypes", js.Array(value*))
  }
}
