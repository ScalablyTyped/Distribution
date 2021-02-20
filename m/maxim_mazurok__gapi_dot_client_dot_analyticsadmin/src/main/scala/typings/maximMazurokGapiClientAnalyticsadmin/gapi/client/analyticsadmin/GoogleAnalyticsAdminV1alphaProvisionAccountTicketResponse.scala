package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse extends StObject {
  
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
  implicit class GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountTicketId(value: String): Self = StObject.set(x, "accountTicketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTicketIdUndefined: Self = StObject.set(x, "accountTicketId", js.undefined)
  }
}
