package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSecurityhealthanalyticssettingsCalculate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the SecurityHealthAnalyticsSettings to calculate. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSecurityhealthanalyticssettingsCalculate {
  
  inline def apply(): ParamsResourceProjectsSecurityhealthanalyticssettingsCalculate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSecurityhealthanalyticssettingsCalculate]
  }
  
  extension [Self <: ParamsResourceProjectsSecurityhealthanalyticssettingsCalculate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
