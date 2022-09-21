package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Monitored Project being requested. Example: projects/{MONITORED_PROJECT_ID_OR_NUMBER\}
    */
  var monitoredResourceContainer: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject {
  
  inline def apply(): ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject]
  }
  
  extension [Self <: ParamsResourceLocationsGlobalMetricsscopesListmetricsscopesbymonitoredproject](x: Self) {
    
    inline def setMonitoredResourceContainer(value: String): Self = StObject.set(x, "monitoredResourceContainer", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceContainerUndefined: Self = StObject.set(x, "monitoredResourceContainer", js.undefined)
  }
}
