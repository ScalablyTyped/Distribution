package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest extends StObject {
  
  /** Required. Example format: accounts/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaDeleteUserLinkRequestMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
