package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse extends StObject {
  
  /** List of FirebaseLinks. This will have at most one value. */
  var firebaseLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]] = js.native
}
object GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListFirebaseLinksResponseMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirebaseLinks(value: js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]): Self = StObject.set(x, "firebaseLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirebaseLinksUndefined: Self = StObject.set(x, "firebaseLinks", js.undefined)
    
    @scala.inline
    def setFirebaseLinksVarargs(value: GoogleAnalyticsAdminV1alphaFirebaseLink*): Self = StObject.set(x, "firebaseLinks", js.Array(value :_*))
  }
}
