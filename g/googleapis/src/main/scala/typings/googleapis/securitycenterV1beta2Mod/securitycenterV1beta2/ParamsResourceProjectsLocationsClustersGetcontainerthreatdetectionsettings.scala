package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the ContainerThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersGetcontainerthreatdetectionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
