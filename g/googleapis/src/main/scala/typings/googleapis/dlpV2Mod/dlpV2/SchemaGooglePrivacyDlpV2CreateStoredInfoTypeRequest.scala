package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest extends StObject {
  
  /**
    * Required. Configuration of the storedInfoType to create.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
    */
  var storedInfoTypeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest](x: Self) {
    
    inline def setConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setStoredInfoTypeId(value: String): Self = StObject.set(x, "storedInfoTypeId", value.asInstanceOf[js.Any])
    
    inline def setStoredInfoTypeIdNull: Self = StObject.set(x, "storedInfoTypeId", null)
    
    inline def setStoredInfoTypeIdUndefined: Self = StObject.set(x, "storedInfoTypeId", js.undefined)
  }
}
