package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingRateTieredRate extends StObject {
  
  /** The maximum for this tier range. */
  var highValue: js.UndefOr[String] = js.undefined
  
  /** The minimum for this tier range. */
  var lowValue: js.UndefOr[String] = js.undefined
  
  /** Rate in micros for this tier. */
  var rateInMicros: js.UndefOr[String] = js.undefined
}
object BillingRateTieredRate {
  
  inline def apply(): BillingRateTieredRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingRateTieredRate]
  }
  
  extension [Self <: BillingRateTieredRate](x: Self) {
    
    inline def setHighValue(value: String): Self = StObject.set(x, "highValue", value.asInstanceOf[js.Any])
    
    inline def setHighValueUndefined: Self = StObject.set(x, "highValue", js.undefined)
    
    inline def setLowValue(value: String): Self = StObject.set(x, "lowValue", value.asInstanceOf[js.Any])
    
    inline def setLowValueUndefined: Self = StObject.set(x, "lowValue", js.undefined)
    
    inline def setRateInMicros(value: String): Self = StObject.set(x, "rateInMicros", value.asInstanceOf[js.Any])
    
    inline def setRateInMicrosUndefined: Self = StObject.set(x, "rateInMicros", js.undefined)
  }
}
