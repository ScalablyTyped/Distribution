package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers. Each PricePerBuyer in a product
  * can become [0,1] deals. To check if there is a PricePerBuyer for a
  * particular buyer we look for the most specific matching rule - we first
  * look for a rule matching the buyer and otherwise look for a matching rule
  * where no buyer is set.
  */
@js.native
trait SchemaPricePerBuyer extends js.Object {
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
  def apply(
    auctionTier: String = null,
    billedBuyer: SchemaBuyer = null,
    buyer: SchemaBuyer = null,
    price: SchemaPrice = null
  ): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    if (auctionTier != null) __obj.updateDynamic("auctionTier")(auctionTier.asInstanceOf[js.Any])
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
}

