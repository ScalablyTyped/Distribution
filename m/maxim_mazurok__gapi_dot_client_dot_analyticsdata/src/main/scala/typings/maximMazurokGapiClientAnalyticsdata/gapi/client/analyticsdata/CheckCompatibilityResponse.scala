package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckCompatibilityResponse extends StObject {
  
  /** The compatibility of each dimension. */
  var dimensionCompatibilities: js.UndefOr[js.Array[DimensionCompatibility]] = js.undefined
  
  /** The compatibility of each metric. */
  var metricCompatibilities: js.UndefOr[js.Array[MetricCompatibility]] = js.undefined
}
object CheckCompatibilityResponse {
  
  inline def apply(): CheckCompatibilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckCompatibilityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckCompatibilityResponse] (val x: Self) extends AnyVal {
    
    inline def setDimensionCompatibilities(value: js.Array[DimensionCompatibility]): Self = StObject.set(x, "dimensionCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setDimensionCompatibilitiesUndefined: Self = StObject.set(x, "dimensionCompatibilities", js.undefined)
    
    inline def setDimensionCompatibilitiesVarargs(value: DimensionCompatibility*): Self = StObject.set(x, "dimensionCompatibilities", js.Array(value*))
    
    inline def setMetricCompatibilities(value: js.Array[MetricCompatibility]): Self = StObject.set(x, "metricCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setMetricCompatibilitiesUndefined: Self = StObject.set(x, "metricCompatibilities", js.undefined)
    
    inline def setMetricCompatibilitiesVarargs(value: MetricCompatibility*): Self = StObject.set(x, "metricCompatibilities", js.Array(value*))
  }
}
