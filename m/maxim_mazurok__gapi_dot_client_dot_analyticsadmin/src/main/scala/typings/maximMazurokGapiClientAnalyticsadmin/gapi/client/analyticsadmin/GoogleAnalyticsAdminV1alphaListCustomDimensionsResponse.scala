package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse extends StObject {
  
  /** List of CustomDimensions. */
  var customDimensions: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaCustomDimension]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomDimensions(value: js.Array[GoogleAnalyticsAdminV1alphaCustomDimension]): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensionsUndefined: Self = StObject.set(x, "customDimensions", js.undefined)
    
    inline def setCustomDimensionsVarargs(value: GoogleAnalyticsAdminV1alphaCustomDimension*): Self = StObject.set(x, "customDimensions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
