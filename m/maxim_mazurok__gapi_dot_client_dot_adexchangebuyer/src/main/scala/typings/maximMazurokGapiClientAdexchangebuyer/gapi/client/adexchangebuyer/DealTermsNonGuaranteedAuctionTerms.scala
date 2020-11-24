package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTermsNonGuaranteedAuctionTerms extends js.Object {
  
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly). */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  
  /** Reserve price for the specified buyer. */
  var reservePricePerBuyers: js.UndefOr[js.Array[PricePerBuyer]] = js.native
}
object DealTermsNonGuaranteedAuctionTerms {
  
  @scala.inline
  def apply(): DealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class DealTermsNonGuaranteedAuctionTermsOps[Self <: DealTermsNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
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
    def setReservePricePerBuyersVarargs(value: PricePerBuyer*): Self = this.set("reservePricePerBuyers", js.Array(value :_*))
    
    @scala.inline
    def setReservePricePerBuyers(value: js.Array[PricePerBuyer]): Self = this.set("reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservePricePerBuyers: Self = this.set("reservePricePerBuyers", js.undefined)
  }
}
