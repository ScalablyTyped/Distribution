package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaDealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedAuctionTerms]
  }
  
  @scala.inline
  implicit class SchemaDealTermsNonGuaranteedAuctionTermsOps[Self <: SchemaDealTermsNonGuaranteedAuctionTerms] (val x: Self) extends AnyVal {
    
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
    def setReservePricePerBuyersVarargs(value: SchemaPricePerBuyer*): Self = this.set("reservePricePerBuyers", js.Array(value :_*))
    
    @scala.inline
    def setReservePricePerBuyers(value: js.Array[SchemaPricePerBuyer]): Self = this.set("reservePricePerBuyers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservePricePerBuyers: Self = this.set("reservePricePerBuyers", js.undefined)
  }
}
