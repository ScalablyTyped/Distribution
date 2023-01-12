package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaForecastingMetrics extends StObject {
  
  /** Arima model fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[js.Array[ArimaFittingMetrics]] = js.undefined
  
  /** Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case. */
  var arimaSingleModelForecastingMetrics: js.UndefOr[js.Array[ArimaSingleModelForecastingMetrics]] = js.undefined
  
  /** Whether Arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[js.Array[ArimaOrder]] = js.undefined
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Id to differentiate different time series for the large-scale case. */
  var timeSeriesId: js.UndefOr[js.Array[String]] = js.undefined
}
object ArimaForecastingMetrics {
  
  inline def apply(): ArimaForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaForecastingMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArimaForecastingMetrics] (val x: Self) extends AnyVal {
    
    inline def setArimaFittingMetrics(value: js.Array[ArimaFittingMetrics]): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    inline def setArimaFittingMetricsVarargs(value: ArimaFittingMetrics*): Self = StObject.set(x, "arimaFittingMetrics", js.Array(value*))
    
    inline def setArimaSingleModelForecastingMetrics(value: js.Array[ArimaSingleModelForecastingMetrics]): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaSingleModelForecastingMetricsUndefined: Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.undefined)
    
    inline def setArimaSingleModelForecastingMetricsVarargs(value: ArimaSingleModelForecastingMetrics*): Self = StObject.set(x, "arimaSingleModelForecastingMetrics", js.Array(value*))
    
    inline def setHasDrift(value: js.Array[Boolean]): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    inline def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    inline def setHasDriftVarargs(value: Boolean*): Self = StObject.set(x, "hasDrift", js.Array(value*))
    
    inline def setNonSeasonalOrder(value: js.Array[ArimaOrder]): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setNonSeasonalOrderVarargs(value: ArimaOrder*): Self = StObject.set(x, "nonSeasonalOrder", js.Array(value*))
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value*))
    
    inline def setTimeSeriesId(value: js.Array[String]): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
    
    inline def setTimeSeriesIdVarargs(value: String*): Self = StObject.set(x, "timeSeriesId", js.Array(value*))
  }
}
