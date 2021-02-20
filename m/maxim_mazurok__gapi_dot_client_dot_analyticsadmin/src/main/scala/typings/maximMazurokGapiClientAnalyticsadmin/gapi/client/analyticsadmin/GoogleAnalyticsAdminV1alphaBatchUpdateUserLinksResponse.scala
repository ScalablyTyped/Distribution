package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse extends StObject {
  
  /** The user links updated. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaUserLink]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaBatchUpdateUserLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    @scala.inline
    def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaUserLink*): Self = StObject.set(x, "userLinks", js.Array(value :_*))
  }
}
