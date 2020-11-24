package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListAccountSummariesResponse extends js.Object {
  
  /** Account summaries of all accounts the caller has access to. */
  var accountSummaries: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccountSummary]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaListAccountSummariesResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListAccountSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListAccountSummariesResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListAccountSummariesResponseOps[Self <: GoogleAnalyticsAdminV1alphaListAccountSummariesResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountSummariesVarargs(value: GoogleAnalyticsAdminV1alphaAccountSummary*): Self = this.set("accountSummaries", js.Array(value :_*))
    
    @scala.inline
    def setAccountSummaries(value: js.Array[GoogleAnalyticsAdminV1alphaAccountSummary]): Self = this.set("accountSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountSummaries: Self = this.set("accountSummaries", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
