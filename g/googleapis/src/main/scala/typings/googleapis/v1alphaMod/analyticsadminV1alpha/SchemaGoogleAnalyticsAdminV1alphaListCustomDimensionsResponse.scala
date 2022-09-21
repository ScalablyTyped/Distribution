package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse extends StObject {
  
  /**
    * List of CustomDimensions.
    */
  var customDimensions: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse](x: Self) {
    
    inline def setCustomDimensions(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensionsUndefined: Self = StObject.set(x, "customDimensions", js.undefined)
    
    inline def setCustomDimensionsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaCustomDimension*): Self = StObject.set(x, "customDimensions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
