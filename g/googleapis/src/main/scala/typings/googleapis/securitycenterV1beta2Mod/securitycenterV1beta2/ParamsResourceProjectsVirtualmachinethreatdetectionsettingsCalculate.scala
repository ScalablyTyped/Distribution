package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsVirtualmachinethreatdetectionsettingsCalculate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the VirtualMachineThreatDetectionSettings to calculate. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsVirtualmachinethreatdetectionsettingsCalculate {
  
  inline def apply(): ParamsResourceProjectsVirtualmachinethreatdetectionsettingsCalculate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsVirtualmachinethreatdetectionsettingsCalculate]
  }
  
  extension [Self <: ParamsResourceProjectsVirtualmachinethreatdetectionsettingsCalculate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
