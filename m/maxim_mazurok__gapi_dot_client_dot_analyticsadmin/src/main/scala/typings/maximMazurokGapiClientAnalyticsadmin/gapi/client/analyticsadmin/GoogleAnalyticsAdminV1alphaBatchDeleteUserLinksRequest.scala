package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest extends js.Object {
  
  /** Required. The requests specifying the user links to update. A maximum of 1000 user links can be updated in a batch. */
  var requests: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequestOps[Self <: GoogleAnalyticsAdminV1alphaBatchDeleteUserLinksRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestsVarargs(value: GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
