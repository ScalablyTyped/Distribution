package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMetricsScopesByMonitoredProjectResponse extends StObject {
  
  /**
    * A set of all metrics scopes that the specified monitored project has been added to.
    */
  var metricsScopes: js.UndefOr[js.Array[SchemaMetricsScope]] = js.undefined
}
object SchemaListMetricsScopesByMonitoredProjectResponse {
  
  inline def apply(): SchemaListMetricsScopesByMonitoredProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMetricsScopesByMonitoredProjectResponse]
  }
  
  extension [Self <: SchemaListMetricsScopesByMonitoredProjectResponse](x: Self) {
    
    inline def setMetricsScopes(value: js.Array[SchemaMetricsScope]): Self = StObject.set(x, "metricsScopes", value.asInstanceOf[js.Any])
    
    inline def setMetricsScopesUndefined: Self = StObject.set(x, "metricsScopes", js.undefined)
    
    inline def setMetricsScopesVarargs(value: SchemaMetricsScope*): Self = StObject.set(x, "metricsScopes", js.Array(value*))
  }
}
