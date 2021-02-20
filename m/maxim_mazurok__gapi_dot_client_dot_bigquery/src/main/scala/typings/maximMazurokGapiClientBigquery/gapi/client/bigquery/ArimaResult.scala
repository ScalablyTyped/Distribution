package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArimaResult extends StObject {
  
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
  implicit class ArimaResultMutableBuilder[Self <: ArimaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArimaModelInfo(value: js.Array[ArimaModelInfo]): Self = StObject.set(x, "arimaModelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArimaModelInfoUndefined: Self = StObject.set(x, "arimaModelInfo", js.undefined)
    
    @scala.inline
    def setArimaModelInfoVarargs(value: ArimaModelInfo*): Self = StObject.set(x, "arimaModelInfo", js.Array(value :_*))
    
    @scala.inline
    def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    @scala.inline
    def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value :_*))
  }
}
