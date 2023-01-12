package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricePerBuyer extends StObject {
  
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[String] = js.undefined
  
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  
  /** The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the buyer). */
  var buyer: js.UndefOr[Buyer] = js.undefined
  
  /** The specified price */
  var price: js.UndefOr[Price] = js.undefined
}
object PricePerBuyer {
  
  inline def apply(): PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricePerBuyer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PricePerBuyer] (val x: Self) extends AnyVal {
    
    inline def setAuctionTier(value: String): Self = StObject.set(x, "auctionTier", value.asInstanceOf[js.Any])
    
    inline def setAuctionTierUndefined: Self = StObject.set(x, "auctionTier", js.undefined)
    
    inline def setBilledBuyer(value: Buyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: Buyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
