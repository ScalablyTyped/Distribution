package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Input only.  A request for the
  * `GetHistogram` method.
  */
@js.native
trait SchemaGetHistogramRequest extends StObject {
  
  /**
    * Optional.  Controls whether to broaden the search to avoid too few
    * results for a given query in instances where a search has sparse results.
    * Results from a broadened query is a superset of the results from the
    * original query.  Defaults to false.
    */
  var allowBroadening: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the histogram.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  
  /**
    * Meta information, such as `user_id`, collected from the job searcher or
    * other entity conducting a job search, is used to improve the
    * service&#39;s search quality. Users determine identifier values, which
    * must be unique and consist.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  
  /**
    * Required.  A list of facets that specify the histogram data to be
    * calculated against and returned.  Histogram response times can be slow,
    * and counts can be approximations. This call may be temporarily or
    * permanently removed prior to the production release of Cloud Talent
    * Solution.
    */
  var searchTypes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGetHistogramRequest {
  
  @scala.inline
  def apply(): SchemaGetHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetHistogramRequest]
  }
  
  @scala.inline
  implicit class SchemaGetHistogramRequestMutableBuilder[Self <: SchemaGetHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowBroadening(value: Boolean): Self = StObject.set(x, "allowBroadening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBroadeningUndefined: Self = StObject.set(x, "allowBroadening", js.undefined)
    
    @scala.inline
    def setFilters(value: SchemaJobFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaJobQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequestMetadata(value: SchemaRequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    @scala.inline
    def setSearchTypes(value: js.Array[String]): Self = StObject.set(x, "searchTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTypesUndefined: Self = StObject.set(x, "searchTypes", js.undefined)
    
    @scala.inline
    def setSearchTypesVarargs(value: String*): Self = StObject.set(x, "searchTypes", js.Array(value :_*))
  }
}
