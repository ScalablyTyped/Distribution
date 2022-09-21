package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPricePerBuyer extends StObject {
  
  /**
    * Optional access type for this buyer.
    */
  var auctionTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reference to the buyer that will get billed.
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.undefined
  
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the buyer).
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
    
    inline def setAuctionTierNull: Self = StObject.set(x, "auctionTier", null)
    
    inline def setAuctionTierUndefined: Self = StObject.set(x, "auctionTier", js.undefined)
    
    inline def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
