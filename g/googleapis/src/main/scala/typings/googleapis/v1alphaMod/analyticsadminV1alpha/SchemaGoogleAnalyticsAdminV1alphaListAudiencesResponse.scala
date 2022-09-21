package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse extends StObject {
  
  /**
    * List of Audiences.
    */
  var audiences: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAudience]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse](x: Self) {
    
    inline def setAudiences(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAudience]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAudiencesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAudience*): Self = StObject.set(x, "audiences", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
