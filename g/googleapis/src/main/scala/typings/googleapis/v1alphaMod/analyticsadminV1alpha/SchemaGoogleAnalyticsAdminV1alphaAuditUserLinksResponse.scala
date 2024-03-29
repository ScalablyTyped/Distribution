package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of AuditUserLinks. These will be ordered stably, but in an arbitrary order.
    */
  var userLinks: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAuditUserLink]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAuditUserLinksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserLinks(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAuditUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    inline def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    inline def setUserLinksVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAuditUserLink*): Self = StObject.set(x, "userLinks", js.Array(value*))
  }
}
