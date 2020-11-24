package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaForecastingMetrics extends js.Object {
  
  /** Arima model fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[js.Array[ArimaFittingMetrics]] = js.native
  
  /** Repeated as there can be many metric sets (one for each model) in auto-arima and the large-scale case. */
  var arimaSingleModelForecastingMetrics: js.UndefOr[js.Array[ArimaSingleModelForecastingMetrics]] = js.native
  
  /** Whether Arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[js.Array[Boolean]] = js.native
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[js.Array[ArimaOrder]] = js.native
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.native
  
  /** Id to differentiate different time series for the large-scale case. */
  var timeSeriesId: js.UndefOr[js.Array[String]] = js.native
}
object ArimaForecastingMetrics {
  
  @scala.inline
  def apply(): ArimaForecastingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaForecastingMetrics]
  }
  
  @scala.inline
  implicit class ArimaForecastingMetricsOps[Self <: ArimaForecastingMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArimaFittingMetricsVarargs(value: ArimaFittingMetrics*): Self = this.set("arimaFittingMetrics", js.Array(value :_*))
    
    @scala.inline
    def setArimaFittingMetrics(value: js.Array[ArimaFittingMetrics]): Self = this.set("arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaFittingMetrics: Self = this.set("arimaFittingMetrics", js.undefined)
    
    @scala.inline
    def setArimaSingleModelForecastingMetricsVarargs(value: ArimaSingleModelForecastingMetrics*): Self = this.set("arimaSingleModelForecastingMetrics", js.Array(value :_*))
    
    @scala.inline
    def setArimaSingleModelForecastingMetrics(value: js.Array[ArimaSingleModelForecastingMetrics]): Self = this.set("arimaSingleModelForecastingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaSingleModelForecastingMetrics: Self = this.set("arimaSingleModelForecastingMetrics", js.undefined)
    
    @scala.inline
    def setHasDriftVarargs(value: Boolean*): Self = this.set("hasDrift", js.Array(value :_*))
    
    @scala.inline
    def setHasDrift(value: js.Array[Boolean]): Self = this.set("hasDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDrift: Self = this.set("hasDrift", js.undefined)
    
    @scala.inline
    def setNonSeasonalOrderVarargs(value: ArimaOrder*): Self = this.set("nonSeasonalOrder", js.Array(value :_*))
    
    @scala.inline
    def setNonSeasonalOrder(value: js.Array[ArimaOrder]): Self = this.set("nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonSeasonalOrder: Self = this.set("nonSeasonalOrder", js.undefined)
    
    @scala.inline
    def setSeasonalPeriodsVarargs(value: String*): Self = this.set("seasonalPeriods", js.Array(value :_*))
    
    @scala.inline
    def setSeasonalPeriods(value: js.Array[String]): Self = this.set("seasonalPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonalPeriods: Self = this.set("seasonalPeriods", js.undefined)
    
    @scala.inline
    def setTimeSeriesIdVarargs(value: String*): Self = this.set("timeSeriesId", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesId(value: js.Array[String]): Self = this.set("timeSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesId: Self = this.set("timeSeriesId", js.undefined)
  }
}
