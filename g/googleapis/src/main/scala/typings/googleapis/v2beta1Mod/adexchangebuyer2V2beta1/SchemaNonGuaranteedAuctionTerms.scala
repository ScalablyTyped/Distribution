package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Private Auctions. Note that Private Auctions can be created only
  * by the seller, but they can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction.
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricesPerBuyer: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(
    autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined,
    reservePricesPerBuyer: js.Array[SchemaPricePerBuyer] = null
  ): SchemaNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction.get.asInstanceOf[js.Any])
    if (reservePricesPerBuyer != null) __obj.updateDynamic("reservePricesPerBuyer")(reservePricesPerBuyer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonGuaranteedAuctionTerms]
  }
}

