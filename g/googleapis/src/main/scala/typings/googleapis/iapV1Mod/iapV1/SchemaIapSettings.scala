package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIapSettings extends StObject {
  
  /**
    * Top level wrapper for all access related setting in IAP
    */
  var accessSettings: js.UndefOr[SchemaAccessSettings] = js.undefined
  
  /**
    * Top level wrapper for all application related settings in IAP
    */
  var applicationSettings: js.UndefOr[SchemaApplicationSettings] = js.undefined
  
  /**
    * Required. The resource name of the IAP protected resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaIapSettings {
  
  inline def apply(): SchemaIapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIapSettings]
  }
  
  extension [Self <: SchemaIapSettings](x: Self) {
    
    inline def setAccessSettings(value: SchemaAccessSettings): Self = StObject.set(x, "accessSettings", value.asInstanceOf[js.Any])
    
    inline def setAccessSettingsUndefined: Self = StObject.set(x, "accessSettings", js.undefined)
    
    inline def setApplicationSettings(value: SchemaApplicationSettings): Self = StObject.set(x, "applicationSettings", value.asInstanceOf[js.Any])
    
    inline def setApplicationSettingsUndefined: Self = StObject.set(x, "applicationSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
