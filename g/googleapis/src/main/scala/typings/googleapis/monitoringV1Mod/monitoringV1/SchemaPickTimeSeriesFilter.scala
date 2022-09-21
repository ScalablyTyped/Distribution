package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPickTimeSeriesFilter extends StObject {
  
  /**
    * How to use the ranking to select time series that pass through the filter.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How many time series to allow to pass through the filter.
    */
  var numTimeSeries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * ranking_method is applied to each time series independently to produce the value which will be used to compare the time series to other time series.
    */
  var rankingMethod: js.UndefOr[String | Null] = js.undefined
}
object SchemaPickTimeSeriesFilter {
  
  inline def apply(): SchemaPickTimeSeriesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPickTimeSeriesFilter]
  }
  
  extension [Self <: SchemaPickTimeSeriesFilter](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setNumTimeSeries(value: Double): Self = StObject.set(x, "numTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setNumTimeSeriesNull: Self = StObject.set(x, "numTimeSeries", null)
    
    inline def setNumTimeSeriesUndefined: Self = StObject.set(x, "numTimeSeries", js.undefined)
    
    inline def setRankingMethod(value: String): Self = StObject.set(x, "rankingMethod", value.asInstanceOf[js.Any])
    
    inline def setRankingMethodNull: Self = StObject.set(x, "rankingMethod", null)
    
    inline def setRankingMethodUndefined: Self = StObject.set(x, "rankingMethod", js.undefined)
  }
}
