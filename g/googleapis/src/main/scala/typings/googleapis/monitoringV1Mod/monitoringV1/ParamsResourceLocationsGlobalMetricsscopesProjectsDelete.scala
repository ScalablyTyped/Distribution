package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGlobalMetricsscopesProjectsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the MonitoredProject. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER\}/projects/{MONITORED_PROJECT_ID_OR_NUMBER\}Authorization requires the following Google IAM (https://cloud.google.com/iam) permissions on both the Metrics Scope and on the MonitoredProject: monitoring.metricsScopes.link
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGlobalMetricsscopesProjectsDelete {
  
  inline def apply(): ParamsResourceLocationsGlobalMetricsscopesProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGlobalMetricsscopesProjectsDelete]
  }
  
  extension [Self <: ParamsResourceLocationsGlobalMetricsscopesProjectsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
