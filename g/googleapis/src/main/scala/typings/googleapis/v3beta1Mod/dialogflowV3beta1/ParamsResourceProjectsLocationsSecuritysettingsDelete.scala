package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSecuritysettingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the SecuritySettings to delete. Format: `projects//locations//securitySettings/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSecuritysettingsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsSecuritysettingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSecuritysettingsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSecuritysettingsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
