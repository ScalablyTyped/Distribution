package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret extends StObject {
  
  /** Required. Human-readable display name for this secret. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Resource name of this secret. This secret may be a child of any type of stream. Format:
    * properties/{property}/dataStreams/{dataStream}/measurementProtocolSecrets/{measurementProtocolSecret}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The measurement protocol secret value. Pass this value to the api_secret field of the Measurement Protocol API when sending hits to this secret's parent property. */
  var secretValue: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecretValue(value: String): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
    
    inline def setSecretValueUndefined: Self = StObject.set(x, "secretValue", js.undefined)
  }
}
