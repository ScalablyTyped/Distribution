package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetsecurityhealthanalyticssettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the SecurityHealthAnalyticsSettings to retrieve. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetsecurityhealthanalyticssettings {
  
  inline def apply(): ParamsResourceProjectsGetsecurityhealthanalyticssettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetsecurityhealthanalyticssettings]
  }
  
  extension [Self <: ParamsResourceProjectsGetsecurityhealthanalyticssettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
