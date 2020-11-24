package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestRequest extends js.Object {
  
  /**
    * The sources to use for suggestions. If not specified, the data sources are taken from the current search application. NOTE: Suggestions are supported only for third party data
    * sources and people (i.e. PredefinedSource.PERSON).
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.native
  
  /** Partial query for which autocomplete suggestions will be shown. For example, if the query is "sea", then the server might return "season", "search", "seagull" and so on. */
  var query: js.UndefOr[String] = js.native
  
  /** Request options, such as the search application and user timezone. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
}
object SuggestRequest {
  
  @scala.inline
  def apply(): SuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestRequest]
  }
  
  @scala.inline
  implicit class SuggestRequestOps[Self <: SuggestRequest] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
}
