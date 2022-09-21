package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSettingsRequest extends StObject {
  
  /**
    * Required. The settings to update with.
    */
  var settings: js.UndefOr[SchemaFormSettings] = js.undefined
  
  /**
    * Required. Only values named in this mask are changed. At least one field must be specified. The root `settings` is implied and should not be specified. A single `"*"` can be used as short-hand for updating every field.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateSettingsRequest {
  
  inline def apply(): SchemaUpdateSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSettingsRequest]
  }
  
  extension [Self <: SchemaUpdateSettingsRequest](x: Self) {
    
    inline def setSettings(value: SchemaFormSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
