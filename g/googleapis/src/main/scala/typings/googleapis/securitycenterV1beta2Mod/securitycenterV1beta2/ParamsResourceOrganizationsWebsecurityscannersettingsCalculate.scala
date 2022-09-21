package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsWebsecurityscannersettingsCalculate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the WebSecurityScannerSettings to calculate. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsWebsecurityscannersettingsCalculate {
  
  inline def apply(): ParamsResourceOrganizationsWebsecurityscannersettingsCalculate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsWebsecurityscannersettingsCalculate]
  }
  
  extension [Self <: ParamsResourceOrganizationsWebsecurityscannersettingsCalculate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
