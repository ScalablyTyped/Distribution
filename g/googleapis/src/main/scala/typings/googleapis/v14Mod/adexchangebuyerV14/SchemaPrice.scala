package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPrice extends StObject {
  
  /**
    * The price value in micros.
    */
  var amountMicros: js.UndefOr[Double] = js.native
  
  /**
    * The currency code for the price.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * In case of CPD deals, the expected CPM in micros.
    */
  var expectedCpmMicros: js.UndefOr[Double] = js.native
  
  /**
    * The pricing type for the deal/product.
    */
  var pricingType: js.UndefOr[String] = js.native
}
object SchemaPrice {
  
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  @scala.inline
  implicit class SchemaPriceMutableBuilder[Self <: SchemaPrice] (val x: Self) extends AnyVal {
    
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
