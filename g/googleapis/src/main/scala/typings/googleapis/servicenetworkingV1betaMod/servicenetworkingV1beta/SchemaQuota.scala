package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuota extends StObject {
  
  /**
    * List of `QuotaLimit` definitions for the service.
    */
  var limits: js.UndefOr[js.Array[SchemaQuotaLimit]] = js.undefined
  
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[SchemaMetricRule]] = js.undefined
}
object SchemaQuota {
  
  inline def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  extension [Self <: SchemaQuota](x: Self) {
    
    inline def setLimits(value: js.Array[SchemaQuotaLimit]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setLimitsVarargs(value: SchemaQuotaLimit*): Self = StObject.set(x, "limits", js.Array(value*))
    
    inline def setMetricRules(value: js.Array[SchemaMetricRule]): Self = StObject.set(x, "metricRules", value.asInstanceOf[js.Any])
    
    inline def setMetricRulesUndefined: Self = StObject.set(x, "metricRules", js.undefined)
    
    inline def setMetricRulesVarargs(value: SchemaMetricRule*): Self = StObject.set(x, "metricRules", js.Array(value*))
  }
}
