package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestRequest extends StObject {
  
  /**
    * The sources to use for suggestions. If not specified, the data sources are taken from the current search application. NOTE: Suggestions are only supported for the following sources:
    * * Third-party data sources * PredefinedSource.PERSON * PredefinedSource.GOOGLE_DRIVE
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.undefined
  
  /** Partial query for which autocomplete suggestions will be shown. For example, if the query is "sea", then the server might return "season", "search", "seagull" and so on. */
  var query: js.UndefOr[String] = js.undefined
  
  /** Request options, such as the search application and user timezone. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}
object SuggestRequest {
  
  inline def apply(): SuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestRequest]
  }
  
  extension [Self <: SuggestRequest](x: Self) {
    
    inline def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    inline def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
