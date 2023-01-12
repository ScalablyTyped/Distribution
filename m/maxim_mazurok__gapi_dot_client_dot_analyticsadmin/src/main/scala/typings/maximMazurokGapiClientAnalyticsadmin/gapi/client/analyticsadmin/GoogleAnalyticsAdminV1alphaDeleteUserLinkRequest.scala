package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest extends StObject {
  
  /** Required. Example format: accounts/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaDeleteUserLinkRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
