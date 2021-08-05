package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationInfo extends StObject {
  
  /** The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and aggregation_count is 14, aggregation will be over 14 days. */
  var aggregationCount: js.UndefOr[Double] = js.undefined
  
  var aggregationInterval: js.UndefOr[String] = js.undefined
  
  var aggregationLevel: js.UndefOr[String] = js.undefined
}
object AggregationInfo {
  
  inline def apply(): AggregationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationInfo]
  }
  
  extension [Self <: AggregationInfo](x: Self) {
    
    inline def setAggregationCount(value: Double): Self = StObject.set(x, "aggregationCount", value.asInstanceOf[js.Any])
    
    inline def setAggregationCountUndefined: Self = StObject.set(x, "aggregationCount", js.undefined)
    
    inline def setAggregationInterval(value: String): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setAggregationLevel(value: String): Self = StObject.set(x, "aggregationLevel", value.asInstanceOf[js.Any])
    
    inline def setAggregationLevelUndefined: Self = StObject.set(x, "aggregationLevel", js.undefined)
  }
}
