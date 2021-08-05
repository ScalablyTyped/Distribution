package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse extends StObject {
  
  /** List of FirebaseLinks. This will have at most one value. */
  var firebaseLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse](x: Self) {
    
    inline def setFirebaseLinks(value: js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]): Self = StObject.set(x, "firebaseLinks", value.asInstanceOf[js.Any])
    
    inline def setFirebaseLinksUndefined: Self = StObject.set(x, "firebaseLinks", js.undefined)
    
    inline def setFirebaseLinksVarargs(value: GoogleAnalyticsAdminV1alphaFirebaseLink*): Self = StObject.set(x, "firebaseLinks", js.Array(value :_*))
  }
}
