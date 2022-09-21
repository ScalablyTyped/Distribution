package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsUptimecheckconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Uptime check configuration to retrieve. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsUptimecheckconfigsGet {
  
  inline def apply(): ParamsResourceProjectsUptimecheckconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsUptimecheckconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsUptimecheckconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
