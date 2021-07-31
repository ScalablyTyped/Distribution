package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaCreateUserLinkRequest extends StObject {
  
  /** Optional. If set, then email the new user notifying them that they've been granted permissions to the resource. */
  var notifyNewUser: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Example format: accounts/1234 */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Required. The user link to create. */
  var userLink: js.UndefOr[GoogleAnalyticsAdminV1alphaUserLink] = js.undefined
}
object GoogleAnalyticsAdminV1alphaCreateUserLinkRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaCreateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaCreateUserLinkRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaCreateUserLinkRequestMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaCreateUserLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyNewUser(value: Boolean): Self = StObject.set(x, "notifyNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyNewUserUndefined: Self = StObject.set(x, "notifyNewUser", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setUserLink(value: GoogleAnalyticsAdminV1alphaUserLink): Self = StObject.set(x, "userLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLinkUndefined: Self = StObject.set(x, "userLink", js.undefined)
  }
}
