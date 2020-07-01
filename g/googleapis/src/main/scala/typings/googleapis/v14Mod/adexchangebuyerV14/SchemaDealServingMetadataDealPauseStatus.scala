package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks which parties (if any) have paused a deal. The deal is considered
  * paused if has_buyer_paused || has_seller_paused. Each of the
  * has_buyer_paused or the has_seller_paused bits can be set independently.
  */
@js.native
trait SchemaDealServingMetadataDealPauseStatus extends js.Object {
  var buyerPauseReason: js.UndefOr[String] = js.native
  /**
    * If the deal is paused, records which party paused the deal first.
    */
  var firstPausedBy: js.UndefOr[String] = js.native
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  var sellerPauseReason: js.UndefOr[String] = js.native
}

object SchemaDealServingMetadataDealPauseStatus {
  @scala.inline
  def apply(
    buyerPauseReason: String = null,
    firstPausedBy: String = null,
    hasBuyerPaused: js.UndefOr[Boolean] = js.undefined,
    hasSellerPaused: js.UndefOr[Boolean] = js.undefined,
    sellerPauseReason: String = null
  ): SchemaDealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    if (buyerPauseReason != null) __obj.updateDynamic("buyerPauseReason")(buyerPauseReason.asInstanceOf[js.Any])
    if (firstPausedBy != null) __obj.updateDynamic("firstPausedBy")(firstPausedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBuyerPaused)) __obj.updateDynamic("hasBuyerPaused")(hasBuyerPaused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSellerPaused)) __obj.updateDynamic("hasSellerPaused")(hasSellerPaused.get.asInstanceOf[js.Any])
    if (sellerPauseReason != null) __obj.updateDynamic("sellerPauseReason")(sellerPauseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealServingMetadataDealPauseStatus]
  }
}

