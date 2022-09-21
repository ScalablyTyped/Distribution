package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTagConsentSetting extends StObject {
  
  /**
    * The tag's consent status. If set to NEEDED, the runtime will check that the consent types specified by the consent_type field have been granted.
    */
  var consentStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of consents to check for during tag firing if in the consent NEEDED state. This parameter must be of type LIST where each list item is of type STRING.
    */
  var consentType: js.UndefOr[SchemaParameter] = js.undefined
}
object SchemaTagConsentSetting {
  
  inline def apply(): SchemaTagConsentSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagConsentSetting]
  }
  
  extension [Self <: SchemaTagConsentSetting](x: Self) {
    
    inline def setConsentStatus(value: String): Self = StObject.set(x, "consentStatus", value.asInstanceOf[js.Any])
    
    inline def setConsentStatusNull: Self = StObject.set(x, "consentStatus", null)
    
    inline def setConsentStatusUndefined: Self = StObject.set(x, "consentStatus", js.undefined)
    
    inline def setConsentType(value: SchemaParameter): Self = StObject.set(x, "consentType", value.asInstanceOf[js.Any])
    
    inline def setConsentTypeUndefined: Self = StObject.set(x, "consentType", js.undefined)
  }
}
