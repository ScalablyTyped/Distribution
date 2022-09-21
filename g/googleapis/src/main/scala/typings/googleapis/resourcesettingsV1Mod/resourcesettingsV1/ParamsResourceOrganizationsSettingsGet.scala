package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSettingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the setting to get. See Setting for naming requirements.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The SettingView for this request.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsSettingsGet {
  
  inline def apply(): ParamsResourceOrganizationsSettingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSettingsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsSettingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
