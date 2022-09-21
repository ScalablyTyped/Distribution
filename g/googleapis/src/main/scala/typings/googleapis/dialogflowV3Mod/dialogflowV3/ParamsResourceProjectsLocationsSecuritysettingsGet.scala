package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSecuritysettingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the settings. Format: `projects//locations//securitySettings/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSecuritysettingsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSecuritysettingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSecuritysettingsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSecuritysettingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
