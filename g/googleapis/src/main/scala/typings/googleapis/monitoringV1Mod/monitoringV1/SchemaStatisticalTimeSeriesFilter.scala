package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatisticalTimeSeriesFilter extends StObject {
  
  /**
    * How many time series to output.
    */
  var numTimeSeries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * rankingMethod is applied to a set of time series, and then the produced value for each individual time series is used to compare a given time series to others. These are methods that cannot be applied stream-by-stream, but rather require the full context of a request to evaluate time series.
    */
  var rankingMethod: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatisticalTimeSeriesFilter {
  
  inline def apply(): SchemaStatisticalTimeSeriesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatisticalTimeSeriesFilter]
  }
  
  extension [Self <: SchemaStatisticalTimeSeriesFilter](x: Self) {
    
    inline def setNumTimeSeries(value: Double): Self = StObject.set(x, "numTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setNumTimeSeriesNull: Self = StObject.set(x, "numTimeSeries", null)
    
    inline def setNumTimeSeriesUndefined: Self = StObject.set(x, "numTimeSeries", js.undefined)
    
    inline def setRankingMethod(value: String): Self = StObject.set(x, "rankingMethod", value.asInstanceOf[js.Any])
    
    inline def setRankingMethodNull: Self = StObject.set(x, "rankingMethod", null)
    
    inline def setRankingMethodUndefined: Self = StObject.set(x, "rankingMethod", js.undefined)
  }
}
