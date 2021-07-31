package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestRequest extends StObject {
  
  /**
    * The sources to use for suggestions. If not specified, the data sources are taken from the current search application. NOTE: Suggestions are supported only for third party data
    * sources and people (i.e. PredefinedSource.PERSON).
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.undefined
  
  /** Partial query for which autocomplete suggestions will be shown. For example, if the query is "sea", then the server might return "season", "search", "seagull" and so on. */
  var query: js.UndefOr[String] = js.undefined
  
  /** Request options, such as the search application and user timezone. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}
object SuggestRequest {
  
  @scala.inline
  def apply(): SuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestRequest]
  }
  
  @scala.inline
  implicit class SuggestRequestMutableBuilder[Self <: SuggestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
