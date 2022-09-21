package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsEventthreatdetectionsettingsCalculate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the EventThreatDetectionSettings to calculate. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsEventthreatdetectionsettingsCalculate {
  
  inline def apply(): ParamsResourceProjectsEventthreatdetectionsettingsCalculate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEventthreatdetectionsettingsCalculate]
  }
  
  extension [Self <: ParamsResourceProjectsEventthreatdetectionsettingsCalculate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
