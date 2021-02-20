package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to specify pricing rules for buyers. Each PricePerBuyer in a product
  * can become [0,1] deals. To check if there is a PricePerBuyer for a
  * particular buyer we look for the most specific matching rule - we first
  * look for a rule matching the buyer and otherwise look for a matching rule
  * where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends StObject {
  
  /**
    * Optional access type for this buyer.
    */
  var auctionTier: js.UndefOr[String] = js.native
  
  /**
    * Reference to the buyer that will get billed.
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * The specified price
    */
  var price: js.UndefOr[SchemaPrice] = js.native
}
object SchemaPricePerBuyer {
  
  @scala.inline
  def apply(): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
  
  @scala.inline
  implicit class SchemaPricePerBuyerMutableBuilder[Self <: SchemaPricePerBuyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuctionTier(value: String): Self = StObject.set(x, "auctionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTierUndefined: Self = StObject.set(x, "auctionTier", js.undefined)
    
    @scala.inline
    def setBilledBuyer(value: SchemaBuyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
