package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingRateTieredRate extends StObject {
  
  /**
    * The maximum for this tier range.
    */
  var highValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum for this tier range.
    */
  var lowValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate in micros for this tier.
    */
  var rateInMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingRateTieredRate {
  
  inline def apply(): SchemaBillingRateTieredRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingRateTieredRate]
  }
  
  extension [Self <: SchemaBillingRateTieredRate](x: Self) {
    
    inline def setHighValue(value: String): Self = StObject.set(x, "highValue", value.asInstanceOf[js.Any])
    
    inline def setHighValueNull: Self = StObject.set(x, "highValue", null)
    
    inline def setHighValueUndefined: Self = StObject.set(x, "highValue", js.undefined)
    
    inline def setLowValue(value: String): Self = StObject.set(x, "lowValue", value.asInstanceOf[js.Any])
    
    inline def setLowValueNull: Self = StObject.set(x, "lowValue", null)
    
    inline def setLowValueUndefined: Self = StObject.set(x, "lowValue", js.undefined)
    
    inline def setRateInMicros(value: String): Self = StObject.set(x, "rateInMicros", value.asInstanceOf[js.Any])
    
    inline def setRateInMicrosNull: Self = StObject.set(x, "rateInMicros", null)
    
    inline def setRateInMicrosUndefined: Self = StObject.set(x, "rateInMicros", js.undefined)
  }
}
