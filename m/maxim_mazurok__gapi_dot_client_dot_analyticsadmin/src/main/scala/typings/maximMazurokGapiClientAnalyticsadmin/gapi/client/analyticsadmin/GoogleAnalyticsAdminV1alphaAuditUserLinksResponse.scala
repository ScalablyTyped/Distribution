package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaAuditUserLinksResponse extends js.Object {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of AuditUserLinks. These will be ordered stably, but in an arbitrary order. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAuditUserLink]] = js.native
}
object GoogleAnalyticsAdminV1alphaAuditUserLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaAuditUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAuditUserLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaAuditUserLinksResponseOps[Self <: GoogleAnalyticsAdminV1alphaAuditUserLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaAuditUserLink*): Self = this.set("userLinks", js.Array(value :_*))
    
    @scala.inline
    def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaAuditUserLink]): Self = this.set("userLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLinks: Self = this.set("userLinks", js.undefined)
  }
}
