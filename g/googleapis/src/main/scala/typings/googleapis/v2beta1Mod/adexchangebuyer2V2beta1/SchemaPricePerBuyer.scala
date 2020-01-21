package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers/advertisers. Each PricePerBuyer in
  * a product can become 0 or 1 deals. To check if there is a PricePerBuyer for
  * a particular buyer or buyer/advertiser pair, we look for the most specific
  * matching rule - we first look for a rule matching the buyer and advertiser,
  * next a rule with the buyer but an empty advertiser list, and otherwise look
  * for a matching rule where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends js.Object {
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
  def apply(advertiserIds: js.Array[String] = null, buyer: SchemaBuyer = null, price: SchemaPrice = null): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
}

