package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaModelInfo extends js.Object {
  
  /** Arima coefficients. */
  var arimaCoefficients: js.UndefOr[ArimaCoefficients] = js.native
  
  /** Arima fitting metrics. */
  var arimaFittingMetrics: js.UndefOr[ArimaFittingMetrics] = js.native
  
  /** Whether Arima model fitted with drift or not. It is always false when d is not 1. */
  var hasDrift: js.UndefOr[Boolean] = js.native
  
  /** Non-seasonal order. */
  var nonSeasonalOrder: js.UndefOr[ArimaOrder] = js.native
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.native
  
  /** The id to indicate different time series. */
  var timeSeriesId: js.UndefOr[String] = js.native
}
object ArimaModelInfo {
  
  @scala.inline
  def apply(): ArimaModelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaModelInfo]
  }
  
  @scala.inline
  implicit class ArimaModelInfoOps[Self <: ArimaModelInfo] (val x: Self) extends AnyVal {
    
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
    def setArimaCoefficients(value: ArimaCoefficients): Self = this.set("arimaCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaCoefficients: Self = this.set("arimaCoefficients", js.undefined)
    
    @scala.inline
    def setArimaFittingMetrics(value: ArimaFittingMetrics): Self = this.set("arimaFittingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaFittingMetrics: Self = this.set("arimaFittingMetrics", js.undefined)
    
    @scala.inline
    def setHasDrift(value: Boolean): Self = this.set("hasDrift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDrift: Self = this.set("hasDrift", js.undefined)
    
    @scala.inline
    def setNonSeasonalOrder(value: ArimaOrder): Self = this.set("nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonSeasonalOrder: Self = this.set("nonSeasonalOrder", js.undefined)
    
    @scala.inline
    def setSeasonalPeriodsVarargs(value: String*): Self = this.set("seasonalPeriods", js.Array(value :_*))
    
    @scala.inline
    def setSeasonalPeriods(value: js.Array[String]): Self = this.set("seasonalPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonalPeriods: Self = this.set("seasonalPeriods", js.undefined)
    
    @scala.inline
    def setTimeSeriesId(value: String): Self = this.set("timeSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesId: Self = this.set("timeSeriesId", js.undefined)
  }
}
