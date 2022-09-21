package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse extends StObject {
  
  /**
    * List of GoogleAdsLinks.
    */
  var googleAdsLinks: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse](x: Self) {
    
    inline def setGoogleAdsLinks(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]): Self = StObject.set(x, "googleAdsLinks", value.asInstanceOf[js.Any])
    
    inline def setGoogleAdsLinksUndefined: Self = StObject.set(x, "googleAdsLinks", js.undefined)
    
    inline def setGoogleAdsLinksVarargs(value: SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink*): Self = StObject.set(x, "googleAdsLinks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
