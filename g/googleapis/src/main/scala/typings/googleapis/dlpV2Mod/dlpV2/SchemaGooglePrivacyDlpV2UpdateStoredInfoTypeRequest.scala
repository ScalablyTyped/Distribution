package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for UpdateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest extends StObject {
  
  /**
    * Updated configuration for the storedInfoType. If not provided, a new
    * version of the storedInfoType will be created with the existing
    * configuration.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
