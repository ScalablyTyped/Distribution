package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsDevicecheckconfigGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the DeviceCheckConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/deviceCheckConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsDevicecheckconfigGet {
  
  inline def apply(): ParamsResourceProjectsAppsDevicecheckconfigGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsDevicecheckconfigGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsDevicecheckconfigGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
