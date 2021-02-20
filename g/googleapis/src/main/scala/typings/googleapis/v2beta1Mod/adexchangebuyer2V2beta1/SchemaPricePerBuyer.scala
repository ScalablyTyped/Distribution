package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to specify pricing rules for buyers/advertisers. Each PricePerBuyer in
  * a product can become 0 or 1 deals. To check if there is a PricePerBuyer for
  * a particular buyer or buyer/advertiser pair, we look for the most specific
  * matching rule - we first look for a rule matching the buyer and advertiser,
  * next a rule with the buyer but an empty advertiser list, and otherwise look
  * for a matching rule where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends StObject {
  
  /**
    * The list of advertisers for this price when associated with this buyer.
    * If empty, all advertisers with this buyer pay this price.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * The specified price.
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
    def setAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value :_*))
    
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
