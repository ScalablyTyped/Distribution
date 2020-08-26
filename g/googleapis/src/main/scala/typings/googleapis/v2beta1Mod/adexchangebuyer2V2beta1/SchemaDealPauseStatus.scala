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
  def apply(): SchemaDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealPauseStatus]
  }
  @scala.inline
  implicit class SchemaDealPauseStatusOps[Self <: SchemaDealPauseStatus] (val x: Self) extends AnyVal {
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
    def setBuyerPauseReason(value: String): Self = this.set("buyerPauseReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerPauseReason: Self = this.set("buyerPauseReason", js.undefined)
    @scala.inline
    def setFirstPausedBy(value: String): Self = this.set("firstPausedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPausedBy: Self = this.set("firstPausedBy", js.undefined)
    @scala.inline
    def setHasBuyerPaused(value: Boolean): Self = this.set("hasBuyerPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBuyerPaused: Self = this.set("hasBuyerPaused", js.undefined)
    @scala.inline
    def setHasSellerPaused(value: Boolean): Self = this.set("hasSellerPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSellerPaused: Self = this.set("hasSellerPaused", js.undefined)
    @scala.inline
    def setSellerPauseReason(value: String): Self = this.set("sellerPauseReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerPauseReason: Self = this.set("sellerPauseReason", js.undefined)
  }
  
}

