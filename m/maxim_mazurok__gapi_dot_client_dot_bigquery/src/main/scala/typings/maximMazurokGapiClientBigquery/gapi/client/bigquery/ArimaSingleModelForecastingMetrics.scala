package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaSingleModelForecastingMetrics extends StObject {
  
  /** Arima fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[ArimaFittingMetrics] = js.undefined
  
  /** Is arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[Boolean] = js.undefined
  
  /** If true, holiday_effect is a part of time series decomposition result. */
  var hasHolidayEffect: js.UndefOr[Boolean] = js.undefined
  
  /** If true, spikes_and_dips is a part of time series decomposition result. */
  var hasSpikesAndDips: js.UndefOr[Boolean] = js.undefined
  
  /** If true, step_changes is a part of time series decomposition result. */
  var hasStepChanges: js.UndefOr[Boolean] = js.undefined
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[ArimaOrder] = js.undefined
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time_series_id value for this time series. It will be one of the unique values from the time_series_id_column specified during ARIMA model training. Only present when
    * time_series_id_column training option was used.
    */
  var timeSeriesId: js.UndefOr[String] = js.undefined
  
  /**
    * The tuple of time_series_ids identifying this time series. It will be one of the unique tuples of values present in the time_series_id_columns specified during ARIMA model training.
    * Only present when time_series_id_columns training option was used and the order of values here are same as the order of time_series_id_columns.
    */
  var timeSeriesIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ArimaSingleModelForecastingMetrics {
  
  inline def apply(): ArimaSingleModelForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaSingleModelForecastingMetrics]
  }
  
  extension [Self <: ArimaSingleModelForecastingMetrics](x: Self) {
    
    inline def setArimaFittingMetrics(value: ArimaFittingMetrics): Self = StObject.set(x, "arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaFittingMetricsUndefined: Self = StObject.set(x, "arimaFittingMetrics", js.undefined)
    
    inline def setHasDrift(value: Boolean): Self = StObject.set(x, "hasDrift", value.asInstanceOf[js.Any])
    
    inline def setHasDriftUndefined: Self = StObject.set(x, "hasDrift", js.undefined)
    
    inline def setHasHolidayEffect(value: Boolean): Self = StObject.set(x, "hasHolidayEffect", value.asInstanceOf[js.Any])
    
    inline def setHasHolidayEffectUndefined: Self = StObject.set(x, "hasHolidayEffect", js.undefined)
    
    inline def setHasSpikesAndDips(value: Boolean): Self = StObject.set(x, "hasSpikesAndDips", value.asInstanceOf[js.Any])
    
    inline def setHasSpikesAndDipsUndefined: Self = StObject.set(x, "hasSpikesAndDips", js.undefined)
    
    inline def setHasStepChanges(value: Boolean): Self = StObject.set(x, "hasStepChanges", value.asInstanceOf[js.Any])
    
    inline def setHasStepChangesUndefined: Self = StObject.set(x, "hasStepChanges", js.undefined)
    
    inline def setNonSeasonalOrder(value: ArimaOrder): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value*))
    
    inline def setTimeSeriesId(value: String): Self = StObject.set(x, "timeSeriesId", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdUndefined: Self = StObject.set(x, "timeSeriesId", js.undefined)
    
    inline def setTimeSeriesIds(value: js.Array[String]): Self = StObject.set(x, "timeSeriesIds", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdsUndefined: Self = StObject.set(x, "timeSeriesIds", js.undefined)
    
    inline def setTimeSeriesIdsVarargs(value: String*): Self = StObject.set(x, "timeSeriesIds", js.Array(value*))
  }
}
