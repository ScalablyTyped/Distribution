package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetwebsecurityscannersettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the WebSecurityScannerSettings to retrieve. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetwebsecurityscannersettings {
  
  inline def apply(): ParamsResourceProjectsGetwebsecurityscannersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetwebsecurityscannersettings]
  }
  
  extension [Self <: ParamsResourceProjectsGetwebsecurityscannersettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
