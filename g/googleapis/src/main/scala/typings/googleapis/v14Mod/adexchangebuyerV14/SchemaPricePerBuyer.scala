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
  def apply(): SchemaPricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricePerBuyer]
  }
  @scala.inline
  implicit class SchemaPricePerBuyerOps[Self <: SchemaPricePerBuyer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuctionTier(value: String): Self = this.set("auctionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuctionTier: Self = this.set("auctionTier", js.undefined)
    @scala.inline
    def setBilledBuyer(value: SchemaBuyer): Self = this.set("billedBuyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilledBuyer: Self = this.set("billedBuyer", js.undefined)
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    @scala.inline
    def setPrice(value: SchemaPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
  }
  
}

