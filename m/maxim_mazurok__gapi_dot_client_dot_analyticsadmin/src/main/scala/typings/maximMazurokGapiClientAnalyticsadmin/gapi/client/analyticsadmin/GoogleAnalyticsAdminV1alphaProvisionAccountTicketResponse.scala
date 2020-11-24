package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse extends js.Object {
  
  /** The param to be passed in the ToS link. */
  var accountTicketId: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponseOps[Self <: GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountTicketId(value: String): Self = this.set("accountTicketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountTicketId: Self = this.set("accountTicketId", js.undefined)
  }
}
