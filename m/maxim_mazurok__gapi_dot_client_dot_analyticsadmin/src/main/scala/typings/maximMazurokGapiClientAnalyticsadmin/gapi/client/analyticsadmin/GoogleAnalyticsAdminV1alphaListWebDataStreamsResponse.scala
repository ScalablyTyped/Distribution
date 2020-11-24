package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse extends js.Object {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Results that matched the filter criteria and were accessible to the caller. */
  var webDataStreams: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaWebDataStream]] = js.native
}
object GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListWebDataStreamsResponseOps[Self <: GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setWebDataStreamsVarargs(value: GoogleAnalyticsAdminV1alphaWebDataStream*): Self = this.set("webDataStreams", js.Array(value :_*))
    
    @scala.inline
    def setWebDataStreams(value: js.Array[GoogleAnalyticsAdminV1alphaWebDataStream]): Self = this.set("webDataStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebDataStreams: Self = this.set("webDataStreams", js.undefined)
  }
}
