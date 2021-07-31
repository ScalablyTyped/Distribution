package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest extends StObject {
  
  /** Required. The user link to update. */
  var userLink: js.UndefOr[GoogleAnalyticsAdminV1alphaUserLink] = js.undefined
}
object GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaUpdateUserLinkRequestMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaUpdateUserLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserLink(value: GoogleAnalyticsAdminV1alphaUserLink): Self = StObject.set(x, "userLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLinkUndefined: Self = StObject.set(x, "userLink", js.undefined)
  }
}
