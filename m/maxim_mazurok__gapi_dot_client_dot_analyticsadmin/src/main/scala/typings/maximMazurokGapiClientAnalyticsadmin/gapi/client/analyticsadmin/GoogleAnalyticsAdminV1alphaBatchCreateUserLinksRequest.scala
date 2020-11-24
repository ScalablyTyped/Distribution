package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest extends js.Object {
  
  /**
    * Optional. If set, then email the new users notifying them that they've been granted permissions to the resource. Regardless of whether this is set or not, notify_new_user field
    * inside each individual request is ignored.
    */
  var notifyNewUsers: js.UndefOr[Boolean] = js.native
  
  /** Required. The requests specifying the user links to create. A maximum of 1000 user links can be created in a batch. */
  var requests: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequestOps[Self <: GoogleAnalyticsAdminV1alphaBatchCreateUserLinksRequest] (val x: Self) extends AnyVal {
    
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
    def setNotifyNewUsers(value: Boolean): Self = this.set("notifyNewUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyNewUsers: Self = this.set("notifyNewUsers", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: GoogleAnalyticsAdminV1alphaCreateUserLinkRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
