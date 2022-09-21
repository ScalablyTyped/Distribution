package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleTypeMoney extends StObject {
  
  /**
    * The three-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
    */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
    */
  var units: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleTypeMoney {
  
  inline def apply(): SchemaGoogleTypeMoney = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleTypeMoney]
  }
  
  extension [Self <: SchemaGoogleTypeMoney](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
