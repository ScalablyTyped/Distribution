package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPrice extends js.Object {
  
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
  implicit class SchemaPriceOps[Self <: SchemaPrice] (val x: Self) extends AnyVal {
    
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
    def setAmountMicros(value: Double): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setExpectedCpmMicros(value: Double): Self = this.set("expectedCpmMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedCpmMicros: Self = this.set("expectedCpmMicros", js.undefined)
    
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
  }
}
