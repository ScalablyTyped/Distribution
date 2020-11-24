package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class SchemaNonGuaranteedAuctionTermsOps[Self <: SchemaNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
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
    def setAutoOptimizePrivateAuction(value: Boolean): Self = this.set("autoOptimizePrivateAuction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOptimizePrivateAuction: Self = this.set("autoOptimizePrivateAuction", js.undefined)
    
    @scala.inline
    def setReservePricesPerBuyerVarargs(value: SchemaPricePerBuyer*): Self = this.set("reservePricesPerBuyer", js.Array(value :_*))
    
    @scala.inline
    def setReservePricesPerBuyer(value: js.Array[SchemaPricePerBuyer]): Self = this.set("reservePricesPerBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservePricesPerBuyer: Self = this.set("reservePricesPerBuyer", js.undefined)
  }
}
