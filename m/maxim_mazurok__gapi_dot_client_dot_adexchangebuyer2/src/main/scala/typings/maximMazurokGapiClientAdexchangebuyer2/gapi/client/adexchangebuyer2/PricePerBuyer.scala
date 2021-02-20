package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricePerBuyer extends StObject {
  
  /** The list of advertisers for this price when associated with this buyer. If empty, all advertisers with this buyer pay this price. */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the buyer). */
  var buyer: js.UndefOr[Buyer] = js.native
  
  /** The specified price. */
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
    def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
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
