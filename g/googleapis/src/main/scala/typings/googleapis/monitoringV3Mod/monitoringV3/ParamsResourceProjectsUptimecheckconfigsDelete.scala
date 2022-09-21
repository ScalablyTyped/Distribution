package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsUptimecheckconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Uptime check configuration to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsUptimecheckconfigsDelete {
  
  inline def apply(): ParamsResourceProjectsUptimecheckconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsUptimecheckconfigsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsUptimecheckconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
