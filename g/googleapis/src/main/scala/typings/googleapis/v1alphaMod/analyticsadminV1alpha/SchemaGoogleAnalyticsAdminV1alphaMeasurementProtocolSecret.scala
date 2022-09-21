package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret extends StObject {
  
  /**
    * Required. Human-readable display name for this secret.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this secret. This secret may be a child of any type of stream. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The measurement protocol secret value. Pass this value to the api_secret field of the Measurement Protocol API when sending hits to this secret's parent property.
    */
  var secretValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecretValue(value: String): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
    
    inline def setSecretValueNull: Self = StObject.set(x, "secretValue", null)
    
    inline def setSecretValueUndefined: Self = StObject.set(x, "secretValue", js.undefined)
  }
}
