package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse extends StObject {
  
  /**
    * List of FirebaseLinks. This will have at most one value.
    */
  var firebaseLinks: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. Currently, Google Analytics supports only one FirebaseLink per property, so this will never be populated.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse](x: Self) {
    
    inline def setFirebaseLinks(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]): Self = StObject.set(x, "firebaseLinks", value.asInstanceOf[js.Any])
    
    inline def setFirebaseLinksUndefined: Self = StObject.set(x, "firebaseLinks", js.undefined)
    
    inline def setFirebaseLinksVarargs(value: SchemaGoogleAnalyticsAdminV1alphaFirebaseLink*): Self = StObject.set(x, "firebaseLinks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
