package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesRatio extends StObject {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var badServiceFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var goodServiceFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var totalServiceFilter: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeSeriesRatio {
  
  inline def apply(): SchemaTimeSeriesRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesRatio]
  }
  
  extension [Self <: SchemaTimeSeriesRatio](x: Self) {
    
    inline def setBadServiceFilter(value: String): Self = StObject.set(x, "badServiceFilter", value.asInstanceOf[js.Any])
    
    inline def setBadServiceFilterNull: Self = StObject.set(x, "badServiceFilter", null)
    
    inline def setBadServiceFilterUndefined: Self = StObject.set(x, "badServiceFilter", js.undefined)
    
    inline def setGoodServiceFilter(value: String): Self = StObject.set(x, "goodServiceFilter", value.asInstanceOf[js.Any])
    
    inline def setGoodServiceFilterNull: Self = StObject.set(x, "goodServiceFilter", null)
    
    inline def setGoodServiceFilterUndefined: Self = StObject.set(x, "goodServiceFilter", js.undefined)
    
    inline def setTotalServiceFilter(value: String): Self = StObject.set(x, "totalServiceFilter", value.asInstanceOf[js.Any])
    
    inline def setTotalServiceFilterNull: Self = StObject.set(x, "totalServiceFilter", null)
    
    inline def setTotalServiceFilterUndefined: Self = StObject.set(x, "totalServiceFilter", js.undefined)
  }
}
