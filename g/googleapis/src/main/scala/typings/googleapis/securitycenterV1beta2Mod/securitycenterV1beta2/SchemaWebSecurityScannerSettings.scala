package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebSecurityScannerSettings extends StObject {
  
  /**
    * The configurations including the state of enablement for the service's different modules. The absence of a module in the map implies its configuration is inherited from its parent's.
    */
  var modules: js.UndefOr[StringDictionary[SchemaConfig] | Null] = js.undefined
  
  /**
    * The resource name of the WebSecurityScannerSettings. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of enablement for the service at its level of the resource hierarchy. A DISABLED state will override all module enablement_states to DISABLED.
    */
  var serviceEnablementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the settings were last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebSecurityScannerSettings {
  
  inline def apply(): SchemaWebSecurityScannerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebSecurityScannerSettings]
  }
  
  extension [Self <: SchemaWebSecurityScannerSettings](x: Self) {
    
    inline def setModules(value: StringDictionary[SchemaConfig]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesNull: Self = StObject.set(x, "modules", null)
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceEnablementState(value: String): Self = StObject.set(x, "serviceEnablementState", value.asInstanceOf[js.Any])
    
    inline def setServiceEnablementStateNull: Self = StObject.set(x, "serviceEnablementState", null)
    
    inline def setServiceEnablementStateUndefined: Self = StObject.set(x, "serviceEnablementState", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
