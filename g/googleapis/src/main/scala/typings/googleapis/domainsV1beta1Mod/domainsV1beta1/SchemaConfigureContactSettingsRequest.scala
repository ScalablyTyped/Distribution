package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigureContactSettingsRequest extends StObject {
  
  /**
    * The list of contact notices that the caller acknowledges. The notices needed here depend on the values specified in `contact_settings`.
    */
  var contactNotices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Fields of the `ContactSettings` to update.
    */
  var contactSettings: js.UndefOr[SchemaContactSettings] = js.undefined
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the registrant contact is being updated, the `update_mask` is `"registrant_contact"`.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Validate the request without actually updating the contact settings.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigureContactSettingsRequest {
  
  inline def apply(): SchemaConfigureContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigureContactSettingsRequest]
  }
  
  extension [Self <: SchemaConfigureContactSettingsRequest](x: Self) {
    
    inline def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    inline def setContactNoticesNull: Self = StObject.set(x, "contactNotices", null)
    
    inline def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    inline def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value*))
    
    inline def setContactSettings(value: SchemaContactSettings): Self = StObject.set(x, "contactSettings", value.asInstanceOf[js.Any])
    
    inline def setContactSettingsUndefined: Self = StObject.set(x, "contactSettings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
