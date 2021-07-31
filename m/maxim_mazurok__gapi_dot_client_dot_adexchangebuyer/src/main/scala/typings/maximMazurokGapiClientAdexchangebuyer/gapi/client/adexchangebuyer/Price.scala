package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  /** The price value in micros. */
  var amountMicros: js.UndefOr[Double] = js.undefined
  
  /** The currency code for the price. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /** In case of CPD deals, the expected CPM in micros. */
  var expectedCpmMicros: js.UndefOr[Double] = js.undefined
  
  /** The pricing type for the deal/product. */
  var pricingType: js.UndefOr[String] = js.undefined
}
object Price {
  
  @scala.inline
  def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountMicros(value: Double): Self = StObject.set(x, "amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMicrosUndefined: Self = StObject.set(x, "amountMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setExpectedCpmMicros(value: Double): Self = StObject.set(x, "expectedCpmMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedCpmMicrosUndefined: Self = StObject.set(x, "expectedCpmMicros", js.undefined)
    
    @scala.inline
    def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
  }
}
