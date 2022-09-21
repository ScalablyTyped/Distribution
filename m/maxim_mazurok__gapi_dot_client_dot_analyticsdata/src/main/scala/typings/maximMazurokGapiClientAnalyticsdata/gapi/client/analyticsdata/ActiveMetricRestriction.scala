package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveMetricRestriction extends StObject {
  
  /** The name of the restricted metric. */
  var metricName: js.UndefOr[String] = js.undefined
  
  /** The reason for this metric's restriction. */
  var restrictedMetricTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ActiveMetricRestriction {
  
  inline def apply(): ActiveMetricRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveMetricRestriction]
  }
  
  extension [Self <: ActiveMetricRestriction](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setRestrictedMetricTypes(value: js.Array[String]): Self = StObject.set(x, "restrictedMetricTypes", value.asInstanceOf[js.Any])
    
    inline def setRestrictedMetricTypesUndefined: Self = StObject.set(x, "restrictedMetricTypes", js.undefined)
    
    inline def setRestrictedMetricTypesVarargs(value: String*): Self = StObject.set(x, "restrictedMetricTypes", js.Array(value*))
  }
}
