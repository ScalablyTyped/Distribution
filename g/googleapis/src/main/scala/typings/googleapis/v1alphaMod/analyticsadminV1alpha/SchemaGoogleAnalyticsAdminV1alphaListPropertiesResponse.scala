package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Results that matched the filter criteria and were accessible to the caller.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaProperty]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
