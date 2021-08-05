package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrice extends StObject {
  
  /**
    * The price value in micros.
    */
  var amountMicros: js.UndefOr[Double] = js.undefined
  
  /**
    * The currency code for the price.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * In case of CPD deals, the expected CPM in micros.
    */
  var expectedCpmMicros: js.UndefOr[Double] = js.undefined
  
  /**
    * The pricing type for the deal/product.
    */
  var pricingType: js.UndefOr[String] = js.undefined
}
object SchemaPrice {
  
  inline def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  extension [Self <: SchemaPrice](x: Self) {
    
    inline def setAmountMicros(value: Double): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    inline def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setExpectedCpmMicros(value: Double): Self = StObject.set(x, "expectedCpmMicros", value.asInstanceOf[js.Any])
    
    inline def setExpectedCpmMicrosUndefined: Self = StObject.set(x, "expectedCpmMicros", js.undefined)
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
  }
}
