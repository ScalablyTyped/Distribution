package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse extends StObject {
  
  /** A list of secrets for the parent stream specified in the request. */
  var measurementProtocolSecrets: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] (val x: Self) extends AnyVal {
    
    inline def setMeasurementProtocolSecrets(value: js.Array[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]): Self = StObject.set(x, "measurementProtocolSecrets", value.asInstanceOf[js.Any])
    
    inline def setMeasurementProtocolSecretsUndefined: Self = StObject.set(x, "measurementProtocolSecrets", js.undefined)
    
    inline def setMeasurementProtocolSecretsVarargs(value: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret*): Self = StObject.set(x, "measurementProtocolSecrets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
