package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest extends StObject {
  
  /**
    * Updated configuration for the storedInfoType. If not provided, a new version of the storedInfoType will be created with the existing configuration.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.undefined
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest](x: Self) {
    
    inline def setConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
