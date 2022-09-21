package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings extends StObject {
  
  /**
    * Output only. Terms of Service acceptance.
    */
  var consent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this setting. Format: properties/{property_id\}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of this setting.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings](x: Self) {
    
    inline def setConsent(value: String): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentNull: Self = StObject.set(x, "consent", null)
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
