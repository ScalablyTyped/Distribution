package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceDealParty extends StObject {
  
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal-party. */
  var buyer: js.UndefOr[Buyer] = js.native
  
  /** The buyer/seller associated with the deal. One of buyer/seller is specified for a deal party. */
  var seller: js.UndefOr[Seller] = js.native
}
object MarketplaceDealParty {
  
  @scala.inline
  def apply(): MarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceDealParty]
  }
  
  @scala.inline
  implicit class MarketplaceDealPartyMutableBuilder[Self <: MarketplaceDealParty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyer(value: Buyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setSeller(value: Seller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
  }
}
