package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the VirtualMachineThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings {
  
  inline def apply(): ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
