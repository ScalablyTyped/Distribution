package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse extends StObject {
  
  /** List of FirebaseLinks. This will have at most one value. */
  var firebaseLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. Currently, Google Analytics supports only one
    * FirebaseLink per property, so this will never be populated.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] (val x: Self) extends AnyVal {
    
    inline def setFirebaseLinks(value: js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]): Self = StObject.set(x, "firebaseLinks", value.asInstanceOf[js.Any])
    
    inline def setFirebaseLinksUndefined: Self = StObject.set(x, "firebaseLinks", js.undefined)
    
    inline def setFirebaseLinksVarargs(value: GoogleAnalyticsAdminV1alphaFirebaseLink*): Self = StObject.set(x, "firebaseLinks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
