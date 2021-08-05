package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArimaResult extends StObject {
  
  /** This message is repeated because there are multiple arima models fitted in auto-arima. For non-auto-arima model, its size is one. */
  var arimaModelInfo: js.UndefOr[js.Array[ArimaModelInfo]] = js.undefined
  
  /** Seasonal periods. Repeated because multiple periods are supported for one time series. */
  var seasonalPeriods: js.UndefOr[js.Array[String]] = js.undefined
}
object ArimaResult {
  
  inline def apply(): ArimaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArimaResult]
  }
  
  extension [Self <: ArimaResult](x: Self) {
    
    inline def setArimaModelInfo(value: js.Array[ArimaModelInfo]): Self = StObject.set(x, "arimaModelInfo", value.asInstanceOf[js.Any])
    
    inline def setArimaModelInfoUndefined: Self = StObject.set(x, "arimaModelInfo", js.undefined)
    
    inline def setArimaModelInfoVarargs(value: ArimaModelInfo*): Self = StObject.set(x, "arimaModelInfo", js.Array(value :_*))
    
    inline def setSeasonalPeriods(value: js.Array[String]): Self = StObject.set(x, "seasonalPeriods", value.asInstanceOf[js.Any])
    
    inline def setSeasonalPeriodsUndefined: Self = StObject.set(x, "seasonalPeriods", js.undefined)
    
    inline def setSeasonalPeriodsVarargs(value: String*): Self = StObject.set(x, "seasonalPeriods", js.Array(value :_*))
  }
}
