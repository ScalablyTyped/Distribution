package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigureManagementSettingsRequest extends StObject {
  
  /**
    * Fields of the `ManagementSettings` to update.
    */
  var managementSettings: js.UndefOr[SchemaManagementSettings] = js.undefined
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the transfer lock is being updated, the `update_mask` is `"transfer_lock_state"`.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigureManagementSettingsRequest {
  
  inline def apply(): SchemaConfigureManagementSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigureManagementSettingsRequest]
  }
  
  extension [Self <: SchemaConfigureManagementSettingsRequest](x: Self) {
    
    inline def setManagementSettings(value: SchemaManagementSettings): Self = StObject.set(x, "managementSettings", value.asInstanceOf[js.Any])
    
    inline def setManagementSettingsUndefined: Self = StObject.set(x, "managementSettings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
