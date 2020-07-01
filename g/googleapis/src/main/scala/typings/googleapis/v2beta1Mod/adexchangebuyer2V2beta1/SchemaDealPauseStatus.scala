package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks which parties (if any) have paused a deal. The deal is considered
  * paused if either hasBuyerPaused or hasSellPaused is true.
  */
@js.native
trait SchemaDealPauseStatus extends js.Object {
  /**
    * The buyer&#39;s reason for pausing, if the buyer paused the deal.
    */
  var buyerPauseReason: js.UndefOr[String] = js.native
  /**
    * The role of the person who first paused this deal.
    */
  var firstPausedBy: js.UndefOr[String] = js.native
  /**
    * True, if the buyer has paused the deal unilaterally.
    */
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  /**
    * True, if the seller has paused the deal unilaterally.
    */
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  /**
    * The seller&#39;s reason for pausing, if the seller paused the deal.
    */
  var sellerPauseReason: js.UndefOr[String] = js.native
}

object SchemaDealPauseStatus {
  @scala.inline
  def apply(
    buyerPauseReason: String = null,
    firstPausedBy: String = null,
    hasBuyerPaused: js.UndefOr[Boolean] = js.undefined,
    hasSellerPaused: js.UndefOr[Boolean] = js.undefined,
    sellerPauseReason: String = null
  ): SchemaDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    if (buyerPauseReason != null) __obj.updateDynamic("buyerPauseReason")(buyerPauseReason.asInstanceOf[js.Any])
    if (firstPausedBy != null) __obj.updateDynamic("firstPausedBy")(firstPausedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBuyerPaused)) __obj.updateDynamic("hasBuyerPaused")(hasBuyerPaused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSellerPaused)) __obj.updateDynamic("hasSellerPaused")(hasSellerPaused.get.asInstanceOf[js.Any])
    if (sellerPauseReason != null) __obj.updateDynamic("sellerPauseReason")(sellerPauseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealPauseStatus]
  }
}

