package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersGetsecuritycentersettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the SecurityCenterSettings to retrieve. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersGetsecuritycentersettings {
  
  inline def apply(): ParamsResourceFoldersGetsecuritycentersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersGetsecuritycentersettings]
  }
  
  extension [Self <: ParamsResourceFoldersGetsecuritycentersettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
