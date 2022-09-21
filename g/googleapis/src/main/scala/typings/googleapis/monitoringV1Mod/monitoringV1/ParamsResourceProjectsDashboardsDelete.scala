package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDashboardsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Dashboard. The format is: projects/[PROJECT_ID_OR_NUMBER]/dashboards/[DASHBOARD_ID]
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDashboardsDelete {
  
  inline def apply(): ParamsResourceProjectsDashboardsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDashboardsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsDashboardsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
