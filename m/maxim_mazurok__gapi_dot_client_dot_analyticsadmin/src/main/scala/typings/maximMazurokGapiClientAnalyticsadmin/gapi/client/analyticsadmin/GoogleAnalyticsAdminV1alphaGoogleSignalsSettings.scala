package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaGoogleSignalsSettings extends StObject {
  
  /** Output only. Terms of Service acceptance. */
  var consent: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this setting. Format: properties/{property_id}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Status of this setting. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaGoogleSignalsSettings {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaGoogleSignalsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaGoogleSignalsSettings](x: Self) {
    
    inline def setConsent(value: String): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
