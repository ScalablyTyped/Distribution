package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaResult extends js.Object {
  
  /** This message is repeated because there are multiple arima models fitted in auto-arima. For non-auto-arima model, its size is one. */
  var arimaModelInfo: js.UndefOr[js.Array[ArimaModelInfo]] = js.native
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.native
}
object ArimaResult {
  
  @scala.inline
  def apply(): ArimaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaResult]
  }
  
  @scala.inline
  implicit class ArimaResultOps[Self <: ArimaResult] (val x: Self) extends AnyVal {
    
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
    def setArimaModelInfoVarargs(value: ArimaModelInfo*): Self = this.set("arimaModelInfo", js.Array(value :_*))
    
    @scala.inline
    def setArimaModelInfo(value: js.Array[ArimaModelInfo]): Self = this.set("arimaModelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaModelInfo: Self = this.set("arimaModelInfo", js.undefined)
    
    @scala.inline
    def setSeasonalPeriodsVarargs(value: String*): Self = this.set("seasonalPeriods", js.Array(value :_*))
    
    @scala.inline
    def setSeasonalPeriods(value: js.Array[String]): Self = this.set("seasonalPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonalPeriods: Self = this.set("seasonalPeriods", js.undefined)
  }
}
