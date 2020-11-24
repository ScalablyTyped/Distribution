package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse extends js.Object {
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var iosAppDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaIosAppDataStream]] = js.native
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponseOps[Self <: GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse] (val x: Self) extends AnyVal {
    
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
    def setIosAppDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaIosAppDataStream*): Self = this.set("iosAppDataStreams", js.Array(value :_*))
    
    @scala.inline
    def setIosAppDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaIosAppDataStream]): Self = this.set("iosAppDataStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosAppDataStreams: Self = this.set("iosAppDataStreams", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
