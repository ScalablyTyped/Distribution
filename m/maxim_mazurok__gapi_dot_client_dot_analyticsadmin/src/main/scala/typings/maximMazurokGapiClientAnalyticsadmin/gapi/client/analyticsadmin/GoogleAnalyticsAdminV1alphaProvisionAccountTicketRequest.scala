package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest extends js.Object {
  
  /** The account to create. */
  var account: js.UndefOr[GoogleAnalyticsAdminV1alphaAccount] = js.native
  
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in Developers Console as a Redirect URI */
  var redirectUri: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequestOps[Self <: GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: GoogleAnalyticsAdminV1alphaAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
  }
}
