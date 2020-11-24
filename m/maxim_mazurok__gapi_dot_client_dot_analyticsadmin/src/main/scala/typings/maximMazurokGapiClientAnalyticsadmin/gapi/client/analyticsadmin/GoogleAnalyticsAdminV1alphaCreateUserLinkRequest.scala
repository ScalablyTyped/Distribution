package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaCreateUserLinkRequest extends js.Object {
  
  /** Optional. If set, then email the new user notifying them that they've been granted permissions to the resource. */
  var notifyNewUser: js.UndefOr[Boolean] = js.native
  
  /** Required. Example format: accounts/1234 */
  var parent: js.UndefOr[String] = js.native
  
  /** Required. The user link to create. */
  var userLink: js.UndefOr[GoogleAnalyticsAdminV1alphaUserLink] = js.native
}
object GoogleAnalyticsAdminV1alphaCreateUserLinkRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaCreateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaCreateUserLinkRequestOps[Self <: GoogleAnalyticsAdminV1alphaCreateUserLinkRequest] (val x: Self) extends AnyVal {
    
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
    def setNotifyNewUser(value: Boolean): Self = this.set("notifyNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyNewUser: Self = this.set("notifyNewUser", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setUserLink(value: GoogleAnalyticsAdminV1alphaUserLink): Self = this.set("userLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLink: Self = this.set("userLink", js.undefined)
  }
}
