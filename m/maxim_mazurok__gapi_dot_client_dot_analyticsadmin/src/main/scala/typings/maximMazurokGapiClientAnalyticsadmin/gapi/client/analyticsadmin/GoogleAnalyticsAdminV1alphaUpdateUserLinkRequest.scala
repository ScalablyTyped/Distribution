package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest extends js.Object {
  
  /** Required. The user link to update. */
  var userLink: js.UndefOr[GoogleAnalyticsAdminV1alphaUserLink] = js.native
}
object GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaUpdateUserLinkRequestOps[Self <: GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest] (val x: Self) extends AnyVal {
    
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
    def setUserLink(value: GoogleAnalyticsAdminV1alphaUserLink): Self = this.set("userLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLink: Self = this.set("userLink", js.undefined)
  }
}
