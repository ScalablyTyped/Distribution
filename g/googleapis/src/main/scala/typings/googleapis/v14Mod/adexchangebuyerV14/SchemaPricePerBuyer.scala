package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to specify pricing rules for buyers. Each PricePerBuyer in a product
  * can become [0,1] deals. To check if there is a PricePerBuyer for a
  * particular buyer we look for the most specific matching rule - we first
  * look for a rule matching the buyer and otherwise look for a matching rule
  * where no buyer is set.
  */
trait SchemaPricePerBuyer extends StObject {
  
  /**
    * Optional access type for this buyer.
    */
  var auctionTier: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the buyer that will get billed.
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The specified price
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaPricePerBuyer {
  
  inline def apply(): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
  
  extension [Self <: SchemaPricePerBuyer](x: Self) {
    
    inline def setAuctionTier(value: String): Self = StObject.set(x, "auctionTier", value.asInstanceOf[js.Any])
    
    inline def setAuctionTierUndefined: Self = StObject.set(x, "auctionTier", js.undefined)
    
    inline def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
