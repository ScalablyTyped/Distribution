package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a price and a pricing type for a product / deal.
  */
trait SchemaPrice extends StObject {
  
  /**
    * The actual price with currency specified.
    */
  var amount: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * The pricing type for the deal/product. (default: CPM)
    */
  var pricingType: js.UndefOr[String] = js.undefined
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
    def setAmount(value: SchemaMoney): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
  }
}
