package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaModelInfo extends StObject {
  
  /** Arima coefficients. */
  var arimaCoefficients: js.UndefOr[ArimaCoefficients] = js.undefined
  
  /** Arima fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[ArimaFittingMetrics] = js.undefined
  
  /** Whether Arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[Boolean] = js.undefined
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[ArimaOrder] = js.undefined
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The id to indicate different time series. */
  var timeSeriesId: js.UndefOr[String] = js.undefined
}
object ArimaModelInfo {
  
  inline def apply(): ArimaModelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaModelInfo]
  }
  
  extension [Self <: ArimaModelInfo](x: Self) {
    
    inline def setArimaCoefficients(value: ArimaCoefficients): Self = StObject.set(x, "arimaCoefficients", value.asInstanceOf[js.Any])
    
    inline def setArimaCoefficientsUndefined: Self = StObject.set(x, "arimaCoefficients", js.undefined)
    
    inline def setArimaFittingMetrics(value: ArimaFittingMetrics): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    inline def setHasDrift(value: Boolean): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    inline def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    inline def setNonSeasonalOrder(value: ArimaOrder): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value :_*))
    
    inline def setTimeSeriesId(value: String): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
  }
}
