package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetsecuritycentersettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the SecurityCenterSettings to retrieve. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetsecuritycentersettings {
  
  inline def apply(): ParamsResourceProjectsGetsecuritycentersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetsecuritycentersettings]
  }
  
  extension [Self <: ParamsResourceProjectsGetsecuritycentersettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
