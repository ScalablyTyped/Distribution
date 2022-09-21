package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse extends StObject {
  
  /**
    * A list of secrets for the parent stream specified in the request.
    */
  var measurementProtocolSecrets: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse](x: Self) {
    
    inline def setMeasurementProtocolSecrets(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]): Self = StObject.set(x, "measurementProtocolSecrets", value.asInstanceOf[js.Any])
    
    inline def setMeasurementProtocolSecretsUndefined: Self = StObject.set(x, "measurementProtocolSecrets", js.undefined)
    
    inline def setMeasurementProtocolSecretsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret*): Self = StObject.set(x, "measurementProtocolSecrets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
