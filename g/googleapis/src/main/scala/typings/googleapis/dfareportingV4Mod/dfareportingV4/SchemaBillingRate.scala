package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingRate extends StObject {
  
  /**
    * Billing currency code in ISO 4217 format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End date of this billing rate.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this billing rate.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this billing rate. This must be less than 256 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flat rate in micros of this billing rate. This cannot co-exist with tiered rate.
    */
  var rateInMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start date of this billing rate.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tiered rate of this billing rate. This cannot co-exist with flat rate.
    */
  var tieredRates: js.UndefOr[js.Array[SchemaBillingRateTieredRate]] = js.undefined
  
  /**
    * Type of this billing rate.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unit of measure for this billing rate.
    */
  var unitOfMeasure: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingRate {
  
  inline def apply(): SchemaBillingRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingRate]
  }
  
  extension [Self <: SchemaBillingRate](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRateInMicros(value: String): Self = StObject.set(x, "rateInMicros", value.asInstanceOf[js.Any])
    
    inline def setRateInMicrosNull: Self = StObject.set(x, "rateInMicros", null)
    
    inline def setRateInMicrosUndefined: Self = StObject.set(x, "rateInMicros", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTieredRates(value: js.Array[SchemaBillingRateTieredRate]): Self = StObject.set(x, "tieredRates", value.asInstanceOf[js.Any])
    
    inline def setTieredRatesUndefined: Self = StObject.set(x, "tieredRates", js.undefined)
    
    inline def setTieredRatesVarargs(value: SchemaBillingRateTieredRate*): Self = StObject.set(x, "tieredRates", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureNull: Self = StObject.set(x, "unitOfMeasure", null)
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
  }
}
