package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsNonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction (buyer-readonly).
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricePerBuyers: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaDealTermsNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(
    autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined,
    reservePricePerBuyers: js.Array[SchemaPricePerBuyer] = null
  ): SchemaDealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction.get.asInstanceOf[js.Any])
    if (reservePricePerBuyers != null) __obj.updateDynamic("reservePricePerBuyers")(reservePricePerBuyers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedAuctionTerms]
  }
}

