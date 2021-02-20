package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricePerBuyer extends StObject {
  
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[String] = js.native
  
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  
  /** The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the buyer). */
  var buyer: js.UndefOr[Buyer] = js.native
  
  /** The specified price */
  var price: js.UndefOr[Price] = js.native
}
object PricePerBuyer {
  
  @scala.inline
  def apply(): PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricePerBuyer]
  }
  
  @scala.inline
  implicit class PricePerBuyerMutableBuilder[Self <: PricePerBuyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuctionTier(value: String): Self = StObject.set(x, "auctionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTierUndefined: Self = StObject.set(x, "auctionTier", js.undefined)
    
    @scala.inline
    def setBilledBuyer(value: Buyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: Buyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
