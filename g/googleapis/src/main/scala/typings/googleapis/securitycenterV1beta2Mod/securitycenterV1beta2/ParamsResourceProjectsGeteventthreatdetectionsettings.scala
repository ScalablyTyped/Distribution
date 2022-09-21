package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGeteventthreatdetectionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the EventThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGeteventthreatdetectionsettings {
  
  inline def apply(): ParamsResourceProjectsGeteventthreatdetectionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGeteventthreatdetectionsettings]
  }
  
  extension [Self <: ParamsResourceProjectsGeteventthreatdetectionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
